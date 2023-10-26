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
	  String U_id = request.getParameter("id");
	  String U_pw = request.getParameter("pwd");
	  
	  if(U_id.equals("admin") && U_pw.equals("1234")){
		  session.setAttribute("UserID", U_id );
		  session.setMaxInactiveInterval(15);
		  response.sendRedirect("sessionLoginOK.jsp");
	  }
	  else{
		  response.sendRedirect("sessionLogin.jsp");
	  }
	%>

</body>
</html>