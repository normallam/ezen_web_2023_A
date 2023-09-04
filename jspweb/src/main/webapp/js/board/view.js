/*
	view.jsp

*/


// 1. list.jsp에서 클릭된 제목의 bno를 전달받아 게시물 1개 가져오기
//URL에 있는 매개변수(쿼리스트링) 가져오기 -> 페이지 전환되면 정보 없어짐 BNO만 쿼리스트링으로 전달
getBoard();
function getBoard(){
	
	// 1 URL에 있는 매개변수(쿼리스트링) 가져오기
		// 1. 현재 주소(url)상 매개변수 가져오기
	let urlParams = new URL(location.href).searchParams
		console.log(urlParams);
	let bno = urlParams.get("bno");	// url주소에서 bno의 데이터 가져오기
		// new URL(location.href).searchParams("매개변수명") 
		console.log(bno);
		
		
	// 2. AJAX 이용한 bno 전달해서 게시물의 상세 정보 모두 가져오기
	  $.ajax({
     	 url : "/jspweb/BoardInfoController",
      	method : "get",
     	 data : { type : 2, bno : bno} ,
     	 success : r => {console.log(r)
     	 
     	 
     	 	// 1.
     	 	let boardBox = document.querySelector('.boardBox')
     	 	
     	 	// 2. HTML 구성 
			let html = `부가정보 : <div> 
									${ r.bcname } , 
									${ r.bview } , 
									${ r.bdate } 
								 </div>
						부가정보2 : <div>  
									${ r.mid }  , 
									<img src="/jspweb/member/img/${ r.mimg }" width="50px" /> 
								</div>
						제목 : <div> ${ r.btitle } </div>
						내용 : <div> ${ r.bcontent } </div>
						첨부파일 : <div> ${ r.bfile } </div>
						
						`
					// 3. 만약에 본인글 인지 제어 [본인들이면 수정/삭제 보여주기 / 아니면 표시안함]
					
					html += `<a href="list.jsp"><button type="button">목록보기</button></a>`	
					if(r.ishost){
						html +=`
							<button onclick = "ondelete(${r.bno})" type="button">삭제</button>
							<button onclick = "onupdate(${r.bno})" type="button">수정</button>
						`
					}	
     	 // 3. 
     	 boardBox.innerHTML = html;
     	 
     	 
     	 } ,
     	 error : e => {console.log(e)}
  		 })

		
}// f end


// 2. 게시물 삭제 -> 레코드 식별 -> pk
function ondelete(bno){
	
	  $.ajax({
      url : "/jspweb/BoardInfoController",
      method : "delete",
      data : {bno : bno} ,
      success :r => {console.log(r);
      
      	if(r){
			  alert('삭제 성공');
			  location.href="/jspweb/board/list.jsp";
		  }else{alert('삭제 실패')}
      
      
      } ,
      error : e => {console.log(e);}
   })
	
}// f end

// 3. 게시물 수정 페이지로 이동
function onupdate(bno){
	// 1. 수정페이지로 이동 [ 대표 : pk ]
	location.href=`/jspweb/board/update.jsp?bno=${bno}`;
	
	
	
	
}// f end
