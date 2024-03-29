
// 1. 글쓰기 버튼을 클릭하면 
function onWrite(){
	if( loginState ){ 	// - 만약에 비 로그인이면 로그인 페이지로 이동
		location.href="/jspweb/board/write.jsp";
	}else{ // - 로그인이면 쓰기 페이지로 이동 
		alert('로그인후 글쓰기 가능합니다.');
		location.href="/jspweb/member/login.jsp";
	}
}

/* 게시물 조회 조건 객체 */
let pageObject ={
	type:1 , bcno:0 , listsize : 10 ,
	page :1, key: '', keyword:''
	//* page :조회할 페이지번호 // key : 검색할 기준 필드명 // keyword : 검색할 키워드명 


}

	// * type : {1:전체조회, 2:개별조회}
	// * bcno : 조회할 카테고리 번호 [기본값은 전체보기]
	// * listsize : 하나의 페이지에 최대표시할 게시물 수 [기본값은 10개]

// 5. 검색 버튼을 클릭했을 때
function onSearch(bcno){ 
	pageObject.key = document.querySelector('.key').value;
		console.log(pageObject.key);
 	pageObject.keyword = document.querySelector('.keyword').value;
		console.log(pageObject.keyword);
	getList(1);
}
	
	
	
	
	
// 3. 카테고리 버튼을 클릭했을 떄
function onCategory(bcno){	console.log('클릭된 카테고리 : ' + bcno);
	pageObject.bcno = bcno; // 조회 조건객체내 카테고리번호를 선택한 카테고리로 변경
	pageObject.key=''; pageObject.keyword=''; //검색해제
	getList(1);	// 조건이 변경되었기때문에 다시 출력[재랜더링/새로고침]
}

// 4. 한페이지 최대 표시할 개수를 변경했을때.
function onListSize(){
	pageObject.listsize = document.querySelector('.listsize').value; // 선택된 게시물수를 조회조건객체 저장
	getList(1);	// 조건이 변겨오디었기 때문에 다시 출력[재랜더링/새로고침]
}


// 2. 모든 글 조회 [ js열렸을때 1회 자동실행 ] // 페이지번호 클릭
getList(1);
function getList(page){ // page : 조회할 페이지번호 
	
	pageObject.page = page;
	// 클릭된 페이지번호를 조건객체에 대입
	
	
	$.ajax({
		url : "/jspweb/BoardInfoController" , 
		method : "get" ,
		data : pageObject, 
		success : r => {
			
			// ------------------ 1. 게시물 출력 -------------------------//
			// 1. 출력할 위치
			let boardTable = document.querySelector('.boardTable');
			
			// 2. 출력할 내용 구성
			let html =`
			<tr>
				<th>번호</th>
				<th>카테고리</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>작성일</th>
			</tr>
			
			
			` 
			// *서블릿으로부터 전달받은 내용[배열] 반복해서 html 구성
			// 배열명.forEach // java -> , js => 
			r.boardList.forEach(b => {
				html += `
			<tr>
				<td>${b.bno}</td>
				<td>${b.bcname}</td>
				<td><a href="/jspweb/board/view.jsp?bno=${b.bno}">${b.btitle}</a></td>
				<td>
					${b.mid}
					<img src="/jspweb/member/img/${b.mimg}">
				</td>
				<td>${b.bview}</td>
				<td>${b.bdate}</td>
			</tr>
				
				`
				
			}); //  for end
		// 3. 구성된 html내용을 출력
		boardTable.innerHTML = html; 
		
		// ----------------------------2. 페이지번호 출력 ---------------//
		
		html = ``; // 위에서 사용된 html 초기화
		
		// 페이지 개수만큼 페이징번호 구성
			//page : 조회한 페이지번호 [현재보고있는 페이지번호]
			// 이전 버튼[page<=1 ? page:page-1 : 만약에 1페이지에서 이전버튼 클릭시 1페이지로 고정하고 아니면 1차감]
		html += `<button onclick="getList(${ page <= 1 ? page : page-1 })" type="button"> < </button>`
		// 페이지번호 버튼[*페이지 개수만큼 반복]
			for( let i = r.startbtn ; i<= r.endbtn ; i++ ){
				// class="${page == i ? 'selectpage':''}"
				//만약에 현재페이지(page)와 i 같으면 버튼태그에 class= "selectpage"
				html += `<button class="${page == i ? 'selectpage':''}" onclick="getList(${i})"  type="button"> ${i} </button>`
			}
			// 다음 버튼 [page >= pageDto.totalpage ? page: page+1 만약에 현재페이지가 마지막페이지이면 고정 아니면 1증가]
				html += `<button onclick="getList(${ page >= r.totalpage ? page : page+1 })" type="button"> > </button>`;
		
		
		document.querySelector('.pagebox').innerHTML = html;
		
		// ----------------------------3. 게시물 수 출력 ---------------//

		let boardcount = document.querySelector('.boardcount');
		
			// 1. 검색이 있을 때
			if(pageObject.key == '' && pageObject.keyword==''){
				boardcount.innerHTML = `총 게시물 수 : ${r.totalsize}`
			}else{// 2. 없을 때
				boardcount.innerHTML = `검색된 게시물 수 : ${r.totalsize}`
			}
			
		
		boardcount.innerHTML =`총 게시물 수 : ${r.totalsize}`
		
		
		}, 
		error : e => {}
	})
}

/*


	HTTP URL에 매개변수(파라미터) 전달 (쿼리[질의] 스트링 방식)
		- 정의 : 페이지 전환시 매개변수(PK,식별) 전달
		- 형태
			URL?변수명 = 데이터
			URL?변수명 = 데이터&변수명 = 데이터 
			HTTP://localhost:80/jspweb/board/view.jsp?bno=3
			
		
		
		-URL에서 매개변수 호출
			new URL(location.href).searchParams.get("변수명")

*/


