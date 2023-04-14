package Encapsulation;
public class SetProductDetails {
	Product product;
	
	 public SetProductDetails(){
			product = new Product();
			product.setProductName("Mobile Phone");
			product.setProductPrice(25000);
	 }
	public Product getProduct() {
		return product;
	}
}
