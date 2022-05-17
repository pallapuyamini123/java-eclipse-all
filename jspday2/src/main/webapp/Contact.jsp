<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact using bean</title>
</head>
<body>
<jsp:useBean id="userBean" class="ai.jobiak.ass.Contact"></jsp:useBean>
<hr>
<h3> Your data is...

Name: <jsp:getProperty property="name" name="userBean"/><br>
Age:  <jsp:getProperty property="age" name="userBean"/><br>
Mobile #:  <jsp:getProperty property="mobile" name="userBean"/><br>  ////it is showing null data
</hr>
</h3>

</body>
</html>