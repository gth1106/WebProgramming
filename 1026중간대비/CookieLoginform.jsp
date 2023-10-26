<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="CookieLogin_process.jsp" method = "POST">
		<p>
			아이디 : <input type="text" name="id">
		<p>
			비밀번호 : <input type="password" name="pwd">
		<p>
			<input type="submit" value="전송">
	</form>
	<br>
	<a href="CookieInformation.jsp">쿠키 정보 보기</a>

</body>
</html>