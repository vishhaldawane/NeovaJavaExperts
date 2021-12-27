package com.neova;

public class PassingObjectReturningObject {
	
	public static void main(String[] args) {
		
		/*Person thePerson = new Person();
		
		thePerson.setAge(22);		thePerson.setGender('F');
		thePerson.setName("Janet");
		
		thePerson.showAge();		thePerson.showGender();
		thePerson.showName();
		
		showPerson(thePerson); //passing object as a value here
		
		thePerson.showAge();		thePerson.showGender();
		thePerson.showName();
		*/
		
		doSomething();
		
		System.out.println("-----------");
		
		Person thePerson = getThePerson(25,'F',"Julie");
		thePerson.showAge();
		thePerson.showGender();
		thePerson.showName();
		
		System.out.println("------");
		
		Person thePerson1= getThePerson();
		thePerson1.showAge();
		thePerson1.showGender();
		thePerson1.showName();
		
		
//		BankAccount baObj = Bank.applyForBankAccount(name,address,balance,phone,Pan,Photo)
		
		
	}
	
	public static void doSomething() { //1st 
		
		Person person = new Person();
		person.setAge(20); //fill it up
		person.setGender('F');
		person.setName("Smita");
		person.showAge();
		person.showGender();
		person.showName();
		
		
	}
	
	public static void showPerson(Person thePersonReference) { //2
		System.out.println("-----------------------");
		System.out.println("Person object is recieved....");
		thePersonReference.showName();
		thePersonReference.showAge();
		thePersonReference.showName();
		thePersonReference.setAge(23);
		thePersonReference.setGender('M');
		thePersonReference.setName("Jack");
		System.out.println("-----------------------");
		
	}
	
	public static Person getThePerson(int x, char y, String z) { //3rd
		Person thePerson = new Person(); // a blank object | local object
		thePerson.setAge(x); //fill it up
		thePerson.setGender(y);
		thePerson.setName(z);
		return thePerson; //return it
		
	}
	public static Person getThePerson() { //4th
		Person thePerson = new Person(); // a blank object | local object
		thePerson.setAge(20); //fill it up
		thePerson.setGender('F');
		thePerson.setName("Smita");
		return thePerson; //return it
		
	}
	

}
