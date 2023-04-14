class Fruit{
public void sweetFruit(){
System.out.println("This is sweet fruit");
}
}
class Apple extends Fruit{
	
      public void surve(){
		  System.out.println("apple surve to family");
	  }
}

public class Tree{
public static void main(String[] args){
Apple apple = new Apple();
apple.sweetFruit();
apple.surve();
}
}