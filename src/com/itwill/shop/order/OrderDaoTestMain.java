package com.itwill.shop.order;

import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.cart.Cart;
import com.itwill.shop.cart.CartDao;
import com.itwill.shop.product.Product;

public class OrderDaoTestMain {

	public static void main(String[] args) throws Exception{
		
		/****cart에서주문****/
		
		String o_des="";
		int o_price=0;
		String userid="guard1";
		List<OrderItem> orderItemList=new ArrayList<OrderItem>();
		
		CartDao cartDao=new CartDao();
		List<Cart> cartList=cartDao.findByUserId(userid);
		for(Cart cart:cartList) {
			System.out.println(cart);
			OrderItem orderItem=new OrderItem(0, cart.getCart_qty(),0, cart.getProduct());
			orderItemList.add(orderItem);
			o_price+=orderItem.getProduct().getP_price()*orderItem.getOi_qty();
		}
		
		o_des=orderItemList.get(0).getProduct().getP_name()+"외"+(orderItemList.size()-1)+"종"; 
		OrderDao orderDao=new OrderDao();
		int rowCount=orderDao.insert(new Order(0,o_des ,null,o_price, userid,orderItemList));
		System.out.println(">> 주문 "+   rowCount+" 건 생성");

	}

}