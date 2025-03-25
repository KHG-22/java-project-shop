/**********************member************************/
--update by pk[로그인한회원정보수정]
update userinfo set password='password',name='cname',email ='cemail' where userid='guard1';
--select by pk[로그인한회원의 정보보기]
select * from userinfo where userid='guard1';


/**********************product************************/
--select by pk
select * from product where p_no=1;
--select all
select * from product;


/*********************cart*************************/
--guard1회원 카트에 제품번호 존재여부
select count(*)  as p_count from cart where userid='guard1' and p_no = 8;
/*
-----
p_count
------
 0
*/

select count(*)  as p_count from cart where userid='guard1' and p_no =1;
/*
-----
p_count
------
 1
*/
--guard1 회원카트에있는 1번제품의 수량 1개증가수정
update cart set cart_qty = cart_qty+1 where userid='guard1' and p_no=1;
--guard1 회원카트에있는 1번제품의 수량 3개로수정
update cart set cart_qty = 3 where userid='guard1' and p_no=1;


-- guard1 회원카트아이템리스트
select * from cart c join product p on c.p_no=p.p_no 
where userid='guard1';

--guard1 회원 카트아이템 1개삭제
delete from cart where cart_no=1;
--guard1 회원 카트아이템 모두삭제
delete from cart where userid='guard';