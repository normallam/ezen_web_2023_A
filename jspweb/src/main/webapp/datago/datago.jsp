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
		<div>
         	<h2> - 카카오 지도 - </h2>
         	<div class="detailbox">
         	
         	</div>
         <div id="map" style="width:800px;height:400px; align-items: center;"></div>
      	</div>
		<div>
			<h6> 안산시 착한가격업소 현황 </h6>
			<table class="apiTable1">
				
			</table>
		</div>
			
	</div>
	
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=fa566ff9d788daf1078fe7df694eb71f&libraries=clusterer"></script>
	<script src="/jspweb/js/datago/datago.js" type="text/javascript"></script>

</body>
</html>