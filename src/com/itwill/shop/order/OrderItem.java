package com.itwill.shop.order;
/*
이름     널?       유형         
------ -------- ---------- 
OI_NO  NOT NULL NUMBER(10) 
OI_QTY          NUMBER(10) 
O_NO            NUMBER(10) 
P_NO            NUMBER(10) 
 */

import com.itwill.shop.product.Product;

public class OrderItem {
	private int oi_no;
	private int oi_qty;
	/********FK***********/
	//private int o_no;
	private Order order;
	/********FK***********/
	//private int p_no;
	private Product product;
	public OrderItem() {
		// TODO Auto-generated constructor stub
	}
	public OrderItem(int oi_no, int oi_qty, Order order, Product product) {
		super();
		this.oi_no = oi_no;
		this.oi_qty = oi_qty;
		this.order = order;
		this.product = product;
	}
	public int getOi_no() {
		return oi_no;
	}
	public void setOi_no(int oi_no) {
		this.oi_no = oi_no;
	}
	public int getOi_qty() {
		return oi_qty;
	}
	public void setOi_qty(int oi_qty) {
		this.oi_qty = oi_qty;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}