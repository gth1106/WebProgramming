<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Validation</title>
</head>
<!-- 데이터 길이 확인 핸들러 함수 작성하세요
  아이디는 4~12자 이내, 비밀번호는 4자 이상으로 입력!!
 -->

<script type="text/javascript">
	function checkLogin( ){
	
 } 
</script>
<body>
	<form name="loginForm" action="validation03_process.jsp" method="post">
		<p>	아 이 디 : <input type="text" name="id">
		<p>	비밀번호 : <input type="password" name="passwd">
		<p>	<input type="button" value="전송" onclick="checkLogin()">
	</form>
</body>
<html>