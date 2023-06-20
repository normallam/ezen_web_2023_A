/**
 * 
 */
/*
 
 	변수: 데이터 1개 저장할 수 있는 공간/메모리/상자
 		변수 선언 : let 상수명 = 데이터
 	상수: 데이터1개 저장할 수 있는 공간/메모리/상자
 		상수 선언 : const 상수명 = 데이터
		선언키워드 변수명=저장할 데이터
		
	배열 데이터 여러개를 한곳에 저장할 수 있는 공간/메모리/상자
 		- 순서대로 번호가 붙인 데이터들이 연속적인 형태
 		- 순서대로 번호 ='인덱스' **
 		- 인덱스 순으로 데이터들을 연속적으로 저장
 		1. 배열 : [] 대괄호 사용
 		2. 식별번호 : 인덱스 사용[0번 시작~]
 		3. 배열 선언
 			let 배열명 = [데이터1, 데이터2, 데이터3]
 			const 배열명 = [데이터1, 데이터2, 데이터3]
 			ex)
 			
	 			let 청소부 = '하하'
	 			=> '청소부'이라는 변수명에 1명/개 데이터를 저장했다. (변수)
	 			
	 			let 무궁화반 = ['유재석', '강호동', '신동엽', '서장훈']
	 			=> '무궁화반'이라는 변수명에 4명/개 데이터를 저장했다. (변수=배열, 함수, 객체)
	 			
	 			인덱스	: 		0		1		2		3
	 			마지막 인덱스:		3
	 			학생수/길이:		4
 		4. 배열 길이
 				배열명.length		: 배열내 데이터 개수
 		5. 배열 호출
 				배열명		: 배열 전체
 				배열명[인덱스] : 배열내 인덱스에 해당하는 데이터 1개				

		6.배열내 데이터 수정 	
				배열명[인덱스] = 새로운 값 	
 	
 		7.배열내 데이터 추가
 				배열명.push( 새로운값 )	: 배열내 마지막 위치에 저장
					- 마지막 인덱스 뒤에 데이터 추가
 				배열명.splice(추가할 위치인덱스, 0, 새로운 값) : 해당 위치인덱스에 새로운 값 저장
 					- 특정 위치/인덱스에 데이터 추가 
 					[*추가된 요소 뒤로 한칸씩 자동 밀려남]
 		8.배열내 데이터 삭제
 				배열명.pop()			:배열내 마지막 위치 데이터 삭제
 				배열명.splice(제거할인덱스, 제거개수)
 				ex)
 					배열명.splice(0)	: 0번 인덱스부터 마지막인덱스까지 삭제
 					배열명.splice(0 , 1)	: 0번 인덱스 1개 삭제
 					배열명.splice(3 , 1)	: 3번 인덱스 1개 삭제
 					배열명.splice(2 , 3)	: 2 3 4번 인덱스 3개 삭제
 					[*삭제된 요소 뒤로 한칸씩 자동 당겨짐]			
 		9.배열내 데이터를 이용한 데이터 삭제	
				-배열명.indexOf('찾을데이터') :  찾을데이터가 존재하면 찾은인덱스 아니면 -1
				ex) 배열명.splice( 배열명.indexOf('바나나'),1) : '바나나'가 배열에 존재하면 삭제
				
				


 			
 				
 */	
 //예제1 : 배열 선언
 let 배열명 = ['바나나','사과','딸기','포도'] // -데이터/문자열 4개를 저장하는 배열 선언
 //예제2 : 배열 호출
console.log(배열명)
 	//F12 개발자도구 console
 	/* array = 배열
 		인덱스 : 데이터
 	*/
document.write(배열명)
// 예제3 : 인덱스 사용
document.write('<h3> 과일개수 :'+배열명.length+'</h3>')
document.write('<ol>')	//html 문자처리O 
document.write(		'<li>'+배열명[0]+'</li>') // 변수or배열 문자처리x
document.write(		'<li>'+배열명[1]+'</li>') // 변수or배열 문자처리x
document.write(		'<li>'+배열명[2]+'</li>') // 변수or배열 문자처리x
document.write(		'<li>'+배열명[3]+'</li>') // 변수or배열 문자처리x
document.write ('</ol>')
 

 //예제4 : 인덱스를 이용한 데이터 수정
console.log(배열명[0]);	// 수정전	'바나나'
 배열명[0] = '수박';		// 수정후
console.log(배열명[0]);   // 수정후 '수박'

//예제5 : 배열에 요소/데이터 추가
배열명.push('체리');  // push('체리'): 배열내 마지막 요소/데이터 뒤에 새로운 데이터 추가
console.log(배열명)
배열명.splice( 0, 0, '복숭아') //0번쨰 인덱스에서 0개 자르고 '복숭아'추가 /*추가와 삭제기능*/
console.log(배열명)


 //예제6 : 배열에 특정 요소/데이터  삭제
 배열명.splice(0,1); //0번 인덱스부터 1개 삭제  
 console.log(배열명) // 수박 제거
 
 
 배열명.splice(배열명.indexOf('딸기'),1)//'딸기' 삭제하는데 인덱스 번호를 모르는 상태
 			//1. 배열명.indexOf('딸기') => 2
 			//2. 배열명.splice( 2, 1 ) => 2번 인덱스부터 1개 삭제
 console.log(배열명) // '딸기'생성
 
 
 
 
 
 
 
 
 
 
 
 
 
 