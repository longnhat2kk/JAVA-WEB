create database bai_tap_o_nha;
use bai_tap_o_nha;
create table `tai_khoan` (
username varchar(15) primary key,
`password` varchar(100) not null -- là bắt buộc nhập thông tin khi thêm mới hoặc sửa 
);

create table lop_hoc(
ma_lop_hoc int primary key auto_increment,
ten_lop_hoc varchar(100)
);

create table giang_vien(
ma_giang_vien int primary key auto_increment,
ten_giang_vien varchar(100),
ngay_sinh date
);

create table hoc_vien (
-- auto_increment : tự động tăng, áp dụng cho số
ma_hoc_vien int primary key auto_increment,
ten_hoc_vien varchar(100),
ngay_sinh date,
email varchar(100),
-- unique : không trùng lặp
username varchar(15) unique,
ma_lop_hoc int,
foreign key(ma_lop_hoc) references lop_hoc(ma_lop_hoc),
foreign key(username) references tai_khoan(username)
);

create table dia_chi(
ma_dia_chi int primary key auto_increment,
dia_chi varchar (255),
ma_hoc_vien int,
foreign key(ma_hoc_vien) references hoc_vien(ma_hoc_vien)
);

create table giang_vien_day_lop_hoc(
ma_giang_vien int,
ma_lop_hoc int,
primary key(ma_giang_vien,ma_lop_hoc), -- khóa phức hợp
foreign key(ma_giang_vien) references giang_vien(ma_giang_vien),
foreign key(ma_lop_hoc) references  lop_hoc(ma_lop_hoc)
);

-- CHÈN DỮ LIỆU VÀO

insert into `tai_khoan` values
("longnhat","123"),
("longnhat1","123"),
("longnhat2","123"),
("longnhat3","123"),
("longnhat4","123"),
("longnhat5","123"),
("longnhat6","123"),
("longnhat7","123");

select * from`tai_khoan`;

insert into lop_hoc(ten_lop_hoc) values
("A0721I1"),
("A0721I2"),
("A0721I3"),
("A0721I4"),
("A0721I5"),
("A0721I6"),
("A0721I7");

select * from lop_hoc;

insert into giang_vien(ten_giang_vien,ngay_sinh) values
("Hai","1235-6-7"),
("Hai1","1236-7-8"),
("Hai2","1237-8-9"),
("Hai3","1238-9-10"),
("Hai4","1239-10-11"),
("Hai5","1240-11-12"),
("Hai6","1241-12-13");

select * from giang_vien;

insert into hoc_vien(ten_hoc_vien, ngay_sinh, email, username, ma_lop_hoc)
 values
("LongNhat","2000-01-02","longnhat212001@gmail.com","longnhat1",3),
("LongNhat2","2000-01-03","longnhat212002@gmail.com","longnhat2",4),
("LongNhat3","2000-01-04","longnhat212003@gmail.com","longnhat3",5),
("LongNha4","2000-01-05","longnhat212004@gmail.com","longnhat4",5),
("LongNhat5","2000-01-06","longnhat212005@gmail.com","longnhat5",6),
("LongNhat6","2000-01-07","longnhat212006@gmail.com","longnhat6",7),
("LongNhat7","2000-01-08","longnhat212007@gmail.com","longnhat7",8);

select * from hoc_vien;

insert into dia_chi(dia_chi, ma_hoc_vien) values 
("DaNang",3),
("DaNang1",4),
("DaNang2",5),
("DaNang3",6),
("DaNang4",7),
("DaNang5",8),
("DaNang6",9);

select * from dia_chi;

insert into giang_vien_day_lop_hoc values 
(1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7);

select * from giang_vien_day_lop_hoc;
