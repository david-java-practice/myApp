-- day 4




--JOIN �Լ�
SELECT e.employee_id, e.department_id, d.department_name
FROM employees e
JOIN departments d
    ON e.department_id = d.department_id;
    
    
    
--NATURAL JOIN �Լ� : ON �� ����
SELECT employee_id, first_name, job_id, job_title
FROM employees
NATURAL JOIN jobs;



--�⺻ ��������
SELECT e.employee_id, j.job_id, j.job_title
FROM employees e
JOIN jobs j
    ON e.job_id = j.job_id;
    
    
--WHERE�� �߰�
SELECT e.employee_id, e.department_id, d.department_name
FROM employees e
JOIN departments d
    ON e.department_id = d.department_id
WHERE d.department_id = 50;



--3�� ���̺� ����
SELECT e.employee_id, d.department_name, lo.city
FROM employees e
JOIN departments d  
    ON e.department_id = d.department_id
JOIN locations lo   
    ON d.location_id = lo.location_id;


--����1)
SELECT d.department_name �μ���, lo.city ���ø�, c.country_name ������
FROM departments d
JOIN locations lo 
    ON d.location_id = lo.location_id
JOIN countries c 
    ON lo.country_id = c.country_id
WHERE (lo.city = 'Seattle' OR lo.city = 'London') AND c.country_name LIKE 'United%'
ORDER BY 2;



--��ü����
SELECT e.last_name ����, e.employee_id ������ȣ, m.last_name �Ŵ���, m.employee_id ������ȣ2
FROM employees e
JOIN employees m
    ON e.manager_id = m.employee_id;;;;;;;;;;;;;;;;;;;;;;;;;
    

SELECT employee_id, last_name, manager_id
FROM employees
WHERE last_name = 'Kumar';;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;





--day5


--�ܺ����� (OUTER JOIN) : ���� ���ǿ� ��ġ���� �ʴ� �����ͱ��� ��� ������ش�.


--LEFT OUTER JOIN
SELECT e.last_name ����, e.department_id �μ���ȣ, d.department_name �μ���
FROM employees e
LEFT OUTER JOIN departments d
    ON e.department_id = d.department_id;


--RIGHT OUTER JOIN
SELECT e.last_name ����, e.department_id �μ���ȣ, d.department_name �μ���
FROM employees e
RIGHT OUTER JOIN departments d
    ON e.department_id = d.department_id;


--FULL OUTER JOIN : ���� ������ �Ѵ� ������
SELECT e.last_name ����, e.department_id �μ���ȣ, d.department_name �μ���
FROM employees e
FULL OUTER JOIN departments d
    ON e.department_id = d.department_id;



--����1)
SELECT c.country_name ����, c.country_id ������ȣ, l.location_id ������ȣ, l.city ����
FROM countries c
LEFT OUTER JOIN locations l
    ON c.country_id = l.country_id
ORDER BY 3 DESC;  -- l.location_id ��� 3 �־ ��.



--CROSS JOIN : �� �� ���̺��� ��� ���� �ٸ� ���̺��� ��� ���� �����Ű�� ���


--����)
SELECT c.country_name ����, r.region_name �����̸�
FROM countries c
CROSS JOIN regions r;



--���� ����
--1
SELECT d.department_name �μ���, d.manager_id �Ŵ�����ȣ, 
        e.last_name||' '||e.first_name Ǯ����, e.phone_number ����ȣ   
FROM departments d
JOIN employees e
    ON d.manager_id = e.employee_id;


--2 : ������ �̿��Ͽ� ������� ������ȣ(employee_id), �������(hire_date), ����(job_id), ��å(job_title)�� ����Ͻÿ�.
SELECT *
FROM employees e
JOIN jobs j
    ON e.job_id = j.job_id;
    
    
--3 : ��å(job_title)�� 'Sales Manger'�� ������� �Ի�⵵ �׷� �� ��� �޿��� ����Ͻÿ�.
    -- �Ի�⵵�� �������� �������� ���� (jobs ���̺�� ���� job_id�� �̿�, �Ի�⵵:TO_CHAR(e.hire_date, 'YYYY'))
SELECT TO_CHAR(e.hire_date, 'YYYY') �Ի�⵵, ROUND(AVG(e.salary)) ��ձ޿�
FROM employees e
JOIN jobs j
    ON j.job_id = e.job_id
WHERE job_title LIKE 'Sales Manager'
GROUP BY TO_CHAR(e.hire_date, 'YYYY')
ORDER BY 1 ASC;


--4 : ������ ����(city)�� �ִ� ��� �μ� �������� ��ձ޿��� ��ȸ�ϰ��� �Ѵ�. ��ձ޿��� ���� ���� ���ú��� ���ø�(city)
    --�� ��տ���, �ش� ������ �������� ������ÿ�. ��, ���ÿ� �ٹ��ϴ� ������ 10�� �̻��� ���� �����ϰ� ��ȸ�Ͻÿ�.
    --(Tips: ���̺� ���赵�� ���� �켱 � ���̺��� �����ؾ� ���� �������� SELEC*�� ���̺��� �����ؼ� ������ ������
    --Ȯ������ GROUP BY���� SELECT �� �ۼ�)
SELECT l.city, ROUND(AVG(e.salary)), COUNT(*)
FROM locations l
JOIN departments d
    ON l.location_id = d.location_id
JOIN employees e
    ON d.department_id = e.department_id
GROUP BY l.city
HAVING COUNT(*) < 10
ORDER BY 2;


--5 : �ڽ��� �Ŵ��� ���� �޿��� ���� �޴� �������� ��(last_name), �޿�(salary)�� �Ŵ����� last_name�� salary�� ����϶�.
SELECT e.employee_id, e.last_name, e.salary, m.last_name, m.salary
FROM employees e
JOIN employees m
    ON e.manager_id = m.employee_id
WHERE e.salary > m.salary;




