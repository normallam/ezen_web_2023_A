package 과제.과제2.Level1.ex2;

import java.time.LocalDateTime;

public class Level1_2 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		System.out.printf("%-10s   %15s   %30s\n" , "type" , "value" , "range" );
		System.out.println("-------------------------------------------------------------");
		/* 문제풀이 위치 */
		boolean a = true;
		boolean b = false;
		System.out.printf("boolean			%b			%b %s %b\n",a,a,"or",b);
		byte c = 100;
		byte d = -128;
		byte e = 127;
		System.out.printf("byte			%d			   %d %s %d\n",c,d,"~",e);
		char f = 'A';
		char g = '0';
		char j = '1';
		int h = 65535;
		String i = "character";
		System.out.printf("char		%d		%d%s%d%s %s %d %s",f,g,"~",h,"[",i,j,"]");
		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개 선언하고 임의값을 대입하여 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. printf() 메소드 사용
*/
