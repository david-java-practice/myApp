<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
           <%@ include file="../include/header_login.jsp" %>
           <br><br><br><br>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="../js/jquery-3.5.1.min.js"></script>

<div class="container">

<form action="insert" method="post" id="frm">
 <div class="form-group">
  <label for="userid">글쓴이</label>
  <input type="text" class="form-control" id="writer"  name="writer" size="40" >
</div>

<div class="form-group">
  <label for="subject">제목</label>
  <input type="text" class="form-control" id="subject" name="subject" size="40">
</div>

<div class="form-group">
  <label for="content">내용</label>
  <textarea rows ="15" cols = "50" class="form-control" id ="content" name="content"></textarea>
</div>

<div class="form-group">
  <input type = "submit" class="btn btn-primary" value ="전송">
</div>

	</form>
	</div>

</body>
<br><br><br><br>
<%@ include file="../include/footer.jsp" %>
</html>