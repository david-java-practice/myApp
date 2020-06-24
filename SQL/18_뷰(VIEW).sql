--day7





-- 단순한 뷰 EMP_V1 만들기
-- 하나의 테이블, 함수나 그룹 사용 안함, DML 사용 가능
DROP VIEW EMP_V1; --미리 뷰 삭제 명령

-- employees 테이블에서 필요한 열들을 골라서 뷰로 생성
CREATE VIEW EMP_V1
AS
SELECT employee_id, first_name, last_name, email, hire_date, job_id
FROM employees;

--테이블처럼 SELECT 문 사용
SELECT* FROM EMP_V1;

DESC EMP_V1;

--테이블처럼 DML 사용가능 (뷰는 가상의 테이블 : 저장공간x) -> 원본 테이블에 입력됨
INSERT INTO EMP_V1 (employee_id, first_name, last_name, email, hire_date, job_id)
VALUES (333, 'David', 'King', 'Dking', SYSDATE, 'IT_PROG');


--뷰에 입력된 데이터 확인
SELECT * FROM EMP_V1
WHERE employee_id=333;
DESC employees;


--원본 테이블에서도 확인
SELECT * FROM employees
WHERE employee_id=333;


--뷰 삭제하기
DELETE FROM EMP_V1
WHERE employee_id = 333;
COMMIT;


--EMP_V2 만들기
CREATE VIEW EMP_V2
AS
SELECT employee_id 직원번호, first_name 이름, last_name 성, email, hire_date, job_id
FROM employees;

SELECT * FROM EMP_V2;


-- 3번째뷰 만들기
CREATE VIEW EMP_V3 ( 직원번호, 이름, 성, 이메일, 고용일자, 직종)
AS
SELECT employee_id , first_name , last_name , email, hire_date, job_id
FROM employees;

SELECT * FROM EMP_V1;
SELECT * FROM EMP_V2;
SELECT * FROM EMP_V3;
SELECT * FROM employees;

--DML 사용하기
INSERT INTO EMP_V3 ( 직원번호, 이름, 성, 이메일, 고용일자, 직종)
VALUES (334, 'Lara', 'Craft', 'Lara', SYSDATE, 'IT_PROG');


--복잡한 뷰로써 그룹함수를 사용하는 뷰는 DML 사용 불가
CREATE OR REPLACE VIEW 부서별_직원_보고서
AS
SELECT department_id 부서번호, COUNT(employee_id) 직원수,
MAX(salary) 최고급여,
MIN(salary) 최저급여,
ROUND(AVG(salary)) 평균급여
FROM employees
GROUP BY department_id
ORDER BY 부서번호;

SELECT * FROM 부서별_직원_보고서;


--읽기 전용뷰 (WITH READ ONLY)
CREATE OR REPLACE VIEW EMP_V_READ
AS
SELECT employee_id, first_name, last_name, email, hire_date, job_id
FROM employees
WHERE department_id=90
WITH READ ONLY;

SELECT * FROM EMP_V_READ;


-- DML 사용 불가
DELETE FROM EMP_V_READ;



--체크 옵션으로 뷰 만들기
CREATE or replace VIEW EMP_V_chq_const
AS
SELECT employee_id, first_name, last_name, email, hire_date, job_id, department_id
FROM employees
WHERE department_id=90
WITH CHECK OPTION;  --체크 옵션으로 현재 부서번호 90 일때만 수정 및 입력 가능

SELECT * FROM EMP_V_chq_const;


--90번 부서 일때만 DML 가능
INSERT INTO EMP_V_chq_const (employee_id, first_name, last_name, email, hire_date, job_id, department_id)
VALUES (444, 'FADI', 'ALI', 'FALI', SYSDATE, 'IT_PROG', 90);









