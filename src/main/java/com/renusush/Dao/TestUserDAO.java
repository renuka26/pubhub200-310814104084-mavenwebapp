package com.renusush.Dao;

import com.renusush.Util.ConnectionUtil;

public class TestUserDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ConnectionUtil.getJdbcTemplate());
		System.out.println(ConnectionUtil.dataSource());
Dao dao = new Dao();dao.findall();
	}

}
