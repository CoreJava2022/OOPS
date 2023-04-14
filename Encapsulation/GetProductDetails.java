package Encapsulation;
public class GetProductDetails {
	Product product;
	public static void main(String[] args) {
		SetProductDetails setProductDetails = new SetProductDetails();
		String name=setProductDetails.getProduct().getProductName();
		System.out.println("name of product="+name);
		long price = setProductDetails.getProduct().getProductPrice();
		System.out.println("price of product="+price);
	}

}