package com.encapsulation;

public class ProductTest {
	  GetProductDetails  productDetails;
	
	public GetProductDetails getProductDetails() {
		return productDetails;
	}

	public static void main(String[] args) {
		GetProductDetails productDetails=new GetProductDetails();
		productDetails.getDetails();
		
	}

}
