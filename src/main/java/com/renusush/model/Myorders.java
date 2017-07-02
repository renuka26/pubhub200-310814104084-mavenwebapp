package com.renusush.model;

public class Myorders {
private int orderid;
private String product_name;
private int quantity;
private String status;
private String mailid;
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
@Override
public String toString() {
	return "Myorders [orderid=" + orderid + ", product_name=" + product_name + ", quantity=" + quantity + ", status="
			+ status + ", mailid=" + mailid + "]";
}
}
