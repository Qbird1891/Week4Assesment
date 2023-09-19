<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Availibe brands for Selected Cookie Type!</title>
</head>
<body>
<h1>Availibe Brands</h1>
<%
  List result = (List) request.getAttribute("cookie brands");
  Iterator it = result.iterator();
  out.println("<br>We Have <br><br>");
  while(it.hasNext()){
  out.println(it.next()+"<br>");
  }
%>
</body>
</html>