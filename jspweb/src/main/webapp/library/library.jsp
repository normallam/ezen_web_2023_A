<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>

	<!-- css import -->
	<link href="library.css" rel="stylesheet" />

</head>
<body>
 <!--HEADER 연결 할지 말지 -->

	<!-- CRUD 기반의 도서관 열람실 입실/퇴실  -->
	<div class ="librarywrap">
		<div class = "library_Top">
			<div class = "library_Seat">
				<div class = seat>1</div>
				<div class = seat>2</div>
				<div class = seat>3</div>
				<div class = seat>4</div>
				<div class = seat>5</div>
				<div class = seat>6</div>
				<div class = seat>7</div>
				<div class = seat>8</div>
			</div>
		</div>
		<div class = "library_Side">
			<div class = "library_Inputs">
				<input class ="lwriter" type="text" placeholder="이름">
				<input class ="lphonenumber" type="text" placeholder="전화번호">
			</div>
		</div>
		<div class = "library_Bottom">
			<button onclick ="library_entrance">입실</button>
			<button onclick ="library_leave">퇴실</button>
		</div>	
	</div>

	<!-- 최신 JQUERY import ( ajax() 사용할 js파일부터 위에서 호출)  -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- js import -->
	<script src="library.js" type="text/javascript"></script>

</body>
</html>