<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
              <%@ include file="../include/header_login.jsp" %>
           <br><br><br><br>
           
<div class="container">
	  <h2>이용후기</h2>
	 <p>총 글갯수: <span id="cntSpan">${count}</span> 개</p><br/><br/>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	       
	        <th>글번호</th>
	        <th>작성자</th>
	        <th>제목</th>
	        <th>내용</th>
	        <th>작성일</th>
	        <th>조회수</th>
	        <c:if test = "${login!=null}">
	        <th>삭제</th>
	        </c:if>
	      </tr>
	    </thead>
	    <tbody>
	      <c:forEach items="${board}" var="board" varStatus = "st">
	       	<tr>
	       		
	       		<td>${board.num}</td>
	      		<td>${board.writer}</td>
	      		<td><a href="detail?num=${board.num}">${board.subject}</a></td>
	      		<td>${board.content}</td>
	      		<td>${board.reg_date}</td>
	      		<td>${board.readcount}</td>
	      		<c:if test = "${sessionScope.login!=null}">
		      		<td>
		      			<a href = "javascript:fdelete(${board.num},${board.name})">삭제</a>
		      		</td>
	      		</c:if>
	      	</tr>
	    </c:forEach>
	    </tbody>
	  </table>
	  <div align = "center">
	  	<c:if test = "${pu.startPage>pu.pageBlock}"> <!-- 이전-->
	  		<a href = "javascript:getData(${pu.startPage-pu.pageBlock},'${pu.field}','${pu.word}')">[이전]</a>
	  	</c:if>
	  	<c:forEach begin ="${pu.startPage}" end = "${pu.endPage}" var = "i"> <!-- 이전-->
  			<c:if test ="${i==pu.currentPage}"> <!-- 현재페이지-->
 				<c:out value = "${i}"/>
  			</c:if>
  			<c:if test = "${i!=pu.currentPage}"> <!-- 현재페이지 아닌 경우 링크 부여-->
  				<a href = "javascript:getData(${i},'${pu.field}','${pu.word}')">${i}</a>
  			</c:if>
	  	</c:forEach>
	  	<c:if test = "${pu.endPage < pu.totPage}"> <!-- 다음-->
	  		<a href = "javascript:getData(${pu.endPage+1},'${pu.field}','${pu.word}')">[다음]</a>
	  	</c:if>
	  </div> 
	  </div>
	  
