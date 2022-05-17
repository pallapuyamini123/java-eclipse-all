<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
.

<jsp:useBean id="userBean" class="ai.jobiak.model.User"></jsp:useBean>
<hr>
<h3> Your data is...

First Name: <jsp:getProperty property="fname" name="userBean"/><br>
Email:  <jsp:getProperty property="email" name="userBean"/><br>
Mobile #:  <jsp:getProperty property="mobile" name="userBean"/><br>
</hr>
</h3>
</body>
</html>