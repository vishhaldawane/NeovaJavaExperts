
public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerValue iv = new IntegerValue(10, 20);
		iv.printInteger();
		iv.swapInteger();
		iv.printInteger();
	
	}

}
class IntegerValue  // CONTAINER 
{
	int i; //container to hold INTEGER TYPE
	int j; //container to hold INTEGER TYPE
	
	IntegerValue(int a, int b) {
		i = a;
		j = b;
	}
	
	void printInteger() { //ALGORITHM TO PRINT
		System.out.println("i "+i); //algorithm to print
		System.out.println("j "+j); //algorithm to print
	}
	void swapInteger() { //ALGORITHM TO SWAP
		System.out.println("swapping....integers....");
		int  temp = i; //algorithm to swap
		i = j;
		j = temp;
	}
}

