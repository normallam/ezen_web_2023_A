console.log('js켜짐?');
findByTop(10);	// 메인페이지에 최신등록된 제품 10개 출력
// 1. N개 제품들을 최신순으로 출력 함수 
function findByTop( count ) {
	$.ajax({
		url : "/jspweb/ProductInfoController" , method : "get" , 
		data : { type: "findByTop" , count : count } ,
		success : jsonArray => { console.log( jsonArray ) 
		
			let productBox = document.querySelector('.productBox')
			let html = ``;
				jsonArray.forEach((p)=>{
					let firstImg = Object.values(p.imgList)[0];
					html += `<div class="col">
								<div class="card">
									<img src="/jspweb/product/img/${firstImg}" class="card-img-top" alt="...">
									<div class="card-body">
										<h5 class="card-title">${p.pname}</h5>
										<p class="card-text">
											<div> ${p.pcontent} </div>
											<div> ${p.pprice.toLocaleString()}원 </div>
										</p>
									</div>
								</div>
							</div>`
					
					
					
				});
		productBox.innerHTML = html;
		
		
		}
		
	 
		
	})
}
// 2. 현재카카오지도내 보고있는 동서남북 기준내 제품들을 출력 함수 
function findByLatLng( east , west  ,  south  , north  ) {
	$.ajax({
		url : "/jspweb/ProductInfoController" , method : "get" , 
		data : { type: "findByLatLng" 	, 
				east :  east , west  : west ,  
				south  : south , north  :  north  
				} ,
		success : jsonArray => { console.log( jsonArray ) }
	})
}
// 3. 선택된 제품번호에 해당하는 제품 출력 함수 
function findByPno( pno ) {
	$.ajax({
		url : "/jspweb/ProductInfoController" , method : "get" , 
		data : { type: "findByPno" 	, pno : pno  } ,
		success : jsonObject => { console.log( jsonObject ) }
	})
}
// 4. 모든 제품들을 출력하는 함수 
function findByAll(   ) {
	$.ajax({
		url : "/jspweb/ProductInfoController" , method : "get" , 
		data : { type: "findByAll" 	 } ,
		success : jsonArray => { console.log( jsonArray ) }
	})
}




