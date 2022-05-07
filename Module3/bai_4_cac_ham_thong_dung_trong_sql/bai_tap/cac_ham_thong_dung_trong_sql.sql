USE QuanLySinhVien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select *,  max(Credit)
from subject;

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select sub.SubID, Sub.SubName,  max(Mark)
from subject sub join mark m on Sub.SubID = m.SubID
group by sub.SubID, Sub.SubName;

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select s.studentId, s.studentName, avg(mark) 
from student s join mark m on S.StudentID = m.studentID
group by s.studentId, s.studentName
order by mark desc;