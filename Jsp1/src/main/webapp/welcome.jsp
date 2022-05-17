<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp@Jobiak#anilBoppuri</title>
</head>
<body>

<%!   int a=10; 
  public int cube(int n) {
	return n*n*n;
}

  ArrayList<String> topics=new ArrayList<>();

%>
<h1> <%=new String("Welcome to jsp")  %> 
</h1>
<h2>

<%
out.println("you can java in tags which are known as declarations,xpressions,commetnts");


out.println(a);
%>
</h2>


<h3>  4^3 is :<%=cube(4)%>

<%topics.add("html,css,Js");
topics.add("Typescript and angular 10");
topics.add("AWS,junit,jekinsand git");
%>
</h3>
<h4>
<% for(String topic:topics) {
	out.println(topic+"</br>");
}
%>

</h4>
</body>
</html>