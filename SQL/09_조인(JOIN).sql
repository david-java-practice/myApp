-- day 4




--JOIN 함수
SELECT e.employee_id, e.department_id, d.department_name
FROM employees e
JOIN departments d
    ON e.department_id = d.department_id;
    
    
    
--NATURAL JOIN 함수 : ON 절 생략
SELECT employee_id, first_name, job_id, job_title
FROM employees
NATURAL JOIN jobs;



--기본 동등조인
SELECT e.employee_id, j.job_id, j.job_title
FROM employees e
JOIN jobs j
    ON e.job_id = j.job_id;
    
    
--WHERE절 추가
SELECT e.employee_id, e.department_id, d.department_name
FROM employees e
JOIN departments d
    ON e.department_id = d.department_id
WHERE d.department_id = 50;



--3개 테이블 조인
SELECT e.employee_id, d.department_name, lo.city
FROM employees e
JOIN departments d  
    ON e.department_id = d.department_id
JOIN locations lo   
    ON d.location_id = lo.location_id;


--예제1)
SELECT d.department_name 부서명, lo.city 도시명, c.country_name 국가명
FROM departments d
JOIN locations lo 
    ON d.location_id = lo.location_id
JOIN countries c 
    ON lo.country_id = c.country_id
WHERE (lo.city = 'Seattle' OR lo.city = 'London') AND c.country_name LIKE 'United%'
ORDER BY 2;



--자체조인
SELECT e.last_name 직원, e.employee_id 직원번호, m.last_name 매니저, m.employee_id 직원번호2
FROM employees e
JOIN employees m
    ON e.manager_id = m.employee_id;;;;;;;;;;;;;;;;;;;;;;;;;
    

SELECT employee_id, last_name, manager_id
FROM employees
WHERE last_name = 'Kumar';;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;





--day5


--외부조인 (OUTER JOIN) : 조인 조건에 일치하지 않는 데이터까지 모두 출력해준다.


--LEFT OUTER JOIN
SELECT e.last_name 직원, e.department_id 부서번호, d.department_name 부서명
FROM employees e
LEFT OUTER JOIN departments d
    ON e.department_id = d.department_id;


--RIGHT OUTER JOIN
SELECT e.last_name 직원, e.department_id 부서번호, d.department_name 부서명
FROM employees e
RIGHT OUTER JOIN departments d
    ON e.department_id = d.department_id;


--FULL OUTER JOIN : 왼쪽 오른쪽 둘다 나오게
SELECT e.last_name 직원, e.department_id 부서번호, d.department_name 부서명
FROM employees e
FULL OUTER JOIN departments d
    ON e.department_id = d.department_id;



--예제1)
SELECT c.country_name 국가, c.country_id 국가번호, l.location_id 지역번호, l.city 도시
FROM countries c
LEFT OUTER JOIN locations l
    ON c.country_id = l.country_id
ORDER BY 3 DESC;  -- l.location_id 대신 3 넣어도 돼.



--CROSS JOIN : 한 쪽 테이블의 모든 행들과 다른 테이블의 모든 행을 연결시키는 기능


--예제)
SELECT c.country_name 국가, r.region_name 지역이름
FROM countries c
CROSS JOIN regions r;



--리뷰 예제
--1
SELECT d.department_name 부서명, d.manager_id 매니저번호, 
        e.last_name||' '||e.first_name 풀네임, e.phone_number 폰번호   
FROM departments d
JOIN employees e
    ON d.manager_id = e.employee_id;


--2 : 조인을 이용하여 사원들의 직원번호(employee_id), 고용일자(hire_date), 직종(job_id), 직책(job_title)을 출력하시오.
SELECT *
FROM employees e
JOIN jobs j
    ON e.job_id = j.job_id;
    
    
--3 : 직책(job_title)이 'Sales Manger'인 사원들의 입사년도 그룹 별 평균 급여를 출력하시오.
    -- 입사년도를 기준으로 오름차순 정렬 (jobs 테이블과 조인 job_id를 이용, 입사년도:TO_CHAR(e.hire_date, 'YYYY'))
SELECT TO_CHAR(e.hire_date, 'YYYY') 입사년도, ROUND(AVG(e.salary)) 평균급여
FROM employees e
JOIN jobs j
    ON j.job_id = e.job_id
WHERE job_title LIKE 'Sales Manager'
GROUP BY TO_CHAR(e.hire_date, 'YYYY')
ORDER BY 1 ASC;


--4 : 각가의 도시(city)에 있는 모든 부서 직원들의 평균급여를 조회하고자 한다. 평균급여가 가장 낮은 도시부터 도시명(city)
    --과 평균연봉, 해당 도시의 직원수를 출려가시오. 단, 도시에 근무하는 직원이 10명 이상인 곳은 제외하고 조회하시오.
    --(Tips: 테이블 관계도를 보고 우선 어떤 테이블을 조인해야 할지 결정한후 SELEC*에 테이블을 조인해서 문제가 없는지
    --확인한후 GROUP BY절과 SELECT 절 작성)
SELECT l.city, ROUND(AVG(e.salary)), COUNT(*)
FROM locations l
JOIN departments d
    ON l.location_id = d.location_id
JOIN employees e
    ON d.department_id = e.department_id
GROUP BY l.city
HAVING COUNT(*) < 10
ORDER BY 2;


--5 : 자신의 매니저 보다 급여를 많이 받는 직원들의 성(last_name), 급여(salary)와 매니저의 last_name과 salary를 출력하라.
SELECT e.employee_id, e.last_name, e.salary, m.last_name, m.salary
FROM employees e
JOIN employees m
    ON e.manager_id = m.employee_id
WHERE e.salary > m.salary;




