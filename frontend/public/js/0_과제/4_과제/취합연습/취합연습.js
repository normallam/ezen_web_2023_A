console.log('샘플코드');
let movie=['미션임파서블-데드레코딩PARTO' , '엘리멘탈' , '범죄도시' ,'스파이더맨-어크로스더유니버스' ];
let area = ['CGV강남','CGV수원','CGV강원','CGV제주'];
let time=['11:00','13:00','15:00','17:00'];
let seat=[];
let moviebox={movie:'',area:'',time:'',seat:''}
console.log(movie)
console.log(area)
console.log(time)

let selectmovie = '';
let selecttheater = '';
let selectdate = '';
let selecttime = '';
let selectseat = []; 
let totalseat = 200;
//-------------영화---------------//
moviePrint();
function moviePrint(){
   let html = ``;
   for( let i = 0 ; i<movie.length ; i++ ){
      html += `<div><button class="movie" onclick="onButton(${i})">${movie[i]}</button></div>`
   }
   document.querySelector('.R_sector_Mn').innerHTML = html;  
   
}


function onButton(no){ console.log('onButton()함수')
   selectmovie = movie[no];
   console.log( selectmovie )
   document.querySelector('.R_details_n').innerHTML = selectmovie;
   
}
// -------------극장---------------- //
locationPrint();
function locationPrint(){
   //
   let html = ``;
   for( let i = 0 ; i<area.length; i++ ){
      html += `<div><button class="area" onclick="lonButton(${i})"> ${ area[i] } </button></div>`
   }
   document.querySelector('.R_sector_tl').innerHTML = html;
}
function lonButton(no){ console.log('lonButton()함수')
   selecttheater = area[no];
   console.log(selecttheater)
   document.querySelector('.R_details_t').innerHTML = selecttheater;

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
   document.querySelector('.R_sector_ww').innerHTML = html;
}
function tonButton(no){ console.log('tonButton()함수')
   selecttime = time[no];
   console.log(selecttime)
   
   
}
//-----------좌석----------------------//
seatPrint();
function seatPrint(){console.log("check()함수 호출")
   //
   
   let R_seat=document.querySelector('.R_sector_ss'); 
   let html =``;
   console.log("seatprint 호출됨")
   console.log("total 출력됨336363"+totalseat)
   for(let i = 1; i <= totalseat ; i++ ){
      
      html +=  `<button class="seat" name=seat${i} onclick="check(${i})" value= ${i}></button>`
   }
//   for(let i = 1; i <= totalseat.length; i++){
//      console.log("total 출력됨"+totalseat)
//      html += `<button class="seat" onclick="check(${i})" value=${i}></button>`
//      
//   }
   R_seat.innerHTML = html;


}
//--------------날짜---------------------//


function onDate(){
   console.log('날짜 변경 됨')
   // 1. 
   let dateInput = document.querySelector('.dateInput').value;
      console.log( dateInput )
   // 2. 
   selectdate = dateInput;
}

//-----------------유효성 검사-----------------//
function check(no){
   let checked = document.getElementsByName(`seat${no}`)[0]
   
   if(checked.innerText ==''){   // 선택이 안되어 있을때 선택하기 
      checked.innerHTML ='x'
      selectseat.push(no);
   }
   else{ // 선택이 되어 있을때 취소 하기 
      checked.innerHTML=''
      selectseat.splice( selectseat.indexOf(no) , 1  );
   }
   
   console.log( selectmovie );
   console.log( selecttheater );
   console.log( selectdate );
   console.log( selecttime );
   console.log( selectseat );
}
//-------------결제하기------------------//
function pay(){
   alert('결제하기');
   
   //* 지금 까지 선택했던 변수들 검토 [ 유효성검사 빈 변수가 이는지 체크 ]

   //1.객체화
   let reservation = {
       selectmovie : selectmovie ,
       selecttheater : selecttheater ,
       selectdate : selectdate ,
       selecttime: selecttime ,
       selectseat: selectseat 
   }
   if(selectmovie==''||selecttheater==''||
   	  selectdate==''||selecttime==''||
   	  selectseat==''
   ){alert('모든 항목을 선택해주세요.')
   	return;
	   
   }
   alert('영화 예매 완료')
   
   console.log( reservation );
   
}