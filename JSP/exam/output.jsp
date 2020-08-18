<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	request.setCharacterEncoding("utf-8");
	String[] hobby = request.getParameterValues("hobby");
%>
</head>
<%
	String name = request.getParameter("name");
	int num = Integer.parseInt(request.getParameter("num"));
	String gender = request.getParameter("gender");
	String major = request.getParameter("major");
	
	
%>
<body>


<hr>
이름: <%=name	%><br>
학번: <%=num %><br>
성별: <%=gender %><br>
전공: <%=major %><br>
 <%
	String str="";
 	
	for(int i=0; i<hobby.length;i++){
		str+=hobby[i]+" ";
	}	
%> 
취미: <%=str %>
</body>


</html>