-- day7




--���������� �߰� �� ����
--Ŭ���� ���̺� ����
CREATE TABLE class (
        cno     VARCHAR2(2),
        cname   VARCHAR2 (50)
        );
INSERT INTO class 
VALUES ( '01', '�����ͺ��̽�');
INSERT INTO class 
VALUES ( '02', '�ڹ�');
SELECT * FROM class;


--�л����̺� ����
CREATE TABLE student(
    sno     VARCHAR2(4),
    sname   VARCHAR2 (50),
    cno     VARCHAR2(2)
    );
INSERT INTO student VALUES ('0414', 'ȫ�浿', '01');
INSERT INTO student VALUES ('0415', '�Ӳ���', '02');
INSERT INTO student VALUES ('0416', '�̼���', '03');
COMMIT;
SELECT * FROM student;


--Ŭ���� ���̺� '�⺻Ű' �߰�
ALTER TABLE class
ADD CONSTRAINT class_cno_pk PRIMARY KEY (cno);


--�⺻Ű���� NULL ���� ���� �� ����
INSERT INTO class 
VALUES ( NULL, '�����ͺ��̽�');


--Ŭ���� ���̺� '����ũŰ' �߰�
ALTER TABLE class
ADD CONSTRAINT class_cname_uk UNIQUE (cname);


-- ����ũ�� �ߺ��ȵ�
INSERT INTO class 
VALUES ( '03', '�����ͺ��̽�');


--���������� ��ȸ�ϴ� ��ɹ�
SELECT *
FROM ALL_CONSTRAINTS -- ��� ��������
WHERE table_name = 'DEPARTMENTS';  -- ���̺�� �Է½� �빮��


-- �л� ���̺� �⺻Ű �߰�
ALTER TABLE student
ADD CONSTRAINT student_sno_pk PRIMARY KEY (sno);


-- �л� ���̺� sname NOT NULL �߰�
-- NOT NULL �ϰ�츸 MODIFY ���
ALTER TABLE student
MODIFY sname CONSTRAINT student_sname_nn NOT NULL;


--�л� ���̺� �ܷ�Ű �߰� (�����ϴ� ���̺�� ���� �߰��ؾ���)
ALTER TABLE student
ADD CONSTRAINT student_cno_fk FOREIGN KEY (cno) REFERENCES CLASS (cno);
SELECT * FROM class;
SELECT * FROM student;

--���������� �߰��Ҷ� �̹� ������� ���̺� �� ���� �����Ͱ� �����ؾ� �߰��ȴ�.
UPDATE student SET cno = '01'
WHERE sno = '0416';



--���������� ���� : 2���� ����� ����
--���������� �̸����� ����
--CASCADE �ɼǽ� �����ϴ� �ܷ�Ű�� �Բ� ����
ALTER TABLE  class
DROP CONSTRAINT class_cno_pk CASCADE;


--������������ ����
ALTER TABLE class
DROP UNIQUE (cname); --Ŭ���� ���̺��� cname���� ����ũ �������� ����
ALTER TABLE student
DROP PRIMARY KEY;  --�⺻Ű�� ����


--���̺��� ����
DROP TABLE class;
DROP TABLE student;



--���̺� �÷�(��)�� �߰��� ����


--1. 90�� �μ��� �������� �����̺� EM_EMP�� ���ϴ� ���� ������ ����
CREATE TABLE E_EMP
AS SELECT employee_id, last_name, salary, department_id
FROM employees
WHERE department_id=90;
DESC E_EMP;
SELECT* FROM E_EMP;


--2. ���� �̸��� �����Ͽ� E_EMP2 ����
CREATE TABLE E_EMP2 (emp_id, name, sal, dept_id)
AS SELECT employee_id, last_name, salary, department_id
FROM employees
WHERE department_id=90;
SELECT* FROM E_EMP2;


--���� �߰�
SELECT * FROM E_EMP;

ALTER TABLE E_EMP
ADD (GENDER CHAR(1));  --���� �� �߰� (�Է� �ȵ� ���� null)


-- ����Ʈ ���� 0���� �ϴ� �� �߰�
ALTER TABLE E_EMP
ADD (Ŀ�̼� NUMBER DEFAULT 0 NOT NULL);


--�ΰ��� ���� �߰�
ALTER TABLE E_EMP
ADD (��¥ DATE DEFAULT SYSDATE, ������ VARCHAR2(100) DEFAULT USER);


--���� ����
SELECT * FROM E_EMP;

-- ������ ������ ����
ALTER TABLE E_EMP
MODIFY (������ VARCHAR2(200));  -- VARCHAR2 ������ 100 -> 200����
DESC E_EMP;

ALTER TABLE E_EMP
MODIFY (������ VARCHAR2(50));   -- VARCHAR2 ������ 200 -> 50����


ALTER TABLE E_EMP
MODIFY (������ VARCHAR2(1));  -- VARCHAR2 ������ 50 -> 1����  : �ּ� 2BYTE �ƴϸ� ����

ALTER TABLE E_EMP
MODIFY (������ NUMBER);  -- �̹� ������ �����Ͱ� �ֱ⶧���� ���������� ����

SELECT * FROM E_EMP;
DESC E_EMP;

-- NULL���� ��쿡 �Էµ� ���� ���⶧���� ������ ������ �ٲ� �� ����
ALTER TABLE E_EMP
MODIFY (gender NUMBER);   


--�������� ������ ������ �ٲٷ� �ϸ�
UPDATE E_EMP
SET ������  = NULL;

ALTER TABLE E_EMP
MODIFY (������ NUMBER); 


--���� ����
ALTER TABLE E_EMP
DROP COLUMN ������;  --������ ���� ����

--�������� �� ����
ALTER TABLE E_EMP
DROP (GENDER, Ŀ�̼�, ��¥, first_name);  

SELECT * FROM E_EMP;


--���� �̸� ����
ALTER TABLE E_EMP
RENAME COLUMN department_id TO �μ���ȣ;
ALTER TABLE E_EMP
RENAME COLUMN salary TO �޿�;
ALTER TABLE E_EMP
RENAME COLUMN employee_id TO ������ȣ;
ALTER TABLE E_EMP
RENAME COLUMN last_name TO �̸�;


--���̺��� �̸� ����
RENAME E_EMP TO �������̺�;



--����1)
--employees ���̺��� job_id�� 'ST_MAN'�� �������� �� ���̺� stmans�� ����� �Է��϶�. 
--��, ���̺��� �÷� �̸��� id, job, sal (���� ���̺��� employee_id, job_id, salary)
CREATE TABLE stmans (id, job, sal)
AS SELECT employee_id, job_id, salary
FROM employees
WHERE job_id = 'ST_MAN';

SELECT * FROM stmans;










