console.log('샘플코드');
let movie=['미션' , '엘리' , '범죄' ,'사냥' ];
let area = ['서울','경기','강원','제주'];
let time=['11:00','13:00','15:00','17:00'];
let seat=[];
let moviebox={movie:'',area:'',time:'',seat:''}
console.log(movie)
console.log(area)
console.log(time)

let 선택영화 = '';
let 선택영화관 = '';
let 입력날짜 = '';
let 선택시간 = '';
let 선택좌석 = ''; /*틱택톡 3배수면 끝나게*/
let totalseat = 100;
//-------------영화---------------//
moviePrint();
function moviePrint(){
	let html = ``;
	for( let i = 0 ; i<movie.length ; i++ ){
		html += `<button class="movie" onclick="onButton(${i})">${movie[i]}</button>`
	}
	document.querySelector('.R_Movie').innerHTML = html;  
}


function onButton(no){ console.log('onButton()함수')
	선택영화 = movie[no];
	console.log( 선택영화 )
}
// -------------극장---------------- //
locationPrint();
function locationPrint(){
	//
	let html = ``;
	for( let i = 0 ; i<area.length; i++ ){
		html += `<button class="area" onclick="lonButton(${i})"> ${ area[i] } </button>`
	}
	document.querySelector('.R_theater').innerHTML = html;
}
function lonButton(no){ console.log('lonButton()함수')
	선택영화관 = area[no];
	console.log(선택영화관)
}
//-----------------시간-----------------//
timeprint();
function timeprint(){
	//
	let html = ``; console.log("timeprint 호출됨")
	console.log("time.length   :   "+time.length);
	for(let i = 0; i<time.length; i++){
		console.log("for문에 들어옴")
		console.log("time["+i+"]"+time[i])
		html += `<button class="time" onclick="tonButton(${i})"> ${ time[i] } </button>`
	}
	document.querySelector('.R_time').innerHTML = html;
}
function tonButton(no){ console.log('tonButton()함수')
	선택시간 = time[no];
	console.log(선택시간)
	
	
}
//-----------좌석----------------------//
seatPrint();
function seatPrint(){console.log("check()함수 호출")
	//
	
	let R_seat=document.querySelector('.R_seat'); 
	let html =``;
	console.log("seatprint 호출됨")
	console.log("total 출력됨336363"+totalseat)
	for(let i = 1; i <= totalseat ; i++ ){
		
		html +=  `<button class="seat" name=seat${i} onclick="check(${i})" value= ${i}></button>`
	}
//	for(let i = 1; i <= totalseat.length; i++){
//		console.log("total 출력됨"+totalseat)
//		html += `<button class="seat" onclick="check(${i})" value=${i}></button>`
//		
//	}
	R_seat.innerHTML = html;

}
function check(no){
	let checked = document.getElementsByName(`seat${no}`)[0]
	
	if(checked.innerText ==''){	checked.innerHTML ='x'}
	else{checked.innerHTML=''}
}
//-----------------------------------//
movieboxprint();
function movieboxprint(){console.log("test중")}
	//
	let Reservation= document.querySelector('.Reservation');
	let html = ``;
	for(let i = 1; i <=  )


/*function moviePrint( categoryNo ){  // 어떤 카테고리의 제품 출력한껀지??? 인수 판단 
	// 1. 어디에 
	let moviebox = document.querySelector('.moviebox')
	// 2. 무엇을  [ 선택된 카테고리에 맞는 제품들 만 출력 ]
	let html =``;
		// html 구성
		for( let i = 0 ; i<moviebox.length ; i++ ){ // 모든 버거배열/리스트[서랍장] 열어서[하나씩] 확인 
			// i번째 버거의 카테고리 와 선택한 카테고리와 같으면 html 구성 / 아니면 구성x
			if( moviebox[i].category == categoryNo ){
				 			/*  이미지출력시:   ${} 앞뒤로 띄어쓰기 주의    */
				html += `	<div onclick="productSelect( ${ i } )" class="product">
								<img src="../img/${ burgerList[i].img }"/>
								<div class="pinfo">
									<div class="pname"> ${ burgerList[i].name } </div>
									<div class="pprice"> ${ burgerList[i].price.toLocaleString() } 원 </div> 
								</div> 
							</div>`
			} // 
		} // f end 
	// 3. 출력[대입]
	productbox.innerHTML = html 
} // f end */


//<div class="pprice"> ${ burgerList[i].price.toLocaleString() } 원 </div>
// ->>>>>>>>>>>>>>>>>>>>>>>위에 참고용

//seatprint();
//function seatprint(){
//	//
//	let html = ``;
//	for(let i = 0; i<seat.length; i++){
//		html += ``	
//	}
//	
//	
//	}