package com.renusush.model;

public class BookInfo {
	private int bookid;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String name;
	private int price;
	@Override
	public String toString() {
		return "BookInfo [bookid=" + bookid + ", name=" + name + ", price=" + price + "]";
	}
}

