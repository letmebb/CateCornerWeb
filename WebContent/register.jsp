<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post"
		action="<%=request.getContextPath()%>/register.action">

		用户名：<input type="text" name="user_name" maxlength="30"> <br />
		<br /> 密码：<input type="password" name="user_pass" maxlength="30">
		<br /> <br /> 电话：<input type="text" name="user_tele" maxlength="30"><br />
		<br /> Email：<input type="text" name="user_email" maxlength="30">
		<br /> <br /> <input type="submit" value="注册"> &nbsp;&nbsp;
		<font color="red">${off }</font>
	</form>
</body>
</html>