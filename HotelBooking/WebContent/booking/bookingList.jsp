<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header_login.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<br><br><br><br>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

  <div class="container">
  <br/>
  <script>
  
 function fchoice(num,hotel_name){
  location.href="/HotelBooking/booking/list?num="+num+"&hotel_name="+hotel_name+"&checkin="+$("#checkin").val()+"$("#checkout").val()";
 }
  
  </script>

  
<h1>예약확인(<span id="cntSpan">${count})</span></h1><br/><br/>
</div>
 <table class="table table-borderless">
    <thead>
 	      <tr align="center">
	       
	        <th>번호</th>
	        <th>사진</th>
	        <th>호텔이름</th>
	        <th>호텔주소</th>
	        <th>평점</th>
	        <th>가격</th>
	        <th>체크인</th>
	        <th>체크아웃</th>
	        <th>인원</th>
      </tr>	
    </thead>
    <tbody>
     <c:forEach items="${bookingchecks}" var="check">
     			<td>${check.num}</td>
	       		<td><img src="../upload/${bookingcheck.uploadFile}" width="200px" height="150px"></td>
	      		<td>${check.hotel_name}</td>
	      		<td>${check.hotel_addr}</td>
	      		<td>${check.hotel_repu}</td>
	      		<td>${check.hotel_price}</td>
	      		<td>${check.checkin}</td>
	      		<td>${check.checkout}</td>
	      		<td>${check.rooms_count}</td>
      
	      		
	      		<c:if test = "${sessionScope.login!=null}">
		      		<td>
		      			<a href = "javascript:fdelete(${check.num},${check.hotel_name})">삭제</a>
		      		</td>
	      		</c:if>    
	</c:forEach>
     
    </tbody>
  </table>
</div>
<footer>
<br><br><br><br><br>
<%@ include file="../include/footer.jsp" %>
</footer>