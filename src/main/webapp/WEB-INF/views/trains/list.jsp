<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List of Trains</title>
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
            padding: 12px;
            text-align: left;
        }

        th {
            background-color: #007bff;
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        a {
            text-decoration: none;
            color: #007bff;
            font-weight: bold;
        }

        a:hover {
            color: #0056b3;
        }

        .add-link {
            display: block;
            margin-top: 20px;
            text-align: right;
        }
    </style>
</head>
<body>
<h1>List of Trains</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Route</th>
        <th>Manufacturer</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${trains}" var="train">
        <tr>
            <td>${train.id}</td>
            <td>${train.route}</td>
            <td>${train.manufacturer}</td>
            <td><a href="/carriages?train=${train.id}">View Carriages</a></td>
        </tr>
    </c:forEach>
</table>
<a class="add-link" href="/newTrain">Add New Train</a>
</body>
</html>
