/*****************member****************/
--update by pk[로그인한 회원정보수정]
update userinfo set password = 'password', name= 'cname', email='cemail' where userid='guard1';
--select by pk[로그인한 회원의 정보보기]
select * from userinfo where userid='guard1';


/********************product*****************/

--select by pk
select * from product where p_no=1;
--select all
select * from product;


/*****************cart***********************/
--guard1 회원카트아이템리스트

select * from cart c join product p on c.p_no=p.p_no where userid = 'guard1';

