<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<!-- css import -->
	<link href="accountbook.css" rel="stylesheet" />
</head>
<body>

	<div class ="accountbookwrap"> <!--전체구역-->
	s
		<div class = "account_Top"> <!--쓰기구역-->
			<div class = "account_inputs">
				<textarea class = "atext" placeholder="항목내용"></textarea>
				<input class = "anumber" type ="text" placeholder="금액">
				<input class = "adate" type ="text" placeholder = "날짜">
				<button onclick="awrite()" type="button">등록</button>
			
			
			</div>
		</div>
		<div class = "account_Bottom"> <!--출력구역-->
			
	
		</div>
	
	</div>






<!-- 최신 JQUERY import ( ajax() 사용할 js파일부터 위에서 호출)  -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- js import -->
	<script src="accountbook.js" type="text/javascript"></script>

</body>
</html>