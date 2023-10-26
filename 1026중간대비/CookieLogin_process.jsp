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
		request.setCharacterEncoding("utf-8");
		
		String U_id = request.getParameter("id");
		String U_pw = request.getParameter("pwd");
		
		if(U_id != null && U_id.equals("admin") && U_pw.equals("1234")){
			Cookie cook_id = new Cookie("UserID", U_id);
			Cookie cook_pw = new Cookie("UserPW", U_pw);
			response.addCookie(cook_id);
			response.addCookie(cook_pw);
			response.sendRedirect("CookieLoginOK.jsp");
		}
		else{
			response.sendRedirect("CookieLogin_failure.jsp");
		}
	%>

</body>
</html>