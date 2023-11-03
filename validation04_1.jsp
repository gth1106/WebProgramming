<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Validation</title>
</head>
<!-- 조건에 맞지 않는 키 입력 방지하기 위한 코드 입력하세요ㅣ -->
<script type="text/javascript">
	function CheckKey(){
		alert(event.keyCode);
		if(!(event.keyCode>=48 && event.keyCode<=57)){
			alert("숫자만 입력가능합니다.");
			event.returnValue=false;
		}
	}
	
	
</script>
<body>
	<form name="loginForm" action=#  method="post">
		<p>	나   이<input type="text" name="age" onkeypress="CheckKey()">	
		<p>	<input type="submit" value="전송">
	</form>
</body>
<html>