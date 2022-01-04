/*
 * 
 * 			kiteCount
 * 			----------
 * 			|	3	|
 * 			---------
 * 									red		owner		length		flying		kiteCount
 * 								-------------------------------------------------------
 * 								|		|			|			|			|
 * 								-------------------------------------------------------
 * 			+--------------------->100
 * 			|
 * 			100
 * 			myKite1
 * 
 * 								red		owner		length		flying			kiteCount
 * 								-------------------------------------------------------
 * 								|		|			|			|			|
 * 								---------------------------------------------------------
 * 			+--------------------->200
 * 			|
 * 			200
 * 			myKite2
 * 
 * 
 * 								red		owner		length		flying			kiteCount
 * 								--------------------------------------------------------
 * 								|		|			|			|			|
 * 								--------------------------------------------------------
 * 			+--------------------->300
 * 			|
 * 			300
 * 			myKite3
 * 
 * 								
 * 
 * 
 */
public class StaticTest {

	public static void main(String[] args) {
		
			//? count is zero 0
			Kite.showKiteCount();
			
			Kite myKite1 = new Kite("Green","Minal",50,true);
			Kite myKite2 = new Kite("Red","Bhushan",40,true);
			Kite myKite3 = new Kite("Black","Vishhal",30,true);
			//count is 3
			
			Kite.showKiteCount();
			
			myKite1.showKite();
			myKite2.showKite();
			
			myKite3.showKite();
			
			
			
			
	}

}


