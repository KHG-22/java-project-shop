package com.itwill.shop.order;

import java.util.Date;

import com.itwill.shop.user.User;

/*
이름      널?       유형            
------- -------- ------------- 
O_NO    NOT NULL NUMBER(10)    
O_DESC           VARCHAR2(100) 
O_DATE           DATE          
O_PRICE          NUMBER(10)    
USERID           VARCHAR2(50)  
 */
public class Order {
	private int o_no;
	private String o_desc;
	private Date o_date;
	private int o_price;
	/**********FK***********/
	//private String userid;
	private User user;
	
}
