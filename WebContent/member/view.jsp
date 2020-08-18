<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../include/header_login.jsp" %>
    <br><br><br>
<div class="container">

  <form action="update.me" method="post" id="frm">
    <div class="form-group">
	        <label for="userid">id:</label>
	      <input type="text" class="form-control" id="userid" placeholder="Enter id" name="userid"  value="${member.userid }" readonly="readonly">
    </div>
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" class="form-control" id="name" placeholder="Enter name" name="name" value="${member.name }">

    </div>

    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd" value="${member.pwd }">
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="text" class="form-control" id="email" placeholder="Enter Eamil" name="email" value="${member.email }">
    </div>
    <div class="form-group">
      <label for="phone">Phone:</label>
      <input type="text" class="form-control" id="phone" placeholder="Enter Phone" name="phone" value="${member.phone }">
    </div>
    <div class="form-check-inline">

</div>
	<script>
	if(${member.admin==0}){ //일반회원
		  $("input:radio[value='0']").prop("checked",true);
	  }else{ //관리자
		  $("input:radio[value='1']").prop("checked",true);
	  }
</script>
<br/>
 	<button  type="submit"  class="btn btn-primary">수정</button>
  </form>
</div>
<br><br><br><br>
<%@ include file="../include/footer.jsp" %>