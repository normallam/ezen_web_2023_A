console.log('샘플코드');
let movie=['미션' , '엘리' , '범죄' ,'사냥' ];
let Location = ['서울','경기','강원','제주'];
let Movieth = ['강동','수원','속초','제주']
let Dateon=['6일','7일','8일','9일'];
console.log(movie)

print();
function print(){
	let html = ``;
	for( let i = 0 ; i<movie.length ; i++ ){
		
		html += `<button class="movie${i+1}" onclick="onButton(${i+1})">${movie[i]}</button>`
		
	}
	document.querySelector('.R_Movie').innerHTML = html; 
}


function onButton(no){ console.log('onButton()함수')
	
	
	
	document.querySelector(`.movie${no}`).innerHTML = movie[no-1];
	
	
// 1. 입력받은 데이터 호출 
		// 1. document.querySelector(식별자).value
	/*
	let movie2Value = document.querySelector('.movie2').value;
	let movie3Value = document.querySelector('.movie3').value;
	let movie4Value = document.querySelector('.movie4').value;*/




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