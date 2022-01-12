
public class MultithreadTest {
	public static void main(String[] args) {
		
		Car myCar = new Car(); //I.c
		myCar.start();
		
		Railway rail = new Railway();  //I.c
		rail.start();
		
		Flight flight = new Flight();  //I.c
		flight.start();
		//ITC
		
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
