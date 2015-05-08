
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
  <link href="<c:url value="/bootstrap/bootstrap.min.css"/>" rel="stylesheet">
</head>
<body>

<div class="col-md-8">
  <a class="" href="patients"><button class="bg-info">Add Patients</button></a>
  <a class="" href="drugs"><button class="bg-info">Add Drugs</button></a>
  <a class="" href="patientslist"><button class="bg-info">Patient List</button></a>
  <a class="" href="drugslist"><button class="bg-info">Drug List</button></a>
</div>
<div>
<c:if test="${not empty error}">
  <div class="alert alert-danger">${error}</div>
</c:if>

<c:if test="${not empty msg}">
  <div class="alert alert-success">${msg}</div>
</c:if>
</div>
<div class="col-md-4 col-md-offset-4">


<form action="<c:url value='/addpatient' />" method='POST'>
<fieldset>
  <legend>Patient's Form</legend>
  <label>First Name</label><br>
  <input  class="form-control" type="text" placeholder="first name" name="fname"  required autofocus>
  <br>
  <label>Last Name</label><br>
  <input class="form-control" type="text" placeholder="last name" name="lname" required>
  <br>
  <label>Date Of Birth</label><br>
  <input class="form-control" type="date" placeholder="Date Of Birth" name="dateofbirth" required >
  <br>
  <button class="btn btn-success"> Add Patient</button>

</fieldset>

</form>
</div>

</body>
</html>
