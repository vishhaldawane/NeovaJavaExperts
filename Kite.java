public class Kite
{
	private String kiteColor;
	private String kiteOwner;
	private int kiteLength;
	private boolean flying;
	
	
	public void showKite() {
		
		System.out.println("Kite Owner  : "+kiteOwner);
		System.out.println("Kite Color  : "+kiteColor);
		System.out.println("Kite Length : "+kiteLength);
		System.out.println("Kite Flying : "+flying);
		System.out.println("-----------");
	}
	public Kite() {
		super();
		System.out.println("Kite() constructor...");
	}

	public Kite(String kiteColor, String kiteOwner, int kiteLength, boolean flying) {
		super();
		System.out.println("Kite(String,String,int,boolean");
		this.kiteColor = kiteColor;
		this.kiteOwner = kiteOwner;
		this.kiteLength = kiteLength;
		this.flying = flying;
	}

	public Kite(String kiteOwner) {
		super();
		System.out.println("Kite(String) constructor....");
		this.kiteOwner = kiteOwner;
	}

	public Kite(int kiteLength) {
		super();
		System.out.println("Kite(int) constructor....");
		this.kiteLength = kiteLength;
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


class Student
{
	
	int roll;
	String name;
	
	float phy;
	float chem;
	float maths;
	
	float total;
	float perc;
	
	char grade;

	public Student(int roll, String name, float phy, float chem, float maths, float total, float perc, char grade) {
		super();
		this.roll = roll;
		this.name = name;
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
		this.total = total;
		this.perc = perc;
		this.grade = grade;
	}

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public Student(int roll, String name, float phy, float chem, float maths) {
		super();
		this.roll = roll;
		this.name = name;
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
	}
	
	
	
	
}