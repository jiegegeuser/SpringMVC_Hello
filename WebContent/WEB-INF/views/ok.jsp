<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>Hey man! I am SpringMVC!</h2><hr>
		<h2>${requestScope.username }</h2><hr>
		<h2><%=request.getAttribute("username") %></h2>
		<h2>${requestScope.m1 }</h2><hr>
		<h2>${requestScope.m2 }</h2><hr>
		<h2>${requestScope.m3 }</h2><hr>
		<h2>${sessionScope.user }</h2><hr>
		<h2>${sessionScope.subway }</h2><hr>
		<h2>${sessionScope.subway2 }</h2><hr>
		<h2>${sessionScope.currentTime }</h2><hr>
		
		username:<fmt:message key="username"></fmt:message><br>
		password:<fmt:message key="password"></fmt:message><br>
	</center>
</body>
</html>