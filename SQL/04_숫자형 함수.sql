--day 2

--숫자형함수

--ROUND (반올림)
SELECT ROUND (15.193, 1) 소수첫째자리,
        ROUND (15.193, 2) 소수둘째자리,
        ROUND (15.193, 0) 정수,
        ROUND (15.193  ) 디폴트, 
        ROUND (15.193, -1) "10의자리",
        ROUND (115.193, -2) "100의자리"
FROM DUAL;


--TRUNC (버림)
SELECT TRUNC(15.79, 1) 소수첫째자리,
        TRUNC(15.79, 0) 정수,
        TRUNC(15.79) 디폴트,
        TRUNC(15.79, -1) "10의 자리"
FROM DUAL;


--MOD (나누기후 나머지)
SELECT employee_id 짞수번, last_name 
FROM employees
WHERE MOD(employee_id, 2) = 0
ORDER BY 1;   --1번째 열로 정렬 (오름차순)

--예제1)
SELECT salary,
        ROUND (salary/30) 정수,
        ROUND (salary/30, 1) 소수점첫째자리,
        ROUND (salary/30, -1) "10의 자리"
FROM employees;



