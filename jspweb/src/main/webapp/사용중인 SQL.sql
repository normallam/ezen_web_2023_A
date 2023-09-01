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
# -------------회원제 게시판(09/01)-------------- #
drop table if exists bcategory;
create table bcategory(
	bcno int auto_increment,
    bcname varchar(30) not null,
    primary key (bcno)
);


drop table if exists board;
create table board(
	bno int auto_increment,
    btitle varchar(30) not null,
    bcontent longtext,
    bfile longtext,
    bdate datetime default now(),
	bview int default 0,
    primary key(bno),
    mno int,
	foreign key( mno ) references member (mno) on delete cascade, -- 회원탈퇴시 게시물도 같이 삭제 [제약조건]
    bcno int,
    foreign key( bcno ) references bcategory (bcno) on delete cascade on update cascade -- 카테고리 삭제시 게시물도 삭제 , 카테고리번호 변경시 fk도 같이 변경 [제약조건]
);

insert into bcategory values(1,'공지사항');
insert into bcategory values(2,'자유게시판');
insert into bcategory values(3,'노하우');
select * from bcategory;
select * from board;