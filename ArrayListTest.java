import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class ArrayListTest {
	public static void main(String[] args) {
		
		
	//	ArrayList myGlass = new ArrayList();//now it is a sac
		
	//	ArrayList<Integer> myGlass = new ArrayList<Integer>();//now it is NOT a generic sac
	//	LinkedList<Integer> myGlass = new LinkedList<Integer>();//now it is NOT a generic sac
	//	TreeSet<Integer> myGlass = new TreeSet<Integer>();//now it is NOT a generic sac
		HashSet<Integer> myGlass = new HashSet<Integer>();
		
		//equals and hashCode
		
		System.out.println("Container : myGlass is ready....");
		
		myGlass.add(10);
		myGlass.add(8);
		myGlass.add(50);
		myGlass.add(78);
		myGlass.add(78);
		myGlass.add(66);
		
		myGlass.add(35);
		myGlass.add(35);
		
		myGlass.add(27);
		
		System.out.println("Content [ ButterMilk ] is added...");
		
		Iterator<Integer> myStraw = myGlass.iterator();
		
		while(myStraw.hasNext()) {
			//Integer value = (Integer) myStraw.next();
			Integer iValue = myStraw.next();
			System.out.println("value : "+iValue);
		}
		
		
	}
}
