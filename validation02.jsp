<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Validation</title>
</head>

<!-- 핸들러 함수를 작성해 주세요 -->
<script type="text/javascript">
	
</script>

<body>
	<form name="loginForm" action="validation02_process.jsp" method="post">
		<p>	아 이 디 : <input type="text" name="id">
		<p>	비밀번호 : <input type="password" name="passwd">
		<p>	<input type="button" value="전송" onclick="checkLogin()">
	</form>
</body>
</html>