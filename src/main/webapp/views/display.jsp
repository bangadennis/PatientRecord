<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: banga
  Date: 5/7/15
  Time: 6:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<c:if test="${not empty patientList}">
    <h1>Patient Table</h1>
    <div class="employeeList">
        <table>
            <thead>
            <td>Patient ID</td>
            <td>FirstName</td>
            <td>LastName</td>
            <td>DateOfBirth</td>
            <td>Timestamp</td>
            </thead>
            <c:forEach var="patient" items="${patientList}">
                <tr>
                    <td>${patient.patientId}</td>
                    <td>${patient.fname}</td>
                    <td>${patient.lname}</td>
                    <td>${patient.dateofbirth}</td>
                    <td>${patient.timestamp}</td>

                </tr>
            </c:forEach>
        </table>
    </div>
</c:if>

<c:if test="${not empty drugList}">
    <h1>Drugs Table</h1>
    <div class="drugList">
        <table>
            <thead>
            <td>Id</td>
            <td>Patient ID</td>
            <td>Drug Name</td>
            </thead>
            <c:forEach var="drug" items="${drugList}">
                <tr>
                    <td> ${drug.pk} </td>
                    <td> ${drug.patient_id} </td>
                    <td> ${drug.drugName} </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</c:if>
</body>
</html>
