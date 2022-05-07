-- create database bt_studen_management;
-- use bt_studen_management
create table Class(
`id` int,
`name` nvarchar(50)
);
create table Teacher(
`id` int,
`name` nvarchar(50),
`country` nvarchar(50)
); 
select * from bt_studen_management.class;
select * from bt_studen_management.Teacher;