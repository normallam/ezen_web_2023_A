// 배열 선언 
let 아이디배열=[];
let 비밀번호배열=[];

console.log('js 열림');

// 이벤트 함수 만들기 
function 회원가입(){console.log('회원가입함수 클릭');
let 아이디입력창 = document.querySelector('.id_sign_up'); console.log(아이디입력창)
let 비밀번호입력창 = document.querySelector('.pw_sign_up'); console.log(비밀번호입력창)


let id_sign_up = 아이디입력창.value; console.log(id_sign_up);
let pw_sign_up = 비밀번호입력창.value; console.log(pw_sign_up);

if(id_sign_up.length<8&&pw_sign_up.length<8){alert('[회원가입 실패]')}{'[회원가입 성공]'}
if(id_sign_up == '' || pw_sign_up == '' ) { alert('[회원가입실패] : 회원정보 모두 입력해주세요.');

}
 아이디배열.push( id_sign_up );

 alert('회원가입되셨습니다.')

function 로그인(){
	
let 로그인아이디 = document.querySelector('.id_sign_in'); console.log(로그인아이디)
let 로그인비밀번호 = document.querySelector('.pw_sign_in');	console.log(로그인비밀번호)
	
let id_sign_in = 로그인아이디.value; console.log(id_sign_in);
let pw_sign_in = 로그인비밀번호.value; console.log(pw_sign_in);	




	if(id_sign_in==''||pw_sign_in==''){alert('아이디 또는 비밀번호를 입력해주세요.')}
		
	for( let i = 0; i < 아이디배열.length ; i++ )
	{if( 아이디배열[i] == 로그인아이디 && 비밀번호배열[i] == 로그인비밀번호 ) { alert('[로그인 성공]')}
	{alert('[로그인 실패]') }


document.querySelector('.id_sign_in').value=``
document.querySelector('.pw_sign_in').value=``






/*
let id = []         
 let password = []
 
 function 회원가입버튼(){//회원가입버튼 함수시작
    //1. 아이디 객체 호출
   let idclassInput = document.querySelector(".idclass")   // idclass 라는 클래스명을 가진 input 객체 호출
   let Storage_id = idclassInput.value      // 입력받은 데이터 가져오기
   
   let passwordclassInput = document.querySelector(".passwordclass")   //password 라는 클래스명을 가진 input 객체 호출
   let Storage_password = passwordclassInput.value      // 입력받은 데이터 가져오기
    
    //아이디 유효성 검사
   id.indexOf(Storage_id) !=-1 ? alert('이미 존재하는 아이디입니다.[추가불가]') : id.push( Storage_id );password.push( Storage_password );
   if(Storage_id.length< 8) {alert('아이디를 8자 이상으로 입력해주세요')}
      else if(Storage_password.length < 8){alert('비밀번호를 8자 이상으로 입력해주세요')}
      else{
          alert('회원가입 완료')
          id.push(Storage_id.value);
          password.push(Storage_password.value);
          }arguments
 }//회원가입버튼 함수 끝
 
 function 로그인버튼(){//로그인버튼 함수시작
   let idclassInput = document.querySelector(".idclass")   // idclass 라는 클래스명을 가진 input 객체 호출
   let Storage_id = idclassInput.value   // 입력받은 데이터 가져오기
   
   let passwordclassInput = document.querySelector(".passwordclass")//password 라는 클래스명을 가진 input 객체 호출
   let Storage_password = passwordclassInput.value// 입력받은 데이터 가져오기
   
   if(idclassInput !=-1 && passwordclassInput !=-1){   //아이디와 비밀번호가 들어가있을 때
      let index = id.indexOf(Storage_id)
      if( index != -1 ){   //입력된 아이디 가 배열에 존재하는지 
         if( password[index] == Storage_password ){ // 입력된 아이디의 인덱스의 위치가 곧 해당 아이디의 패스워드 인덱스 
            alert('로그인성공')// 로그인 성공 
         }
      
      }
   else alert('로그인실패')
   }
   
   //<input> 입력값 초기화
   idclassInput.value = ''
   passwordclassInput.value = ''
 }//로그인버튼 함수끝



























*/























































/*
let id리스트3=[]
let pw리스트3=[]

function 로그인함수1(){
   let id3= document.querySelector('.loginId3').value
   let pw3= document.querySelector('.loginPw3').value
   console.log('로그인함수 아이디 받음: '+id3)
   console.log('로그인함수 비밀번호 받음: '+pw3)
   //아이디 공백이면 학번 입력
   if(id3==''){alert('학번 입력 해주셈')
               return;} 
   for(let i=0; i<id리스트3.length;i++){
      if(id리스트3[i]==id3&&pw리스트3[i]==pw3){alert('로그인성공')}
   }
   //초기화
   document.querySelector('.loginId3').value=``
   document.querySelector('.loginPw3').value=``
}

function 회원가입함수1(){
   id3= document.querySelector('.loginId3').value
   pw3= document.querySelector('.loginPw3').value
   if(id리스트3.indexOf(id3)!=-1){
      alert('가입 불가능')
      return;
   }
   if(id3.length>=8||pw3.length>=8){id리스트3.push(id3)
                  pw리스트3.push(pw3);
                  alert('성공')}
   console.log(id리스트3)               
   console.log(pw리스트3)               

   
   document.querySelector('.loginId3').value=``
   document.querySelector('.loginPw3').value=``}