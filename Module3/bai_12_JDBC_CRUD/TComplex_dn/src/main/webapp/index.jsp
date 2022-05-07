<%--
  Created by IntelliJ IDEA.
  User: LE CHU LONG NHAT
  Date: 26/01/2022
  Time: 07:27 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <table>
        <tr>
          <td>Mã mặt bằng (*)<input type="text"></td>
          <td>Diện tích (*)<input type="text"></td>
          <td>Trạng thái(*)<select>
            <option>Trống</option>
            <option>Hết</option>
          </select></td>
          <td>Tầng (*)<select>
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
            <option>5</option>
            <option>6</option>
            <option>7</option>
            <option>8</option>
            <option>9</option>
            <option>10</option>
            <option>11</option>
            <option>12</option>
            <option>13</option>
            <option>14</option>
            <option>15</option>
          </select></td>
          <td>Loại văn phòng <select>
            <option>Cho thuê</option>
            <option>Cho thuê2</option>
          </select></td>
          <td>Mô tả chi tiết <input type="text">VND</td>
          <td>Giá cho thuê()*<input type="text"></td>
          <td>Ngày bắt đầu <input type="date"></td>
          <td>Ngày kết thúc <input type="date"></td>
          <td>Lưu <input type="button"></td>
          <td>Huỷ <input type="button"></td>

        </tr>

      </table>
  </body>
</html>
