package com.neova;


class Person
{
	private char gender; //not atall a local variable - ITS A FIELD, DATA MEMBER of the class
	private int age; //try to set the age as 1 to 120
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
	
	void setAge(int theAge) { // setter function 
		System.out.println("setting the age..");
		if(theAge >=1 && theAge<=120)
			age = theAge;
		else
			throw new RuntimeException("Invalid age.....it should be in the range of 1-120");
	}
	
	void showAge() { // accessor - read only activity
		System.out.println("Age is : "+age);
	}
	
	void setName(String theName) { // setter function 
		System.out.println("setting the name..");
		if(theName.matches("^[a-zA-Z]*$"))
			name = theName;
		else
			throw new RuntimeException("Invalid name.....it should have alphabets");
	}
	
	//   12 3  4  567
	//	 sa x     ena
	//   sa k  s  ena
	//   sa[xk]s*ena
	
	//^ means starting with a letter
	//$ means ending with a letter
	// * means character preceeding it should be matched zero or more times
	// [] a particular position of a character  
	 
	void showName() { // accessor - read only activity
		System.out.println("Name is : "+name);
	}
	
}