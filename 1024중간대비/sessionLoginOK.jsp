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
	if(session.getAttribute("UserID")==null){
		session.invalidate();
		response.sendRedirect("session.jsp");
	}
%>
<h1><%= session.getAttribute("UserID") %> 님 반가워요</h1>
<h1><%= session.getAttribute("UserPW") %> 는패스워드~</h1>

<a href="sessionLogout.jsp">로그아웃</a>
</body>
</html>