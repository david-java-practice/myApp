<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="../js/jquery-3.5.1.min.js"></script>
<br>
 <script>
  $(document).ready(function(){
	 
	  $("#btnSearch").on("click",function(){
		  //alert("Db")
		  getData(1,$("#field").val(),$("#word").val(),$("#checkin").val(),
				  $("#rooms_count").val());
	  })
  })
  function getData(pageNum, field, word,checkin,rooms_count){
	  $.get("/HotelBooking/file/list",
		{"pageNum":pageNum, "field":field, "word":word},
		function(d){
		
			$("#resultbooking").html(d);
		}
	  
	  )
  }
  
  </script>
<title>hotel list</title>
</head>
<body>
	<div class="container">
  <div id="resultbooking" class="container"></div>
  <br><br>
  <div align ="center" class="form-gourp">
          <form action="../booking/bookingList.jsp" name="search"  id="search" class="form-gourp" method="get">
           <div class="form-group">     
			<label><h3>오늘의 목적지는?</h3></label><br>

				<label>우리나라 목적지 또는 호텔</label><br>
				<div class="form-group">
					<select name ="field" id="field" class="form-group">
					<option value ="hotel_addr">주소로 찾기</option>
					<option value ="hotel_name">이름으로 찾기</option>
					</select>
					
           		<input type = "text" name="word" id="word" class="form-group">
				<input type = "button" value ="찾기" id = "btnSearch" class="btn btn-primary">
				</div>
          	   	</form>
          	   	</div>
          </div>
</body>
<div id="resultbooking"></div>
</html>