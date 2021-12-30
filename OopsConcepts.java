
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
	 					
	 				
	 		
	 		4. Inheritance
	 			
	 		5. Object communication	


*/












