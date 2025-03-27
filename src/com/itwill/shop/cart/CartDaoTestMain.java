package com.itwill.shop.cart;

import com.itwill.shop.product.Product;

public class CartDaoTestMain {

	public static void main(String[] args)throws Exception {
		CartDao cartDao=new CartDao();
		System.out.println("0.countByProductNo:"+cartDao.countByProductNo("guard1", 1));
		if(cartDao.countByProductNo("guard1", 1) == 1) {
			System.out.println("1.updateByProductNo:"+cartDao.updateByProductNo(new Cart(0, 3, "guard1", new Product(1, null, 0, null, null, 0))));
		}else {
			System.out.println("2.insert:"+cartDao.insert(new Cart(0,3,"guard1",new Product(1, null, 0, null, null, 0)))); 
		}
		System.out.println("3.updateByCartNo:"+cartDao.updateByCartNo(22, 8));
		
		System.out.println("4.findByUserId:"+cartDao.findByUserId("guard1"));
		
		System.out.println("5.delete:"+cartDao.deleteByCartNo(22)); 
		
		

	}

}