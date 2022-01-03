
public class DerivationTest {
	public static void main(String[] args) {
		//Farm myFarm  = new Farm();
		//myFarm.relax();
		
		GrandFather gf = new GrandFather();
		gf.farming();
		
		System.out.println("--------");
		
		Father father = new Father();
		father.farming();
		father.banking();
		
		System.out.println("--------");
		
		Child child = new Child();
		child.farming();
		child.banking();
		child.coding();
		
	}
	
	
}


class GrandFather // extends Object
{
	GrandFather() {
		super();
		System.out.println("GrandFather() ctor....");
	}
	void farming() {
		System.out.println("GrandFather is farming...");
	}
}

class Father extends GrandFather
{
	Father() {
		super(); //default line of all ctors in java
		//must be the first line
		
		System.out.println("\tFather() ctor....");
	}
	void farming() { //inherited - cum - overriding
		System.out.println("Father is farming...via tractor");
	}
	void banking() { // exclusive function
		System.out.println("Father is banking......");
	}
}

class Child extends Father
{
	Child() {
		super(); //default line of all ctors in java
		//must be the first line
		
		System.out.println("\t\tChild() ctor....");
	}
	void farming() { //inherited - cum - overriding
		System.out.println("Child is farming...via robo tractor");
	}
	void banking() { // overridding
		System.out.println("Child is netbanking......");
	}
	void coding() { // exclusive
		System.out.println("Child is coding in java...");
	}
}


class Farm
{
	void relax() {
		//GrandFather gf = new GrandFather();
		//gf.farming();
	
	}
}



