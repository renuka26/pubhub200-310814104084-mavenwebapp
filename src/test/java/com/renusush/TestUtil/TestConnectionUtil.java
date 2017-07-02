package com.renusush.TestUtil;

import com.renusush.Util.ConnectionUtil;
import com.renusush.model.Book;

public class TestConnectionUtil {

	public static void main(String[] args) {
		System.out.println("hi");
		System.out.println(ConnectionUtil.getJdbcTemplate());
		System.out.println(ConnectionUtil.dataSource());
Book user1=new Book();user1.setEmailId("r");user1.setId(500);user1.setMobileNo(67);user1.setPassword("rr");user1.setName("lo");
System.out.println(user1);}
}
