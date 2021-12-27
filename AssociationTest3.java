package com.neova;

public class AssociationTest3 {
	public static void main(String[] args) {
	
		//Milk m = new Milk();
		
		Cow theCow = new Cow();
		
		Milk m = theCow.milkACow();
		
		m.drinkMilkEveryDay();
		
	}
}


class Cow
{
	
	
	Milk milkACow() {
		Milk m = new Milk();
		return m;
	}
}

class Milk
{
	//color , density, type
	
	void drinkMilkEveryDay() {
		System.out.println("drink A2 milk only....");
	}
	
	Curd coagulate() {
		Curd theCurd =new Curd();
		return theCurd;
	}
}

class Curd
{
	
}



