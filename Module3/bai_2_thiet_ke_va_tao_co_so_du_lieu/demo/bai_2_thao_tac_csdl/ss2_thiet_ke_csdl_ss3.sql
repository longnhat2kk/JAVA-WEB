create database if not exists a0921i1;
use a0921i1;
create table class_type(
id int primary key auto_increment,
class_type_name varchar(50)
);
create table class(
id int primary key auto_increment,
`name` varchar(50),
class_type_id int,
foreign key(class_type_id) references class_type(id)
);
create table jame(
`account` varchar(50) primary key,
 `password` varchar(25) 
);
create table student(
id int auto_increment primary key,
name varchar(250),
birthday date,
gender boolean,
point int,
email varchar(50),
`account` varchar(50),
class_id int
);
alter table student add constraint fk_1 foreign key(`account`) references jame(`account`);
alter table student add constraint fk_2 foreign key(class_id) references class(id);

create table instructor (
id int auto_increment primary key,
name varchar(250),
birthday date,
class_type int,
salary int
);
create table class_instructor (
class_id int,
instructor_id int,
primary key(class_id,instructor_id),
foreign key(class_id) references class(id),
foreign key(instructor_id) references instructor(id)
);

insert into class_type (class_type_name) values ('full time'), ('part time'),('orther');
select * from class_type;

insert into class (name,class_type_id) values ('c1121g1',1), ('c1221g1',1),('a0821i1',2),('a0921i1',2);
select* from class;

insert into jame(`account`,`password`)
 values('cunn','12345'),('chunglh','12345'),('hoanhh','12345'),('dungd','12345'),('huynhtd','12345'),
 ('hainm','12345'),('namtv','12345'),('hieuvm','12345'),('kynx','12345'),('vulm','12345');
 select* from jame;
 
 insert into instructor(`name`,birthday, salary)
 values('tran van chanh','1985-02-03',100),('tran minh chien','1985-02-03',200),('vu thanh tien','1985-02-03',300);
 select* from instructor;
 
 insert into student(`name`,birthday, gender,`point`, class_id,`account`) 
 values ('nguyen ngoc cu','1981-12-12',1,8,1,'cunn'),('le hai chung','1981-12-12',1,5,1,'chunglh'),
 ('hoang huu hoan','1990-12-12',1,6,2,'hoanhh'),('dau dung','1987-12-12',1,8,1,'dungd'),
 ('ta dinh huynh','1981-12-12',1,7,2,'huynhtd'),('nguyen minh hai','1987-12-12',1,9,1,'hainm'),
 ('tran van nam','1989-12-12',1,4,2,'namtv'),('vo minh hieu','1981-12-12',1,3,1,'hieuvm'),
 ('le xuan ky','1981-12-12',1,7,2,'kynx'),('le minh vu','1981-12-12',1,7,1,'vulm');
 select * from student;
 insert into class_instructor(class_id,instructor_id) values (1,1),(1,2),(2,1),(2,2),(3,1),(3,2);
 select * from class_instructor;
 
select * from class_type;
select* from class;
select* from jame;
select* from instructor;select * from student;
select * from class_instructor;

-- b??i 3: thao t??c v???i database

 -- 1. L???y ra th??ng tin c??c h???c vi??n, v?? cho bi???t c??c h???c vi??n ??ang theo h???c l???p n??o.--
 -- id, name, class_name
 select s.id,s.name, c.name from 
 student as s join class as c on s.class_id = c.id;
 -- 2. L???y ra th??ng tin c??c h???c vi??n, v?? cho bi???t c??c h???c vi??n ??ang theo h???c l???p n??o 
-- v?? c??? c??c b???n ???? ????ng k?? nh??ng ch??a c?? l???p h???c???
select * from 
 student as s left join class as c on s.class_id = c.id;
-- 4. L???y th??ng tin c???a c??c h???c vi??n t??n 'vo minh hieu' ho???c 'le xuan ky.
select * from student where name ='le xuan ky' or name ='le hai chung';
-- 4. L???y ra h???c vi??n c?? ??i???m l???n h??n 5
select * from student where point>5;
select * from student having point>5;
-- 4. L???y ra h???c vi??n c?? ??i???m l???n h??n ho???c b???ng  4 v?? nh??? h??n ho???c b???ng  7
select * from student where point>=4 and point <=7;

select * from student where point between 4 and 7;
-- 5. L???y ra h???c vi??n c?? h??? l?? nguyen
select * from student where name like 'nguyen%';
-- like ti???ng vi???t
select * from student where name like concat('%',convert('v??n',binary),'%');
-- 6. th??ng k??? s??? l?????ng h???c sinh theo t???ng lo???i ??i???m;
select point, count(id) as so_luong from student group by point;
-- 6. th??ng k??? s??? l?????ng h???c sinh theo ??i???m v?? ??i???m ph???i l???n h??n 5
select point, count(id) as so_luong from student where point>=5 group by point;
-- 6. th??ng k??? s??? l?????ng h???c sinh theo ??i???m l???n h??n 5 v?? ch??? hi???n th??? v???i s??? l?????ng>=2 
select point, count(id) as so_luong from student where point>=5 group by point having so_luong>=2;
-- 7. L???y ra danh s??ch h???c vi??n c???a l???p c1121g1 v?? s???p x???p t??n h???c vi??n theo alphabet.
select * from 
student as s join class as c on s.class_id=c.id where c.name='c1121g1' order by s.name desc;
-- 7. L???y ra danh s??ch h???c vi??n c???a l???p c1121g1 v?? s???p x???p theo point gi???m d???n, n???u point b???ng nhau
-- th?? s???p x???p t??n theo alphabet.
select * from 
student as s join class as c on s.class_id=c.id 
where c.name='c1121g1' order by s.point desc, s.name asc;
 -- 7. th??ng k??? s??? l?????ng h???c sinh theo ??i???m l???n h??n 4 v?? ch??? hi???n th??? v???i s??? l?????ng>2 
 select point, count(id) as so_luong from student
 where point>=5 group by point having so_luong>=2 order by so_luong desc;

 -- s???p x???p theo s??? l?????ng gi???m d???n;