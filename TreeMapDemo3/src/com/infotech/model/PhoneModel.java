package com.infotech.model;

public class PhoneModel implements Comparable<PhoneModel> {

	private String name;
	private Double price;
	
	public PhoneModel(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public int compareTo(PhoneModel o) {
		return this.getPrice().compareTo(o.getPrice());
	}

	@Override
	public String toString() {
		return "PhoneModel [name=" + name + ", price=" + price + "]";
	}
}
