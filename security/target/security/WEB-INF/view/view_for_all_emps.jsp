<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 09.12.2020
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All employees info</title>
</head>
<body>

<h3>Information for all employees</h3>
<br>

<security:authorize access="hasRole('HR')">
<input type="button" value="Salary" onclick="window.location.href='hr_info'"/>
Only for HRs
<br>
</security:authorize>

<security:authorize access="hasRole('MANAGER')">
<input type="button" value="Performance" onclick="window.location.href='manager_info'"/>
Only for Managers
<br>
</security:authorize>

</body>
</html>
