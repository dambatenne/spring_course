<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 05.12.2020
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>

<h2>Please enter your details</h2>

<form:form action="showDetails" modelAttribute="employee">

    Name: <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    Surname: <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    Salary: <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    Email: <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    Department:
    <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>
    <br>
    Car brand:
    <form:radiobuttons path="car" items="${employee.carBrands}"/>
    <br>
    Languages:
    <form:checkboxes path="langs" items="${employee.langList}"/>
    <br>
    <input type="submit" value="Ok"/>

</form:form>

</body>
<head>
    <title>Enter form</title>
</head>
</html>
