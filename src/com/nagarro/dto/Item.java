package com.nagarro.dto;

public class Item {
	
	private String name;
	private ItemType type;
	private Integer quantity;
	private Double price;
	private Double tax;
	
	public Item(String name,ItemType type,Integer quantity,Double price) {
		this.name = name;
		this.type = type;
		this.quantity = quantity;
		this.price= price;
	}

	public  String getName() {
		return this.name;
	}
	public Integer getquantity() {
		return this.quantity  ;
	}
	public Double getprice() {
		return this.price;
	}
	public Double getTax() {
		return this.tax;
	}
	public ItemType getType() {
		return this.type;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	
}

