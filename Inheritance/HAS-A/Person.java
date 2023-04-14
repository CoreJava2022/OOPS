package com.example;

public class Person {
	int id;
	String name;
	PermanantAdd address;
	CurrentAdd currentAdd;

	Person(int id, String name, PermanantAdd address, CurrentAdd currentAdd) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.currentAdd = currentAdd;

	}

	void show() {
		System.out.println(id + " " + name);
		System.out.println("This is Permanant address :- " + " " + address.city + " " + address.state);

	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println("This is current address :-" + " " + currentAdd.city + " " + currentAdd.state);

	}

	public static void main(String[] args) {

		PermanantAdd a = new PermanantAdd("Sangola", "maharshtra");
		CurrentAdd c = new CurrentAdd("Pune", "maharashta");

		Person p = new Person(1, "manasi", a, c);
		p.show();
		p.display();
//		Person p1= new Person(2,"Rutuja",a,c);
//		p1.display();

	}

}
