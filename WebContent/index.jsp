<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<a href="${pageContext.request.contextPath }/hello">点我点我</a>
	</center><br>
	<center>
		<a href="${pageContext.request.contextPath }/testParams?age=110&name=jacson">testParams</a>
	</center><br>
<center>
		<a href="${pageContext.request.contextPath }/testHeaders">testHeaders</a>
	<br>
		<a href="${pageContext.request.contextPath }/testAntStyle/aa/bb">testAntStyle</a>
	<br>
		<a href="${pageContext.request.contextPath }/testPatyVariable/1111">testPatyVariable</a>
	<br>
	
	
	<fieldset>
		<form action="${pageContext.request.contextPath }/hello/111" method="post">
			<input type="hidden" name="_method" value="DELETE">
			<input type="submit" value="delete">
		</form><br>
		<form action="${pageContext.request.contextPath }/hello/111" method="post">
			<input type="hidden" name="_method" value="PUT">
			<input type="submit" value="put">
		</form><br>
		<a href="${pageContext.request.contextPath }/testGet/1111">testGet</a>
	<br>
	</fieldset>
	
	<a href="${pageContext.request.contextPath }/testRequestParams?id=110&id=111&id=112&name=jacson">testRequestParams</a>
	<br>
	<a href="${pageContext.request.contextPath }/testRequestHeader">testRequestHeader</a>
	<br>
	<a href="${pageContext.request.contextPath }/testCookieValue">testCookieValue</a>
	<br>
	
	<form action="${pageContext.request.contextPath }/testPojo" method="post">
		<input type="text" name="userName" value="Joe">
		<input type="password" name="passWord" value="123123">
		<input type="text" name="address" value="美国">
		<input type="text" name="gender" value="男">
		<input type="submit" value="pojo_submit">
	</form><hr>
	<a href="${pageContext.request.contextPath }/testServletAPI">testServletAPI</a>
	<hr>
	<a href="${pageContext.request.contextPath }/testModelAndView">testModelAndView</a>
	<hr>
	<a href="${pageContext.request.contextPath }/testMap_Model_ModelMap">testMap_Model_ModelMap</a>
	<hr>
	<a href="${pageContext.request.contextPath }/testSessionAttributes">testSessionAttributes</a>
	<hr>
	testModelAttribute:
	<form action="${pageContext.request.contextPath }/testModelAttribute" method="post">
		<input type="hidden" name="_method" value="PUT">
		<input type="hidden" name="id" value="1">
		<input type="text" name="userName" value="中国大妈">
		<input type="text" name="address" value="外国">
		<input type="text" name="gender" value="大妈">
		<input type="submit" value="点啊！">
	</form>
	<hr>
	<a href="${pageContext.request.contextPath }/testMySelfView">testMySelfView</a>
	<hr>
	<a href="${pageContext.request.contextPath }/testI18N">testI18N</a>
	<hr>
	<a href="${pageContext.request.contextPath }/testForward">testForward</a>
	<hr>
	<a href="${pageContext.request.contextPath }/testRedirect">testRedirect</a>
	<hr>
	<a href="${pageContext.request.contextPath }/testMvcViewController">testMvcViewController</a>
	<hr>
	
	
</center>
</body>
</html>