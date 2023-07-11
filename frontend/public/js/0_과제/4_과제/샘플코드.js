console.log('샘플코드');
let movie=['미션' , '엘리' , '범죄' ,'사냥' ];
let location = ['서울','경기','강원','제주'];
let time=['11:00','7일','8일','9일'];
let seat=['','','','','','','','',''];

console.log(movie)
let 선택영화 = '';
let 선택영화관 = '';
let 입력날짜 = '';
let 선택시간 = '';
let 선택좌석 = ''; /*틱택톡 3배수면 끝나게*/

moviePrint();
function moviePrint(){
	let html = ``;
	for( let i = 0 ; i<movie.length ; i++ ){
		html += `<button class="movie${i}" onclick="onButton(${i})">${movie[i]}</button>`
	}
	document.querySelector('.R_Movie').innerHTML = html;  
}


function onButton(no){ console.log('onButton()함수')
	선택영화 = movie[no];
	console.log( 선택영화 )
}
// ----------------------------- //
locationPrint();
function locationPrint(){
	//
	let html = ``;
	for( let i = 0 ; i<location.length; i++ ){
		html += `<button class="location${i}" onclick="lonButton(${i})"> ${ location[i] } </button>`
	}
	document.querySelector('.R_theater').innerHTML = html;
}
function onButton(no){ console.log('lonButton()함수')
	선택영화관 = location[no];
	console.log(선택영화관)
}
//----------------------------------//
timeprint();
function timeprint(){
	//
	let html = ``;
	for(let i = 0; i<time.length; i++){
		html += `<button class="time${i}" onclick="tonButton(${i})">${time[i]}</button>`
	}
	document.querySelector('R_date').innerHTML = html;
}
function tonButton(no){ console.log('tonButton()함수')
	선택시간 = time[no];
	console.log(선택시간)
	
	
}
//---------------------------------//
seatprint();
function seatprint(){
	//
	let html = ``;
	for(let i = 0; i<seat.length; i++){
		html += ``	
	}
	
	
	
} 





function lonButton(no){
	document.querySelector(`.Location${no}`).innerHTML = Location[no-1];
}
function tonButton(no){
	document.querySelector(`.Movieth${no}`).innerHTML = Movieth[no-1]; 
}
function donButton(no){
	document.querySelector(`.Dateon${no}`).innerHTML = Dateon[no-1];
}