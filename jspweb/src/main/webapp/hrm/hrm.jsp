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
					 
					<input class ="E_nameinput" name="ename" placeholder="이름"/>
				</div>
			</div>
			<div class ="E_phone">
					<input class ="E_phoneinput" name="ecall" placeholder="전화번호"/>	
			</div>
		<div class ="E_picture">
			  
			<div class="inputbox">
					직원사진
					<input onchange="hrmimg( this )" class="hrmimg" name="hrmimg" type="file">
			</div>
		</div>
			<button type="button" onclick="regist()">제출</button>
		</form>
	</div>
	
	 	<table class="viewbox">
		
		</table>

	<script src="../hrm/hrm.js" type="text/javascript"> </script> 
	
</body>
</html>
 