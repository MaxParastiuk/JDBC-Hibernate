CREATE DATABASE CarsShop;

DROP TABLE clients;
DROP TABLE cars;

CREATE TABLE clients					
(                                      
	id int auto_increment NOT NULL,  
	name varchar(25) NOT NULL,   
	age varchar(25) NOT NULL,
	phone char(12),
    primary key (id) 
);

CREATE TABLE cars
( 
	id int auto_increment NOT NULL,
	client_id int NOT NULL UNIQUE, 
	mark varchar(30) NOT NULL,
	model varchar(30) NOT NULL,
    primary key(id),
    foreign key(client_id) references clients(id)
);

INSERT INTO clients																			   
(name, age, phone)
VALUES
('Petro', ' 25',  '(093)1231212'),
('Vasya', '18',  '(095)2313233'),
('Anton', '23',  '(095)5433244'),
('Artem', '38',  '(095)2313467');	

INSERT INTO cars
(client_id, mark,	model)
VALUES
(1, 'Audi', 'A5'),
(2, 'Lada', 'Priora'),
(3, 'Audi', 'A8'),
(4, 'Tesla', 'Model X');

SELECT name, age FROM clients;
SELECT * FROM cars;