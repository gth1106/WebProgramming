<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> Login Form </title>
	<script type ="text/javascript">
     function validateForm() {
         var id = document.loginForm.uID.value; 
         var password = document.loginForm.uPW.value; 

         if(id === ""){
        	 alert("아이디는 반드시 입력되어야 합니다.");
        	 return false;
         }
         if(password === ""){
        	 alert("비밀번호는 반드시 입력되어야 합니다.");
        	 return false;
         }
         return true;
     }
	</script>
</head>
<body>
	Home > 로그인
	<hr>
	<form name="loginForm" action="loginSuccess.jsp" onsubmit="return validateForm()" method="post" >
		<fieldset style="width:260px">
			<legend> 로그인 화면 </legend><p>
			<table>
			<tr height="30">
				<td align="right">아이디&nbsp;</td>
				<td><input type="text" name="uID"></td>
			</tr>
			<tr height="30">
				<td align="right">비밀번호&nbsp;</td>
				<td><input type="password" name="uPW"></td>
			</tr>
			<tr height="50">
				<td align="right">이메일&nbsp;</td>
				<td><input type="email" name="uEmail" placeholder="이메일 입력"></td>
			</tr>
			<tr height="50">
				<td></td>
				<td><input type="submit" value=" 로그인 ▶▶ "></td>
			</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>
