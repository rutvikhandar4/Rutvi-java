CREATE TABLE Emp(
  Empno INT(4) NOT NULL DEFAULT 0,
  Ename VARCHAR(10),
  Job VARCHAR(9),
  Mgr INT(4),
  Hiredate DATE,
  Sal DECIMAL(7,2),
  Comm DECIMAL(7,2),
  Deptno INT(2),
  PRIMARY KEY (Empno)
);

DESCRIBE emp;

