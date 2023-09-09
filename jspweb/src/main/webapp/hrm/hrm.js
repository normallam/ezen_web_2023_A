console.log('js연결');

view(); // 어디서 불러오는거지

// 1. 인사등록
function Employee regist(){
	
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
			  console.log('저장성공!');
		  }
		  hrmread();
	  } ,
      error : e=> {console.log(e)}
   })

	
	
}

// 2. 인사조회

view();
function view(){
		console.log('view');
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