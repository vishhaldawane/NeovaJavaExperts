
public class CustomExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WashingMachine washMachine = new WashingMachine();
		try {
			washMachine.wash();
		}
		catch(WaterException e) {
			System.out.println("Using manual storage of water via bucket...to run the wash...");
		}
		catch(ElectricityException e) {
			System.out.println("Oh No!!....wash is failed....");
		}
	}

}
//11 to 4
class ElectricityException extends Exception // assuming 11am to 7pm no electricity
{
	
}

//8am to 9am wash()
class WaterException extends Exception //assuming water is at 6am to 9am AND 6pm to 9pm
{
	WaterException(String str) {
		super(str); 
	}
}
class WashingMachine
{
	void wash() throws ElectricityException, WaterException
	{
		for(int i=1;i<=30;i++) {
			System.out.println("Washing...."+i);
			double val = Math.random()%10;
			if(val>0.95) {
				WaterException we = new WaterException("Are!! Paani chala gaya...");
				throw we;
			}
		}
	}
}