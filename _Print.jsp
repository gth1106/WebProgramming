<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<% int count = 0; %>
<%! int count2=0; %>
<body>
   Page Count is
   <% out.println(++count); %>
   <% out.println(++count2); %>
   <%= application.getRealPath("/") %>
</body>
</html>
