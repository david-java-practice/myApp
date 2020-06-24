--day7





-- �ܼ��� �� EMP_V1 �����
-- �ϳ��� ���̺�, �Լ��� �׷� ��� ����, DML ��� ����
DROP VIEW EMP_V1; --�̸� �� ���� ���

-- employees ���̺��� �ʿ��� ������ ��� ��� ����
CREATE VIEW EMP_V1
AS
SELECT employee_id, first_name, last_name, email, hire_date, job_id
FROM employees;

--���̺�ó�� SELECT �� ���
SELECT* FROM EMP_V1;

DESC EMP_V1;

--���̺�ó�� DML ��밡�� (��� ������ ���̺� : �������x) -> ���� ���̺� �Էµ�
INSERT INTO EMP_V1 (employee_id, first_name, last_name, email, hire_date, job_id)
VALUES (333, 'David', 'King', 'Dking', SYSDATE, 'IT_PROG');


--�信 �Էµ� ������ Ȯ��
SELECT * FROM EMP_V1
WHERE employee_id=333;
DESC employees;


--���� ���̺����� Ȯ��
SELECT * FROM employees
WHERE employee_id=333;


--�� �����ϱ�
DELETE FROM EMP_V1
WHERE employee_id = 333;
COMMIT;


--EMP_V2 �����
CREATE VIEW EMP_V2
AS
SELECT employee_id ������ȣ, first_name �̸�, last_name ��, email, hire_date, job_id
FROM employees;

SELECT * FROM EMP_V2;


-- 3��°�� �����
CREATE VIEW EMP_V3 ( ������ȣ, �̸�, ��, �̸���, �������, ����)
AS
SELECT employee_id , first_name , last_name , email, hire_date, job_id
FROM employees;

SELECT * FROM EMP_V1;
SELECT * FROM EMP_V2;
SELECT * FROM EMP_V3;
SELECT * FROM employees;

--DML ����ϱ�
INSERT INTO EMP_V3 ( ������ȣ, �̸�, ��, �̸���, �������, ����)
VALUES (334, 'Lara', 'Craft', 'Lara', SYSDATE, 'IT_PROG');


--������ ��ν� �׷��Լ��� ����ϴ� ��� DML ��� �Ұ�
CREATE OR REPLACE VIEW �μ���_����_����
AS
SELECT department_id �μ���ȣ, COUNT(employee_id) ������,
MAX(salary) �ְ�޿�,
MIN(salary) �����޿�,
ROUND(AVG(salary)) ��ձ޿�
FROM employees
GROUP BY department_id
ORDER BY �μ���ȣ;

SELECT * FROM �μ���_����_����;


--�б� ����� (WITH READ ONLY)
CREATE OR REPLACE VIEW EMP_V_READ
AS
SELECT employee_id, first_name, last_name, email, hire_date, job_id
FROM employees
WHERE department_id=90
WITH READ ONLY;

SELECT * FROM EMP_V_READ;


-- DML ��� �Ұ�
DELETE FROM EMP_V_READ;



--üũ �ɼ����� �� �����
CREATE or replace VIEW EMP_V_chq_const
AS
SELECT employee_id, first_name, last_name, email, hire_date, job_id, department_id
FROM employees
WHERE department_id=90
WITH CHECK OPTION;  --üũ �ɼ����� ���� �μ���ȣ 90 �϶��� ���� �� �Է� ����

SELECT * FROM EMP_V_chq_const;


--90�� �μ� �϶��� DML ����
INSERT INTO EMP_V_chq_const (employee_id, first_name, last_name, email, hire_date, job_id, department_id)
VALUES (444, 'FADI', 'ALI', 'FALI', SYSDATE, 'IT_PROG', 90);









