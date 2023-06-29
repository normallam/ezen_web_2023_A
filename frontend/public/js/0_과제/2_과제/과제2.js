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

if(id_sign_up == '' || pw_sign_up == ''){alert('[회원가입실패] : 회원정보 모두 입력해주세요.')}
else if(id_sign_up.length<8||pw_sign_up.length<8){alert('[회원가입 실패]')}
else{alert('[회원가입 성공]')}

아이디배열.push( id_sign_up );

document.querySelector('.id_sign_up').value=``
document.querySelector('.pw_sign_up').value=``
}
function 로그인(){
	
let 로그인아이디 = document.querySelector('.id_sign_in'); console.log(로그인아이디)
let 로그인비밀번호 = document.querySelector('.pw_sign_in');	console.log(로그인비밀번호)
	
let id_sign_in = 로그인아이디.value; console.log(id_sign_in);
let pw_sign_in = 로그인비밀번호.value; console.log(pw_sign_in);	


	if(id_sign_in==''||pw_sign_in==''){alert('아이디 또는 비밀번호를 입력해주세요.')}
		
	for( let i = 0; i < 아이디배열.length ; i++ ){
	if( 아이디배열[i] == 로그인아이디.value && 비밀번호배열[i] == 로그인비밀번호.value ){ alert('[로그인 성공]')}
	else{alert('[로그인 실패]') }}


document.querySelector('.id_sign_in').value=``
document.querySelector('.pw_sign_in').value=``
}