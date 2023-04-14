class Restaurant{
	
public void orderPlace(String veg){
System.out.println(veg + " orderd");
}

public void orderPlace(String veg, String nonveg,int qty){
System.out.println(qty +" "+veg +" "+ qty +" "+nonveg +" "+ " orderd");
}

public static void main(String[] args){

Restaurant restaurant = new Restaurant();
restaurant.orderPlace("RicePlate");

restaurant.orderPlace("RicePlate","chicken",4);
}
}