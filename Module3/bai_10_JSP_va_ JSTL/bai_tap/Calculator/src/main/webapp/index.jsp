<%--
  Created by IntelliJ IDEA.
  User: Le Chu Long Nhat
  Date: 07/01/2022
  Time: 4:59 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<style>

</style>
<body>
<form method="post" action="CalculateServlet">

    <h1>Simple Calculator</h1>
    <table>
        <tr>
            <td>First operand:</td>
            <td><input type="text" name="firstOperand"></td>
        </tr>
        <tr>
            <td>Operator:</td>
            <td><select id="operator" name="operator">
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="*">*</option>
                <option value="/">/</option>
            </select></td>
        </tr>
        <tr>
            <td>Second operand:</td>
            <td><input type="text" name="secondOperand"> <br></td>
        </tr>
        <tr>
            <td>First operand:</td>
            <td><input type="submit" id="submit" value="Calculate"> <br></td>
        </tr>
    </table>
</form>
</body>
</html>
