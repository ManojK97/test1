package com.model;

public class Product {

	private String Prodnm;
	private int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int stock;
	
	public String getProdnm() {
		return Prodnm;
	}
	public void setProdnm(String prodnm) {
		Prodnm = prodnm;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
