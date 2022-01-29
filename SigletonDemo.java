/*
 * 
 * study of various IT projects
 * Gang Of Four
 * 		- Eric Gamma
 * 
 * 23 design patterns
 * 
 * various types of doors
 * 
 * push, pull, sliding door, butterfly door
 * 
 * 
 */

class Kitchen
{
	private static Kitchen kitchenRef = null;
	private Kitchen() {
		System.out.println("Kitchen() ctor..");
	}
	
	public static Kitchen getInstance() {
		if(kitchenRef == null)
			kitchenRef = new Kitchen();
		
		return kitchenRef;
	}
}

public class SigletonDemo {

	public static void main(String[] args) {
		
		Kitchen k1 = Kitchen.getInstance();
		Kitchen k2 = Kitchen.getInstance();
		Kitchen k3 = Kitchen.getInstance();
		
		
		System.out.println("k1 : "+k1);
		System.out.println("k2 : "+k2);
		System.out.println("k3 : "+k3);
		
	}

}
