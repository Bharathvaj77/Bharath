USE employee;

SHOW TABLES;
DESCRIBE Employees;
SELECT * FROM Employees LIMIT 5;

/* ALTER TABLE Employees
ADD COLUMN salary DECIMAL(10,2),
ADD COLUMN designation VARCHAR(100); */

SELECT DISTINCT salary
FROM Employees;

DESCRIBE Employees;

 SELECT
    age AS Employee_Age,
    salary AS Employee_Salary
FROM Employees; 

SELECT * FROM Employees
WHERE salary > 50000
AND hire_date < '2016-01-01';

SELECT * FROM Employees
WHERE designation IS NULL;

/* UPDATE Employees
SET designation = 'Data Scientist'
WHERE designation IS NULL;

SELECT * FROM Employees
WHERE designation = 'Data Scientist'; */

SELECT * FROM Employees
ORDER BY
    department_id ASC,
    salary DESC;
    
    SELECT * FROM Employees
WHERE hire_date >= '2018-01-01'
AND hire_date < '2019-01-01'
ORDER BY hire_date ASC
LIMIT 5;

SELECT SUM(e.salary) AS Total_Finance_Salary
FROM Employees e
INNER JOIN Departments d
ON e.department_id = d.department_id
WHERE d.department_name = 'Finance';

SELECT MIN(age) AS Minimum_Employee_Age
FROM Employees;

SELECT
    location_id,
    MAX(salary) AS Maximum_Salary
FROM Employees
GROUP BY location_id;

SELECT
    designation,
    AVG(salary) AS Average_Salary
FROM Employees
WHERE designation LIKE '%Analyst%'
GROUP BY designation;

SELECT
    department_id,
    COUNT(employee_id) AS Total_Employees
FROM Employees
GROUP BY department_id
HAVING COUNT(employee_id) < 3;

SELECT
    location_id,
    AVG(age) AS Average_Age
FROM Employees
WHERE gender = 'Female'
GROUP BY location_id
HAVING AVG(age) < 30;

SELECT
    e.employee_name,
    e.designation,
    d.department_name
FROM Employees e
INNER JOIN Departments d
ON e.department_id = d.department_id;

SELECT
    d.department_id,
    d.department_name,
    COUNT(e.employee_id) AS Total_Employees
FROM Departments d
LEFT JOIN Employees e
ON d.department_id = e.department_id
GROUP BY
    d.department_id,
    d.department_name;
    
    SELECT
    l.location_id,
    l.location_name,
    e.employee_name
FROM Employees e
RIGHT JOIN Location l
ON e.location_id = l.location_id;

DESCRIBE Location;