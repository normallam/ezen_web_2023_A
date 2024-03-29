// -- 포인트 지급 테스트
//setPoint( 1000 , "회원가입축하");
//setPoint( -500 , "이모티콘구매");
getPoint();
getPointList();

// 1. 포인트 사용 함수[mno는 서블릿이 (로그인세션) 알고 있다.]
function setPoint(mpamount,mpcomment){
	
	if(loginState == false){return;}
	
	let returnData = false;
	
	$.ajax({
      url : "/jspweb/PointController",
      method : "post",
      async : false, /*ajax가 응답이 올때까지 대기상태 = 동기식, 반대말 : 비동기식*/
      data : {mpamount:mpamount, mpcomment:mpcomment} ,
      success : result=> {console.log(result);
      	returnData = result;
      
      
      } ,
      error : e=> {console.log(e);}
   })
	return returnData; /*ajax 결과를 리턴하는 방식*/
}
// 2. 내 포인트 확인 함수 
function getPoint(){
	if(loginState == false){return;}
	 $.ajax({
      url : "/jspweb/PointController",
      method : "get",
      data : {type : 1} ,
      success : result=> {console.log(result);} ,
      error : e=> {console.log(e);}
   })

	
	
}
// 3. 내 포인트 내역 전체 출력 함수
function getPointList(){
	if(loginState == false){return;}
	  $.ajax({
      url : "/jspweb/PointController",
      method : "get",
      data : {type : 2} ,
      success : result=> {console.log(result);} ,
      error : e=> {console.log(e);}
   })

	
}


// ---------------------------- 결제 연동 ---------------------------//

// 1. 아임포트 관리자 식별키
IMP.init('imp18356013')

 function requestPay() {
	 
	 // 2-1 : 만약에 결제방식을 선택을 안했으면
	 if(pay_method == ''){alert('결제방식을 선택해주세요'); return;}
	 if(amount == 0 ){alert('결제금액을 선택해주세요');return;}
	 // 2-2 : 주문번호 만들기
	 	// * 고유성/중복x/PK/식별키
	 	// 1. 날짜(밀리초)+상품코드(제품의 pk)+회원번호 조합해서 설계
	 	// 2. 회사전화번호+사업자번호 조합해서 설계
	 		// ---- 등등
	 	let now = new Date(); 		console.log(now); // 현재날짜.
	 	let time = now.getTime();	console.log(time);// 현재시간[밀리초]
	 	let merchant_uid = "p"+time+"-"+loginMid; console.log(merchant_uid);
	 	
	 	
	 	
    IMP.request_pay({
      pg: "html5_inicis.INIBillTst",
      pay_method: pay_method,
      merchant_uid: merchant_uid,   // 주문번호[]
      name: "포인트결제",
      amount: amount,                         // 숫자 타입
      buyer_email: "gildong@gmail.com",
      buyer_name: "기면수",
      buyer_tel: "010-4242-4242",
      buyer_addr: "서울특별시 강남구 신사동",
      buyer_postcode: "54321",
      vbank_due : 1,
    }, function (rsp) { // callback
    	console.log(rsp);
    	if(rsp.success){//결제 성공
			
		}else{//결제 실패 [테스트 : 실패가 성공이라는 가정]
			alert('결제성공');
			
			// 1. 포인트 적립 기능처리
			let result = setPoint(amount, '포인트결제');
			
			// 2. 결제내역 테이블 기능처리 [구현x]
			
			
		}
    	
      //rsp.imp_uid 값으로 결제 단건조회 API를 호출하여 결제결과를 판단합니다.
    });
  }

// 3. 결제방식 선택 함수 

let pay_method = '';
function onPayMethod( method){pay_method = method;}

// 4. 결제금액 선택 함수
let amount = 0; // 결제 금액
function onAmount(value){amount = value;}







