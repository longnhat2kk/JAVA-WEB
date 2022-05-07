<%--
  Created by IntelliJ IDEA.
  User: Le Chu Long Nhat
  Date: 05/01/2022
  Time: 8:33 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<style>
    img{
        height: auto;
        width: 150px;
    }

</style>
<body>
<h1>Danh sách khách hàng</h1>
<form action="khach_hang" method="post">
</form>
<div>
    <table>
        <tr>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa Chỉ</th>
            <th>Ảnh</th>
        </tr>

        <tr>
            <th>Mai Văn Hoàn</th>
            <th>1983-08-20</th>
            <th>Hà Nội</th>
            <th><img src="./img/a.jpg"></th>
        </tr>
        <tr>
            <th>Nguyễn Văn Nam</th>
            <th>1983-08-21</t   h>
            <th>Bắc Giang</th>
            <th><img src="./img/b.jpeg"></th>
        </tr>
        <tr>
            <th>Nguyễn Thái Hoà</th>
            <th>1983-08-22</th>
            <th>Nam Định</th>
            <th><img src="./img/c.jpg"></th>
        </tr>
    </table>
</div>

</body>

</html>
