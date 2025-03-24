/*****************member****************/
--로그인한 회원정보수정
update userinfo set password = 'password', name= 'cname', email='cemail' where userid='guard1';
--로그인한 회원의 정보보기
select * from userinfo where userid='guard1';


/********************product*****************/

--select by pk
select * from product where p_no=1;
--select all
select * from product;