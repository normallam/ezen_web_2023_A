Cconsole.log('1_AJAX통신.js open');

// 1. 예제1

function 예제1(){
	
$.ajax({
		
		url: "" ,		
		data: {'value1','jsdata'} ,		
		method: "get" ,
		success: function 함수(result){
			console.log("서블릿 응답한 내용 :" + result)
		},
		error: function 함수(result){} 		
	})	
	
	
	
	
}// f end


/*

	$.ajax();
	객체{} 타임의 속성 대입
	$.ajax({
		
		url: "" ,				-- 통신할 HTTP 주소(누구에게)
		data: {} ,				-- 보내는 데이터(어떤 거를)
		method: "" ,			-- POST, GET, PUT , DELETE(어떤방식으로)
		success: function 함수(result){} ,			-- 통신 성공 했을 때 응답데이터를 result 매개변수 받기
		error: function 함수(result){} ,			-- 통신 실패 했을 때 실패사유를 result 매개변수 받기
		
	})


*/