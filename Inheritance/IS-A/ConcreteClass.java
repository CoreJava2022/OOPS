package com.abstractionConstructor;


 abstract class AbstractClass{
	 AbstractClass(){
		 System.out.println("hello from abstract class ");
	 }
	 
	 AbstractClass(int a ,int b){
		 System.out.println("hello from  parameterised abstract class ");
	 }
}
public class ConcreteClass extends AbstractClass {

	public ConcreteClass() {
		 super();
		 System.out.println("hello");  
	    }
	 ConcreteClass(int a ,int b) {
		 super(10,20);

	 }
	public static void main(String[] args) {
		
		ConcreteClass concreteClass = new ConcreteClass(20,20);
	}
}
