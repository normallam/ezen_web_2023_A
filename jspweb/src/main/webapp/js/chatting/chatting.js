// 1. 클라이언트 소켓 만들기

	// 1. JS웹 소켓 객체 [WebSocket클래스] // 객체가 생성되면 서버소켓에 자동으로 접속됨
		// new WebSocket('ws://ip주소:포트번호/서버소켓URL')
	let 클라이언트소켓 = new WebSocket('ws://localhost:80/jspweb/ChattingSocket'); console.log(클라이언트소켓);
	// 2. onopen, onclose, send, onmessage

	// 내가 만든 함수를 클라이언트소켓 속성에 대입
	클라이언트소켓.onmessage = (event) => onmsg(event);

	// 2. 연결된 서버소켓에게 메세지 보내기
function msgsend(){
	// 1. input 입력된 값 가져오기
	let msg = document.querySelector('.inputcontent').value;
	// 2. 클라이언트소켓 .send();
	클라이언트소켓.send(msg); // input에서 입력받은 데이터를 보내기 [ 클라이언트소켓.send() =====> 서버소켓 @OnMessage ]
}//f end

	// 3. 연결된 서버소켓으로부터 메세지를 받았을 때
function onmsg(event){
	console.log(event);
	console.log(event.data);
	
	document.querySelector('.contentbox')
				.innerHTML += `<div>${event.data}</div>`



}


/*
	1. AJAX[ 단방향 ]
		
		발신자 : AJAX		요청
		수신자 : 서블릿		응답
		
		
		 
		JS 					JAVA[서블릿]
		
		AJAX
				rest		get
							post
							put
							delete

	2. (웹) 소켓
		
		소켓 : 통신의 종착점[도착위치]
		
		JS						  JAVA
		[클라이언트소켓]				[서버소켓]		
		websocket



*/

/*

	






*/