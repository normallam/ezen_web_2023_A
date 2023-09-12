console.log('js연결');

// 1. 첨부파일 이미지 미리보기
function preimg(object){
	
	// --- 해당 파일을 바이트코드 변환
	// 2. js파일클래스 선언
	let file = new FileReader(); // 파일 읽기 클래스 이용한 파일읽기객체 선언
	// 3. 파일 읽어오기 함수 제공 
	file.readAsDataURL(object.files[0]); // input에 등록된 파일리스트중 1개를 파일객체로 읽어오기
	//console.log(file);
	// 4. 읽어온 파일을 해당 html img태그에 load
	file.onload = e => { // onload() : 일겅온 파일의 바이트코드를 불러오기
		console.log(e);  // e : 이벤트 정보 
		console.log(e.target);  // e.target : onload() 실행한 fileReader 객체
		console.log(e.target.result); // 읽어온 파일의 바이트코드
		document.querySelector('.preimg').src = e.target.result; // img src 속성에 대입
	}
} // f end

function hrmimg( object ){
	
	console.log( 'hrmimg 열림' )
	
	let file = new FileReader();
	
	file.readAsDataURL( object.file[0] );
	
	file.onload = e =>{
		document.querySelector('.hrmimg').src = e.target.result;
	}
}


// 2. 인사등록
function regist(){
	
	let hrmForm = document.querySelectorAll('.E_text')[0];
	console.log('hrmForm : ' + hrmForm);
	let hrmData = new FormData(hrmForm);
	console.log('hrmData : ' + hrmData);
	 $.ajax({
      url : "/jspweb/HrmController",
      method : "post",				// form 객체 [대용량] 전송은 무조건 post 방식
      data : hrmData ,				// FormData 객체를 전송
      contentType : false,			// form 객체[대용량] 전송타입
      processData : false,
      success : r=> {
		  if(r){
			  console.log('저장성공!');  //view();
		  }
		
	  } ,
      error : e=> {console.log(e)}
   })

	
	
}

// 3. 인사조회
view();
function view(){
		
		$.ajax({
      	url : "/jspweb/HrmController",
      	method : "get",
      	success : r => {
			  let viewbox = document.querySelector('.viewbox');
			  let html = ``;
			  let setting = `<tr>
			  				<th>직원번호</th>
							<th>사진</th>
							<th>직원명</th>
							<th>직원전화번호</th>
							<th>직급</th>
							<th> 입사등록일</th>
			  				</tr>`;
			  				
			 for(let i=0;i<r.length;i++){
				 html += `<tr class="content">
				 			<td>${r[i].eno}</td>
				 			<td><img alt="등록사진" src="img//${r[i].epi}"></td>
				 			<td>${r[i].ename}</td>
				 			<td>${r[i].ecall}</td>
				 			<td>${r[i].egrade}</td>
				 			<td>${r[i].eredate}</td>
				 		</tr>`;
			 }				
			  				
			  viewbox.innerHTML = setting+html;
			  
			  
		  } ,
      	error : e=> {console.log(e)},
   })

	
	
	
	
	
}