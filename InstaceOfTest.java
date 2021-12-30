
public class InstaceOfTest {
	public static void main(String[] args) {
		
	//	new Doctor().diagnose();
		
	
	Doctor d = new Doctor();
		
		if(d instanceof Doctor) { // runtime type identification - RTTI 
			System.out.println("1 yes d is a Doctor");
			d.diagnose();
			d.chargeFees();
			//d.doSurgery();
			//d.doHeartSurgery();
			
		}
		else {
			System.out.println("1 d is not a Doctor");
		}
		

		if(d instanceof Surgeon ) { // runtime type identification - RTTI 
			System.out.println("2 yes d is a Surgeon");
			d.diagnose();
			d.chargeFees();
			//d.doSurgery();
		}
		else {
			System.out.println("2 No d is not a Surgeon");
		}
		
		System.out.println("======================");
		
	Surgeon s = new Surgeon();
		
		if(s instanceof Doctor) { // runtime type identification - RTTI 
			System.out.println("3 yes s is a Doctor");
			s.diagnose();
			s.chargeFees();
			s.diagnose();
			//s.doHeartSurgery();
		}
		else {
			System.out.println("3 No s is not a Doctor");
		}
		
		
		if(s instanceof Surgeon) { // runtime type identification - RTTI 
			System.out.println("3 yes s is a Surgeon");
			s.diagnose();
			s.chargeFees();
			s.doSurgery();
		}
		else {
			System.out.println("3 No s is not a Surgeon");
		}
		
		
		System.out.println("======================");
		
	HeartSurgeon hs = new HeartSurgeon();
		
		if(hs instanceof Doctor) { // runtime type identification - RTTI 
			System.out.println("4 yes hs is a Doctor");
			hs.diagnose();
			hs.chargeFees();
			hs.doSurgery();
			hs.doHeartSurgery();
		}
		else {
			System.out.println("4 No hs is not a Doctor");
		}
		
		
		if(hs instanceof Surgeon) { // runtime type identification - RTTI 
			System.out.println("4 yes hs is a Surgeon");
			hs.diagnose();
			hs.chargeFees();
			hs.doSurgery();
			hs.doHeartSurgery();
		}
		else {
			System.out.println("4 No hs is not a Surgeon");
		}
		
		if(hs instanceof HeartSurgeon) { // runtime type identification - RTTI 
			System.out.println("4 yes hs is a HeartSurgeon");
			hs.diagnose();
			hs.chargeFees();
			hs.doSurgery();
			hs.doHeartSurgery();
		}
		else {
			System.out.println("4 No hs is not a HeartSurgeon");
		}
		
		System.out.println("*******************************");
		
		Doctor doctRef = new Doctor();
		//Doctor doctRef = new Surgeon();
		//Doctor doctRef = new HeartSurgeon(); // a super class reference can also point to a child object
		
		if(doctRef instanceof Doctor) { // runtime type identification - RTTI 
			System.out.println("yes doctRef is a Doctor");
			doctRef.diagnose();
			d.chargeFees();
		}
		else {
			System.out.println("No doctRef is not a Doctor");
		}
		
		
		if(doctRef instanceof Surgeon) { // runtime type identification - RTTI 
			System.out.println("yes doctRef is a Surgeon");
			doctRef.diagnose();
			d.chargeFees();
		}
		else {
			System.out.println("No doctRef is not a Surgeon");
		}
		
		if(doctRef instanceof HeartSurgeon) { // runtime type identification - RTTI 
			System.out.println("yes doctRef is a HeartSurgeon");
			doctRef.diagnose();
			d.chargeFees();
		}
		else {
			System.out.println("No doctRef is not a HeartSurgeon");
		}
		
	}
}

class Doctor 
{
	//data + function	
	void diagnose() { //original token of the super class| overridden
		System.out.println("Doctor is diagnosing....EENTT");
	}
	void chargeFees() {
		System.out.println("Charging... 500 Rs..");
	}
}
class Surgeon extends Doctor  // every Surgeon is a Doctor
{
	//inherited data + functions
	// +
	//own data + own function
	void diagnose() { //redefining it... overriding | hiding parent's method
		System.out.println("\tSurgeon is diagnosing....CT SCAN");
	}
	void chargeFees() {
		System.out.println("\tCharging... 1500 Rs..");
	}
	void doSurgery() {
		System.out.println("\t\tSurgeon doing Surgery...");
	}
}

class HeartSurgeon extends Surgeon  // every HeartSurgeon is a Surgeon
{
	//inherited data + functions
	// +
	//own data + own function
	void diagnose() {
		System.out.println("\tHeartSurgeon is diagnosing....2D echo / ECG");
	}
	void chargeFees() {
		System.out.println("\tCharging... 2500 Rs..");
	}
	void doSurgery() { //overriding
		System.out.println("\t\t\theartSurgeon doing Heart Surgery...");
	}
	void doHeartSurgery() { //exclusive function of this class 
		System.out.println("\t\t\tHeart Surgeon is doing Open Heart Surgery....");
	}
}


