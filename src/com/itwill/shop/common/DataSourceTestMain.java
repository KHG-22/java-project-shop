package com.itwill.shop.common;

import java.sql.Connection;

public class DataSourceTestMain {

	public static void main(String[] args) throws Exception{
		DataSource ds=new DataSource();
		Connection con=ds.getConnection();
		System.out.println(con);
		ds.close(con);

	}

}