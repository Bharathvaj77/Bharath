-- create database employee;
-- use employee;
-- select * from employee;

/* create table departments(
	department_id int primary key,
    department_name varchar(100)
); */

/* CREATE TABLE Location (
    location_id INT PRIMARY KEY,
    location VARCHAR(30)
); */

/* CREATE TABLE Employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(50),
    gender ENUM('M','F'),
    age INT,
    hire_date DATE,
    designation VARCHAR(100),
    department_id INT,
    location_id INT,
    salary DECIMAL(10,2)
); */

-- SHOW TABLES;

-- ALTER TABLE Employees
-- ADD email VARCHAR(100);

-- DESC Employees;

-- ALTER TABLE Employees
-- MODIFY designation VARCHAR(255);

-- ALTER TABLE Employees
-- DROP COLUMN age;

-- ALTER TABLE Employees
-- RENAME COLUMN hire_date TO date_of_joining;

-- RENAME TABLE Departments TO Departments_Info;
-- RENAME TABLE Location TO Locations;

-- TRUNCATE TABLE Employees;

-- DROP TABLE Employees;

DROP DATABASE IF EXISTS employee;

CREATE DATABASE employee;

USE employee;

SELECT DATABASE();

CREATE TABLE Departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE Location (
    location_id INT AUTO_INCREMENT PRIMARY KEY,
    location VARCHAR(30) NOT NULL UNIQUE
);

CREATE TABLE Employees (
    employee_id INT PRIMARY KEY,

    employee_name VARCHAR(50) NOT NULL,

    gender ENUM('M','F'),

    age INT CHECK (age >= 18),

    hire_date DATE DEFAULT (CURRENT_DATE),

    department_id INT,

    location_id INT,

    CONSTRAINT fk_department
    FOREIGN KEY (department_id)
    REFERENCES Departments(department_id),

    CONSTRAINT fk_location
    FOREIGN KEY (location_id)
    REFERENCES Location(location_id)
);