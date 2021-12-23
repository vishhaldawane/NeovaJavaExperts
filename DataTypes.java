package com.neova;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte cricketerRankInTheTeam= 127; //blind cast 
		
		/*System.out.println("Enter value for cricketer rank : ");
		Scanner scan = new Scanner(System.in);
		String theLine = scan.nextLine(); //190
		
		int temp = Byte.parseByte(theLine);
		cricketerRankInTheTeam = (byte) temp;*/
		
		System.out.println("cricketer rank in the team is : "+cricketerRankInTheTeam);
		System.out.println("Min value of a byte : "+Byte.MIN_VALUE);
		System.out.println("Max value of a byte : "+Byte.MAX_VALUE);
		
		short universityRollNumber = 22314;
		System.out.println("universityRollNumber is : "+universityRollNumber);
		System.out.println("Min value of a short : "+Short.MIN_VALUE);
		System.out.println("Max value of a short : "+Short.MAX_VALUE);
		
		int socialSecurityNumber = 122314;
		System.out.println("socialSecurityNumber is : "+socialSecurityNumber);
		System.out.println("Min value of a Integer : "+Integer.MIN_VALUE);
		System.out.println("Max value of a Integer : "+Integer.MAX_VALUE);
		
		long distanceBetweenTheStars = 12237814;
		System.out.println("distanceBetweenTheStars is : "+distanceBetweenTheStars);
		System.out.println("Min value of a Long : "+Long.MIN_VALUE);
		System.out.println("Max value of a Long : "+Long.MAX_VALUE);
		
		
		float bankInterestRate = 3.5F;
		System.out.println("bankInterestRate is : "+bankInterestRate);
		System.out.println("Min value of a Float : "+Float.MIN_VALUE);
		System.out.println("Max value of a Float : "+Float.MAX_VALUE);
		
		
		double distanceBetweenTwoMolecules = 0.0000023;
		System.out.println("distanceBetweenTwoMolecules is : "+distanceBetweenTwoMolecules);
		System.out.println("Min value of a Double : "+Long.MIN_VALUE);
		System.out.println("Max value of a Double : "+Long.MAX_VALUE);
		
		boolean married=false;
		boolean areYouHappy = true;
		
		System.out.println("Are you married ?     "+married);
		System.out.println("Are you areYouHappy ?  "+areYouHappy);
		
		char gender1='F';
		char gender2='M';
		
		System.out.println("gender1 : "+gender1);
		System.out.println("gender2 : "+gender2);
		
		String myCity = "Mumbai";
		String yourCity ="Awesome Pune";
		
		System.out.println("My City   : "+myCity);
		System.out.println("Your City : "+yourCity);
		
		
		//Wrapper type - int  <-- Integer, byte Byte, short Short char Character
		//boolean Boolean, float Float
	}

}
/*
 
  Table <-- data constraints
  |
  empno	age	salary	comm
  12345 00  12020   300.0  
  |
  Java class
  | int  byte  float  float <-- validations applied
  |
  form entries area validated 
  |
  UI Form  
 
Naming Convention

			ClassName		DriverManager, FixedDepositAccount
			varibleName		socialSecurityNumber,
			methodName		setLookAndFeel(), transferFunds()
			CONSTANT		MAX MIN PI SPEED_OF_LIGHT
			pack1.pack2		com.neova, com.neova.airlines
			

		Data has various types
		
		numeric   123   556   whole numbers
		
		floating	fractions   45.7 0.9994
		
		character	'M'  'F'  'Y' 'N'
		
		String		"New York"   "New Mumbai"  "Pune"
		
		boolean		true / false
		
		
		
					data types
						|
			------------------------
			|					|
			Primitive		Secondary
			|
---------------------------------------
|			|		   | 			|
Integrals  floating   Boolean	character
|				 |		   |			|		
byte  1 - 8bits float  4 boolean 1 	  char 2 bytes ASCII+UNICODE
short 2		    double 8  true/false
int   4
long  8


8 bits = 256 representations


	1 bit = 0 
			1
			
	2 bits = 00
			 01
			 10
			 11
			 
	3 bits = 8
	4		16
	5		32
	6		64
	7		128
	8		256
	
	dial of byte would be
	
	
  -128  -127 .... -4 -3 -2 -1	0  1 2 3 4 ....127
 <------------------------------|----------------->
 
 	
 		byte cricketerRankInTheTeam = 14;
 		
 	












			
			
			
			
			
			
			
			
			
		


*/