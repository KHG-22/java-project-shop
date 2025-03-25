package com.itwill.shop.order;
/*
이름      널?       유형            
------- -------- ------------- 
O_NO    NOT NULL NUMBER(10)    
O_DESC           VARCHAR2(100) 
O_DATE           DATE          
O_PRICE          NUMBER(10)    
USERID           VARCHAR2(100) 
 */

import java.util.Date;
import java.util.List;

import com.itwill.shop.user.User;

public class Order {
	private int o_no;
	private String o_desc;
	private Date o_date;
	private int o_price;
	/**********FK************/
	//private String userid;
	private User user;
	
	private List<OrderItem> orderItems;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int o_no, String o_desc, Date o_date, int o_price, User user, List<OrderItem> orderItems) {
		super();
		this.o_no = o_no;
		this.o_desc = o_desc;
		this.o_date = o_date;
		this.o_price = o_price;
		this.user = user;
		this.orderItems = orderItems;
	}

	public int getO_no() {
		return o_no;
	}

	public void setO_no(int o_no) {
		this.o_no = o_no;
	}

	public String getO_desc() {
		return o_desc;
	}

	public void setO_desc(String o_desc) {
		this.o_desc = o_desc;
	}

	public Date getO_date() {
		return o_date;
	}

	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}

	public int getO_price() {
		return o_price;
	}

	public void setO_price(int o_price) {
		this.o_price = o_price;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	
}