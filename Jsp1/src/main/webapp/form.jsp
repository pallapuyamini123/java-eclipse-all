<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Example</title>
</head>
<body>

<h2> 
Enter your data
</h2>
<hr/>
<form name="signupform" action="form.jsp" method="post">
Enter first name:<input type="text" name="fname"><br/>
Email:<input type="text" name="email"><br/>
Mobile:<input type="text" name="mobile"><br/>
Click to send data<input type="submit" name="send"><br/>
<input type="reset" name="clear"><br/>



</form>
<hr/> First Name:<%=request.getParameter("fname") %><br/>
Email:<%=request.getParameter("email") %><br/>
Mobile:<%=request.getParameter("mobile") %><br/>


<hr/>


</body>
</html>