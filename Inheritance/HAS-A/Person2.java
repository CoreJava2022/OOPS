package com.example;

public class Person2 {
	int id;
	String name;
	Address address;

	Person2(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;

	}

	void show() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {

		Address a = new Address();
		Person2 p = new Person2(1, "manasi", a);
		p.show();
	}

}
