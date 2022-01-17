import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		
		
		ArrayList myGlass = new ArrayList();//now it is a sac
		
	//	ArrayList<Integer> myGlass = new ArrayList<Integer>();//now it is NOT a generic sac
		
		System.out.println("Container : myGlass is ready....");
		
		myGlass.add(10.0);
		myGlass.add(25.5f);
		myGlass.add("Jack");
		myGlass.add('A');
		myGlass.add(35);
		myGlass.add(27);
		
		System.out.println("Content [ ButterMilk ] is added...");
		
		Iterator myStraw = myGlass.iterator();
		
		while(myStraw.hasNext()) {
			//Integer value = (Integer) myStraw.next();
			Object value = myStraw.next();
			System.out.println("value : "+value);
		}
		
		
	}
}
