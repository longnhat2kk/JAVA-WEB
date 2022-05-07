USE QuanLySinhVien;
-- Hiển thị danh sách tất cả các học viên
select * from student;

-- Hiển thị danh sách các học viên đang theo học.
select * from student where Status = true;

-- Hiển thị danh sách các môn học có thời gian học nhỏ hơn 10 giờ.
select * from `subject` where Credit < 10;

-- Hiển thị danh sách học viên lớp A1
select * from class where class.ClassName = 'A1'

-- Hiển thị điểm môn CF của các học viên
SELECT S.StudentId, S.StudentName, Sub.SubName, M.Mark
FROM Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId
WHERE Sub.SubName = 'CF';