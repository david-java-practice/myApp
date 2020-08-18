<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <script src="/project/js/member.js"></script>
</head>
<body>

<!-- Navigation -->
  <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
    	<a href="../views/index_login.jsp"><img src="../img/logo.png" alt="logo" width="50px" height="50px"></a>
    	&nbsp;&nbsp;&nbsp;&nbsp;
      <a class="navbar-brand" href="../views/index_login.jsp">HotelDrWA</a>
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link" href="../booking/bookingList.jsp">예약확인</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../board/list.jsp">이용후기</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="../views/index.jsp">로그아웃</a>
          </li>

           <li class="nav-item">
            <a class="nav-link" href="#">고객센터</a>
          </li>
 
        </ul>       
      </div>    
    </div>
  </nav>
  




