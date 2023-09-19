package test.chattingsample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/serversocket")
public class ServerSocket {
	
	public static List< Session   > connList = new ArrayList<>();
	
	@OnOpen // 연동되었을때 실행되는 함수 구현
	public void OnOpen( Session session  ) {
		System.out.println( session );
		connList.add( session  );
			System.out.println( connList );
	}
	@OnClose
	public void OnClose( Session session ) {
		connList.remove( session );
	}
	@OnMessage
	public void OnMessage( Session session , String msg ) throws Exception {
		System.out.println( msg );
		connList.forEach( (s) -> {
			try { s.getBasicRemote().sendText(msg);} 
			catch (IOException e) { e.printStackTrace(); }
		});
		
	}
	
}








/*


*/