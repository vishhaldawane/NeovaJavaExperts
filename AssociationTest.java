package com.neova;

public class AssociationTest {

	public static void main(String[] args) {
		//int x; // local variables
		//System.out.println("x is "+x);
		Person thePerson = new Person();
		thePerson.showGender();
		thePerson.setGender('T');
		thePerson.showGender();
		
		//thePerson.gender='T'; //value is directly set, bypassed the setGender() 
		//thePerson.showGender();

	}

}

class Person
{
	private char gender; //not atall a local variable - ITS A FIELD, DATA MEMBER of the class
	private int age;
	private String name;
	
	void setGender(char theGender) { // setter function 
		System.out.println("setting the gender..");
		if(theGender =='M' || theGender=='m' || theGender=='f' || theGender=='F')
			gender = theGender;
		else
			throw new RuntimeException("Invalid gender.....it should be either M or F");
	}
	
	void showGender() { // accessor - read only activity
		System.out.println("Gender is : "+gender);
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
