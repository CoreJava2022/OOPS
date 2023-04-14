package com.abstractprogram;

abstract class Engine {

	public void start() {
		System.out.println(" Engine started");
	}
	public void stop() {
		System.out.println(" Engine stop");
	}
	abstract void shiftGear();
	
	// we can take static method in abstract class 
	
	public  static void show() {
		System.out.println("manasi");	
		}
}

public class PetrolEngine extends Engine {

	public static void main(String[] args) {
		PetrolEngine petrolEngine = new PetrolEngine();
		petrolEngine.start();
		petrolEngine.shiftGear();
		petrolEngine.stop();
		petrolEngine.show();
	}

	void shiftGear() {
		System.out.println(" Gear is changed");
	}
}