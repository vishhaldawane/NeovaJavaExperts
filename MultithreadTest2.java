import java.awt.FlowLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextField;

//java MultithreadTest
// |		 |
// "main"	main(String args[])
//The Observer effect

//java complete reference

// Head First Java

//percieve the world as OO 

// physical length + width + depth 
// functionality

//bottle
//pen
//kitchen
//3 dimentional world
//time
//space
//
//11 dimentions


public class MultithreadTest2 {
	public static void main(String[] args) {
		
		System.out.println("BEGIN MAIN");
		
		CarFrame myCar = new CarFrame(300,100,200,300,"Car Frame"); //II.c
		RailwayFrame rail = new RailwayFrame(300,100,300,400,"Railway Frame");  //II.c
		FlightFrame flight = new FlightFrame(300,100,400,500,"FLight Frame");  //II.c
		
		myCar.setVisible(true);
		rail.setVisible(true);
		flight.setVisible(true);
		
		//myCar.run();
		//rail.run();
		//flight.run();
		
		//1-MIN_PRIORITY
		//5-NORM_PRIORITY
		//10 MAX_PRIORITY
		
		Thread t1 = new Thread(myCar);
		Thread t2 = new Thread(rail);
		Thread t3 = new Thread(flight);
		System.out.println("t1's priority : "+t1.getPriority());
		System.out.println("t2's priority : "+t2.getPriority());
		System.out.println("t3's priority : "+t3.getPriority());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
	
		System.out.println("t1's priority : "+t1.getPriority());
		System.out.println("t2's priority : "+t2.getPriority());
		System.out.println("t3's priority : "+t3.getPriority());
	
		
		System.out.println("is t1 alive ? "+t1.isAlive());
		System.out.println("is t2 alive ? "+t2.isAlive());
		System.out.println("is t3 alive ? "+t3.isAlive());
		
	/*	System.out.println("Press ENTER to continue...");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/	
		t1.start(); // it would invoke myCar's run()
		t2.start(); // it would invoke rail's run();
		t3.start(); // it would invoke flight's run();
		
		System.out.println("is t1 alive ? "+t1.isAlive());
		System.out.println("is t2 alive ? "+t2.isAlive());
		System.out.println("is t3 alive ? "+t3.isAlive());
		
		
	//	flight.start();
	//	rail.start();
	//	myCar.start();
		
		
		//ITC
		
		
		/*	try {
				myCar.join(); //waiting for this to die
				rail.join(); //waiting for this to die
				flight.join(); //waiting for this to die
			} catch (InterruptedException e) {
				System.out.println("Thread is interrupted...");
				e.printStackTrace();
			}
	*/
		
		System.out.println("==> END MAIN");
		
	}
}

//wait() and notify()

class CarFrame extends JFrame implements Runnable //II.a
{
	JTextField data = new JTextField(20);
	
	CarFrame(int x, int y, int r, int c, String title) {
		super(title);
		setSize(x,y);
		setLocation(r,c);
		setLayout(new FlowLayout());
		add(data);
		
	}
	public void run() { //II.b
		for(int i=1;i<=11125000;i++ ) {
			//System.out.println("Car completed..."+i);
			data.setText("Car completed : "+i);
		}
	}
}
class RailwayFrame extends JFrame implements Runnable //II.a
{
	JTextField data = new JTextField(20);
	
	RailwayFrame(int x, int y, int r, int c, String title) {
		super(title);
		setSize(x,y);
		setLocation(r,c);
		setLayout(new FlowLayout());
		add(data);
	}
	public void run() { //II.b
		for(int i=1;i<=11125000;i++ ) {
			//System.out.println("\tRailway completed..."+i);
			data.setText("Railway completed : "+i);
		}
	}
}
class BikeFrame extends JFrame implements Runnable
{
	JTextField data = new JTextField(20);
	
	BikeFrame() {
		
	}
	public void run() {
		
	}
}
class FlightFrame extends JFrame implements Runnable //II.a
{
	JTextField data = new JTextField(20);
	
	FlightFrame(int x, int y, int r, int c, String title) {
		super(title);
		setSize(x,y);
		setLocation(r,c);
		setLayout(new FlowLayout());
		add(data);
	}
	public void run() { //II.b
		for(int i=1;i<=11125000;i++ ) {
			//System.out.println("\t\tFlight completed..."+i);
			data.setText("Flight completed : "+i);
		}
	}
}
