<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  
  <title>HotelDrWA - 호텔드루와</title>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="../js/jquery-3.5.1.min.js"></script>



  <!-- Bootstrap core CSS -->
  <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="../css/modern-business.css" rel="stylesheet">

</head>

<body>

  <!-- Navigation -->
  <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
    	<a href="../views/index.jsp"><img src="../img/logo.png" alt="logo" width="50px" height="50px"></a>
    	&nbsp;&nbsp;&nbsp;&nbsp;
      <a class="navbar-brand" href="index.jsp">HotelDrWA</a>
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
            <a class="nav-link" href="../member/join.jsp">회원가입</a>
          </li>
           <li class="nav-item">
            <a class="nav-link" href="../member/login.jsp">로그인</a>
          </li>
           <li class="nav-item">
            <a class="nav-link" href="#">고객센터</a>
          </li>
 
        </ul>       
      </div>    
    </div>
  </nav>
  <header>
  	<div class="container">
  	<%@ include file="../file/fileSearch.jsp" %></div>
    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
    
      <ol class="carousel-indicators">
        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
     	
      </ol>
      
      <div class="slide">   
      <div class="carousel-inner" role="listbox">
      
        <!-- Slide One - Set the background image for this slide in the line below -->
        <div class="carousel-item active" style="background-image: url('../img/hotel_1.jpg')">
          <div class="carousel-caption d-none d-md-block">
			   <h3>I don't know where I'm going,</h3>
            <p>but I'm on my way.</p>
          </div>
        </div>
        <!-- Slide Two - Set the background image for this slide in the line below -->
        <div class="carousel-item" style="background-image: url('../img/hill.jpg')">
          <div class="carousel-caption d-none d-md-block">
        
            <h3>Don't</h3>
            <p>Listen to what they say. GO SEE.</p>
          </div>
        </div>
        <!-- Slide Three - Set the background image for this slide in the line below -->
        <div class="carousel-item" style="background-image: url('../img/hotel_beach.jpg')">
          <div class="carousel-caption d-none d-md-block">
       
            <h3>Travel brings power and love back to your life</h3>
            
            <p>RUMI</p>
          </div>
        </div>
                <div class="carousel-item" style="background-image: url('../img/riding.jpg')">
          <div class="carousel-caption d-none d-md-block">
       
            <h3>Travel is the only thing you buy</h3>
            
            <p>that makes you richer.</p>
          </div>
        </div>
        
      </div>
      <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
     
    </div>
  </header>

  <!-- Page Content -->
  <div class="container">


    <!-- Portfolio Section -->
    <br><br>
    <h2>오늘의 추천 호텔</h2>

    <div class="row">
      <div class="col-lg-4 col-sm-6 portfolio-item">
        <div class="card h-100">
          <a href="../file/fileList.jsp"><img class="card-img-top" src="../img/hotel_hayatt.PNG" alt=""></a>
          <div class="card-body" >
            <h4 class="card-title">
              <a href="../file/fileList.jsp"><strong>그랜드 하얏트 서울</strong></a>
            </h4>
            <p class="card-text">용산구 소월로 322, 서울특별시, 140-738, 대한민국</p>
            <p class="card-text" style="font-size: 13px"><i>⊙수영장 ⊙주차가능 ⊙공항교통편 ⊙스파</i></p>
            <p class="card-text"  style="font-weight: bold;" align="right"> ★8.4</p>
            <p class="card-text" style="color:red; font-weight: bold;" align="right" >₩ 314,000</p>
            
          </div>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 portfolio-item">
        <div class="card h-100">
          <a href="../file/fileList.jsp"><img class="card-img-top" src="../img/hotel_conrad.PNG" alt=""></a>
          <div class="card-body">
            <h4 class="card-title">
              <a href="../file/fileList.jsp"><strong>콘래드 서울</strong></a>
            </h4>
            <p class="card-text">영등포구 국제금융로 10, 서울특별시, 07326, 대한민국</p>
            <p class="card-text" style="font-size: 13px"><i>⊙수영장 ⊙무료주차 ⊙공항교통편 ⊙스파 ⊙욕조</i></p>
            <p class="card-text"  style="font-weight: bold;" align="right"> ★8.8</p>
            <p class="card-text" style="color:red; font-weight: bold;" align="right" >₩ 210,000</p>
            
          </div>
        </div>
      </div>
            <div class="col-lg-4 col-sm-6 portfolio-item">
        <div class="card h-100">
          <a href="../file/fileList.jsp"><img class="card-img-top" src="../img/hotel_silla.PNG" alt=""></a>
          <div class="card-body">
            <h4 class="card-title">
              <a href="../file/fileList.jsp"><strong>제주신라호텔</strong></a>
            </h4>
            <p class="card-text">중문관광로72번길75, 서귀포시, 제주특별자치도, 697-808, 대한민국</p>
            <p class="card-text" style="font-size: 13px"><i>⊙수영장 ⊙무료주차 ⊙공항교통편</i></p>
            <p class="card-text"  style="font-weight: bold;" align="right"> ★9.2</p>
            <p class="card-text" style="color:red; font-weight: bold;" align="right" >₩ 620,000</p>
            
          </div>
        </div>
      </div>

      <div class="col-lg-4 col-sm-6 portfolio-item">
        <div class="card h-100">
          <a href="../file/fileList.jsp"><img class="card-img-top" src="../img/hotel_paradise.PNG" alt=""></a>
          <div class="card-body">
            <h4 class="card-title">
              <a href="../file/fileList.jsp"><strong>부산 웨스틴조선호텔</strong></a>
            </h4>
            <p class="card-text">해운대구 해운대해변로 296, 부산광역시, 612-010, 대한민국</p>
            <p class="card-text" style="font-size: 13px"><i>⊙수영장 ⊙주차가능 ⊙공항교통편 ⊙스파 ⊙욕조</i></p>
            <p class="card-text"  style="font-weight: bold;" align="right"> ★9.0</p>
            <p class="card-text" style="color:red; font-weight: bold;" align="right" >₩ 324,000</p>
            
          </div>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 portfolio-item">
        <div class="card h-100">
          <a href="../file/fileList.jsp"><img class="card-img-top" src="../img/hotel_lotte.PNG" alt=""></a>
          <div class="card-body">
            <h4 class="card-title">
              <a href="../file/fileList.jsp"><strong>롯데 호텔 제주</strong></a>
            </h4>
            <p class="card-text">중문관광로72번길 35, 서귀포시, 제주특별자치도, 697-808, 대한민국</p>
            <p class="card-text" style="font-size: 13px"><i>⊙수영장 ⊙무료주차 ⊙공항교통편</i></p>
            <p class="card-text"  style="font-weight: bold;" align="right"> ★9.0</p>
            <p class="card-text" style="color:red; font-weight: bold;" align="right" >₩ 540,000</p>
            
          </div>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 portfolio-item">
        <div class="card h-100">
          <a href="../file/fileList.jsp"><img class="card-img-top" src="../img/hotel_thewestinchosun.PNG" alt=""></a>
          <div class="card-body">
            <h4 class="card-title">
               <a href="../file/fileList.jsp"><strong>부산 웨스틴조선호텔</strong></a>
            </h4>
            <p class="card-text">동백로 67, 해운대구, 부산광역시, 48100, 대한민국</p>
            <p class="card-text" style="font-size: 13px"><i>⊙수영장 ⊙무료주차 ⊙욕조</i></p>
            <p class="card-text"  style="font-weight: bold;" align="right"> ★9.0</p>
            <p class="card-text" style="color:red; font-weight: bold;" align="right" >₩ 332,500</p>
            
          </div>
        </div>
      </div>
    </div>
    <!-- /.row -->
    
     <h2 class="my-4">이용 후기 및 추천여행지</h2>

    <!-- Marketing Icons Section -->
    <div class="row">
      <div class="col-lg-4 mb-4">
        <div class="card h-100">
          <h4 class="card-header">이용 후기</h4>
          <div class="card-body">
            <p class="card-text"><a href="../board/insert.jsp">글쓰기</a></p>
          </div>
          <div class="card-footer">
            <a href="../board/list.jsp" class="btn btn-primary">Learn More</a>
          </div>
        </div>
      </div>
      <div class="col-lg-4 mb-4">
        <div class="card h-100">
          <h4 class="card-header">추천 여행지</h4>
          <div class="card-body">
            <p class="card-text"><strong>서울의 관광명소</strong></p>
            <a href="https://www.tripadvisor.co.kr/Attractions-g294197-Activities-Seoul.html">
            <img src="../img/경복궁.PNG" alt="pacebook" width="200px" height="50px"></a>
            <br><br>
            <p class="card-text"><strong>부산의 관광명소</strong></p>
            <a href="https://www.tripadvisor.co.kr/Attractions-g297884-Activities-Busan.html">
            <img src="../img/해운대.PNG" alt="pacebook" width="200px" height="50px"></a>
            <br><br>
            <p class="card-text"><strong>제주도의 관광명소</strong></p>
            <a href="https://www.tripadvisor.co.kr/Attractions-g983296-Activities-Jeju_Island.html">
            <img src="../img/성산일출봉.PNG" alt="pacebook" width="200px" height="50px"></a>
            
          </div>
          <div class="card-footer">
            <a href="https://www.tripadvisor.co.kr/" class="btn btn-primary">Learn More</a>
          </div>
        </div>
      </div>

    </div>
    <!-- /.row -->

    <!-- Features Section -->
    <br>
    <div class="row">
      <div>
        <h2>자주 묻는 질문 FAQ</h2>
        <ul>
          <li>호텔 및 휴가용 임대 숙소 예약에 대한 환불 ☞<a href="#">바로가기</a></li>
          <li>코로나19(COVID-19) ☞<a href="#">바로가기</a></li>
          <li>HotelDrWA 리워드 가입 ☞<a href="#">바로가기</a><li>
          <li>결제 및 영수증 관련 문의 ☞<a href="#">바로가기</a></li>
          <li>여행 취소 관련 문의 ☞<a href="#">바로가기</a></li>    
        </ul>       
      </div>
    </div>
    <!-- /.row -->

    <hr>

    <!-- Call to Action Section -->
    <div class="row mb-4">
      <div class="col-md-8">
        <p class="m-0 text-left text-black" style="font-size: 13px;">* 리워드 1박의 금액은 적립하신 스탬프 10개의 평균 요금입니다. 세금 및 서비스 요금이 포함되지 않습니다. 사용하시는 각 리워드 숙박에 대해 ₩5,500의 수수료가 적용되지만 앱에서 사용 시 수수료가 없습니다. 제외 사항이 적용됩니다.</p>
        	<a href="#">이용약관 보기</a>
        
      </div>

    </div>

  </div>
  <!-- /.container -->

  <!-- Footer -->
  <footer class="py-5 bg-dark">
    <div class="container">
    <div align="left">
    <p class="form-group" style="color: white;">SNS에서 만나는 호텔드루와</p> 
    <a href="https://www.facebook.com/"><img src="../img/facebook1.PNG" alt="pacebook" width="40px" height="40px"></a>
    &nbsp;
    <a href="https://www.instagram.com/"><img src="../img/insta.PNG" alt="insta" width="40px" height="40px"></a>
    &nbsp;
    <a href="https://www.youtube.com/"><img src="../img/youtube.PNG" alt="youtube" width="40px" height="40px"></a>
    &nbsp;
    <a href="https://twitter.com/"><img src="../img/twitter.PNG" alt="twitter" width="40px" height="40px"></a>
    &nbsp;
    </div>
    
    <div align="right">
    <p class="form-group" style="color: white;">이제 스마트폰에서도 호텔드루와!</p>
    <a href="https://apps.apple.com/"><img src="../img/appstore1.PNG" alt="appstore" width="120px" height="40px"></a>
    &nbsp;&nbsp;
    <a href="https://play.google.com/"><img src="../img/googleplay.PNG" alt="googleplay" width="120px" height="40px"></a>
    </div>
    
    <p class="m-0 text-center text-white">본사: 서울시 종로구 종로5길 Tower8 9층, Tel: 02-1234-1234</p>
      <p class="m-0 text-center text-white">Copyright &copy; HotelDrWA - 호텔드루와 2020</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>

