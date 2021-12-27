package com.neova;

public class AssociationTest {

	public static void main(String[] args) {
		//int x; // local variables
		//System.out.println("x is "+x);
		Person thePerson = new Person();
		thePerson.showGender();
		thePerson.setGender('M');
		thePerson.showGender();
		
		//thePerson.gender='T'; //value is directly set, bypassed the setGender() 
		//thePerson.showGender();
		
		thePerson.setAge(22);
		thePerson.showAge();
		
		thePerson.setName("Bashar");
		thePerson.showName();
	}

}


/*

		Class							Object
		|								|
		design of an object			instance of a class [ state + behaviour ]			
		template to create object	
		
		blue print of a house		actual house [ in which we stay ]
		blue print a n/w card		actual n/w card
		
		class Person { }			Person objRefName = new Person();
									|		 | 		  = |		 |
 								classname reference  allocator  constructor Function
		
	


*/
