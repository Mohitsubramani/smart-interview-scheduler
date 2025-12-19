CREATE DATABASE interview_scheduler;
USE interview_scheduler;

CREATE TABLE candidates (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    start_time INT,
    end_time INT
);

CREATE TABLE interviewers (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    start_time INT,
    end_time INT
);
