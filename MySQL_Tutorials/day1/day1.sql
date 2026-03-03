show databases;
use cfgdb;
show databases;
use cfgdb;


create table user(
username varchar(10), password varchar(20),
userid numeric , primary key(userid));
show tables;
show grants for user1;
insert into user values('swapna', 'swapna', 123);
insert into user (username, password, userid)
values
('amit','amit', 124),
('raj','raj',125),
('pooja','pooja',789);
select * from user;
select username, userid from user;
update user set password='amit@123' where userid=124;
delete from user where userid=123;
truncate table user;

start transaction;
select * from student;
alter table student add constraint ukey unique(mobile);


insert into student (studid, stdname, marks, mobile) values
(123, 'Swapna', 90, 873663984),
(125, 'amit', 80, 873674984);
select * from student;
commit;

insert into student values (186,"Anurag", 76,87329873);
savepoint sp1;

insert into student values (486,"Shivaya", 54, 7739873);
select * from student;
rollback;

start transaction;
insert into student values (002,"aditya", 69, 83746873);
commit;

start transaction;

insert into student values (344,"ddd", 09, 32746);
savepoint sp2;
commit;

set autocommit = 0;
insert into student values (322,"eee", 34, 123123);
select * from student;
rollback;
select * from student;
insert into student values (322,"eee", 90, 123123);


select max(marks) as max_marks, sum(marks) as sum_of_marks
from student;

select count(*) as marks_90 from student
group by marks
having marks = 90;


select * from student 
order by studid desc;

select count(distinct marks) from student;

select stdname from student
where stdname like 's%';

select upper(stdname) from student;

select * from student where stdname like 's_____';

select stdname, length(stdname) as length from  student;

select stdname, concat('sir ' , stdname)  from  student;

SET SQL_SAFE_UPDATES = 0;

update student set stdname = '     Swapna    ' where studid = 123; 
select stdname, length(stdname) as length, length(trim(stdname)) as trimmed_length, length(ltrim(stdname))as left_trimmed  
from  student 
where studid = 123;

select stdname, substring(stdname, 1, 4) as subString from student;
select stdname, left(stdname,5) as leftChars from student;
select stdname, reverse(stdname) as reverseName from student;

select * from student;
select stdname, replace(stdname, ' ', '*') as replaceName from student where studid = 123; 
select stdname, instr(stdname, 'Swa') as instrvalue from student where studid = 123;

