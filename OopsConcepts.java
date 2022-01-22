
public class OopsConcepts {

}
/*

	POPS = Procedure Oriented Programming System
	procedure <---- data
	top to bottom approach
	
	
	OOPS = Object Oriented Programming System
	
	data <--- procedure
	
	Surgeon 
	|
	
	cut - length + depth + width  <-- cutting
	
	
	
	bottom to top approach
	
	
	Tailor Made Shirt
	|
	
	
	data + function = togetherness is called as contract of class
	
	
	Customer
	|
	Tailor =  requirement/measurements + cloth material
	|
	paper + pencil/pen
	|n1,n2,n3 .......n14 <-- one time initialization
	|
	|
	measuring() { } -> makeCuttingDiagram() + chalk
	1						|2
							|
						cutIntoPieces() { } + Scissor
							|3
							|
						stitchingPieces() { } + Needle + stitchingMachine
							|4
							|
						The Shirt is Ready for ironing() + Iron
								|5
								PackIt()
								|5
	
	
	
	
	
	
	Object = state + behaviour
				
	BankAccount = acno, acname, acbalance + withdraw() deposit(), transfer() showBankAccount()
	 											constructors + setters / getters + toString()
	 											
	 		
	 			
	 	OOPS concepts
	 	
	 		
	 			
	 			System.out.println("hello");
	 			
	 			
	 		1. Abstraction
	 				hiding the complexity of an object
	 				
	 				using these functions to utilize the object
	 				
	 				it is the "WHAT IS?" part of an object
	 				
	 				What is an ATM Object? - getting the cash - Farmer - 
	 				
	 				a. data abstraction - how much cash is there in the ATM?
	 				b. procedural abstraction - cameraClick(), soundRec(), log(), lock() releaseIt()
	 				c. class abstraction
	 				
	 				Kite kite1 = new Kite();
	 				kite1.fly();
	 				kite1.kiteFight();
	 				
	 				what is your father ?  - he is a Surgeon
	 				
	 				
	 				USAGE
	 				BankAccount baObj = new BankAccount();
	 				baObj.withdraw(5000); //USAGE
	 				baObj.balance=999999999999;
	 				
	 				
	 		2. Encapsulation
	 				coding for the complexity of the object
	 				class BankAccount {
	 					double balance ; // DATA
	 					void withdraw(float amt) { // FUNCTION 
	 						..
	 						.... balance = balance - amt;
	 						..
	 					}
	 				}
	 				
	 				binding of data with concerned function = contract
	 				
	 				it is the "HOW IS IT?" part of an object
	 				
	 				How the cash is dispensed??? - ATM Engineer
	 				
	 				class Kite { ....}
	 				class Flight {... }
	 				class Person { ....}
	 				
	 				CODE for the USAGE
	 	
	 		
	 		3. Polymorphism
	 					poly = many
	 					morphism = forms / appearance/manifestation
	 					
	 					ability of a business entity to appear multiple forms
	 					
	 					a. class extension
	 					
	 						Doctor
	 						|
	 					---------
	 					|
	 					Surgeon <-- is a Doctor
	 					|
	 				-----------
	 				|
	 				HeartSurgeon <-- is a Doctor
	 				
	 					b. function overloading
	 					
	 						COMPILE TIME BINDING / EARLY BINDING
	 						RUNTIME/STATIC POLYMORPHISM - MISNOMER
	 						ability of a function to appear multiple times
	 						
	 						i. type of parameter
	 						ii. number of parameters
	 						iii. sequence of parameters
	 						
	 					
	 					c. function overriding
	 					
	 						ability of a child class to redefine the function
	 						of its parent class
	 						
	 						wherein it has the same signature as of the
	 						parent class method
	 						
	 						class A
	 						{
	 							void fun() { }
	 							void foo(){ }
	 						}
	 						class B extends A
	 						{
	 							void fun(int i) {
	 							}
	 							void foo() { }
	 						}
	 						
	 						B b = new B();
	 						b.fun();
	 						b.fun(100);
	 						b.foo(); // foo of the B is called...
	 						
	 						
	 						BankAccount <= no such object in real time banking
	 							|withdraw() { - }
	 					----------------------------------
	 					|				|			|
	 			SavingsAccount		CurrentAccount	CreditAccount
	 			  |withdraw() {		withdraw() {		withdraw() {
	 			  | maintain			maintain			maintain
	 			  | balance 		   overdraft			creditlimit
	 			  |	}				}					}
	 		FixedDepositAccount
	 			withdraw() {
	 				maintain
	 				maturity
	 				date
	 			}
	 						
	 						class BankAccount  {
	 							
	 							void withdraw(float amt) {
	 								//logic to withdraw - subtraction
	 							}
	 						}
	 						
	 						class SavingsAccount extends BankAccount {
	 							
	 							void withdraw(float amt) {
	 								//logic to withdraw by maintaining the min balance
	 							}
	 						}
	 						class FixedDepositAccount extends SavingsAccount {
	 							
	 							void withdraw(float amt) {
	 								//logic to withdraw by maintaining maturity date
	 							}
	 				
	 						}
	 						
	 						class CurrentAccount extends BankAccount {
	 							
	 							void withdraw(float amt) {
	 								//logic to withdraw by maintaining overdraft
	 							}
	 						}
	 						
	 						class CreditAccount extends BankAccount {
	 							
	 							void withdraw(float amt) {
	 								//logic to withdraw by maintaining creditlimit
	 							}
	 						}
	 						
	 					d. operator overloading
	 					
	 						ability of an operator symbol to be used
	 						in different context
	 					
	 				
	 		
	 		4. Inheritance
	 		
	 		Acquiring properties from existing classes
	 		
	 		classification
	 		
	 		A								B	
	 		Derivation					Implementation
	 									abstract classes/interfaces
	 		Person						
	 		|
	 	------------------ 
	 		|			|
	 		Student		Magician
	 		|
	 	---------------------
	 		|			|
	 		Employee	MedicalStudent
	 						|
	 					 Doctor
	 					
	 		
	 		super() -- calls a constructor from a constructor
	 					must be the first line from a ctor
	 					
	 					
	 		super.  -- calls any accessible 
	 					data member/function of the super class from
	 					any function of the child class
	 		
	 					may not be the first line
	 					
	 					
	 		5. Object communication	
	 		
	 		One object invoking method of another object
	 		
	
	 		
	 		
	 		
	 ===============================================================	
 		
	 			final				static				abstract/
	 												incomplete/
	 												partial
	 ===============================================================
	 	
	 field		constant/		shared data				NA
	 			immutable		across all the
	 			data			objects of a class
	 ---------------------------------------------------------------
	 
	 method		cannot be		refer other static		method without
	 			overridden		data/functions			code body/
	 												partial contract
	 ---------------------------------------------------------------

	 class		cannot be		nested class/		which cannot be
	 			extended/		inner class			instantiated
	 			subclassed
	 ---------------------------------------------------------------




Interfaces

	-  pure abstract class
	
	 - it just has method declarations
	 
	 - no scope for any method with code body
	 
	 - all method are by default public and abstract
	 
	 
	 					Light <-- pure 
	 					
	 
	 SunLight		MoonLight		WoodenFireLight
	 |
	is Sun aware of darkness????
	if sun says that what is it?
	
	 blind person cannot know what darkness is???
	 
	 fish doesnt know what the water is
	 
	 
	 
	 CandleLight		TubeLight		BulbLight
	 
	 
	 
	 
	 interface Living
	 {
	 	void live();
	 }
	 interface Moving
	 {
	 	void move();
	 }
	 
	 interface Dieing
	 {
	 	void die();
	 }
	 
	 
	 abstract class Animal implements Living, Moving, Dieing
	 {
	 	void breathing();
	 }
	 
	 abstract class Mammal extends Animal //isA
	 {
	 	abstract void giveBirth();
	 }
	 
	 interface Reactive
	 {
	 	void react();
	 }
	 
	 class Person extends Mammal  implements Reactive //isA
	 {
	 	void giveBirth() {
	 		
	 	}
	 	void breathing() { }
	 	public void live() { }
	 	public void die() { }
	 	public void move() { }
	 }


interfaces and abstract can lead to create frameworks
framework = semi - developed application

			Living	Moving	Dieing
			|live(); |move();	|die();
			---------------------
					|
					Animal						instanceof  
					|breathing();
					|
					----------------------------------------
					|					| Flying	| Swimming
					|					| |	fly();	| swim();
					Mammal				Bird		Fish
					|walk();			|			|
					|				Sparrow			SwordFish
					|	Reactive		Bat*		WhaleFish*
					|   |react();	FlyingHorse
					Person
					|
					|	Responsive
					|    |respond();
					Student
					|	Proactive
					|    |proact();
					Employee
	Neighbour		| work();
		|	------------------------------------------------------
		|	|			|		|			|		|		|
		Programmer	Tester	Deployer			..	..	..
		code();		test();		deploy();
	
		
		
				Payment
				| pay();
	--------------------------------------------
	|			|				|			|
	Gpayment	CardPayment	CashPayment	UPIPayment
		gpay()	swipe();	  cash();		scan();
		pay();	pay();			pay();		pay();
		
		Interfaces are used for multiple level inheritance
		
						Animal
							| breathing();
				--------------------------
				|		|				|	
				Bird*	Fish			Mammal*
				|fly();	   |swim()		|   |giveBirth();
				|		   |layEggs();  |   |
				|layEggs() +-----------[|]--+		
				|					    | 	|
				+-----------------------+ 	Whale
						|					 |
						Bat*				giveBirth(){}
						fly();				layEggs(); X
						giveBirth() {}		swim() { }
						layEgggs() X
						
					
		virtual base classes
		
		   A		
		F / \ M     dreaded diamond 
		  \ /
		   W
		   
		   One concrete class can only extend one
		   concrete class
		   
	
		   
		   
		   Flying		Landing		Moving
		   |fly();		|land();	| moving();
	----------------------------------------
	|	   |		|		|
Flight	Chopper	  Baloon	Rocket
fly();	fly();		fly();	fly();
land();	land();		land();	land();
moving(); moving();	moving();	moving();

Packages
---------


		packages are similar to operating system directories/folders
		
		to organize the relevant classes
		
		
				c:\
				|
				users
				|
				vishhal <-- this can be my workspace folder
				|
				jungle <-- main package
				|
		------------------------------
		|		|		|			|
		river	tree	cave		use <-- sub packages 
		|		|		  |			|
Crocodile		Monkey	Lion		TestIt
	|			|		    |			|
Crocodile.java	Monkey.java	Lion.java	TestIt.java
				|							|
		1. package jungle.tree;			1. package jungle.use;
		2. public class Monkey {		2. import jungle.tree.Monkey;
				public void jump() { }	3. public class TestIt {
			}									psv main() {
			class Chimp {							Monkey m = new Monkey();
			}										m.jump();
												}
											}
	
		   
	
		
		1.        <-- default/package basesd
		2. private <-- only within the class body
		3. protected <--only available to the child 
					<-- also to the non-child within the same package
					<-- no available to the child with diff package
						via reference to Monkey
		4. public <-- anywhere
		
		
		
		
		c:\\users\\vishhal\\jungle\\tree
								|
							front or backslashes as the separator
		
		c:\\users\\vishhal\\jungle.tree
							   |
							  separator
		
		
		
		


	Exception handling
	-------------------
	
				Exception = runtime error
				
				
							Errors
								|
			------------------------------------------
			|		|		|		|		|
			compile	linker	runtime	fatal	logical
			|		 |		|		  |			|
		syntax   library  Exception  critical  programmer 4x+4 = 16 
			


								Object
								|
							Throwable
								|
						-----------------
						|				|
						Error		Exception
									|  "checked" - by the compiler
							--------------------------------
							|					|		|
						RuntimeException	IOException SQLException
						| "unchecked"			|
				-----------------------		FileNotFoundException
				|			|	 |  |
		ArithmeticException |    | IllegalArgumentException
			NullPointerException |					|
					IndexOutOfBoundsException	NumberFormatException
							|
			---------------------------------
			|							|
	StringIndexOutOfBoundsException 	ArrayIndexOutOfBoundsException

		

	shortDrive()					longDrive()
									|
								   must check the fuel
								   must check the docs
								   must check the stepney wheel

	red signal dishonoured		   red signal dishonoured
	

	User defined exception
	-----------------------
	
	decide? what type of exception to be created
	
	Exception									RuntimeException
	
			checked					or			unchecked
			
	AccountOpeningBalanceException			InsufficientFundsException
	InvalidBankDocumentException			
	
		longDrive()								shortDrive()
	StepneyFailedException					RedSignalDishonouredException
											SpeedLimitCrossedException
											
	HomeLoanInterestException
											ServiceChargedException
											
											
							Door Locking system
					
		Auto Locked Door						Manually Locked Door
		|										|
		I should ensure to carry				key and lock must be carried
		the key with me
		
		
	MultiThreading
	---------------
	
	thread = simple set of instructions
	

	Cash Deposit Counter
	--------------------
	books of account
	----------------
	101 Suresh 80000 <--book mark level
	102 Dinesh 60000
	103 Ramesh 70000
	...
	...
	
			1.1000				1001-2000			2001->
				Teller1				Teller2			Teller3
				|					|				|
				getBalance()		getBalance()	getBalance()
				|					|				|
				calcAmt()			calcAmt()		calcAmt()
				|					|				|
				setBalance()		setBalance()	setBalance()
				|					|				|
				Customer1			Customer2		Customer3
	time		10.30am				10.30am			10.30am
	a/c			101					1101			2010
	cash		7000/-				8000/-			5000/-
	deno		100Rs				2000Rs			50Rs
	nos			70					4				100
				
				
				
				Customer4
				...
				..
				
				G			Runnable		JFrame
							|run();			   |	
						--------------------+  | extends
						|	 implements		|  |
						|					|  --------------------------
						|					|	|		|				|
			F		Thread					CarFrame  RailwayFrame  FlightFrame
					|							run()		run()		run()
					| start() { } ----------> JVM's Thread Scheduler | Round Robin CPU cycling logic
					| run() { }						|
				----------							|
				| extends							|
		C	MyThread								|
			run() { logic }	<-----------------------+
		Car  Railway  Flight
		
	I. extending java.lang.Thread
		a. extend from java.lang.Thread
		b. override the run() method ->put your logic here
		c. instantiate this class
		d. invoke the start() method -> will invoke run()
		
	
	II. implementing java.lang.Runnable interface
		a. implement from java.lang.Runnable interface
		b. mandate to implement run() ->put your logic here
		c. instantiate this class
			
			CarFrame cf = new CarFrame();
			
		d. instantiate java.lang.Thread class and to its constructor
		   pass the object created on step c.
		   
		   Thread t = new Thread(cf);
		   
		e. and invoke its start() method -> which invokes run()
			t.start(); --> would invoke cf's run();
		
		
		
		
		
						Pizza - FoodItem
		
		
		java.lang.Object
		|
		wait and notify
		
						FoodItem
							|
						  boolean
						isItemServed
						
		Producer						Consumer
		|								|
		produce()						consume()
										|
									if it gets first chance to run
									then it has to wait() 
									for produce() to initiate
									
		|
		and once produce()
		is over
		it will notify()
		the waiting thread
		to start
		
		
		
		
		
		
	Generics and Collections
	
		
			Generics
			
				- template classes and template functions
				
				
	letter pad of the company
	
				T i t l e 
				address   reg. no.  Date :
			------------------------
				 Promotion/transfer/upraisal
				 invoice/offer letter
				  
				  
				  
			-------------------------
				foot notes...
				
		
			Components orthogonal space
			
			
					   x - data type - Milk ButterMilk* SoftDrink  Whisky Tea Coffee
					   | 			   FriedRice
					  / \			   Noodles
					 /   \			   PaneerChilly
					/	  \			   Pickle/Shrikhand
				   /       \		   WhiskyPeg
				  y----i----z		   Integer
				  |	   |	|
			+-----+	   |	+-----+
			|		Iterator	  |
		Container	   |		Algorithm
			|		   |			  |
		ArrayList	
		 Bottle*	Straw*		drink()*;
		 |
	Water/Milk/Juice/Coffee/././././......
		 
		 
		 Plate		Spoon		eat();
		 Bowl		Chopsticks	eat();
		 Plate		Fork		eat();
		 Plate		Finger		lick();
		 
		
		 
	 class WaterBottle { }
	 class MilkBottle { }
	 class JuiceBottle { }
	 
	 class WaterIterator { }
	 class MilkIterator { }
	 class JuiceIterator { }
	 
	 class DrinkWater {
	 	void drink() {
	 	}
	 }
	  class DrinkJuice {
	 	void drink() {
	 	}
	 }
	  class DrinkMilk {
	 	void drink() {
	 	}
	 }
	 
	 purchase potatoes 
	 purchase onion
	 purchase tomatoes
	 purchase eggs - different container
	 
		 
	different containers
		 |
		 sac - grocery rice 
		 bag - office bag 
		 laptop bag - bottle 
		 trolly bag - wheels
		 
		 interface Iterable
		 {
		   Iterator iterator(); //1
		 }
		 interface Collection extends Iterable {
		    void add(); //1 + 5 = 6
		 }
		 interface List extends Collection {
		 	//10
		 }
		 class ArrayList extends ....  implements List
		 {
		 
		 }
		 			 
						Iterable <-- interface
						    |iterator();
		?				Collection <-- interface <--produces   Map
		|					|add();								|
		?		-------------------------					-------------
		|		|						|					|			|
		?		List					Set <-- interfaces	TreeMap	 HashMap
		|		|duplicates				 |unique
		|---------------			-------------------
		|			|				|			|
		ArrayList	LinkedList	TreeSet		HashSet <-- classes
		|				|
	growable array
	

ArrayList
  -------
 0|	45  | <---
  -------
 1|	56	|
  -------
 2|	44	|
  -------
 3|	66	|
  -------
 4|	68	| <--
 
 	 |
 growing at the end
 
 append is efficient
 search is efficient
 but delete is not efficient
 
 
 	
 	Linked List - double linked list 
 	
 	search is NOT efficient
 	adding item at the end - not efficient
 	adding item at the beg - is efficient
 	
 	deleting  an item - not efficient - but flexible
 	inserting an item - not efficient - but flexible
 	updating  an item - not efficient - but flexible
 	
 	
 			1st				2nd					3rd
 		-----------n---		-----------n---		-----------n---
 		|		| 500 |		|		| 800 |		|		| 0   |
 		|		|--p--+		|		|--p--+		|		|--p--+
 		|		| 0   |		|		| 100 |		|		| 500 |
 		---------------		--------------		--------------
 		100					500					800
 
		
		1	->	5	->	7	->	9	->	3
			<-		<-		<-		<0
		
					
					
		Set - non-linear data structure
		
		10  8   50   5    9   45  65  3  1  70 80 90 100 120 
				
				
							  
		 Btree - balanced binary tree
							  
							  
							  root 100
							---------
							|	10	|
						<	| L	  R |
							---------
							200	 300
							|	  |
				------------+	  +-------------
				|								|
			  200								300
			---------						---------
			|	8	|						|	50	|
			| L	  R |						| L	  R |
			---------						---------			
			  |   |							  |    |
		------+   +-----				-------		-------
		|              |				|				|
		5			   9				45				65
					
			5  8  9 10  45 50 60
	
	
		Hashing - hash key maintained by the algorithm	
	
	Godrej 
	
		-----------------
		|				|
		|	comics		|
		-----------------
		|	spiritual	|
		|				|
		|---------------|
		|novel	|magz	|
		|		|		|
		---------		|
		|textbk	|		|
		|		|		|
		-----------------
		
		Map <-backed by interface
		
		
		synchronization
		sa
		synchro
		
		Key and Value
		
		
		Ground Floor <-- Name Board
		
		1011   Satish Kulkarni
		2011   Jack
 Key->  3011   Julie
		
===============================================================

java.io



		File Input Output - Streams <-- flow of data
				|    |
		   reading  writing
		   
		   
		   stdin							   stdout
		   |									|
		   System.in							System.out
		   	Keyboard							Monitor/Printer
		   	|									|
		   	+-------->----------+ +-------->----+
		   						| |
	Socket	 ----->------   JAVA PROGRAM ------->------> Socket <-- java.net
		   			  reading	| |  writing
					------>-----+ +----->---+
					|	input		output	|
					File					File  <--- java.io
					
					
					
					
================================================================================
		 	Byte based stream		||		Character based streams
			min unit is 1 byte		||		min unit 1 char = 2 bytes
			256 ASCII				||		65535 UNICODE 
			byte					||			int (4) 
================================================================================
InputStream   	|  OutputStream   	||		Reader		|	Writer	
 read()			|    write()		||		read()		|	 write()
================================================================================		
FileInputStream	|FileOutputStream	|| FileReader		|  FileWriter
BufferedInputStream	|				|| BufferedReader   |
ObjectInputStream	|ObjectOutputStream	
				
				
				
location1				
		Object Serialization Process
		|
	-----------------JVM-----------------
	|	private data <-- bankBalance	|
	|	|								|
	----|---------------------------------
		|
		serialization [ encryption / decryption ]
		|
		file-----n/w--------+
							|
						de-serialized here at other location
							|
							Object
	
			
	SERVER - JVM
	|			OBJECTS
	|			serialize these object in a file
	
	-transport the file over the n/w
	|
	--------
	|
	CLIENT side - de-serialize the objects
	|
	JVM
	
	
------------------------------------


JDBC

		JAVAS DATABASE CONNECTIVITY
		
		
		ODBC 
		
			java.sql
			
			
	following diagram is NOT of inheritance
			
						Driver
						  | | implements
						  | oracle.jdbc.driver.OracleDriver.class <- ORACLE
						  | URL : oracle:jdbc:thin:@neova.airline.usa:1521:airlineReservation
						  |
						  | org.hsqldb.jdbc.JDBCDriver.class <- HSQLDB
						  | URL : jdbc:hsqldb:hsql://localhost/mydb
					DriverManager
						  | registerDriver
						  | getConnection
						  |
		----------------------------------
			|			  |				|
		Statement	PreparedStatement	CallableStatement
		|				|					|
		select	insert/update/delete		procedure/function
		
		1. know your database
		2. know the jar file which provides the driver to connect to that db
		3. register driver
		4. getconnection
		5. make a desired statement
		6. execute the statement, acquire result if any, to process it
		7. close the resources, statement, connection etc
		
HSQL
		
CREATE TABLE DEPT_NEOVA
(
  DEPTNO INT PRIMARY KEY,
  DEPTNAME VARCHAR(20),
  DEPTLOC VARCHAR(20)
);

INSERT INTO DEPT_NEOVA VALUES (10,'IT','NY');
INSERT INTO DEPT_NEOVA VALUES (20,'TEST','NJ');
INSERT INTO DEPT_NEOVA VALUES (30,'ACCOUNTS','ND');
INSERT INTO DEPT_NEOVA VALUES (40,'SALES','NM');
INSERT INTO DEPT_NEOVA VALUES (50,'PURCHASE','NP');


ORACLE:

CREATE TABLE DEPT_NEOVA
(
  DEPTNO NUMBER PRIMARY KEY,
  DEPTNAME VARCHAR2(20),
  DEPTLOC VARCHAR2(20)
);




		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
					
					









		
*/


class A
{
}
class B
{	
}

class C extends A,B // no non-linear inheritance in java | but possible in C++
{	
}

interface X { }
interface Y { }

class D implements X,Y // possible with interfaces
{
	
}










