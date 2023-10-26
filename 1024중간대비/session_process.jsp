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
		String u_id = request.getParameter("id");
		String u_pw= request.getParameter("pwd");
		
		if(u_id.equals("admin") && u_pw.equals("1234")){
			session.setAttribute("UserID", u_id);
			session.setAttribute("UserPW", u_pw );
			session.setMaxInactiveInterval(15);
			response.sendRedirect("sessionLoginOK.jsp");
		}
		else{
			// session.invaildate();
			response.sendRedirect("session.jsp");
		}
	%>

</body>
</html>