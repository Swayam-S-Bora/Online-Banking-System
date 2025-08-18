-- Online Banking System Database Schema

-- 1. Drop existing database if it exists
DROP DATABASE IF EXISTS online_banking_system;

-- 2. Create database
CREATE DATABASE online_banking_system;

-- 3. Use database
USE online_banking_system;

-- 4. Accountant Table
CREATE TABLE accountant (
    username VARCHAR(20) NOT NULL,
    password VARCHAR(20) NOT NULL
);

-- 5. Customer Table
CREATE TABLE customer (
    C_Acc_No INT AUTO_INCREMENT PRIMARY KEY,
    C_Name VARCHAR(20) NOT NULL,
    C_Password VARCHAR(10) NOT NULL,
    C_Address VARCHAR(20) NOT NULL,
    C_Mob_No VARCHAR(10) NOT NULL,
    C_Email VARCHAR(20) NOT NULL,
    C_Total_Amount INT NOT NULL
);

-- 6. Deposit Table
CREATE TABLE deposit (
    C_Acc_No INT NOT NULL,
    C_Name VARCHAR(20) NOT NULL,
    D_Amount INT NOT NULL,
    FOREIGN KEY (C_Acc_No) REFERENCES customer(C_Acc_No)
);

-- 7. Withdraw Table
CREATE TABLE withdraw (
    C_Acc_No INT NOT NULL,
    C_Name VARCHAR(20) NOT NULL,
    W_Amount INT NOT NULL,
    FOREIGN KEY (C_Acc_No) REFERENCES customer(C_Acc_No)
);

-- 8. Transaction Table
CREATE TABLE transaction (
    sender_acc_no INT NOT NULL,
    receiver_acc_no INT NOT NULL,
    amount INT NOT NULL,
    FOREIGN KEY (sender_acc_no) REFERENCES customer(C_Acc_No),
    FOREIGN KEY (receiver_acc_no) REFERENCES customer(C_Acc_No)
);

-- Default account
INSERT INTO accountant (username, password)
VALUES ('admin', '1234');