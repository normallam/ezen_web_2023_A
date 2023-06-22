/**
 * 
 */

 // 문제 11 : 정수 3개를 입력받아 오름차순 출력 
let int1 = Number( prompt('정수1 : ') ) ;	
let int2 = Number( prompt('정수2 : ') ) ;	
let int3 = Number( prompt('정수3 : ') ) ;	

if( int1 > int2 ){
	let temp = int1; 
	int1 = int2;	 
	int2 = temp;}
if( int1 > int3 ){let temp = int1; int1 = int3; int3 = temp;}
if( int2 > int3 ){let temp = int2; int2 = int3; int3 = temp;}
console.log( int1 +'  '+int2 + '  ' + int3 )

/* 문제12 : [ 가위바위보 게임 ] 











*/