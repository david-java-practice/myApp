<%@page import="com.address.Address"%>
<%@page import="com.address.AddressDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>

</head>

<%
	request.setCharacterEncoding("utf-8");
	int num =Integer.parseInt(request.getParameter("num"));
	AddressDAO dao = AddressDAO.getInstance();
	Address address=dao.addrDetail(num);
%>
<script>
	//query 이용
	$(document).ready(function(){
		$("#deleteBtn").click(function(){
			if(confirm("정말 삭제할까요?")){
				//location.href="deletePro.jsp?num=<%=num%>"; 
				$(location).attr("href","deletePro.jsp?num=<%=num%>");
			}
		});
	});
</script>
<script>
	function del(){
		if(confirm("정말 삭제할까요?")){
			location.href="deletePro.jsp?num=<%=num%>";
			
		}
	}
	function dels(no){
		if(confirm("정말 삭제할까요?")){
			location.href="deletePro.jsp?num="+no;
			
		}
	}
</script>

</head>
<body>
<a href="list.jsp">전체보기</a>  
<form action="updatePro.jsp" method="post">
<input type = "hidden" name="num" value=<%=num %>>
	주소록 수정하기<br>
	이름 <input type="text" name="name" size=10
		value ="<%=address.getName() %>"><br>
	우편번호 <input type="text" name="zipcode" size=10
		value ="<%=address.getZipcode() %>">
	검색 <input type="button" value="검색"> <br>
	주소 <input type="text" name="addr" size=60
		value ="<%=address.getAddr() %>"><br>
	전화번호 <input type="text" name="tel" size=20
		value ="<%=address.getTel() %>" ><br>

<input type="submit" value="수정" > 
<input type="button" value="삭제" onclick="del()"> 
<input type="button" value="매개변수삭제" onclick="dels(<%=num%>)"> 
<input type="button" value="jquery 삭제" id="deleteBtn"> 
<input type="reset" value="취소">

</form>
</body>
</html>