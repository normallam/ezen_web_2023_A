/**
 * 
 */

 
/* [ JS 연산자 과제1 ]
   문제11 : 정수 3개를 입력받아 오름차순 으로 출력    [ 7 5 9 -> 5 7 9] */
   
let value1 = Number(prompt('정수1:'))
let value2 = Number(prompt('정수2:'))
let value3 = Number(prompt('정수3:'))

console.log('두 정수 중 더 큰 수:' + (value1>value2 ? value1 : value2> value3 ? value2 : value3 ));
console.log('두 정수 중 더 큰 수:' + (value2>value3 ? value2 : value3));
console.log('두 정수 중 더 큰 수:' + (value3>value1 ? value3 : value1));


