package controller.chatting;

import javax.websocket.server.ServerEndpoint;

import java.io.IOException;
import java.util.ArrayList;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;


/*
 	1. 서버 소켓 만들기
 		1. 클래스 선언
 		2. 클래스 위에 @ServerEndpoint("서버소켓의 URL정의") : 클라이언트소켓들이 접속하는 위치
 		3. 서버 웹소켓의 필수 메소드
 			@OnOpen		: 클라이언트소켓이 서버소켓에 연결이 접속되었을때
 			@OnClose	: 클라이언트소켓이 서버소켓과 연결이 닫혔을 때
 			@OnMessage	: 클라이언트소켓이 메시지를 보냈을 때
 			@OnError	: 클라이언트소켓이 서버소켓과 연결에 에러 발생했을 때
 */
@ServerEndpoint("/ChattingSocket")
public class ChattingSocket {
		
	public static ArrayList<Session> 접속명단 = new ArrayList<>();
	
	
	// 1.
	@OnOpen // 클라이언트가 서버소켓의 접속했을때 매핑/연결	(JS에서 new WebSocket 객체 생성될때. 문제없이 접속되면)
	public void onOpen(Session session) {
		System.out.println("클라이언트소켓 접속 : "+session);
		System.out.println(session.getId());
		System.out.println(session.getRequestURI());
		// * 들어온 클라이언소켓들을 서버소켓에 저장...
		접속명단.add(session); // 접속된 소켓들의 명단을 가지고 있어야 추후에 통신가능
		System.out.println("접속명단 :" + 접속명단);
		
		
	}
	// 2. 클라이언트가 서버소켓과 연결이 닫혔을때 매핑/연결 (JS에서 웹소켓 객체를 초기화 = 새로고침[F5],페이지전환 등등)
	@OnClose
	public void onClose(Session session) {접속명단.remove(session);} // 접속명단 리스트에서 제외
	// 3.
	@OnMessage // 클라이언트가 서버소켓에 메세지를 보냈을때 연결/매핑
	public void onMessage(Session session, String msg) {System.out.println(msg);//클라이언트소켓으로부터 메세지를 받았을 때
		// 현재 접속된 명단(클라이언트소켓)들에게 메세지 전달
		for(int i=0;i<접속명단.size();i++) {Session s = 접속명단.get(i);}
		for(Session s : 접속명단 ) {}
		접속명단.forEach(s->{
			try {s.getBasicRemote().sendText(msg);
			} catch (IOException e) {System.out.println(e);}
			// s : 접속명단에 있는 클라이언트소켓 중 하나
				// .getBasicRemote() : 메세지 전송을 메소드 제공
					// .sendText : 메세지를 String타입으로 전송 [!예외처리 필수]
			
		});
	}
	
	// 4.
}



















