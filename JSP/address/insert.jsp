<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../js/jquery-3.5.1.min.js"></script>
<script>
function zipfinder(){
	window.open("zipCheck.jsp","","wideth=700 height=400");
	}
	</script>

<script>
$(function(){
	$("#btn").on("click",function(){
		if($("#name").val()==""){
			alert("이름을 입력하세요");
			return;	
			} //if
		if($("#zipcode").val()==""){
			alert("우편번호를 입력하세요");
			return false;	
			} //if
		if($("#addr").val()==""){
			alert("주소를 입력하세요");
			return false;	
		} //if
		if($("#tel").val()==""){
			alert("전화번호를 입력하세요");
			return false;
		} //if
			
			//frm.submit();
			$("#frm").submit();
	}); //btn		
}) //function

</script>

</head>
<body>
<a href="list.jsp">전체보기</a>  <!-- 클릭하면 list로 가라 -->
<form action="insertPro.jsp" method="post" name="frm" >
주소록 등록하기<br>
이름 <input type="text" name="name" ><br>
우편번호 <input type="text" name="zipcode" size=7>
		<input type="button" value="검색" onclick="zipfinder()"> <br>
주소 <input type="text" name="addr" size=30><br>
전화번호 <input type="text" name="tel" ><br>
<input type="submit" value="등록" > 
<input type="reset" value="취소">

</body>
</html>