--day8





--DCL: DATA CONTROL LANGUAGE ������ ���� ���
--�������� �������� ����
--GRANT : Ư�� �����ͺ��̽� ����ڿ��� Ư�� �۾��� ���� ���� ������ �ο�
--REVOKE : Ư�� �����ͺ��̽� ����ڿ��� Ư�� �۾��� ���� ���� ������ ��Ż or ȸ�� �Ѵ�.



--�� ���� �����
CREATE USER John Identified by 1234;   --�� ���� ���� ����� ��й�ȣ 1234


--���ӱ��� �ֱ�
GRANT CREATE SESSION TO John;   -- John �������� ���� ���� �ֱ�
    
    --���̺� ���� ���� �ο�
GRANT CREATE TABLE TO John;

    --���̺� �����̽� (���̺��� ������ �� �ִ� ����)
CREATE TABLESPACE johnSpace
DATAFILE 'C:\oraclexe\app\oracle\oradata\XE\john.dbf' SIZE 10M
AUTOEXTEND ON NEXT 5M;
-- johnSpace�̸��� ���̺����̽� ����
-- ������ 10MB�� john.dbf ������ ���� ��ο� ����
-- �ڵ����� �뷮�� ������ 5MB�� �ڵ�����

-- �� ������ �� ���̺����̽��� ����� �� �ֵ���
ALTER USER John DEFAULT TABLESPACE johnSpace;   --����Ʈ �������̽���
ALTER USER John QUOTA UNLIMITED ON johnSpace;   --���̺����̽� ������



-- ��(Role) �ο�
GRANT CONNECT, RESOURCE TO John;    
-- CONNECT -> ���Ӱ��� ���ѵ��� ��� Role
-- RESOURCE ���� ������ü�� (���̺�, �� ��)�� ���� �� ��� ����



-- ������ ���� �� ȸ�� : REVOKE ( + ���� + FROM + ���� )
REVOKE CREATE TABLE FROM John;


--���� ���� �� ȸ��
REVOKE RESOURCE FROM John;


-- John ������ ����
DROP USER John CASCADE;


-- ���̺����̽� ����
DROP TABLESPACE JohnSpace;


-- ���� �����Ǿ� �ִ� ���� Ȯ��
SELECT * FROM ALL_USERS;
SELECT * FROM DBA_USERS;


-- ����ڿ��� �ο��� �ý��� ���� Ȯ��
SELECT * FROM DBA_SYS_PRIVS
WHERE GRANTEE = 'HR';





























