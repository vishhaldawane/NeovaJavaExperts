
public class CustomExceptionTest {
	public static void main(String[] args) {
		
		System.out.println("Begin main");
		Car myCar = new Car();
		
			myCar.longDrive();
		
		System.out.println("End main");
		
	}
}

class StepneyException extends Exception // checked
{
	StepneyException(String str){
		super(str);
	}
}
class SpeedOverLimitException extends RuntimeException //unchecked
{
	SpeedOverLimitException(String str) {
		super(str);
	}
}
//InsuranceNotRenewedException
//PUCDocumentNotFoundException
//TyrePuncturedException
//TyreOnLowPressureException
//LowFuelException
//RedSignalDishonouredException

class Car
{
	boolean wheel1Status=true;
	boolean wheel2Status=true;
	boolean wheel3Status=true;
	boolean wheel4Status=true;
	boolean wheel5Status=true;
	
	private void status() {
		double value = Math.random()%10;
		if(value>0.90) {
			wheel5Status=false; // assume the stepney is punctured..
		} 
	}
	
	void longDrive() throws StepneyException // throws clause is mandatory for checked exceptions
	{
		status();
		if(wheel5Status == false) {
			StepneyException stepEx = new StepneyException("Oh!! Stepney is punctured..lets repair it before the journey");
			throw stepEx;
		}
		System.out.println("Long drive started...");
		
		for(int i=1;i<=25;i++) {
			double value = Math.random()%10;
			System.out.println(i+" kms completed..."+value);
			if(value>0.99) {
				SpeedOverLimitException speedOvrlmtEx = new SpeedOverLimitException("Oh!!Challan of Speed Limit Crossed Generated..."); 
				throw speedOvrlmtEx;
			}
		
		}
		System.out.println("Long drive finished...");
	}
}
