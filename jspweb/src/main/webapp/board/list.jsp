<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="/jspweb/css/board/list.css" rel="stylesheet">
</head>
<body>
	<%@include file ="../Header.jsp" %>
	<div class="webcontainer">
		<h3>글 목록 페이지</h3>
		<!-- 1. 상단(페이지 제목)  -->
		<div class = "boardtop">
			<h2> 게시판 </h2>
			<p> 다양한 사람들과 정보를 공유 하세요.</p>
		</div>
		<!-- 2. 상단 부가 버튼  -->
		<div clss="boardtopetc">
		
			<div>
				<select class="bbtn listsize" onchange="onListSize()">	<!-- 하나의 페이지에 표시할 최대 게시물 수  -->
					<option>10</option><option>15</option><option>20</option>
				</select>
				<span class="boardcount"> 게시물 수 : 13 </span> <!-- 전체 게시물 수 -->
			</div>
			<button class="bbtn" onclick="onWrite()" type="button">글쓰기</button>
		
		
		</div>
		
		<!-- 3. 카테고리 구역 -->
		<div class="boardcategorybox">
			<button onclick="onCategory(0)" class="bbtn" type="button"> 전체보기 </button>
			<button onclick="onCategory(1)" class="bbtn" type="button"> 공지사항 </button>
			<button onclick="onCategory(2)" class="bbtn" type="button"> 자유게시판 </button>
			<button onclick="onCategory(3)" class="bbtn" type="button"> 노하우 </button>
		</div>
		<!-- 4.  -->
		<table class="boardTable"></table>
		
		<div class="boardbottom">
		
			<!-- 5. 페이징처리 구역  -->
			<div class="pagebox"></div>
			
			<!-- 6. 검색 구역  -->
			<select class="bbtn">	<!-- 검색할 필드명 -->
				<option>제목</option>
				<option>내용</option>
				<option>작성자</option>
			</select>
			<input class="keyword" type="text"><!--  검색 내용 -->
			<button class="bbtn" type="button">검색</button>
			
		</div>
	</div>
		

	
	
	
	<script src="../js/board/list.js" type="text/javascript"></script>

</body>
</html>