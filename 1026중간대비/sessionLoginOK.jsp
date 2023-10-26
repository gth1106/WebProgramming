<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% if(session.getAttribute("UserID")==null){  // 로그인하지 않은 상태에서 로그인이 필요한 페이지에 접근하는 것을 방지하기 위한 코드입니다.
		  response.sendRedirect("sessionLogout.jsp");
	}
    // 로그인 성공 화면에 접근할 때, 세션에 UserID가 있는지 확인합니다.
    // 만약 UserID가 없다면, 사용자가 로그인하지 않은 상태로 로그인 성공 화면에 접근하려고 했음을 의미하므로
    // 로그아웃 페이지로 리디렉션 시킵니다.
	%>
	<h1><%= session.getAttribute("UserID") %>님반가워요! </h1>
	<a href="sessionLogout.jsp">로그아웃</a>
</body>
</html>