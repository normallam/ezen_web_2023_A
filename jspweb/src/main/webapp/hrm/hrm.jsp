<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link href="../hrm/hrm.css" rel="stylesheet">
<body>
	<!-- JSP파일안에 다른 JSP 파일 import 하기  -->
	<%@include file ="../Header.jsp" %>
	
	
		<div class ="E_wrap">
		<form class ="E_text">
			<div class ="E_inputcontent">
				
				<select class ="E_selectgrade" name="egrade">
					<option>사장</option>
					<option>부장</option>
					<option>팀장</option>
					<option>대리</option>
					<option>주임</option>
					<option>사원</option>
				</select>

				<div class ="E_name">
					 
					<input class ="E_nameinput" name="ename"/>
				</div>
			</div>
			<div class ="E_phone">
					직원전화번호 
					<input class ="E_phoneinput" name="ecall"/>	
			</div>
		<div class ="E_picture"> 직원 사진 
			<img class="preimg" alt="" src="img/default.webp" name="epi" width="100px"> 기본값 
		</div>
			<button type="button" onclick="regist()">제출</button>
		</form>
	</div>
	
	 	<table class="viewbox">
		
		</table>

	<script src="../hrm/hrm.js" type="text/javascript"> </script> 
	
</body>
</html>
 
	<!-- <div class ="E_wrap">
		<form class ="E_text">
			<div class ="E_inputcontent">
				
				<select class ="E_selectgrade">직급
					<option>사장</option>
					<option>부장</option>
					<option>팀장</option>
					<option>대리</option>
					<option>주임</option>
					<option>사원</option>
				</select>

				<div class ="E_name">
					직원명  
					<input class ="E_nameinput"/>
				</div>
			</div>
			<div class ="E_phone">
					직원전화번호 
					<input class ="E_phoneinput"/>	
			</div>
		<div class ="E_picture"> 직원 사진 
			<img class="preimg" alt="" src="img/default.webp" width="100px"> 기본값 
		</div>
			<button type="button" onclick="regist()">제출</button>
		</form>
	</div>
	
	 	<table class="viewbox">
		
		</table>

	<script src="../hrm/hrm.js" type="text/javascript"> </script> 
	
	
	
		<div class ="E_wrap">
		<form class ="E_text">
			<div class ="E_inputcontent">
				
				<select class ="egrade">직급
					<option>사장</option>
					<option>부장</option>
					<option>팀장</option>
					<option>대리</option>
					<option>주임</option>
					<option>사원</option>
				</select>

				<div class ="E_name">
					직원명  
					<input class ="ename"/>
				</div>
			</div>
			<div class ="E_phone">
					직원전화번호 
					<input class ="ecall"/>	
			</div>
		<div class ="E_picture"> 직원 사진 
			<img class="epi" alt="" src="img/default.webp" width="100px"> 기본값 
		</div>
			<button type="button" onclick="regist()">제출</button>
		</form>
	</div>
	
	 	<table class="viewbox">
		
		</table>

	<script src="../hrm/hrm.js" type="text/javascript"> </script> -->