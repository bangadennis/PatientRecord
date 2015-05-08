<%--
  Created by IntelliJ IDEA.
  User: banga
  Date: 5/7/15
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@page session="true"%>
<html>
<head>
  <title></title>
  <link href="<c:url value="bootstrap/bootstrap.min.css"/>" rel="stylesheet">
</head>
<body>

<div class="col-md-8">
  <a class="" href="patients"><button class="bg-info">Add Patients</button></a>
  <a class="" href="drugs"><button class="bg-info">Add Drugs</button></a>
  <a class="" href="patientslist"><button class="bg-info">Patient List</button></a>
  <a class="" href="drugslist"><button class="bg-info">Drug List</button></a>
</div>
<div>

</div>
<c:if test="${not empty error}">
  <div class="alert alert-danger">${error}</div>
</c:if>

<c:if test="${not empty msg}">
  <div class="alert alert-success">${msg}</div>
</c:if>

<div class="col-md-4 col-md-offset-4">
<form action="<c:url value='/add_drug' />" method='POST'>
  <fieldset>
    <legend>Drug's Form</legend>
    <label>Patient ID</label>
    <select name="patientId" required class="form-control">
      <option></option>
      <c:forEach  var="option" items="${data}">
        <option>${option.patientId}</option>
      </c:forEach>
    </select>
    <!--<input type="text" placeholder="patient ID" name="patientId" >-->
    <br>
    <br>
    <label class="">Drug Name</label>
    <input class="form-control" type="text" placeholder="Drug Name" name="drugName" required >
    <br>
    <button class="btn btn-success"> Add Drug</button>

  </fieldset>

</form>
</div>
</body>
</html>
