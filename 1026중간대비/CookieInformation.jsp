<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie[] cookie = request.getCookies();
		out.println(">> 쿠키의 개수 "+ cookie.length + "<br>");
		out.println("<hr>");
		
		for(int i=0 ; i<cookie.length; i++){
			out.println("쿠키 이름:"+cookie[i].getName() + "<br>");
			out.println("쿠키 값:"+cookie[i].getValue());
			out.println("<hr>");
		}
	%>	
	<br>
	<a href ="CookieLoginform.jsp">로그인 화면 돌아가기</a>

</body>
</html>