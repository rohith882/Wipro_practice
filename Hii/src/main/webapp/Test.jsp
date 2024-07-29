<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    import="Servelt.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="u"
class="Servelt.User" />
<jsp:setProperty property="name" name="u" value="Virat"/>
<jsp:setProperty property="age" name="u" value="18"/>
<p>User Name:<jsp:getProperty property="name" name="u"/></p>
<p>User No:<jsp:getProperty property="age" name="u"/></p>

</body>
</html>