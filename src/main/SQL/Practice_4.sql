CREATE DATABASE UniDB;

CREATE TABLE Students (
                          id INT PRIMARY KEY,
                          name VARCHAR(50),
                          age INT,
                          city VARCHAR(30),
                          grade DOUBLE,
                          phone VARCHAR(20)

);

INSERT INTO Students
VALUES
    (1,'Bavly',21,'Cairo',91.5,'01011111111'),
    (2,'Ali',20,'Giza',80,'01022222222'),
    (3,'John',22,'Alex',65,'01033333333');

--SELECT
SELECT * FROM Students;

SELECT name
FROM Students;

--WHERE
SELECT *
FROM Students
WHERE age > 20;

SELECT *
FROM Students
WHERE city = 'Cairo';

--AND
SELECT *
FROM Students
WHERE city = 'Cairo'
  AND grade > 90;

--Like
-- Starts with A
SELECT *
FROM Students
WHERE name LIKE 'A%';

-- Contains ar
SELECT *
FROM Students
WHERE name LIKE '%ar%';

-- BETWEEN
SELECT *
FROM Students
WHERE age BETWEEN 20 AND 22;

-- IN
SELECT *
FROM Students
WHERE city IN ('Cairo','Alex');

-- NULL CHECKS
SELECT *
FROM Students
WHERE phone IS NULL;

-- ORDER BY
SELECT *
FROM Students
ORDER BY name ASC;

-- UPDATE
UPDATE Students
SET grade = 100
WHERE id = 2;

UPDATE Students
SET city = 'Cairo',
    age = 25
WHERE id = 6;

-- DELETE
DELETE FROM Students
WHERE id = 5;

-- Delete all rows
DELETE FROM Students;


-- ALTER TABLE
ALTER TABLE Students
ADD email VARCHAR(100);

-- Change datatype
ALTER TABLE Students
MODIFY age TINYINT;

-- Drop column
ALTER TABLE Students
DROP COLUMN email;


-- DROP TABLE
DROP TABLE Students;
