package com.app.dtos;

public class SubCategoryDTO {

	private int productId;
	private int subCategoryId;
	private String size;
	private String dishName;
	private double price;
	// private Product product;

	public SubCategoryDTO() {
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

	public String getdishName() {
		return dishName;
	}

	public void setdishName(String dishName) {
		this.dishName = dishName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("SubCategoryDTO [productId=%s, subCategoryId=%s, size=%s, dishName=%s, price=%s]",
				productId, subCategoryId, size, dishName, price);
	}

}
