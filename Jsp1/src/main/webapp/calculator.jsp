<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> 
Enter your data
</h2>
<hr/>
<form name="calculator" action="calculator.jsp" method="post">
Enter first number:<input type="text" name="fnum"><br/>
Enter second number:<input type="text" name="snum"><br/>

Click to send data<input type="submit" name="send"><br/>
<input type="reset" name="clear"><br/>



</form>
<hr/> <%

String fnum=request.getParameter("fnum");

int n1=Integer.parseInt(fnum);


String snum=request.getParameter("snum");

int n2=Integer.parseInt(snum);



%>

<h3>

<%
out.println("addition:"+(n1+n2));
%>
</h3>
</body>
</html>