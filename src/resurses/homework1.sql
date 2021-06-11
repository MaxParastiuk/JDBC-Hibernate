USE MyJoinsDB;

drop table staff;
drop table job_information;
drop table personal_information;

CREATE TABLE staff
( id INT auto_increment NOT NULL,
  name varchar(30),
  phone varchar(15),
  primary key(id) 
);

CREATE TABLE job_information
(id INT auto_increment NOT NULL,
post Varchar(30),
salary int,
 primary key(id)
);

CREATE TABLE personal_information
(id INT auto_increment NOT NULL,
marital_status VARCHAR(15) NULL,
date_birth date,
address VARCHAR(30),
 primary key(id)
);

INSERT INTO staff
(name,phone)
VALUES 
('Анатолий Анатольевич','380(83)342243'),
('Сергей Сергеевич','380(54)584623'),
('Дмитрий Дмитриевич','380(93)23476'),
('Александр Александрович','380(98)234572');

INSERT INTO job_information
(post,salary)
VALUES
('Главный директор','30000'),
('Рабочий','10000'),
('Менеджер','20000'),
('Рабочий','12000');

INSERT INTO personal_information
(date_birth,address,marital_status)
VALUES 
('1969-03-10','Соборная,17','Женат'),
('1995-07-19','Пирогова,54',null ),
('1978-05-26','Центральная, 93','Женат'),
('1996-10-11','Зуброва,32', null);

SELECT * FROM staff;
SELECT * FROM job_information;
SELECT * FROM personal_information;
