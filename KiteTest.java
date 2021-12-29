
//test cases
public class KiteTest { // testing unit | execution environment 
	public static void main(String[] args) {
		
		Kite myKite1 = new Kite("Green","Minal",50,true);
		Kite myKite2 = new Kite("Black");
		Kite myKite3 = new Kite(90);
		Kite myKite4 = new Kite();
		
		
		myKite1.showKite();
		myKite2.showKite();
		myKite3.showKite();
		myKite4.showKite();
		
		myKite1.setKiteLength(40);
		myKite1.showKite();
		
		myKite1.setKiteLength(50);
		myKite1.showKite();
		
		myKite1.setKiteLength(60);
		myKite1.showKite();
		
		myKite1.setKiteLength(70);
		myKite1.showKite();
		
		myKite1.setKiteLength(30);
		myKite1.showKite();
		
		
		
		
		/*System.out.println("my kite1 is  "+myKite1); // toString is involed....
		System.out.println("my kite2 is  "+myKite2);
		System.out.println("my kite3 is  "+myKite3);
		System.out.println("my kite4 is  "+myKite4);*/
		
		//System.out.println("kite1 : "+myKite1.getKiteOwner());
	}
}
/*
 * 	1	DB - table for the Kite - table columns
 * 		|
 * 	2	POJO [ plain old java object ] Kite
 * 		|
 * 	3	DAO - repository [ kitchen ]
 * 		|
 * 	4	Service - business logic
 * 		|
 * 	5	RestController - http
 * 		|
 * 	6	UI <-- React / angular 
 * 		<input type=text name="kiteColor">
 * 
 * 		Enter Kite owner : Ruhi
 * 		Enter ..
 * 		Enter ...
 * 		Enter..
 * 		[ Store My Kite Details ]
 * 
 * 
 */
