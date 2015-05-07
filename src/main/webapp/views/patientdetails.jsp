
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

  <input type="text" placeholder="first name" name="fname" >
  <input type="text" placeholder="last name" name="lname" >
  <input type="date" placeholder="Date Of Birth" name="dateofbirth" >

  <button> Add</button>

</form>

</body>
</html>
