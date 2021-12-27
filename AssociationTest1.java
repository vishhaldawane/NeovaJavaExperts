package com.neova;

public class AssociationTest1 {

	public static void main(String[] args) {
		
		WashingMachine washingMachine = new WashingMachine();
		
		/*washingMachine.wash(); //1
		
		washingMachine.wash("WhiteClothes"); //2
		
		int minutes = 55;
		
		float bill = washingMachine.wash(minutes); //3     - per minute 0.50 rs
		System.out.println("Bill for "+minutes+ " minutes is "+bill+" Rs");
		
		float bill2 = washingMachine.tubClean(); //4 
		System.out.println("tub clean bill : "+bill2);*/
		
		WashingPowder washPowder = new WashingPowder();
		washPowder.setBrand("Tide");
		washPowder.setType("FrontLoad");
		washPowder.setSize(50); //gms
		
		washingMachine.wash(washPowder);
		
	}
}


class WashingPowder
{
	private String brand; // Nirma, Surf Excel / Tide
	private String type; //front /top load
	private int size;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}

//isA				hasA					usesA		producesA
//VisaMachine		CardReader				Card		CardBill

class WashingMachine
{
	
	public void wash(WashingPowder washPow )
	{
		System.out.println("wash(WashingPowder) invoked...."+washPow.getBrand());
	}
	
	public void wash() { //1
		System.out.println("washing...");
	}
	
	public void wash(String x) { //2
		System.out.println("washing..."+x);
	}
	
	public float  wash(int minutes)//3
	{
		System.out.println("washing....for "+minutes+" minutes");
		return 0.50f * minutes ;// electricity bill for 30 mnts washing..
	}
	
	public float tubClean() {
		System.out.println("cleaning the tub...");
		return 10.0f;
	}
	
}


/*
 *		3 T shirts + 2 jeans
 * 
 * 
 * 		LaundryBill = water charges + electricity charges +
 * 						washing powder charges + ironing charges +
 * 						man power
 * 
 * 					
 * 
 * 
 * 
 */


//1  no parameter   | no return
//2  with parameter | no return 
//3  with parameter | with return
//4