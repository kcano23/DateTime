<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time</title>
<link rel="stylesheet" type="text/css" href="style.css">
<script type="text/javascript" src="timeApp.js"></script>
</head>
<body>
	<h1 class = greenFont><c:out value="${displayDate}"/></h1>
</body>
</html>