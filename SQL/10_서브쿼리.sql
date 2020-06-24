-- day5



--��������


--Abel �������� �޿��� �� ���� �޴� ��������?
--Abel�� �޿� Ȯ��
SELECT salary
FROM employees
WHERE last_name = 'Abel';

--���������� ���
-- ������ ������ ( =, >, <, <=, =>, <>, != )
SELECT employee_id, last_name, salary
FROM employees
WHERE salary > (SELECT salary
                FROM employees
                WHERE last_name = 'Abel');
                
--������ ���� ���
SELECT employee_id, last_name, salary
FROM employees
WHERE salary > (SELECT salary
                FROM employees
                WHERE department_id = 30);
                
--�׷��Լ��� ���������� �̿�
--�׷��Լ� ���� MAX�� ������� �޿��� �޴� ����� �˼�����
SELECT *
FROM employees
WHERE salary = (SELECT MAX(salary) FROM employees);


--����1) ���'Abel'(last_name)���� �޿��� ���� ����� last_name, salary�� ��Ÿ�����(�������� ���)
SELECT last_name, salary
FROM employees
WHERE salary > (SELECT salary FROM employees WHERE last_name = 'Abel');


--����2) 'Bull'�̶� last_name�� ���� ����� �μ����� Bull���� ���� �޿��� �޴� ������� ����϶�. (�������� ���)
SELECT employee_id ������ȣ, last_name �̸�, department_id �μ���ȣ, salary �޿�
FROM employees
WHERE department_id = (SELECT department_id FROM employees WHERE last_name ='Bull')
    AND salary > (SELECT salary FROM employees WHERE last_name='Bull');
    
    
--����3) 'Russell'�̶� last_name�� ������ȣ�� manager_id�� ������ �������� last_name, salary, manager_id�� ����Ͻÿ�.
SELECT last_name, salary, manager_id
FROM employees
WHERE manager_id = (SELECT employee_id FROM employees WHERE last_name = 'Russell');


--����4) jobs ���̺� job_title�� 'Stock Manager'�� job_id�� ���� �������� ������ Employees ���̺��� ã�Ƽ� ����Ͻÿ�.
SELECT *
FROM employees
WHERE job_id = (SELECT job_id FROM jobs WHERE job_title = 'Stock Manager');



-- ������ ��������
-- ������ (IN, ANY, ALL)
SELECT salary FROM employees WHERE department_id = 90;



-- IN ������ : �˻��� �� �߿� �ϳ��� ��ġ�ϸ� ���̴�.(�������� '=')
SELECT employee_id, first_name, last_name, salary
FROM employees 
WHERE salary IN
            (SELECT salary FROM employees WHERE department_id = 90);
            
            
-- ANY ������: �˻��� �� �߿� ���ǿ� �´� ���� �ϳ� �̻� ������ ���̴�.
-- �񱳿����� ( > , <, =>, <= ���)�� �־�� �Ѵ�.
SELECT employee_id, first_name, last_name, salary
FROM employees
WHERE salary >= ANY (SELECT salary FROM employees WHERE department_id = 90);


-- ALL ������: ��� �˻��� ���� ���ǿ� �¾ƾ� �Ѵ�.
-- �񱳿����� ( > , <, =>, <= ���)�� �־�� �Ѵ�.
SELECT employee_id, first_name, last_name, salary
FROM employees
WHERE salary < ALL (SELECT salary FROM employees WHERE job_id = 'IT_PROG');


--����1) �μ���ȣ(department_id)�� 20���� �������� �Ŵ������̵�(manager_id)�� ���� �Ŵ����� ������ ��������
--����Ͻÿ� (�� 20�� �μ��� ������ ����!)
SELECT employee_id, first_name, job_id ����, salary �޿�
FROM employees
WHERE manager_id IN (SELECT manager_id FROM employees WHERE department_id = 20)
                AND department_id NOT LIKE  20;


--����2) job_id�� 'ST_MAN'�� �������� ��� ������ ���ٵ� �޿��� ���� �������� ����Ͻÿ�(ANY)
SELECT employee_id, last_name, job_id, salary
FROM employees
WHERE salary < ANY (SELECT salary FROM employees WHERE job_id = 'ST_MAN');


--����3) ��å�� 'IT_PROG'�� ������ ���� �޿��� ���� �������� ����Ͻÿ� (ALL)
SELECT employee_id, last_name, job_id, salary
FROM employees
WHERE salary < ALL (SELECT salary FROM employees WHERE job_id = 'IT_PROG');




--���߿� �������� : ���� ���� �÷��� �˻��ϴ� ���� ����
SELECT employee_id, first_name, job_id, salary, manager_id
FROM employees
WHERE (manager_id, job_id) IN (SELECT manager_id, job_id FROM employees WHERE first_name = 'Bruce')
AND first_name <> 'Bruce';


--�μ����� �ּ� �޿��� �޴� ����� �μ���ȣ, �����ȣ, �̸�, �޿� ���� �˻�
SELECT department_id �μ���ȣ, employee_id �����ȣ, first_name �̸�, salary �޿�
FROM employees
WHERE (department_id, salary) IN (SELECT department_id, MIN(salary)
                                    FROM employees
                                    GROUP BY department_id)
ORDER BY department_id;



--����) : employees ���̺��� job_id���� ���� ���� salary�� ������ ã�ƺ���, ã�Ƴ� job_id�� salary�� �ش��ϴ�
--������ first_name, job_id, salary, department_id�� ����Ͻÿ�. (salary�������� ����)
SELECT first_name, job_id, salary, department_id
FROM employees
WHERE (job_id, salary) IN (SELECT job_id, MIN(salary) FROM employees GROUP BY job_id)
ORDER BY salary DESC;




