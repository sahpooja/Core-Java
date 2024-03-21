package com.ed.pojo;

public class Product 
{
	private int ProductId;
    private String ProductName;
    private int ProductPrise;
    private int ProductQuantity;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProductPrise() {
		return ProductPrise;
	}
	public void setProductPrise(int productPrise) {
		ProductPrise = productPrise;
	}
	public int getProductQuantity() {
		return ProductQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		ProductQuantity = productQuantity;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, int productPrise, int productQuantity) {
		super();
		ProductName = productName;
		ProductPrise = productPrise;
		ProductQuantity = productQuantity;
	}
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductPrise=" + ProductPrise
				+ ", ProductQuantity=" + ProductQuantity + "]";
	}
    
    
}