<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> 회원 가입 </title>
	
    <script type = "text/javascript">
        function checkForm() {
            var id = document.user_info.id.value;
            var address = document.user_info.address.value;
            var phone = document.user_info.phone.value;
           

            if(id === "" || id.length !== 7) {
                alert("학번은 반드시 입력되어야 하며 7자 이여야 합니다.");
                return false;
            }


            if(address === "" || address.length > 10) {
                alert("주소는 반드시 입력되어야 하며 10자 이상이어야 합니다.");
                return false;
            }

            if(phone === "") {
                alert("전화번호는 반드시 입력되어야 합니다.");
                return false;
            }
            return true; // 폼 전송
        }
    </script>
	
</head>
<body>
	Home > 회원 가입
	<hr>
	<form action="insertDB.jsp" name="user_info" onsubmit="return checkForm()" method="post" >
		<fieldset style="width:230px">
			<legend> 회원 가입 화면 </legend><p>
	
			학번 : <br>
			<input type="text" size = "16" name="id" ><br><br>
		
			학과 : <br> 
			<input type="text" size = "16" name="cn"><br><br>
			
			이름 : <br>
			<input type="text" size="30" name="name"><br>	
			주소 : <br>
			<input type="text" size = "16" name="address" ><br><br>
			전화번호 : <br>
			<input type="text" size = "16" name="phone" ><br><br>	
			<hr>
			<input type="reset" value=" ◀ 다시작성 ">
			<input type="submit" value=" 전송 ▶ ">
			<br><br>
		</fieldset>
	</form>
</body>
</html>