<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!
		String str = "Hello, Java Server page";
		public String getString(){
			return str;
			}%>
	
	<% 
		out.println(getString());
		%>
</body>
</html>