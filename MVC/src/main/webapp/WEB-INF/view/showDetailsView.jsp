<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 05.12.2020
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show details</title>
</head>
<body>
    <h2>Here are your requested details!</h2>

    <h3>Name: ${employee.name}</h3>
    <br>
    <h3>Surname: ${employee.surname}</h3>
    <br>
    <h3>Salary: ${employee.salary}</h3>
    <br>
    <h3>Email: ${employee.email}</h3>
    <br>
    <h3>Department: ${employee.department}</h3>
    <br>
    <h3>Car: ${employee.car}</h3>
    <br>
    Languages:
    <c:forEach var="lang" items="${employee.langs}">
        ${lang}
        <br>
    </c:forEach>

</body>
</html>
