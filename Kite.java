public class Kite
{
	private String kiteColor; //non-static | object's data
	private String kiteOwner; //non-static | object's data
	private int kiteLength; //non-static | object's data
	private boolean flying; //non-static | object's data
	
	private static int kiteCount; //now it is not an object's data
	//rather it is the class's data | shared data across all the objects
	
	public static void showKiteCount() {
		System.out.println("Kite Count  : "+kiteCount);
	}
	public void showKite() { //object ref dependent
		
		System.out.println("Kite Owner  : "+kiteOwner);
		System.out.println("Kite Color  : "+kiteColor);
		System.out.println("Kite Length : "+kiteLength);
		System.out.println("Kite Flying : "+flying);
		System.out.println("Kite Count  : "+kiteCount);
		System.out.println("-----------");
	}
	public Kite() {
		super();
		System.out.println("Kite() constructor...");
		++kiteCount;
	}

	public Kite(String kiteColor, String kiteOwner, int kiteLength, boolean flying) {
		super();
		System.out.println("Kite(String,String,int,boolean");
		this.kiteColor = kiteColor;
		this.kiteOwner = kiteOwner;
		this.kiteLength = kiteLength;
		this.flying = flying;
		++kiteCount;
	}

	public Kite(String kiteOwner) {
		super();
		System.out.println("Kite(String) constructor....");
		this.kiteOwner = kiteOwner;
		++kiteCount;
	}

	public Kite(int kiteLength) {
		super();
		System.out.println("Kite(int) constructor....");
		this.kiteLength = kiteLength;
		++kiteCount;
	}

	@Override
	public String toString() {
		return "Kite [kiteColor=" + kiteColor + ", kiteOwner=" + kiteOwner + ", kiteLength=" + kiteLength + ", flying="
				+ flying + "]";
	}

	public String getKiteColor() {
		return kiteColor;
	}

	public String getKiteOwner() {
		return kiteOwner;
	}

	public int getKiteLength() {
		return kiteLength;
	}

	public boolean isFlying() {
		return flying;
	}
	public void setKiteColor(String kiteColor) {
		this.kiteColor = kiteColor;
	}
	public void setKiteOwner(String kiteOwner) {
		this.kiteOwner = kiteOwner;
	}
	public void setKiteLength(int kiteLength) {
		System.out.println("setKiteLength..."+kiteLength);
		this.kiteLength = kiteLength;
	}
	public void setFlying(boolean flying) {
		this.flying = flying;
	} 

}

