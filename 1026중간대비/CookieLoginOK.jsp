<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Home > 로그인성공화면
	
	<%
	  String id = null;
	  Cookie[] cookie = request.getCookies();
	  for(int i=0 ; i<cookie.length ; i++){
		  if(cookie[i].getName().equals("UserID")){
			  id = cookie[i].getValue();
		  }
	  }
	  if( id == null) {
		  response.sendRedirect("CookieLoginform.jsp");
	  }
	%>
	
	<br>
	<a href = "CookieLogout.jsp">로그아웃하기</a>
	<a href = "CookieInformation.jsp">쿠키 정보 보기</a>

</body>
</html>