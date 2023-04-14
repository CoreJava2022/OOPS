package com.abstractprogram;

abstract class Subject1{
	int a;
	public Subject1(int a) {
		this.a=a;
	}
	abstract int multiply(int val); 
}
 class Test1 extends Subject1 {
	public Test1() {
		super(2);
	}
	@Override
	int multiply(int val) {
		return this.a*val;
	}
 }
	public class Test{
	public static void main(String[] args) {
		Subject1 s= new Test1();
		System.out.println(s.multiply(3));
	}

}
