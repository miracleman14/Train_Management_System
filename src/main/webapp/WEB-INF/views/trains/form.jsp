<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add a New Train</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #fff;
            margin: 0;
            padding: 20px;
        }

        h1 {
            color: #333;
        }

        form {
            margin-top: 20px;
        }

        label {
            display: block;
            margin: 10px 0 5px;
            color: #333;
        }

        input {
            padding: 8px;
            width: 100%;
            margin-bottom: 10px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<h1>Add a New Train</h1>
<form:form method="post" action="/addTrain" modelAttribute="train">
    <label for="id">ID:</label>
    <form:input path="id" required="true"/><br>

    <label for="route">Route:</label>
    <form:input path="route" required="true"/><br>

    <label for="manufacturer">Manufacturer:</label>
    <form:input path="manufacturer" required="true"/><br>

    <input type="submit" value="Add Train">
</form:form>
</body>
</html>
