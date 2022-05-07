use furuma_resort;
-- Tạo dữ liệu bảng vị trí
insert into vi_tri(ten_vi_tri)
values  ('Le tan'),
		('Phuc vu'),
        ('Chuyen vien'),
        ('Giam sat'),
        ('Quan ly'),
        ('Giam doc');
select * from vi_tri;

-- Tạo dữ liệu bảng trình độ
insert into trinh_do(ten_trinh_do)
values ('Trung cap'),
		('Cao dang'),
        ('Dai hoc'),
        ('Sau dai hoc');
 select * from trinh_do; 
 
-- Tạo dữ liệu bảng bộ phận
insert into bo_phan(ten_bo_phan)
values  ('Sale - Marketing'),
		('Hanh chinh'),
		('Phuc vu'),
        ('Quan ly');
select * from bo_phan;

-- Tạo dữ liệu bảng khách hàng
insert into loai_khach(ten_loai_khach)
values  ('Diamond'),
		('Platinium'),
		('Gold'),
        ('Silver'),
        ('Member');
select * from loai_khach;

-- Tạo dữ liệu bảng dịch vụ đi kèm
insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai_kha_dung)
values  ('Massage',800000,1,'Trong'),
		('Karaoke',200000,1,'Trong'),
		('Food',100000,1,'Trong'),
		('Nuoc',50000,1,'Trong'),
		('Xe',150000,1,'Trong');
select * from dich_vu_di_kem;

-- Tạo dữ liệu bảng loại dịch vụ
insert into loai_dich_vu(ten_loai_dich_vu)
values  ('Villa'),
		('House'),
		('Room');
select * from loai_dich_vu;

-- Tạo dữ liệu bảng kiểu thế
insert into kieu_thue(ten_kieu_thue,gia)
values  ('Theo nam',200000000),
		('Theo thang',25000000),
		('Theo ngay',1000000),
		('Theo gio',50000);
select * from kieu_thue;

-- Tạo dữ liệu bảng dịch vụ
insert into dich_vu(ten_dich_vu, dien_tich, so_tang, so_nguoi_toi_da, chi_phi_thue, id_kieu_thue, id_loai_dich_vu, trang_thai)
values  ('Villa to',100,3,30,500000,4,1,'trong'),
		('Villa nho',70,2,10,100000,3,1,'trong'),
		('House nho',50,1,5,50000,4,2,'trong'),
		('Room nho',30,1,3,50000,4,3,'trong');
select * from dich_vu;

-- Tạo dữ liệu bảng nhân viên
insert into nhan_vien(ten_nhan_vien,id_vi_tri,id_trinh_do,id_bo_phan,ngay_sinh,cmnd,luong,sdt,email,dia_chi)
values  ('Nhat',1,1,1,'1997-05-27','231074010',10000000,'0989714995','nhanvien1@gmail.com','Hai Chau'),
		('Nam',2,2,2,'1999-04-05','123474099',8000000,'0986234991','nhanvien2@gmail.com','Lien Chieu'),
		('Khanh',3,3,3,'1980-11-30','553374567',12000000,'0123768900','nhanvien3@gmail.com','Hoa Khanh'),
        ('Hao',4,4,4,'1987-09-09','713374333',15000000,'0387612432','nhanvien4@gmail.com','Quang Tri'),
        ('Thanh',5,3,1,'2000-12-11','531107409',20000000,'0966432123','nhanvien5@gmail.com','Da Nang'),
        ('Nhi',6,4,2,'2002-01-02','789074432',25000000,'0905432123','nhanvien6@gmail.com','Hai Chau');
select * from nhan_vien;

-- Tạo dữ liệu bảng khách hàng
insert into khach_hang(ten_khach_hang,id_loai_khach,ngay_sinh,cmnd,sdt,email,dia_chi)
values  ('Nhat',1,'1997-05-27','231074010','0989714995','khachhang1@gmail.com','Hai Chau'),
		('Nam',2,'1999-04-05','123474099','0986234991','khachhang2@gmail.com','Lien Chieu'),
		('Khanh',3,'1980-11-30','553374567','0123768900','khachhang3@gmail.com','Hoa Khanh'),
        ('Hao',4,'1987-09-09','713374333','0387612432','khachhang4@gmail.com','Quang Tri'),
        ('Thanh',3,'2000-12-11','531107409','0966432123','khachhang5@gmail.com','Da Nang'),
        ('Nhi',2,'2002-01-02','789074432','0905432123','khachhang6@gmail.com','Hai Chau'),
        ('Nhi',2,'2002-01-02','789074432','0905432123','khachhang6@gmail.com','Hai Chau');
        
select * from khach_hang;

-- Tạo dữ liệu bảng hợp đồng
insert into hop_dong(id_nhan_vien, id_khach_hang, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, tong_tien, id_dich_vu)
values	(1,2,'2018-03-15','2019-07-12',1000000,6000000,4),
		(3,4,'2019-03-15','2019-07-12',1000000,6000000,2),
		(4,3,'2019-04-03','2019-04-12',1000000,6000000,3),
        (1,1,'2021-03-10','2021-03-12',500000,1000000,1);
      
select * from hop_dong;

-- Tạo dữ liệu bảng chi tiết hợp đồng
insert into chi_tiet_hop_dong(id_hop_dong, id_dich_vu_di_kem, so_luong)
values(1,1,2),
	  (2,2,3),
      (3,3,5);
insert into hop_dong(id_nhan_vien, id_khach_hang, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, tong_tien, id_dich_vu)
values 	(1,2,'2021-01-15','2021-10-12',1000000,6000000,4),
		(3,4,'2021-02-15','2021-10-12',1000000,6000000,2),
		(4,3,'2019-02-03','2019-10-12',1000000,6000000,3),
		(1,1,'2019-04-10','2019-10-12',500000,1000000,1);
select * from chi_tiet_hop_dong;