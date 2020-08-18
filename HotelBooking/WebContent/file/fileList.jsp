<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
       <%@ include file="../include/header.jsp" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>


  
  <script>
  $(document).ready(function(){
	  getData(1,"","","","");
	  
	  $("#search").on("click",function(){
		  //alert("Db")
		  getData(1,$("#field").val(),$("#word").val());
	  })
  })
  function getData(pageNum, field, word){
	  $.get("list",
		{"pageNum":pageNum, "field":field, "word":word},
		function(d){
			//alert(d);
		
			$("#result").html(d);
		}
	  
	  )
  }
// function fchoice(num,hotel_name){
//	  location.href="/HotelBooking/booking/list?num="+num+"&hotel_name="+hotel_name+"&checkin="+$("#checkin").val()+"$("#checkout").val()";
// }
  
  </script>
  
<title>board list</title>
</head>
<body>
<br/><br/><br/>
<div id="result"></div>


<br><br><br><br>
<%@ include file="../include/footer.jsp" %>

