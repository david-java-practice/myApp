<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="result" class="container">
	<h2>호텔 리스트</h2>
	<p>
		총 리스트: <span id="cntSpan">${count}</span> 개
	</p>
	<br /> <br />

	<table class="table table-striped">
		<thead>
			<tr align="center">

				<th>글번호</th>
				<th>사진</th>
				<th>호텔이름</th>
				<th>호텔주소</th>
				<th>평점</th>
				<th>가격</th>
				<th>체크인</th>
				<th>체크아웃</th>
				<th>인원</th>
				<th></th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${board}" var="fileupload" varStatus="st">			
			<form action="../booking/insert" method="post">
				
					<input type="hidden" name="hotel_name"
						value="${fileupload.hotel_name}">
					<input type="hidden" name="hotel_addr"
						value="${fileupload.hotel_addr}">
					<input type="hidden" name="hotel_repu"
						value="${fileupload.hotel_repu}">
					<input type="hidden" name="hotel_price"
						value="${fileupload.hotel_price}">

					<tr>
					<td>${fileupload.num}</td>
					<td><img src="../upload/${fileupload.uploadFile}"
						width="200px" height="150px"></td>
					<td>${fileupload.hotel_name}</td>
					<td>${fileupload.hotel_addr}</td>
					<td>${fileupload.hotel_repu}</td>
					<td>${fileupload.hotel_price}</td>
					<td><input type="date" class="form-group" name="checkin"
						id="checkin" size="10" value="2020-08-18"></td>
					<td><input type="date" class="form-group" name="checkout"
						id="checkout" size="10" value="2020-08-22"></td>
					<td><select id="rooms_count" name="rooms_count">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
					</select></td>
					<td><a href="../booking/bookingList.jsp">선택</a></td>
					<!-- <td><input type="submit" id="select" name="select"
						 class="btn btn-primary" value="선택"> -->
						 
						<!-- <a href = "javascript:fchoice(${fileupload.num},${fileupload.hotel_name})">선택</a>
						
					</td>-->

					<c:if test="${sessionScope.login!=null}">
						<td><a
							href="javascript:fdelete(${fileupload.num},${fileupload.hotel_name})">삭제</a>
						</td>
					</c:if>
				</tr>
					</form>
		</c:forEach>
	
		</tbody>
	</table>

	<div align="center">
		<c:if test="${pu.startPage>pu.pageBlock}">
			<!-- 이전-->
			<a
				href="javascript:getData(${pu.startPage-pu.pageBlock},'${pu.field}','${pu.word}','${pu.checkin}','${pu.rooms_count})">[이전]</a>
		</c:if>
		<c:forEach begin="${pu.startPage}" end="${pu.endPage}" var="i">
			<!-- 이전-->
			<c:if test="${i==pu.currentPage}">
				<!-- 현재페이지-->
				<c:out value="${i}" />
			</c:if>
			<c:if test="${i!=pu.currentPage}">
				<!-- 현재페이지 아닌 경우 링크 부여-->
				<a
					href="javascript:getData(${i},'${pu.field}','${pu.word}','${pu.checkin}','${pu.rooms_count}')">${i}</a>
			</c:if>
		</c:forEach>
		<c:if test="${pu.endPage < pu.totPage}">
			<!-- 다음-->
			<a
				href="javascript:getData(${pu.endPage+1},'${pu.field}','${pu.word}','${pu.checkin}','${pu.rooms_count})">[다음]</a>
		</c:if>
	</div>
</div>


