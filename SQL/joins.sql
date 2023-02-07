CREATE TABLE `db`.`student` (
  `stuid` INT NOT NULL,
  `stuname` VARCHAR(45) NOT NULL,
  `gender` VARCHAR(10) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `contact` VARCHAR(45) NOT NULL,
  `dept` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`stuid`));

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

CREATE TABLE `db`.`attendance` (
  `Aid` INT NOT NULL,
  `stuid` INT NOT NULL,
  `adate` date NOT NULL,
  `astatus` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`Aid`));

INSERT INTO `db`.`attendance` (`Aid`, `stuid`, `adate`, `astatus`) VALUES ('1', '1', '2000-08-11', 'P');
INSERT INTO `db`.`attendance` (`Aid`, `stuid`, `adate`, `astatus`) VALUES ('2', '3', '2002-09-13', 'A');
INSERT INTO `db`.`attendance` (`Aid`, `stuid`, `adate`, `astatus`) VALUES ('3', '4', '2002-04-19', 'P');
INSERT INTO `db`.`attendance` (`Aid`, `stuid`, `adate`, `astatus`) VALUES ('4', '5', '2002-09-21', 'A');
INSERT INTO `db`.`attendance` (`Aid`, `stuid`, `adate`, `astatus`) VALUES ('5', '6', '2001-02-13', 'P');
INSERT INTO `db`.`attendance` (`Aid`, `stuid`, `adate`, `astatus`) VALUES ('6', '7', '2000-09-07', 'P');
INSERT INTO `db`.`attendance` (`Aid`, `stuid`, `adate`, `astatus`) VALUES ('7', '8', '2002-09-13', 'A');
INSERT INTO `db`.`attendance` (`Aid`, `stuid`, `adate`, `astatus`) VALUES ('8', '9', '2002-09-14', 'A');
INSERT INTO `db`.`attendance` (`Aid`, `stuid`, `adate`, `astatus`) VALUES ('9', '10', '2002-06-13', 'P');
INSERT INTO `db`.`attendance` (`Aid`, `stuid`, `adate`, `astatus`) VALUES ('10', '11', '2002-01-02', 'A');
INSERT INTO `db`.`attendance` (`Aid`, `stuid`, `adate`, `astatus`) VALUES ('11', '12', '2003-09-13', 'P');

select * from db.attendance;
SELECT * FROM db.student;

select *from db.student inner join db.attendance on db.student.stuid= db.attendance.aid

select *from db.student left join db.attendance on db.student.stuid= db.attendance.aid

select *from db.student right join db.attendance on db.student.stuid= db.attendance.aid

select *from db.student full outer join db.attendance on db.student.stuid= db.attendance.aid




