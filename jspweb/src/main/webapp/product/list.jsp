<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/jspweb/css/list.css" rel="stylesheet">
</head>

<body>
	<%@include file ="../Header.jsp" %>
	<div class="mapfather">
		<div class="mapcontent"><!--지도와 사이드바 포함된 구역-->
		
			<!--지도를 표시할 div입니다.-->
			
				<div id="map" style="width:100%;height:350px;"></div>
			
				<!--사이드바 구역-->
				<div class="sidebar"></div>
				
				<!--카드 start  -->
			
		</div>
	</div>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=	fa566ff9d788daf1078fe7df694eb71f&libraries=clusterer"></script>
	<script src="/jspweb/js/product/list.js"type="text/javascript"></script>




</body>
</html>