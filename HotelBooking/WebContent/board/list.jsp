<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
       <%@ include file="../include/header.jsp" %>
    <br><br><br>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="../js/jquery-3.5.1.min.js"></script>
  
  <script>
  $(document).ready(function(){
	  getData(1,"","");
	  
	  $("#btnSearch").on("click",function(){
		  //alert("DB")
		  getData(1,$("#field").val(),$("#word").val());
	  })
  })
  function getData(pageNum, field, word){
	  $.get("list",
		{"pageNum":pageNum, "field":field, "word":word},
		function(d){
			$("#result").html(d);
		}
	  
	  )
  }
  
  </script>
  
<title>board list</title>
</head>
<body>
<div class="container">
<div class="form-group">
<a href="insert.jsp">글쓰기</a>
</div>
<div id="result" class="form-group"></div>
<br/><br/>
	<div align ="center" class="form-group">
		<form name = "search" id="search">
			<select name ="field" id="field" class="form-group">
				<option value ="writer">이름</option>
				<option value ="content">내용</option>
				</select>
			<input type = "text" name="word" id="word" class="form-group">
			<input type = "button" value ="찾기" id = "btnSearch" class="btn btn-primary">
			</form>
			</div>
			
			</div>
</body>
<footer>
<br><br><br><br>
<%@ include file="../include/footer.jsp" %>
</footer>
</html>