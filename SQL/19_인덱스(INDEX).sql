-- day7



--�ε��� Ȯ���ϱ�
SELECT
    TABLE_NAME      ���̺��,
    INDEX_NAME      �ε����̸�,
    COLUMN_NAME     �÷��̸�
FROM ALL_IND_COLUMNS   -- ����Ŭ���� �ڵ� ������
WHERE TABLE_NAME ='DEPARTMENTS';   --���̺��̸��� �빮�ڷ�


DROP TABLE members;
--�ǽ����� ���̺� �����
CREATE TABLE members(
    member_id   INT,
    first_name  VARCHAR2(100) NOT NULL,
    last_name   VARCHAR2(100) NOT NULL,
    gender      CHAR(1) NOT NULL,
    dob         DATE NOT NULL,
    email       VARCHAR2(255) NOT NULL,
    PRIMARY KEY(member_id)
    );
DESC members;


--�ε��� Ȯ���ϱ�
SELECT
    TABLE_NAME      ���̺��,
    INDEX_NAME      �ε����̸�,
    COLUMN_NAME     �÷��̸�
FROM ALL_IND_COLUMNS   -- ����Ŭ���� �ڵ� ������
WHERE TABLE_NAME ='MEMBERS';   --���̺� �̸� �빮�ڷ�

SELECT * FROM members
WHERE last_name = 'Harse';   --���̺� ��ü �˻�

EXPLAIN PLAN FOR        --���� ������ SELECT ���� �����Ͽ� ���� �ۼ�
SELECT * FROM members
WHERE last_name = 'Harse';

SELECT 
    PLAN_TABLE_OUTPUT    --������ ���
FROM
    TABLE(DBMS_XPLAN.DISPLAY());
    
    

--�ε��� �����
CREATE INDEX members_last_name_i
On members(last_name);


EXPLAIN PLAN FOR        --���� ������ SELECT ���� �����Ͽ� ���� �ۼ�
SELECT * FROM members
WHERE last_name = 'Harse';


SELECT 
    PLAN_TABLE_OUTPUT    --������ ���
FROM
    TABLE(DBMS_XPLAN.DISPLAY());


--�ε��� �����ϱ� : �ε����� ���̺��� drop/���� �� ���� ������
DROP INDEX members_last_name_i;

SELECT * 
FROM members
WHERE first_name LIKE 'M%' AND last_name LIKE 'A%';


CREATE INDEX name_i
ON members(first_name, last_name);


EXPLAIN PLAN FOR        --���� ������ SELECT ���� �����Ͽ� ���� �ۼ�
SELECT * FROM members
WHERE first_name LIKE 'M%' AND last_name LIKE 'A%';


SELECT 
    PLAN_TABLE_OUTPUT    --������ ���
FROM
    TABLE(DBMS_XPLAN.DISPLAY());

-- �ε��� �輼�ϱ�
DROP INDEX name_i;





