
//java MultithreadTest
// |		 |
// "main"	main(String args[])

public class MultithreadTest {
	public static void main(String[] args) {
		
		System.out.println("BEGIN MAIN");
		Car myCar = new Car(); //I.c
		myCar.start();
		
		Railway rail = new Railway();  //I.c
		rail.start();
		
		Flight flight = new Flight();  //I.c
		flight.start();
		//ITC
		
		try {
			myCar.join(); //waiting for this to die
			rail.join(); //waiting for this to die
			flight.join(); //waiting for this to die
		} catch (InterruptedException e) {
			
			System.out.println("Thread is interrupted...");
		}
		System.out.println("==> END MAIN");
		
	}
}

class Car extends Thread //I.a
{
	public void run() { //I.b
		for(int i=1;i<=250;i++ ) {
			System.out.println("Car completed..."+i);
		}
	}
}
class Railway extends Thread //I.a
{
	public void run() { //I.b
		for(int i=1;i<=250;i++ ) {
			System.out.println("\tRailway completed..."+i);
		}
	}
}
class Flight extends Thread //I.a
{
	public void run() { //I.b
		for(int i=1;i<=250;i++ ) {
			System.out.println("\t\tFlight completed..."+i);
		}
	}
}
