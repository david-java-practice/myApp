<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header_login.jsp" %>
<br><br><br>

  <div class="container">

  <form action="login.me" method="post">
  	<h3>Please sign in</h3>
    <div class="form-group">
      
      <input type="text" class="form-control" id="userid" placeholder="ID" name="userid">
    </div>
    <div class="form-group">
      
      <input type="password" class="form-control" id="pwd" placeholder="PASSWORD" name="pwd">
    </div>
    <div class="form-group form-check">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember"> Remember me
      </label>
    </div>
    <button type="button" class="btn btn-primary" id="loginBtn">Login</button>
  </form>
</div>
<script>
	$("#loginBtn").click(function(){
		if($("#userid").val()==""){
			 alert(" ID 입력");
			 $("#userid").focus();
			 return false;
		 }
		 if($("#pwd").val()==""){
			 alert("PWD 입력");
			 $("#pwd").focus();
			 return false;
		 }
		 $.ajax({
			 type	: "post",
			 url	: "login.me",
		   	data	: {"userid":$("#userid").val(),"pwd":$("#pwd").val()},
		   	success:function(value){
		   		//alert(value.trim());
		   		if(value.trim()==0){
		   			//alert("일반회원 로그인");
		   			location.href="view.me";
		   		}else if(value.trim()==1){
		   			alert("관리자 로그인");
		   			location.href="list.me";
		   		}else if (value.trim()==-1){
		   			alert("회원이 아닙니다. 회원가입하세요");
		   			location.href="insert.me";
		   		}else if(value.trim()==2){
		   			alert("비밀번호를 확인하세요");
		   		}
		   		
		   	},
		   	error :function(e){
		   		alert("error:"+e);
		   	}
		 });
	})
</script>
<br><br><br><br>
<%@ include file="../include/footer.jsp" %>