
public class InterthreadCommunicationTest {
	public static void main(String[] args) {
		
		FoodItem item = new FoodItem("Pizza");
		
		Producer producer = new Producer(item); //I.c
		Consumer consumer = new Consumer(item);
		
		producer.start(); //I.d
		consumer.start();
	}
}

class FoodItem {
	String itemName;
	boolean isItemServed; //false
	
	FoodItem(String name) {
		itemName=name;
	}
	
	synchronized void eat() { // should be called by the Consumer thread
		//pie
		if(isItemServed==false) {
			System.out.println("\tWaiting for "+itemName+" to be served...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\tWait is over....");
		}
		System.out.println("\tEating the item..."+itemName);
		
	}
	synchronized void serve() { // should be called by the Producer thread
		
		if(isItemServed==false) {
			System.out.println("Serving the item..."+itemName);
			isItemServed=true;
			notify();// notifies the waiting thread to complete its waiting period 
		}
		
	}
}

class Producer extends Thread //I.a
{
	FoodItem foodItem;
	
	Producer(FoodItem ref) {
		foodItem = ref;
	}
	
	void produce() {
	//	System.out.println("produce() started");
	//	System.out.println("produce() finished");
		foodItem.serve();
	}
	public void run() { //I.b
		produce();
	}
}

class Consumer extends Thread
{
	FoodItem foodItem;
	
	Consumer(FoodItem ref) {
		foodItem = ref;
	}
	void consume() {
	//	System.out.println("\tconsume() started");
	//	System.out.println("\tconsume() finished");
		foodItem.eat();
	}
	public void run() {
		consume();
	}
}
