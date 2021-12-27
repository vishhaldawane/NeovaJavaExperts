package com.neova;

public class Greeting {

	public static void main(String abc[]) {
		
		System.out.println("Welcome Again to Java");
		System.out.println("1. Java is simple");
		System.out.println("2. Java is WORA");
		System.out.println("3. Java is Secured");
		System.out.println("4. Java is Robust");
		System.out.println("5. Java is Dynamic");
		moon();
		sun();
		
		MyMusic.listeningMusic();
	}
	public static void moon() {
		System.out.println("Look at the moon");
		sun(); //wiring
	}
	public static void sun() {
		System.out.println("Feel the warmth of the Sun");
	}
	
}

class MyMusic
{
	public static void main(String abc[]) {
		System.out.println("MyMusic main...");
	}
	
	public static void listeningMusic()
	{
		System.out.println("Listening the music...");
	}
	
}
/*
  
  
  															first program				datatype
  															22-Dec-2021
1 Abhijeet        4       5       testing
2 Abhishek        4       4									inactive		inactive
3 Akshay G        6       1
4 Akshay K        2       3.5     manual testing
5 Akshay S        4       2       js													noresponse

6 Anuj            1       2       manual testing
7 Bhushan         5/6     14      C#/java/f/w code
8 Darshana        3       6       automated/manual testing
9 Isha                    8       cloud/advertising
10 Jaya            11      5       testing

11 Manasi          3       5       testing
12 Minal           2       5.5
13 Pramod																	
14 Prashant        1       5       testing												absent
15 Ravi            2       2       testing

16 Ruhi            5       4.5     testing
17 Rushikesh
18 Shubham         6.5     1       testing
19 Sukant          4       1+      javascript											absent
20 Swapnil         2.5     9+      teamlead
21 Vinay      


*/