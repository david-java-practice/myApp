<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ include file="../include/header_admin.jsp" %>
        <br><br><br>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="../js/jquery-3.5.1.min.js"></script>
</head>
<body>
<div class="container">
	

<form method="post" action="upload.do" enctype="multipart/form-data">
<div class="form-group">
	<label class="col-sm-2">호텔 이름:</label>
	<input type="text" name="hotel_name" class="form-control">
</div>
<div class="form-group">
	<label class="col-sm-2">호텔 주소:</label>
	<input type="text" name="hotel_addr" class="form-control">
</div>
<div class="form-group">
	<label class="col-sm-2">호텔 평점:</label>
	<input type="text" name="hotel_repu" class="form-control">
</div>
<div class="form-group">
	<label class="col-sm-2">호텔 가격:</label>
	<input type="text" name="hotel_price" class="form-control">
</div>
<div class="form-group">
<label>파일 지정하기:</label>
<input type="file" name="uploadFile">
</div>
<div class="form-group">
<input type="submit" value="전송" class="btn btn-primary">
</div>
</form>
</div>
</body>
<br><br><br><br>
<%@ include file="../include/footer.jsp" %>
</html>