package 과제.과제2;

public class 연산20문제 {
	
	public static void main(String[] args) {

		//------ 문제1 여기에 풀이-------//
System.out.println("1번");
System.out.println("   |\\_/|"); 
System.out.println("   |q p|   /}"); 
System.out.println("   ( 0 )\"\"\"\\"); 
System.out.println("   |\"^\"`    |"); 
System.out.println("   ||_/=\\\\__|"); 
		
		//------ 문제2 여기에 풀이-------//
System.out.println("2번");
String name = "강호동";
String hello = "안녕하세요";
String date = "09-28";
System.out.println("       --------------방문록--------------------");
System.out.println("       | 순번  | 작성자  |    내용     | 날짜       |");
System.out.println("       |  1   |"+" "+name+"  "+"|"+hello+"  |"+"   "+date+"   "+"|");
System.out.println("       ----------------------------------------*/");

		//------ 문제3 여기에 풀이-------//
System.out.print("3번:");
int basicpay = 10000;
int extrapay = 5000;
System.out.println(basicpay+extrapay-(basicpay/10));

		//------ 문제4 여기에 풀이-------//
System.out.print("4번:");
int money =356789;
int m1 = (int)(money/100000);
int m2 = (money%100000/10000);
int m3 = (money%10000/1000);
int m4 = (money%1000/100);
System.out.println("금액은 :"+money);
System.out.println("십만원권 : "+m1+" ,만원권 : "+m2+" ,천원권 : "+m3+" ,백원 :"+ m4);

		//------ 문제5 여기에 풀이-------//
System.out.print("5번:");
int number = 1251231;
String seventimes = (number%7 == 0) ? "O" : "X";
System.out.println(seventimes);

		//------ 문제6 여기에 풀이-------//
System.out.print("6번:");
int number2 = 12345678;
String oddnumber = (number%2 == 1) ? "O" : "X";
System.out.println(oddnumber);

		//------ 문제7 여기에 풀이-------//
System.out.print("7번:");
int number3 = 23251323;
String intersection = (number3%7 == 0 && number3%2 == 0) ? "O" : "X";
System.out.println(intersection);

		//------ 문제8 여기에 풀이-------//
System.out.print("8번:");
int number4 = 1231123;
String intersectionO = (number%7 == 0 || number%2 == 1) ? "O" : "X";
System.out.println(intersectionO);

		//------ 문제9 여기에 풀이-------//
System.out.print("9번:");
int number5 = 212321;
int number6 = 233231;
int biggerNumber = (number5>number6) ? number5 : number6;
System.out.println(biggerNumber);

		//------ 문제10 여기에 풀이-------//
System.out.print("10번:");
int radius = 323;
double area = radius*radius*3.14;
System.out.println(area);

		//------ 문제11 여기에 풀이-------//
System.out.print("11번:");
int number7 = 12;
int number8 = 144;
double persent =(double)number7/(double)number8;
System.out.println(persent);

		//------ 문제12 여기에 풀이-------//	
System.out.print("12번:");
int base = 60;
int upperside = 30;
int height = 45;
double area2 = (upperside+base)*height/2;
System.out.println(area2);

		//------ 문제13 여기에 풀이-------//
System.out.print("13번:");
int height2 = 173;
double normweight = (height2-100)*0.9;
System.out.println(normweight);

		//------ 문제14 여기에 풀이-------//
//계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
System.out.print("14번:");
int height3 = 173;
int weight1 = 70;
double calbmi = weight1/((height3/100)*(height3/100));
System.out.printf("%.2f",calbmi);
System.out.println(); // 띄어주기위한 용도
		//------ 문제15 여기에 풀이-------//
System.out.print("15번:");
int inchinput = 30;
double inchcal = (inchinput*2.54);
System.out.println(inchcal);

		//------ 문제16 여기에 풀이-------//
System.out.print("16번:");
int middletest = 70;
int finaltest = 80;
int performanceE = 85;
double testscore = (middletest*0.3+finaltest*0.3+performanceE*0.4);
System.out.println(String.format("%.2f", testscore));
		
		//------ 문제17 여기에 풀이-------//
System.out.print("17번:");
int x = 10;
int y = x-- + 5 + --x;
System.out.printf("x의 값 : %d , y의 값 : %d ",x,y);
System.out.println(); //띄어주기 위한 용도

		//------ 문제18 여기에 풀이-------//
System.out.print("18번:");
int ageinput = 25;
String agesort= (ageinput>=40) ? "중년" : (ageinput>=20) ? "성인" : (ageinput>=10) ? "학생" : "노인";
System.out.println(agesort);	

		//------ 문제19 여기에 풀이-------//
System.out.print("19번:");
int korean = 90;
int math = 85;
int english = 90;
double totalsum = (korean+math+english);
double average = (korean+math+english)/3;
System.out.printf("총점은: %.1f, 평균은: %.2f",totalsum,average);
System.out.println(); //띄어주기위한 용도	

		//------ 문제20 여기에 풀이-------//
System.out.print("20번:");
String idinput = "admin";
String pwinput = "4321";
String validation = (idinput=="admin"&&pwinput=="1234") ? "로그인성공" : "로그인실패";
System.out.println(validation);	

		//------ 문제21 여기에 풀이-------//
System.out.print("21번:");
int one = 30;
int two = 90;
int three = 60;
int maxnumber = (one>two)? one : (one>three)? one : (two>three)? two: three ;
System.out.println(maxnumber);
		
	}

}


/*

문제1 : 강아지 console 출력
	|\_/|
	|q p|   /}
	( 0 )"""\
	|"^"`    |
	||_/=\\__|

문제2 : 입력받은 3개 데이터를 이용한 표 만들기 
	[입력변수]
		1. 작성자[문자열] , 내용[문자열] , 날짜[문자열] 입력받아 각 변수에 저장 
	[출력 예]
		   --------------방문록--------------------
		   | 순번  | 작성자  | 	내용 	| 날짜       |
		   |  1   | 강호동  |안녕하세요  |  09-28    |
		  ----------------------------------------
	
문제3 : 급여 계산
	[입력조건]
		기본급[정수] , 수당[정수]
	[ 조건 ] 
		 실수령액 = 기본급 + 수당 - 세금[기본급10%] 
	[출력조건] 
		실수령액 출력[ 소수점 없이  ]

문제4 : 지폐 세기 
	 [입력조건 ] 
		금액 
	 [조건 ] 
		 십만원 부터 백원 까지의 개수 세기 
	[ 출력조건 ]
		예) 356789 입력시 
		 십만원 3장 
		 만원 5장
		 천원 6장 
		 백원 7개

문제5 : 하나의 정수를 입력받아 7의 배수인지 출력[ 'O' 혹은 'X' 로 출력]

문제6 : 하나의 정수를 입력받아 홀수 인지 출력 [ 'O' 혹은 'X' 로 출력]

문제7 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 출력 [ 'O' 혹은 'X' 로 출력 ]

문제8 : 하나의 정수를 입력받아 7의 배수 이거나 홀수 인지 출력 [ 'O' 혹은 'X' 로 출력 ]

문제9 : 두개의 정수를 입력받아 더 큰수 출력 

문제10 : 반지름을 입력받아 원 넓이 출력하기 
	계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]

문제11 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기 
	예) 54.5   84.3 실수 2개입력시 결과는   64.285714%

문제12 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 
	계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2

문제13: 키를 정수를 입력받아 표준체중 출력하기 
	계산식) 표준체중 계산식 = > (키 - 100) * 0.9

문제14: 키와 몸무게를 입력받아 BMI 출력하기 
	계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))

문제15: inch 를 입력받아 cm 로 변환하기 
	계산식) 1 inch -> 2.54cm

문제16:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오 
	계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %

문제17 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
	int x = 10;
	int y = x-- + 5 + --x;
	printf(" x의 값 : %d , y의값 :  %d ", x, y)

문제18 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기

문제19 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력

문제20 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 로그인성공 아니면 로그인실패 출력

문제21 : 세 정수를 입력받아 가장 큰수 출력 

  
 */
