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
</head>
<body>

<c:if test="${not empty error}">
  <div class="error">${error}</div>
</c:if>

<c:if test="${not empty msg}">
  <div class="msg">${msg}</div>
</c:if>

<form action="<c:url value='/add_drug' />" method='POST'>
  <fieldset>
    <legend>Drug's Form</legend>
    <label>Patient ID</label>
    <select name="patientId" required autofocus>
      <c:forEach  var="option" items="${data}">
        <option></option>
        <option>${option.patientId}</option>
      </c:forEach>
    </select>
    <!--<input type="text" placeholder="patient ID" name="patientId" >-->
    <br>
    <br>
    <label>Drug Name</label>
    <input type="text" placeholder="Drug Name" name="drugName" required >
    <br>
    <button> Add Drug</button>

  </fieldset>

</form>

</body>
</html>
