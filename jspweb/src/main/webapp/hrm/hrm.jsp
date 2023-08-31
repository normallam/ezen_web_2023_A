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
	<div class ="E_wrap">
		<div class ="E_inputcontent">
			<ul class ="E_grade"> <!--직급-->
				<select class ="E_selectgrade">
					<option>사장</option>
					<option>부장</option>
					<option>팀장</option>
					<option>대리</option>
					<option>주임</option>
					<option>사원</option>
				</select>
			</ul>
			
			<div class ="E_name">
				<!--직원명  --> 
				<input class ="E_nameinput"/>
			</div>
		</div>
		<div class ="E_phone">
				<!--직원전화번호  -->
				<input class ="E_phoneinput"/>	
		</div>
		<div class ="E_picture"> <!--직원 사진  -->
			<img class="preimg" alt="" src="img/default.webp" width="100px"> <!--기본값  -->
		</div>
	</div>
	
	<script src="../hrm/hrm.js" type="text/javascript"> </script>
	
</body>
</html>