<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to my web app!</h1>
    
	<%-- <a href="<%=request.getContextPath()%>/home">go to home page</a> --%>
	<form action="<%=request.getContextPath()%>/login" method="post">
	
		Username: <input type="text" name="username"/><br/><br/>
		Password: <input type="password" name="password"/><br/><br/>
		<input type = "submit" value = "login"/>
	</form>
</body>
</html>

