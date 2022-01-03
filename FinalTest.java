
public class FinalTest {
	public static void main(String[] args) {
		
		final double PI;
		
		PI=3.14;
		
		System.out.println("PI : "+PI);
		
	//The final local variable PI cannot be assigned
	//It must be blank and not using a compound assignment
		
		//PI=3.18f;
		
		System.out.println("PI : "+PI);

		Batsman crik = new Batsman();
		crik.totalScore();

		crik.hitBoundry();
		crik.hitSixer();
		crik.hitSixer();
		crik.hitBoundry();
		crik.hitBoundry();
		crik.hitSixer();
		
		crik.totalScore();
		
	}
}

class Circle
{
	final float PI=3.14f; //read only data member
	float radius;
	
	void calcArea() {
		//PI=9.4f;
		float ans = PI * radius * radius;
	}
	
}
/*
 * 			Cricketer
 * 				|
 *			--------------
 *			|			|
 *		Batsman			Baller
 *		|
 *	HockeyPlayer
 * 
 * 
 * 
 */
class Cricketer
{
	int score;
	
	final void hitSixer() {
		System.out.println("hitSixer()");
		score = score + 6;
	}
	final void hitBoundry() {
		System.out.println("hitBoundry()");
		score = score + 4;
	}
	
	void totalScore() {
		System.out.println("Score : "+score);
	}
}


class Batsman extends  Cricketer //isA
{
	//Cannot override the final method from Cricketer
	void hitSixer() {//
		System.out.println("over the mid wicket..sixer..");
		score = score + 5;
	}
	
	//Cannot override the final method from Cricketer
	void hitBoundry() {
		System.out.println("ground shot boundry..");
		score = score + 3;
	}

}
//The type HockeyPlayer cannot subclass 
//the final class Batsman

class HockeyPlayer //extends Batsman
{
	
}
