package com.renusush.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.renusush.Util.ConnectionUtil;
import com.renusush.model.Book;
import com.renusush.model.BookInfo;
import com.renusush.model.Myorders;

public class Dao {
	private JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void save(Book user) {
		String sql = "insert into users(name,email_id,password, mobile_no) values(?,?,?,?)";
		Object[] args = { user.getName(), user.getEmailId(), user.getPassword(), user.getMobileNo() };
		int rows = jdbcTemplate.update(sql, args);
		System.out.println("number of row inserted " + rows);
	}

	public Book validate(String emailID, String password) {
		Book user = null;
		try {
			String sql = "select id,name,password from users where email_id=? and password=?";
			Object[] args = { emailID, password };
			user = jdbcTemplate.queryForObject(sql, args, (rse, rowNo) -> {
				Book u = new Book();
				u.setId(rse.getInt("id"));
				u.setName(rse.getString("name"));
				u.setPassword(rse.getString("password"));
				return u;
			});

		} catch (EmptyResultDataAccessException e) {
			System.out.println(e);
		}
		return user;
	}

	public BookInfo BookInformation(String bookname) {
		BookInfo book1 = null;
		try {
			String sql = "SELECT `book id`,`name`,`price` FROM `book` WHERE `name`=?";
			Object[] args = { bookname };
			book1 = jdbcTemplate.queryForObject(sql, args, (rse, rowNo) -> {
				BookInfo b1 = new BookInfo();
				b1.setBookid(rse.getInt("book id"));
				b1.setName(rse.getString("name"));
				b1.setPrice(rse.getInt("price"));
				return b1;

			});

		} catch (EmptyResultDataAccessException e) {
			System.out.println(e);
		}
		return book1;
	}

	public void placeorder(String quantity, Object name, String prodname) {

		// user.setEmailId("minney@gmail.com");

		String sql = "INSERT INTO `myorders`(`status`,`quantity`,`mail_id`,product_name) VALUES (?,?,?,?)";
		Object[] args = { "ordered", quantity, name, prodname };
		int rows = jdbcTemplate.update(sql, args);
		System.out.println("number of row inserted " + rows);
	}

	public List<Myorders> findAllOrders() {
		//JdbcTemplate jdbcTemplate1 = ConnectionUtil.getJdbcTemplate();
		String sql = "SELECT `orderid`,`status`,`quantity`,`mail_id`,`product_name` FROM`myorders`";
		List<Myorders> list1 = jdbcTemplate.query(sql, (rs1, rowNum) -> {
			Myorders o1 = convert1(rs1);
			return o1;
		});
		
		System.out.println(list1);
		return list1;

}

	static Myorders convert1(ResultSet rs1) throws SQLException {
		Myorders order1 = new Myorders();
		order1.setOrderid(rs1.getInt("orderid"));
		order1.setStatus(rs1.getString("status"));
		order1.setQuantity(rs1.getInt("quantity"));
		order1.setMailid(rs1.getString("mail_id"));
		order1.setProduct_name(rs1.getString("product_name"));
		System.out.println(order1);
		return order1;
	}

	

	public List<BookInfo> findall() {
		// JdbcTemplate jdbcTemplate1 = ConnectionUtil.getJdbcTemplate();
		String sql = "SELECT `NAME`,`price` FROM `book`";
		List<BookInfo> list = jdbcTemplate.query(sql, (rs, rowNum) -> {
			BookInfo book1 = convert(rs);
			return book1;
		});
		System.out.println(list);
		return list;

	}

	static BookInfo convert(ResultSet rs) throws SQLException {
		BookInfo book1 = new BookInfo();
		book1.setName(rs.getString("name"));
		book1.setPrice(rs.getInt("price"));
		System.out.println(book1);
		return book1;
	}

}
