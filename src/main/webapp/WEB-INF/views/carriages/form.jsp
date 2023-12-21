<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add a New Carriage</title>
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

        form {
            max-width: 600px;
            margin: 20px auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 8px;
        }

        input,
        select {
            width: 100%;
            padding: 10px;
            margin-bottom: 16px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }

        select {
            cursor: pointer;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 12px 20px;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<h1>Add a New Carriage</h1>
<form method="post" action="/addCarriage">
    <label for="code">Code:</label>
    <input type="text" name="code" id="code" required><br>
    <label for="driver">Driver:</label>
    <input type="text" name="driver" id="driver" required><br>
    <label for="type">Type:</label>
    <select name="type" id="type">
        <option value="First Class">First Class</option>
        <option value="Second Class">Second Class</option>
        <option value="Third Class">Third Class</option>
    </select><br>
    <label for="seats">Seats:</label>
    <input type="number" name="seats" id="seats" required><br>
    <input type="hidden" name="train" value="${trainId}">
    <input type="submit" value="Add Carriage">
</form>
</body>
</html>
