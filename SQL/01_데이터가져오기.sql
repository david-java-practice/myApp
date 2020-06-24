-- ������ �ּ��Դϴ�. ����Ű�� CTRL+/
/* 
������ �ּ�
�� �ٴ� ���
*/

-- 1. ���̺��� ��� ��� ���� �о���� *
SELECT *
FROM departments;

-- 2. Ư�� ���� �о����
SELECT department_id, department_name
FROM departments;
-- 3. ��� ������ ���(+, -, *, /)
SELECT employee_id, first_name, salary
FROM employees;

SELECT employee_id, first_name, salary, salary+100,
        salary + (salary *  0.1)
FROM employees;

-- 4. ��(NULL) �̶�?
-- ���� �Էµ��� ����, ������� ����, �˼� ���� ��
-- �ΰ��� ����(0) �Ǵ� ����("")���� �ٸ���.
SELECT last_name, job_id, salary, commission_pct
FROM employees;

SELECT last_name, job_id, salary,
        commission_pct, commission_pct + 10
FROM employees;

-- 5. �ߺ��� �� ���� : distinct
SELECT distinct job_id
FROM employees;


-- ���� 1)
SELECT employee_id, first_name, last_name
FROM employees;

--���� 2)
SELECT first_name, salary,  salary*1.1 ��������
FROM employees;

--���� 3)
SELECT employee_id �����ȣ, first_name �̸�, last_name ��
FROM employees;

--���� ������ (||)
SELECT last_name || ' is a ' || job_id as "���� ����"
FROM employees;


SELECT employee_id, first_name || ' ' ||last_name
FROM employees;

--���� 4)
SELECT employee_id, fist_name ||' '|| last_name, email || 'company.com '
FROM employees;