<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hearty Welcome To JSP Servlets</title>
</head>
<body>
<!-- Scriplet tags -->
<%
int empno=101;
String empname="Ramesh";
double empsal=100012.235;
String empaddr="Hyderabad";
out.println("The employee no is: " + empno);
out.println("<br/>");
out.println("The employee name is:  " + empname);
out.println("<br/>");
out.println("The employee salary is: " + empsal);
out.println("<br/>");
out.println("The employee Address is: " + empaddr);
%>
<hr/>
<!-- Expression tags -->
<%="the employee no is:" +empno%><br/>
<%="the employee name is: " +empname %><br/>
<%="the employee salary is: " +empsal %><br/>
<%="the employee address is: " +empaddr %>
<!-- Declarative tags -->
<%!
int empno=1883;
String empname = "Ramesh";
public int getSquare(int x){
	return x * x;
}%>
<br/>
<%= " the employee no is: " + empno%><br/>
<%= " the employee name is:  " + empname%>
<br/>
<%="the square of the given number: " + getSquare(3)%>
</body>
</html>