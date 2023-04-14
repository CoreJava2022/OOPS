package com.encapsulation;

class Person{
	
	private String personName;
	private String personAddress;
	
	public String getPersonName(){
	return personName;
	}
	public String setPersonName(String personName){
	return this.personName = personName;
	}
	
	
	public String getPersonAddress(){
	return personAddress;
	}
	public String setPersonAddress(String personAddress){
	return this.personAddress = personAddress;
	}
}

 class SetPersonInfo {
	Person person;
	
	 public SetPersonInfo(){
			person = new Person();
			person.setPersonName("Manasi kulkarni");
			person.setPersonAddress("Kalewadi,Pune");
	 }
	public Person getPerson() {
		return person;
	}
}

public class GetPersonInfo {
	public static void main(String[] args) {
		Person person;
		SetPersonInfo setPersonInfo = new SetPersonInfo();
		
		String name = setPersonInfo.getPerson().getPersonName();
		System.out.println("Name of person"+name);
		
		String address = setPersonInfo.getPerson().getPersonAddress();
		System.out.println("Address of person"+address);
	}
}
