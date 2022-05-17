<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h3>check...</h3>
<h3>Enter your data</h3>
<h3>
<form  action="BeanAction.jsp" method="post">
Enter first name:<input type="text" name="fname"><br/>
Email:<input type="text" name="email"><br/>
Mobile:<input type="text" name="mobile"><br/>
Click to send data<input type="submit" name="send"><br/>
<input type="reset" name="clear"><br/>
</h3>
<jsp:useBean id="userBean" class="ai.jobiak.model.User"></jsp:useBean>
<jsp:setProperty property="fname" name="userBean" param="fname"/>
<jsp:setProperty property="email" name="userBean" param="email"/>
<jsp:setProperty property="mobile" name="userBean" param="mobile"/>

<hr>
<h3> Your data is...
<hr>
First Name:<jsp:getProperty property="fname" name="userBean"/><br>
Email:<jsp:getProperty property="email" name="userBean"/><br>
Mobile #:<jsp:getProperty property="mobile" name="userBean"/><br>
</hr>
  
</h3>
</body>
</html>