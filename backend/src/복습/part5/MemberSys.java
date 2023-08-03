package 복습.part5;

import java.util.Arrays;
import java.util.Scanner;

public class MemberSys {// class s

	public static void main(String[] args) {//main s
		
	Member[] memberList = new Member[100];
	Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println(Arrays.toString(memberList));
			System.out.println("----회원시스템----");
			System.out.println("1.회원가입 2.로그인");
			
			int ch = sc.nextInt();
			if(ch==1) {
				
				System.out.println("아이디 :"); String InputId = sc.next();
				System.out.println("비밀번호 :"); String InputPw = sc.next();
				System.out.println("이름 :"); String InputName = sc.next();
				System.out.println("전화번호 :"); String InputPhone = sc.next();
				System.out.println("나이 :"); int InputAge = sc.nextInt();
				
				Member member = new Member(InputId, InputPw, InputName, InputPhone, InputAge);
				
				for(int i =0; i<memberList.length;i++) {
					if(memberList[i]==null) {
						memberList[i]= member; break;
					}
					
					
				}// for e
				
				
			}//if e
			else if(ch==2) {
				System.out.println("----로그인----");
				System.out.println("아이디 :"); String InputId = sc.next();
				System.out.println("비밀번호 :"); String InputPw = sc.next();
				
				int login = -1;
				for(int i=0;i<memberList.length;i++) {
					if(memberList[i]!=null&&memberList[i].id.equals(InputId)&&memberList[i].password.equals(InputPw)) {
						login = i; break;
					}
					
					
					
				}// for e
				
					if(login>=0) {
						System.out.println("안내) 로그인성공");
					}else{System.out.println("안내)로그인 실패");}
				
			}//if e
		
		
		}// while e
		
	}// main e
	
	
}// class e
