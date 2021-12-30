
public class PhoneTest {
	public static void main(String[] args) {
	
		Phone myPhone = new Phone();
		myPhone.dial(); // it is known to the compiler
		myPhone.dial("Juliet");
		myPhone.dial(101);
		myPhone.dial(11, 344556);
		myPhone.dial(676767, "Seema");
		myPhone.dial("Jack",454545);
		
	}
}

class Phone
{
	//NO DATA HERE
	
	void dial() { // no arg
		System.out.println("dial()  : just dialing....");
	}
	
	void dial(String name) { //1 arg - type is unique
		System.out.println("dial(String) : just dialing.."+name);
	}
	
	void dial(int number) { //1 arg - type is unique
		System.out.println("dial(int) : just dialing.."+number);
		
	}
	void dial(int stdCode, int number) {// 2 arg - type is same as above
		System.out.println("dial(int,int) : just dialing..stdCode: "+stdCode+" number "+number);
		
	}
	
	void dial(int number, String  name) {// 2 arg - type is same as above
		System.out.println("dial(int,String) : just dialing..number: "+number+" of  "+name);
		
	}
	void dial(String  name, int number) {// 2 arg - type is same as above
		System.out.println("dial(String,int) : just dialing..number: "+number+" of  "+name);
		
	}
	
}