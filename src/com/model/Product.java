package com.model;

public class Product 
{

	private String Prodnm;			//variable for product name
	private int price;				//variable for price of product
	private int stock;				//variable for stocks remaining
	
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	
	public String getProdnm() 
	{
		return Prodnm;
	}
	public void setProdnm(String prodnm) 
	{
		Prodnm = prodnm;
	}
	public int getStock()
	{
		return stock;
	}
	public void setStock(int stock)
	{
		this.stock = stock;
	}
}
