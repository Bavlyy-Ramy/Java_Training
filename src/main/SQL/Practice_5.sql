CREATE DATABASE CompanyDB;
CREATE TABLE Departments (
                             department_id INT PRIMARY KEY,
                             department_name VARCHAR(50) UNIQUE NOT NULL
);
CREATE TABLE Employees (
                           employee_id INT PRIMARY KEY,
                           first_name VARCHAR(50) NOT NULL,
                           salary DECIMAL(10,2) CHECK (salary >= 0),
                           city VARCHAR(50),
                           department_id INT,
                           FOREIGN KEY (department_id) REFERENCES Departments(department_id)
);

INSERT INTO Departments VALUES
                            (1,'IT'),
                            (2,'HR'),
                            (3,'Finance');

INSERT INTO Employees VALUES
                          (1,'Bavly',12000,'Cairo',1),
                          (2,'Ali',9000,'Giza',2),
                          (3,'Sara',15000,'Cairo',1),
                          (4,'John',7000,'Alex',3);

SELECT COUNT(*) FROM Employees;
SELECT AVG(salary) FROM Employees;
SELECT MAX(salary) FROM Employees;
SELECT MIN(salary) FROM Employees;
SELECT SUM(salary) FROM Employees;


SELECT department_id, COUNT(*)
FROM Employees
GROUP BY department_id;

SELECT department_id, AVG(salary)
FROM Employees
GROUP BY department_id
HAVING AVG(salary) > 10000;


-- JOINS
-- INNER JOIN
SELECT first_name, department_name
FROM Employees e
         JOIN Departments d
              ON e.department_id = d.department_id;

-- LEFT JOIN
SELECT first_name, department_name
FROM Employees e
         LEFT JOIN Departments d
                   ON e.department_id = d.department_id;


-- SUBQUERIES
-- Highest salary
SELECT *
FROM Employees
WHERE salary = (
    SELECT MAX(salary)
    FROM Employees
);

-- Above average salary
SELECT *
FROM Employees
WHERE salary > (
    SELECT AVG(salary)
    FROM Employees
);


-- UNION
SELECT city FROM Employees
UNION
SELECT department_name FROM Departments;