
<%--
  Created by IntelliJ IDEA.
  User: banga
  Date: 5/7/15
  Time: 12:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page session="true"%>
<html>
<head>
    <title></title>
</head>
<body>

<c:if test="${not empty error}">
  <div class="error">${error}</div>
</c:if>

<c:if test="${not empty msg}">
  <div class="msg">${msg}</div>
</c:if>

<form action="<c:url value='/addpatient' />" method='POST'>
<fieldset>
  <legend>Patient's Form</legend>
  <label>First Name</label><br>
  <input type="text" placeholder="first name" name="fname"  required autofocus>
  <br>
  <label>Last Name</label><br>
  <input type="text" placeholder="last name" name="lname" required>
  <br>
  <label>Date Of Birth</label><br>
  <input type="date" placeholder="Date Of Birth" name="dateofbirth" required >
  <br>
  <button> Add Patient</button>

</fieldset>

</form>

</body>
</html>
