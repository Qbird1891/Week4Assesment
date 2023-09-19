<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Booze/Cookie Store!</title>
</head>
<body>
<h1>Select the type of Booze Or Type of Cookie
<form method="post" action="BoozeServlet">
<br>
<select name="Type" size="1">
            <option>WINE</option>
            <option>WHISKEY</option>
            <option>BEER</option>
            </select>
<br><br>
<input type = "submit">
</form>
<form method="post" action="CookieServlet">
<br>
<select name="Type" size="1">
        <option>OATMEAL</option>
        <option>SNICKERDOODLE</option>
        <option>SUGAR</option>
        </select>
<br><br>
<input type = "submit">
</form>
</h1>
</body>
</html>