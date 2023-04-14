package com.encapsulation;

public class GetProductDetails {
	
	Product product;
	
	public void getDetails(){
		SetProductDetails setProductDetails = new SetProductDetails();
		
		String name = setProductDetails.getProduct().getProductName();
		System.out.println("Product Name " +name);
		
		long price = setProductDetails.getProduct().getProductPrice();
     System.out.println("Product Price " +price);
			
	}
}
