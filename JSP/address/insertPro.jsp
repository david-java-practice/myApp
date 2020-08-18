<%@page import="com.address.AddressDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="ad" class="com.address.Address"/>
<jsp:setProperty property="*" name="ad"/>
<%
	AddressDAO dao = AddressDAO.getInstance();	//화면을 받아서
	dao.addrInsert(ad); //내용을 넣고
	response.sendRedirect("list.jsp"); //list로 가라
	
%>

