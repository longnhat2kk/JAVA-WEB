create database demo;
use demo;

create table users(
id int(3) not null auto_increment,
name varchar(120) not null,
email varchar(120) not null,
country varchar(120),
primary key (id)
);

insert into users(name, email, country) values('Nhat','nhat@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Longnhat','longnhat@fpt.edu.vn','Viet Nam');