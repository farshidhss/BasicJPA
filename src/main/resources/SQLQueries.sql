/* Create Database */
CREATE DATABASE jpaBasicDb;

/* Use The Newly Created Database */
USE jpaBasicDb;

/* Creating Table */
CREATE TABLE person
(
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(120) NOT NULL,
    city VARCHAR(200) NOT NULL,
    PRIMARY KEY (id)
);

DESC person;