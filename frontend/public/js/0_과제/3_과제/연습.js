/**
 * 
 */

 
 let 날짜배열 =[]
 let 항목배열 =[]
 let 금액배열 =[]
 
 console.log('js 열림')
 
 
//1. 등록 버튼 클릭했을 때 이벤트
function 등록(){console.log('등록함수 클릭');

	//1. HTML 특정 태그 가져오기
	//document.getElementsByClassName("클래스명")
	let dateInput = document.querySelector(".date");	console.log( dateInput )
	let nameInput = document.querySelector(".name"); 	console.log( nameInput )
	let moneyInput = document.querySelector(".money"); 	console.log( moneyInput )
	
	//2. 태그의 입력된 값 호출
	let date = dateInput.value;		console.log(date)
	let name = nameInput.value;		console.log(name)
	let money = moneyInput.value;	console.log(money)
	
	//* 유효성검사 : 만약에 3가지 중에 하나라도 공백이면
	if( date == '' || name== '' || money=='' ){
		alert('미입력이 존재합니다.[등록불가]');
		return; // 함수 강제종료 // return 실행되면 아래 코드는 실행x
	}


	// 3. 배열 저장
	날짜배열.push(date);	console.log(날짜배열)
	항목배열.push(name);	console.log(항목배열)
	금액배열.push(money); console.log(금액배열)
	
	
	출력()
	
	//*저장 성공시 input 상자 입력값 초기화
	alert('항목 등록이 성고 되었습니다.')
	dateInput.value = ``
	nameInput.value = ``
	moneyInput.value = ``
} // f end


function 출력(){console.log('가계부목록 출력합니다.');
	//1. 어디에 출력할껀지?? table 가져오기
	let outputTable = document.querySelector('.outputTable')
	//2. 무엇을???
	let html = `<tr> <th> 날짜 </th> <th> 항목 </th> <th> 가격 </th><th> 비고 </th> </tr>`
	
	for(let 인덱스=0 ; 인덱스<날짜배열.length; 인덱스++ ){
		html += `<tr>
					<td> ${날짜배열[인덱스]} </td>
					<td> ${항목배열[인덱스]} </td>
					<td> ${Number(금액배열[인덱스]).toLocaleString()}원 </td>
					<td> <button onclick="삭제(${인덱스})">삭제</button> </td>
		
		
		
				</tr>	`
		
		
		
		
		
	}

	let 총합계 =0;
	for(let i =0 ;인덱스<금액배열.length ; 인덱스 ++){
		console.log(인덱스);
		console.log(금액배열[인덱스]);
		총합계 += Number(금액배열[인덱스]);

	}



}




















