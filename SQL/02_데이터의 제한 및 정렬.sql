--day1

-- 1. 테이블의 모든 데이터 가져오기
SELECT * FROM employees;

-- 2. Where 절에 가져올 조건에 맞는 행을 선택한다.
--  위치는 FROM 절 다음에 위치
SELECT * 
FROM 
employees
WHERE department_id = 90;   -- 90번 부서만
SELECT * 
FROM 
employees
WHERE salary = 24000;  --월급이 $24,000인 직원

/*
where 절을 사용할때 주의점
문자(String)과 날짜(Date) 값은 항상 따옴표(')로 표시
문자값은 대소문자를 구분한다. (Case-Sensitive)
날짜값은 날짜포맷에 벗어나지 않도록 (Format-Sensitive)
오라클의 날짜포맷은 RR/MM/DD(RR은 2자리 년도)
*/
-- 3. WHERE + 문자열
SELECT employee_id, first_name, last_name, job_id
FROM employees
WHERE first_name = 'Steven';
-- 4. WHERE + 날씨
SELECT SYSDATE FROM DUAL;
--dual은 샘플테이블 SYSDATE는 현재 날짜 시간

SELECT *
FROM employees
WHERE hire_date = '03/06/17'; --년도/월/날짜

--5. 비교 연산자
SELECT *
FROM employees
WHERE salary >= 10000;   --숫자비교

SELECT *
FROM employees
WHERE hire_date >= '03/06/17';  --날짜비교

SELECT *
FROM employees
WHERE last_name > 'King';  --문자비교 (알파벳순서로 비교)


--예제1)
SELECT *
FROM employees
WHERE employee_id = 100;

--예제2)
SELECT *
FROM employees
WHERE first_name = 'David';

--예제3)
SELECT *
FROM employees
WHERE employee_id <= 105;

--예제4)
SELECT *
FROM job_history
WHERE start_date >= '06/03/03';

--예제5)
SELECT *
FROM departments
WHERE location_id != 1700;   -- <> 이표시도 가능

-- 6. AND OR
SELECT *
FROM employees
WHERE ( department_id = 60 OR 
    department_id = 80) AND salary > 10000;
    
SELECT *
FROM employees
WHERE hire_date > '08/04/04' OR salary > 13000
    AND job_id = 'AD_VP';
    
SELECT *
FROM employees
WHERE (hire_date > '04/01/01' OR salary >5000); -- (hire_date <='04/01/01' AND salary <= 5000);
   
--예제1)
SELECT *
FROM employees
WHERE salary > 4000 AND job_id = 'IT_PROG'; 

--예제2)
SELECT *
FROM employees
WHERE salary > 4000 AND (job_id = 'IT_PROG' OR job_id = 'FI_ACCOUNT'); 


-- IN 연산자
SELECT *
FROM employees
WHERE salary = 4000 OR salary = 3000 OR salary = 2700;

SELECT *
FROM employees
WHERE salary IN ( 4000, 3000, 2700);

예제1)
SELECT *
FROM employees
WHERE salary IN( 10000, 17000, 24000);

예제2)
SELECT *
FROM employees
WHERE department_id NOT IN (30, 50, 80, 100, 110);   -- NOT IN 아닌


-- BETWEEN 연산자
SELECT *
FROM employees
WHERE salary >= 9000 AND salary  <= 10000;

SELECT *
FROM employees
WHERE salary BETWEEN 9000 and 10000;

--예제1)
SELECT *
FROM employees
WHERE salary BETWEEN 10000 and 20000;

--예제2)
SELECT *
FROM employees
WHERE hire_date BETWEEN '04/01/01' and '04/12/30';

--예제3)
SELECT *
FROM employees
WHERE salary NOT BETWEEN  7000 and  17000;


--day 2

--Like 연산자는  _ 와 %를 사용
--%는 문자가 0개 또는 1개 이상
--_는 문자가 1개

SELECT *
FROM employees
WHERE last_name LIKE 'B%';   --대문자 B로 시작하는 이름


SELECT *
FROM employees
WHERE last_name LIKE '%b%';  --이름에 b가 있으면 출력

SELECT *
FROM employees
WHERE first_name LIKE '_d%';   --첫글자 뒤에 d가 나오면


SELECT *
FROM employees
WHERE first_name LIKE '__s%';   --세번째 문자가 s일때


--예제1)

SELECT *
FROM employees
WHERE job_id LIKE '%AD%';


--예제2)

SELECT *
FROM employees
WHERE job_id LIKE '%AD___';

--예제3)

SELECT *
FROM employees
WHERE Phone_number LIKE '%1234';

--예제4)

SELECT *
FROM employees
WHERE Phone_number NOT LIKE '%3%'
                    AND phone_number LIKE '%9';

--예제5)

SELECT *
FROM employees
WHERE job_id LIKE  '%MGR%' 
            OR job_id LIKE '%ASST%';


-- IS NULL / IS NOT NULL

SELECT *
FROM employees
WHERE commission_pct IS NULL;    -- == NULL (X)

SELECT *
FROM employees
WHERE commission_pct IS NOT NULL;


--예제1)

SELECT *
FROM employees
WHERE manager_id IS NULL;


-- ORDER BY ( ASC / DESC )

SELECT *
FROM employees
ORDER BY salary ;  --ASC 기본이 오름차순

SELECT *
FROM employees
ORDER BY salary DESC; 

SELECT *
FROM employees
ORDER BY last_name ;  --알파펫 순서도 가능

--멀티 정렬

SELECT employee_id , last_name, department_id
FROM employees
ORDER BY department_id , employee_id DESC;   
--부서번호로 정렬후 사원번호로 정렬


--열을 생성하여 정렬
SELECT employee_id, last_name, salary*12 연봉
FROM employees
ORDER BY 연봉 DESC;

--ORDER BY는 WHERE 절 다음에 위치
SELECT employee_id, last_name, department_id, salary*12 연봉
FROM employees
WHERE department_id = 90
ORDER BY 연봉 DESC;


--예제1)
SELECT employee_id, first_name, last_name
FROM employees
ORDER BY employee_id DESC;

--예제2)
SELECT *
FROM employees
WHERE job_id LIKE '%CLERK%'
ORDER BY salary DESC;

--예제3)
SELECT employee_id, first_name, department_id, salary
FROM employees
WHERE employee_id BETWEEN 120 AND 150
ORDER BY department_id, salary DESC;








