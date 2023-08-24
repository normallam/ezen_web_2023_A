console.log('accountbook.js 열림')

// 1. create

function awrite(){
	
	let atextInput = document.querySelector('.atext'); console.log('atextInput' + atextInput);
	let anumberInput = document.querySelector('.anumber'); console.log('anumberInput'+anumberInput);
	let adateInput = document.querySelector('.adate'); console.log('adateInput'+adateInput);

	let info = {
		atext : atextInput.value,
		anumber : anumberInput.value,
		adate : adateInput.value,
	}; console.log(info);
	$.ajax({
		url : "/jspweb/Accountbook",
		method : "post",
		data : info,
		success : function f(r){console.log(r);
		if(r==true){alert('등록성공'); aread();
		atextInput.value= '' ; anumberInput.value = '';   adateInput.value = '';
			
		}
		else{alert('등록실패');}
		},
		error : function f(r){}
	})
}	

// 2. read
aread();
function aread(){
		
	
	$.ajax({
		url: "/jspweb/Accountbook",
		method : "get",
		data: "",
		success : function f(r){console.log(r);
		
			let output = document.querySelector('.account_Bottom');
			
			let html = '';
			
				for(let i =0; i<r.length;i++){
					html +=`
					<div class="contentbox">
						<div class = "atext1" >${r[i].atext}</div>
						<div class = "apay1"  >${r[i].anumber}</div>
						<div class = "adate1" >${r[i].adate}</div>
						<button onclick="aupdate(${r[i].ano})" type="button">수정</button>
						<button onclick="adelete(${r[i].ano})" type="button">삭제</button>
					</div>`;

				}
			output.innerHTML = html;
	},
	error : function f(r){}
	
	
	})

}// f end
// 3. update

function aupdate(ano){console.log('aupdate()open' + ano);

	let atext = prompt('수정할 항목내용 : ');
	let adate = prompt('수정할 날짜 : ')
	
	$.ajax({
		url : "/jspweb/Accountbook",
		method : "put",
		data : {ano : ano , atext : atext , adate : adate },
		success : function f(r){console.log("put통신성공");
		
			if(r==true){alert('수정성공'); aread();}
			else{alert('수정실패');}
			
		},
		error : function f(r){console.log(r);}
		
	})


}// f end


// 4. delete

function adelete(ano){console.log('adelete()open'+ano)


	$.ajax({
		url: "/jspweb/Accountbook",
		method:"delete",
		data:{ano},
		success: function f(r){console.log("delete통신성공")
		
			if(r=true){alert('삭제성공'); aread();}
			else{alert('삭제실패] 비밀번호가 일치하지 않습니다.');}
		
		
		},
		error : function f(r){console.log(r);}
		
		
		
		
	})









}
