CREATE TABLE EMP ( 
Empno INT, 
Ename VARCHAR(20), 
Job VARCHAR(20), 
Mgr INT, 
Hiredate DATE, 
Sal DECIMAL(7,2), 
Comm DECIMAL(7,2), 
Deptno INT 
); 

INSERT INTO EMP (Empno, Ename, Job, Mgr, Hiredate, Sal, Comm, Deptno) 
VALUES 
(7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800.00, NULL, 20), 
(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600.00, 300.00, 30), 
(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250.00, 500.00, 30), 
(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975.00, NULL, 20), 
(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250.00, 1400.00, 30), 
(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850.00, NULL, 30), 
(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450.00, NULL, 10), 
(7788, 'SCOTT', 'ANALYST', 7566, '1987-06-11', 3000.00, NULL, 20), 
(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000.00, NULL, 10), 
(7844, 'TURNER', 'SALESMAN', 7698, '1981-08-09', 1500.00, 0.00, 30), 
(7876, 'ADAMS', 'CLERK', 7788, '1987-07-13', 1100.00, NULL, 20), 
(7900, 'JAMES', 'CLERK', 7698, '1981-03-12', 950.00, NULL, 30), 
(7902, 'FORD', 'ANALYST', 7566, '1981-03-12', 3000.00, NULL, 20), 
(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300.00, NULL, 10); 

SELECT * FROM EMP;


