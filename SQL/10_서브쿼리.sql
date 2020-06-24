-- day5



--서브쿼리


--Abel 직원보다 급여를 더 많이 받는 직원들은?
--Abel의 급여 확인
SELECT salary
FROM employees
WHERE last_name = 'Abel';

--서브쿼리를 사용
-- 단일행 연산자 ( =, >, <, <=, =>, <>, != )
SELECT employee_id, last_name, salary
FROM employees
WHERE salary > (SELECT salary
                FROM employees
                WHERE last_name = 'Abel');
                
--에러가 나는 경우
SELECT employee_id, last_name, salary
FROM employees
WHERE salary > (SELECT salary
                FROM employees
                WHERE department_id = 30);
                
--그룹함수를 서브쿼리로 이용
--그룹함수 예로 MAX는 가장높은 급여를 받는 사람을 알수없음
SELECT *
FROM employees
WHERE salary = (SELECT MAX(salary) FROM employees);


--예제1) 사원'Abel'(last_name)보다 급여가 많은 사원의 last_name, salary를 나타내어라(서브쿼리 사용)
SELECT last_name, salary
FROM employees
WHERE salary > (SELECT salary FROM employees WHERE last_name = 'Abel');


--예제2) 'Bull'이란 last_name을 가진 사원의 부서에서 Bull보다 높은 급여를 받는 사원들을 출력하라. (서브쿼리 사용)
SELECT employee_id 직원번호, last_name 이름, department_id 부서번호, salary 급여
FROM employees
WHERE department_id = (SELECT department_id FROM employees WHERE last_name ='Bull')
    AND salary > (SELECT salary FROM employees WHERE last_name='Bull');
    
    
--예제3) 'Russell'이란 last_name의 직원번호를 manager_id로 가지는 직원들의 last_name, salary, manager_id를 출력하시오.
SELECT last_name, salary, manager_id
FROM employees
WHERE manager_id = (SELECT employee_id FROM employees WHERE last_name = 'Russell');


--예제4) jobs 테이블에 job_title이 'Stock Manager'의 job_id를 가진 직원들의 정보를 Employees 테이블에서 찾아서 출력하시오.
SELECT *
FROM employees
WHERE job_id = (SELECT job_id FROM jobs WHERE job_title = 'Stock Manager');



-- 다중행 서브쿼리
-- 연산자 (IN, ANY, ALL)
SELECT salary FROM employees WHERE department_id = 90;



-- IN 연산자 : 검색된 값 중에 하나만 일치하면 참이다.(여러개의 '=')
SELECT employee_id, first_name, last_name, salary
FROM employees 
WHERE salary IN
            (SELECT salary FROM employees WHERE department_id = 90);
            
            
-- ANY 연산자: 검색된 값 중에 조건에 맞는 것이 하나 이상 있으면 참이다.
-- 비교연산자 ( > , <, =>, <= 등등)가 있어야 한다.
SELECT employee_id, first_name, last_name, salary
FROM employees
WHERE salary >= ANY (SELECT salary FROM employees WHERE department_id = 90);


-- ALL 연산자: 모든 검색된 값과 조건에 맞아야 한다.
-- 비교연산자 ( > , <, =>, <= 등등)가 있어야 한다.
SELECT employee_id, first_name, last_name, salary
FROM employees
WHERE salary < ALL (SELECT salary FROM employees WHERE job_id = 'IT_PROG');


--예제1) 부서번호(department_id)가 20번인 직원들의 매니저아이디(manager_id)와 같은 매니저를 가지는 직원들을
--출력하시오 (단 20번 부서의 직원은 제외!)
SELECT employee_id, first_name, job_id 직종, salary 급여
FROM employees
WHERE manager_id IN (SELECT manager_id FROM employees WHERE department_id = 20)
                AND department_id NOT LIKE  20;


--예제2) job_id가 'ST_MAN'인 직원들중 어느 한직원 보다도 급여가 작은 직원들을 출력하시오(ANY)
SELECT employee_id, last_name, job_id, salary
FROM employees
WHERE salary < ANY (SELECT salary FROM employees WHERE job_id = 'ST_MAN');


--예제3) 직책이 'IT_PROG'인 직원들 보다 급여가 작은 직원들을 출력하시오 (ALL)
SELECT employee_id, last_name, job_id, salary
FROM employees
WHERE salary < ALL (SELECT salary FROM employees WHERE job_id = 'IT_PROG');




--다중열 서브쿼리 : 여러 개의 컬럼을 검색하는 서브 쿼리
SELECT employee_id, first_name, job_id, salary, manager_id
FROM employees
WHERE (manager_id, job_id) IN (SELECT manager_id, job_id FROM employees WHERE first_name = 'Bruce')
AND first_name <> 'Bruce';


--부서별로 최소 급여를 받는 사원의 부서번호, 사원번호, 이름, 급여 정보 검색
SELECT department_id 부서번호, employee_id 사원번호, first_name 이름, salary 급여
FROM employees
WHERE (department_id, salary) IN (SELECT department_id, MIN(salary)
                                    FROM employees
                                    GROUP BY department_id)
ORDER BY department_id;



--예제) : employees 테이블에서 job_id별로 가장 낮은 salary가 얼마인지 찾아보고, 찾아낸 job_id별 salary에 해당하는
--직원이 first_name, job_id, salary, department_id를 출력하시오. (salary내림차순 정렬)
SELECT first_name, job_id, salary, department_id
FROM employees
WHERE (job_id, salary) IN (SELECT job_id, MIN(salary) FROM employees GROUP BY job_id)
ORDER BY salary DESC;




