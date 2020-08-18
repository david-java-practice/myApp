$(document).ready(function(){
	$("#send").click(function(){
		
		if($("#userid").val()==""){
			alert("아이디를 입력하세요");
			$("#userid").focus();
			return false;
		}
		if($("#name").val()==""){
			alert("이름을 입력하세요");
			$("#name").focus();
			return false;
		}
		if($("#pwd").val()==""){
			alert("비밀번호를 입력하세요");
			$("#pwd").focus();
			return false;
		}
		if($("#pwd").val()!==$("#pwd_check").val()){
			alert("비밀번호가 일치하지 않습니다.");
			$("#pwd_check").focus();
			return false;
		}
		if($("#email").val()==""){
			alert("이메일을 입력하세요");
			$("#email").focus();
			return false;
		}
		if($("#phone").val()==""){
			alert("전화번호를 입력하세요");
			$("#phone").focus();
			return false;
		}
		
		$("#frm").submit();
			
		});
	

	$("#idBtn").click(function(){
		window.open("idCheck.jsp","","width=800 height=500");
		
	}); //idBtn
	
	
	//아이디 중복확인버튼 페이지이동
	$("#idcheckBtn").click(function(){
		window.open("idCheck.me","","width=800 height=500")
	});
	
	//id중복확인버튼 중복확인
	$("#useBtn").click(function(){
		if($("#userid").val()==""){
			alert("아이디를 입력하세요");
			$("#userid").focus();
			return false;
		}
		$.ajax({
			type:"post",
			url : "idCheck.me",  //Pro는 로직을 처리해주는 역할
			data : {"userid":$("#userid").val()},  //아이디를 가지고감
			success : function(val){
				if(val.trim()=="yes"){
					alert("사용 가능한 아이디입니다.");
					$(opener.document).find("#userid").val($("#userid").val());
					//$(opener.document).find("#uid").val($("#uid").val());
					self.close();
				} else if(val.trim()=="no"){
					alert("사용 불가능한 아이디입니다.");
					$("#userid").val("")
				}
			},
			error:function(e){
				alert("error:"+e)
			}
		}); //ajax
	})//useBtn
	
}) //idCheckBtn
		
		
function del(userid){
	$.getJSON("userDelete.me?userid="+userid, function(data){
//		alert(data);
		var htmlStr="";
		$.each(data.root, function(key, val){
			htmlStr+="<tr>";
			htmlStr+="<td>"+val.name+"</td>";
			htmlStr+="<td>"+val.userid+"</td>";
			htmlStr+="<td>"+val.phone+"</td>";
			htmlStr+="<td>"+val.email+"</td>";
			htmlStr+="<td>"+val.mode+"</td>";
			if(val.mode=='일반회원'){
				htmlStr+="<td onclick=del('"+val.userid+"')>삭제</td>";
			}else{
				htmlStr+="<td>Admin</td>";
			}
				htmlStr+="<tr>";
		})
		$("table tbody").html(htmlStr);
		$("#cntSpan").text(data.rootCount.count)
	})
}
