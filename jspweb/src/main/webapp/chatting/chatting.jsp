<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%@include file = "../Header.jsp" %>
	
	<div class="webcontainer">
		<h2>채팅</h2>
		<div class ="contentbox">
		
		
		</div>
		<input class="inputcontent" type="text">
		<button class="sendbtn" onclick="msgsend()" type="button">전송</button>
		
	</div>
	
	<script src="/jspweb/js/chatting/chatting.js" type="text/javascript"></script>
	
</body>
</html>