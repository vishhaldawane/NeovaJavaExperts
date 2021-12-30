
public class InstaceOfTest {
	public static void main(String[] args) {
	
	Doctor d = new Doctor();
		
		if(d instanceof Doctor) { // runtime type identification - RTTI 
			System.out.println("yes d is a Doctor");
		}
		else {
			System.out.println("d is not a Doctor");
		}
		
		if(d instanceof Surgeon ) { // runtime type identification - RTTI 
			System.out.println("yes d is a Surgeon");
		}
		else {
			System.out.println("No d is not a Surgeon");
		}
		
		System.out.println("======================");
		
	Surgeon s = new Surgeon();
		
		if(s instanceof Doctor) { // runtime type identification - RTTI 
			System.out.println("yes s is a Doctor");
		}
		else {
			System.out.println("No s is not a Doctor");
		}
		
		
		if(s instanceof Surgeon) { // runtime type identification - RTTI 
			System.out.println("yes s is a Surgeon");
		}
		else {
			System.out.println("No s is not a Surgeon");
		}
		
		System.out.println("--------");
		
		System.out.println("======================");
		
	HeartSurgeon hs = new HeartSurgeon();
		
		if(hs instanceof Doctor) { // runtime type identification - RTTI 
			System.out.println("yes hs is a Doctor");
		}
		else {
			System.out.println("No hs is not a Doctor");
		}
		
		
		if(hs instanceof Surgeon) { // runtime type identification - RTTI 
			System.out.println("yes hs is a Surgeon");
		}
		else {
			System.out.println("No hs is not a Surgeon");
		}
		
		if(hs instanceof HeartSurgeon) { // runtime type identification - RTTI 
			System.out.println("yes hs is a HeartSurgeon");
		}
		else {
			System.out.println("No hs is not a HeartSurgeon");
		}
		
		System.out.println("*******************************");
		
		Doctor doctRef = new Doctor();
		//Doctor doctRef = new Surgeon();
		//Doctor doctRef = new HeartSurgeon(); // a super class reference can also point to a child object
		
		if(doctRef instanceof Doctor) { // runtime type identification - RTTI 
			System.out.println("yes doctRef is a Doctor");
		}
		else {
			System.out.println("No doctRef is not a Doctor");
		}
		
		
		if(doctRef instanceof Surgeon) { // runtime type identification - RTTI 
			System.out.println("yes doctRef is a Surgeon");
		}
		else {
			System.out.println("No doctRef is not a Surgeon");
		}
		
		if(doctRef instanceof HeartSurgeon) { // runtime type identification - RTTI 
			System.out.println("yes doctRef is a HeartSurgeon");
		}
		else {
			System.out.println("No doctRef is not a HeartSurgeon");
		}
		
	}
}

class Doctor
{
	//data + function	
}
class Surgeon extends Doctor  // every Surgeon is a Doctor
{
	//inherited data + functions
	// +
	//own data + own function
}

class HeartSurgeon extends Surgeon  // every HeartSurgeon is a Surgeon
{
	//inherited data + functions
	// +
	//own data + own function
}


