<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
jsp:forward page="Display.jsp">
<jsp:param name="empno" value = "100"/>
<jsp:param name="empname" value="Hitman"/>
</jsp:forward>

</body>
</html>