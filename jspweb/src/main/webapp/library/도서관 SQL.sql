/*DROP database if exists JSPWEB;
create database JSPWEB;
use JSPWEB;

drop table if exists visitlog;
create table visitlog(
	vno 		int auto_increment,
    vname 		varchar(30) not null,
    vpw 		varchar(10) not null,
    vtext 		longtext not null,
    vdate 		datetime default now(), -- 생략시 자동날짜/시간 등록
    primary key(vno)

);
# 1. 저장 insert / 레코드 추가 
insert into visitlog(vname, vpw, vtext) values('기면수','1234','바이');
select * from visitlog;

# 2. 호출 select / 모든 레코드 검색 / 정렬(최신글부터 출력)
select * from visitlog order by vdate desc;

# 3. 수정 [조건 필수]
update visitlog set vtext = '내용수정했다' where vno = 3; /* vno가 3이면 vtext필드의 값을 수정 */
update visitlog set vtext = '내용수정했다' where vno = 3 and vpw = '123123';*/ /* vno 3 이면서 vpw 123123이면 vtext값을 수정
#update visitlog set vtext = ? where vno = ? and vpw = ?;

# 4. 삭제 [삭제할 식별자 필수]
delete from visitlog; /*모든 레코드 삭제*/
delete from visitlog where vno = 3; /*vno 3인 레코드 삭제*/
delete from visitlog where vno = 3 and vpw = '123123';
#delete from visitlog where vno = ? and vpw = ?;

# 가계부만들기
drop table if exists accountbook;
create table accountbook(
	ano int auto_increment,
	atext longtext not null,
	anumber varchar(200) not null,
	adate varchar(20) not null,
    primary key (ano)
);
select format (anumber,0) from accountbook; 
select * from accountbook;

insert into accountbook (atext,anumber,adate) values('안녕하세요','4100000','2023-03-13 19:20');
insert into accountbook (atext,anumber,adate) values('감사합니다','3000000','2023-04-13 20:20');
insert into accountbook (atext,anumber,adate) values('잘부탁드립니다','2000000','2023-03-13 21:20');
insert into accountbook (atext,anumber,adate) values('반갑습니다','4000000','2023-05-13 19:40'); 

drop table if exists member;
create table member(
	mno int auto_increment,
    mid varchar(50) not null unique,
    mpwd varchar(20) not null,
    memail varchar(50) not null unique,
    mimg longtext,		# 만약에 프로필 미등록시 기본 프로필 사용.
    primary key(mno)
);
select * from member;

# ----------------------------------------#
insert into member(mid,mpwd,memail,mimg) values('유재석','a1234','qwe@qwe.com','default.jpg');

# 2. 아이디 중복검사 [특정 mid의 아이디로 검색했을때 존재하면 사용중인 아이디 o , 없으면 사용중인 아이디 x ]
select * from member where mid = "qweqwe"; /* 레코드 존재여부 판단이므로*/
# select * from member where mid = "?"

update accountbook set atext = 'asd', adate = '1234'  where ano = '1';*/




# ----------------------------------------- #

DROP database if exists JSPWEB;
create database JSPWEB;
use JSPWEB;

drop table if exists library;
create table library(
lname varchar(50) not null unique,
lphone varchar(50) not null,
lseat varchar(20)  not null,

primary key(lname)
);
select * from library;
