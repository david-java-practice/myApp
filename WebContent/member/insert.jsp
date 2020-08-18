<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../include/header.jsp" %>
    <br><br><br>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="../js/jquery-3.5.1.min.js"></script>
<scrip>
<div class="container">
<form action="insert.me" method="post" id="frm">
<div class="row">
 <div class="col">
  <label for="userid">id:</label>
  <input type="text" class="form-control" id="userid" placeholder="Enter id" name="userid" >
</div>
<div class="col align-self-end">
		 <button type="button" id="idcheck" class="btn btn-primary">중복확인</button>
</div>
</div>
 
<div class="form-group">
  <label for="name">Name:</label>
  <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
</div>
 <div class="form-group">
  <label for="pwd">Password:</label>
  <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
</div>
 <div class="form-group">
  <label for="pwd_check">Password Confirm:</label>
  <input type="password" class="form-control" id="pwd_check" placeholder="Enter password Confirm" name="pwd_check">
</div>
<div class="form-group">
  <label for="email">Email:</label>
  <input type="text" class="form-control" id="email" placeholder="Enter Eamil" name="email">
</div>
<div class="form-group">
  <label for="phone">Phone:</label>
  <input type="text" class="form-control" id="phone" placeholder="Enter Phone" name="phone">
</div>
<div class="form-check-inline">
<label class="form-check-label">
<input type="radio" class="form-check-input" name="admin" value="1">관리자
</label>
</div>
<div class="form-check-inline">
<label class="form-check-label">
<input type="radio" class="form-check-input" name="admin"  value="0" checked>일반회원
</label>
</div>
<br/>

<button id="send" class="btn btn-primary">Submit</button>
</form>
</div>
<br><br><br><br>
<%@ include file="../include/footer.jsp" %>
</script>
</head>
<body>

</body>
</html>