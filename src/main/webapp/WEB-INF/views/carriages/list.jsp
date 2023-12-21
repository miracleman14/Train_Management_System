<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List of Carriages</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }

        h1 {
            color: #333;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #007bff;
            color: #fff;
        }

        tr:hover {
            background-color: #f5f5f5;
        }

        a {
            display: block;
            margin-top: 20px;
            text-decoration: none;
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border-radius: 4px;
            width: 200px;
            text-align: center;
        }

        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<h1>List of Carriages</h1>
<table>
    <tr>
        <th>Code</th>
        <th>Driver</th>
        <th>Type</th>
        <th>Seats</th>
    </tr>
    <c:forEach items="${carriages}" var="carriage">
        <tr>
            <td>${carriage.code}</td>
            <td>${carriage.driver}</td>
            <td>${carriage.type}</td>
            <td>${carriage.seats}</td>
        </tr>
    </c:forEach>
</table>
<a href="/newCarriage?train=${trainId}">Add New Carriage</a>
</body>
</html>
