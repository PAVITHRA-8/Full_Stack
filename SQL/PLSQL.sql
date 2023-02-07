DECLARE
TYPE emp_det IS RECORD
(
EMP_NO NUMBER,
EMP_NAME VARCHAR2(150),
MANAGER NUMBER,
SALARY NUMBER
);
TYPE emp_det_tbl IS TABLE OF emp_det; emp_rec emp_det_tbl:= emp_det_tbl(); 
BEGIN
INSERT INTO emp (emp_no,emp_name, salary, manager) VALUES (1000,’AAA’,25000,1000);
INSERT INTO emp (emp_no,emp_name, salary, manager) VALUES (1001,'XXX’,10000,1000);
INSERT INTO emp (emp_no, emp_name, salary, manager) VALUES (1002,'YYY',15000,1000);
INSERT INTO emp (emp_no,emp_name,salary, manager) VALUES (1003,’ZZZ’,'7500,1000);
COMMIT:
SELECT emp no,emp_name,manager,salary BULK COLLECT INTO emp_rec
FROM emp;
dbms_output.put_line (‘Employee Detail');
FOR i IN emp_rec.FIRST..emp_rec.LAST
LOOP
dbms_output.put_line (‘Employee Number: '|| emp_rec(i).emp_no); 
dbms_output.put_line (‘Employee Name: '|| emp_rec(i).emp_name); 
dbms_output.put_line (‘Employee Salary:'|| emp_rec(i).salary); 
dbms_output.put_line(‘Employee Manager Number:'||emp_rec(i).manager);
dbms_output.put_line('--------------------------------');
END LOOP;
END;
/