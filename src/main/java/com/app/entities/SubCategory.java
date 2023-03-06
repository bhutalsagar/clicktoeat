package com.app.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sub_category")
public class SubCategory {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "sub_category_id")
	private int subCategoryId;
	@Column(length= 20)
	private String size;
	@Column(name = "crust_type",length = 100)
	private String dishName;//crusttype changed to product name for ex.dish name
	private double price;
	private int productId;
	

	
	public SubCategory() {
	}


public SubCategory(int subCategoryId, String size, String dishName, double price, int productId) {
	this.subCategoryId = subCategoryId;
	this.size = size;
	this.dishName = dishName;
	this.price = price;
	this.productId = productId;
}



public int getProductId() {
	return productId;
}


public void setProductId(int productId) {
	this.productId = productId;
}


public int getSubCategoryId() {
	return subCategoryId;
}

public void setSubCategoryId(int subCategoryId) {
	this.subCategoryId = subCategoryId;
}

public String getSize() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}

public String getCrustType() {
	return dishName;
}

public void setCrustType(String crustType) {
	this.dishName = crustType;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return String.format("SubCategory [subCategoryId=%s, size=%s, crustType=%s, price=%s]", subCategoryId, size,
			dishName, price);
}


	
	

	
}
