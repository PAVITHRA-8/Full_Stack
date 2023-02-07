CREATE TABLE `db`.`student` (
  `stuid` INT NOT NULL,
  `stuname` VARCHAR(45) NOT NULL,
  `gender` VARCHAR(10) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `contact` VARCHAR(45) NOT NULL,
  `dept` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`stuid`));

CREATE TABLE `db`.`department` (
  `deptid` INT NOT NULL,
  `deptname` VARCHAR(50) NOT NULL,
  `deptzone` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`deptid`));

CREATE TABLE `db`.`attendance` (
  `Aid` INT NOT NULL,
  `id` INT NOT NULL,
  `adate` date NOT NULL,
  `astatus` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`Aid`));

CREATE TABLE `db`.`employee` (
  `empid` INT NOT NULL,
  `empname` VARCHAR(50) NOT NULL,
  `design` VARCHAR(50) NOT NULL,
   `DOB` date NOT NULL,
  PRIMARY KEY (`empid`));


SELECT * FROM db.student;

insert into db.student values(101,'Appuu','M','TN',09876,'ECE');

insert into db.student (stuid,stuname,gender,city,contact,dept) values
(102,'Sam','F','AP',09865,'IT'),
(103,'trisha','F','KL',09809,'CIVIL'),
(104,'AK','M','TN',09832,'EEE'),
(105,'Annie','F','AP',09845,'MECH'),
(106,'arjun','M','TN',09566,'BME');

delete from db.student where stuid=105; 
update db.student set city='MP',contact=8765 where stuid=104;

truncate table db.student;
INSERT INTO db.student VALUES ('007', 'Ramasundar', 'M','Bangalore', '077-25814763', 'ECE'),
 ('003', 'Alex ','M', 'London','075-12458969', 'IT'),
 ('008', 'Alford', 'M','New York','044-25874365', 'EEE'),
 ('011', 'Ravi Kumar','M', 'Bangalore','077-45625874', 'CSE'),
 ('010', 'Santakumar','M', 'Chennai','007-22388644', 'BME'),
 ('012', 'Lucida', 'F','San Jose','044-52981425', 'MECH'),
 ('005', 'Anderson','M', 'Brisban','045-21447739', 'AI'),
 ('001', 'Subbarao', 'M','Bangalore','077-12346674', 'DS'),
 ('006', 'McDen', 'M','London','078-22255588', 'CHEM'),
 ('004', 'Ivan', 'M','Torento', '008-22544166', 'AIML'),
 ('009', 'Benjamin','M', 'Hampshair','008-22536178', 'ROB');

SELECT * FROM db.student;

select stuname,dept from  db.student;

select stuname,city,dept from  db.student where city='bangalore';

select stuname,city,dept,contact from  db.student where city='bangalore' AND stuid=1;

ALTER TABLE db.student
ADD age int not null;

UPDATE `db`.`student` SET `age` = '23' WHERE (`stuid` = '1');
UPDATE `db`.`student` SET `age` = '24' WHERE (`stuid` = '3');
UPDATE `db`.`student` SET `age` = '26' WHERE (`stuid` = '4');
UPDATE `db`.`student` SET `age` = '28' WHERE (`stuid` = '5');
UPDATE `db`.`student` SET `age` = '29' WHERE (`stuid` = '6');
UPDATE `db`.`student` SET `age` = '30' WHERE (`stuid` = '7');
UPDATE `db`.`student` SET `age` = '21' WHERE (`stuid` = '8');
UPDATE `db`.`student` SET `age` = '22' WHERE (`stuid` = '9');
UPDATE `db`.`student` SET `age` = '25' WHERE (`stuid` = '10');
UPDATE `db`.`student` SET `age` = '32' WHERE (`stuid` = '11');
UPDATE `db`.`student` SET `age` = '27' WHERE (`stuid` = '12');

select stuname,city,dept,contact from  db.student where city='bangalore' AND age>=27;

SELECT * FROM db.student;
select stuname,city,dept,contact from  db.student where (city='bangalore' or city='london') and age>=23 order by city;

select city from db.student;
select distinct city from db.student;
select count(city) from db.student;
select count(distinct city) from db.student;
select *from db.student limit 1,7;
select *from db.student order by stuid desc limit 0,1;

select max(age) from db.student;
select min(age) from db.student;
select avg(age) from db.student;
select round(avg(age),0) from db.student;
select sum(age) from db.student;

select gender,count(stuid) as total from db.student group by gender;  
select city,count(stuid) as total from db.student group by city; 

select stuname from db.student where stuname like 'ra%';
select stuname from db.student where stuname like '%a%';
select stuname from db.student where stuname like '%a';
select stuname from db.student where stuname not like '%a';

select * from db.student where city='bangalore' or city='chennai';
select * from db.student where city in ('bangalore','chennai','london');
select * from db.student where city not in ('bangalore','chennai','london');

select stuname,age from db.student where age between 22 and 30;

select *from db.attendance;

INSERT INTO `db`.`attendance` (`Aid`, `id`, `adate`, `astatus`) VALUES ('1', '1', '1/02', 'P');
INSERT INTO `db`.`attendance` (`Aid`, `id`, `adate`, `astatus`) VALUES ('2', '3', '2/02', 'P');
INSERT INTO `db`.`attendance` (`Aid`, `id`, `adate`, `astatus`) VALUES ('3', '4', '3/02', 'P');
INSERT INTO `db`.`attendance` (`Aid`, `id`, `adate`, `astatus`) VALUES ('4', '5', '1/02', 'P');
INSERT INTO `db`.`attendance` (`Aid`, `id`, `adate`, `astatus`) VALUES ('5', '6', '4/02', 'A');
INSERT INTO `db`.`attendance` (`Aid`, `id`, `adate`, `astatus`) VALUES ('6', '7', '2/02', 'P');
INSERT INTO `db`.`attendance` (`Aid`, `id`, `adate`, `astatus`) VALUES ('7', '8', '2/02', 'P');
INSERT INTO `db`.`attendance` (`Aid`, `id`, `adate`, `astatus`) VALUES ('8', '9', '3/02', 'A');
INSERT INTO `db`.`attendance` (`Aid`, `id`, `adate`, `astatus`) VALUES ('9', '10', '5/02', 'A');
INSERT INTO `db`.`attendance` (`Aid`, `id`, `adate`, `astatus`) VALUES ('10', '11', '1/02', 'A');
INSERT INTO `db`.`attendance` (`Aid`, `id`, `adate`, `astatus`) VALUES ('11', '12', '6/02', 'P');

select *from db.attendance where id=1;

