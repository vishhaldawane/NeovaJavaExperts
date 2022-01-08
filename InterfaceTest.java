
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.live();
		person.move();
		person.walk();
		person.giveBirth();
		person.noBreathing();
		person.die();
	}

}

//char(moving)  achar(non-moving)   Animal + Trees
/*
1				Living 		Moving  	Dieing <--- interfaces | pure abstract classes
				|live();	|move();	|die(); <-- pure abstract methods
				|			|			|
				-----------[|]----------+--------+
							|			|		 |
			-----------------------------      ----------------------
			|									 |
2			Animal <-- abstract class			Tree
			|walk(); <-- abstract method
		-------------------
		|				|
3		Mammal			Reptile <-- abstract classes
		|giveBirth();		|layEggs(); abstract methods
		|					|crawl();
	---------			-----------
	|		|			|
4	Tiger	Person		Crocodile <-- concrete class
	|hunt();  talk();	crawl() {} <-- concrete methods
	
*/
interface Living
{
	void live(); // public abstract
	void breathing();
}
interface Dieing {
	void die();
	void noBreathing();
}
interface Moving {
	void move();
}

abstract class Animal implements Living, Dieing, Moving
{
	abstract void walk();
}
abstract class Mammal extends Animal
{
	abstract void giveBirth();
}
class Person extends Mammal
{

	@Override
	public void live() {
		// TODO Auto-generated method stub
		System.out.println("Person is living...");
	}

	@Override
	public void breathing() {
		// TODO Auto-generated method stub
		System.out.println("Person is breathing...");
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("Person is dieing...");
	}

	@Override
	public void noBreathing() {
		// TODO Auto-generated method stub
		System.out.println("Person is not breathing...");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Person is moving...");
	}

	@Override
	void giveBirth() {
		// TODO Auto-generated method stub
		System.out.println("Person is giving birth...");
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println("Person is walking...");
	}
	
}

abstract class Tree implements Living
{
	abstract void stable();
}
