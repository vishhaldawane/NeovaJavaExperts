
class MyInt {
	int x;
	MyInt(int a) {
		x = a;
	}
	void print() {
		System.out.println(x);
	}
	//some functinons to work on int
	void increase() {
		++x;
	}
}
public class GenericTest {

	public static void main(String[] args) {
		int p=100;
		p++;
		--p;
		
		MyInt m = new MyInt(100);
		m.increase();
		
		// TODO Auto-generated method stub
		/*IntegerValue iv = new IntegerValue(10, 20);
		iv.printInteger();
		iv.swapInteger();
		iv.printInteger();*/
	//what should we do if we want the same to be done on float
		//System.out.println("----");
		/*FloatValue fv = new FloatValue(45.5f, 89.6f);
		fv.printFloat();
		fv.swapFloat();
		fv.printFloat();*/
	//	System.out.println("----");
		/*StringValue sv = new StringValue("Jack", "Julie");
		sv.printString();
		sv.swapString();
		sv.printString();*/
		//System.out.println("----");
		
		AnyValue av1 = new AnyValue(10,20);
		av1.print();
		av1.swap();
		av1.print();
		System.out.println("----");
		AnyValue av2 = new AnyValue(10.4f,20.5f);
		av2.print();
		av2.swap();
		av2.print();
		
		System.out.println("----");
		AnyValue av3 = new AnyValue(10.4,20.5);
		av3.print();
		av3.swap();
		av3.print();
		
		System.out.println("----");
		AnyValue av4 = new AnyValue('Y','N');
		av4.print();
		av4.swap();
		av4.print();
		
		System.out.println("----");
		AnyValue av5 = new AnyValue("Jack","Julie");
		av5.print();
		av5.swap();
		av5.print();
		
		Song s1 = new Song("My Heart Will Go On","Titanic","Celine D",1994);
		Song s2 = new Song("I want it that way","Millenium","Backstreet Boys",1996);
		AnyValue av6 = new AnyValue(s1,s2);
		av6.print();
		av6.swap();
		av6.print();
		
		/*SongValue songVal = new SongValue(s1, s2);
		songVal.printSong();
		songVal.swapSong();
		songVal.printSong();*/
		
		
		
	}

}
// wrapper classes
/*
 * 
 * primitive	Wrapper/Object	
 * 		|		|
 * 		byte	Byte
 * 		short	Short
 * 		int		Integer
 * 		long	Long
 * 
 * 		float	Float
 * 		double	Double
 * 		boolean	Boolean
 * 
 * 		char	Character
 * 
 * 
 */
class AnyValue<T>  // GENERIC CONTAINER T replaced with Integer,Float, Song
{
	T i; //container to hold INTEGER TYPE
	T j; //container to hold INTEGER TYPE
	
	AnyValue(T a, T b) {
		i = a;
		j = b;
	}
	
	void print() { //ALGORITHM TO PRINT
		System.out.println("i "+i); //algorithm to print
		System.out.println("j "+j); //algorithm to print
	}
	void swap() { //ALGORITHM TO SWAP
		System.out.println("swapping....any....");
		T  temp = i; //algorithm to swap
		i = j;
		j = temp;
	}
}
/*
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

class FloatValue  // CONTAINER 
{
	float i; //container to hold float TYPE
	float j; //container to hold float TYPE
	
	FloatValue(float a, float b) {
		i = a;
		j = b;
	}
	
	void printFloat() { //ALGORITHM TO PRINT
		System.out.println("i "+i); //algorithm to print
		System.out.println("j "+j); //algorithm to print
	}
	void swapFloat() { //ALGORITHM TO SWAP
		System.out.println("swapping....float....");
		float  temp = i; //algorithm to swap
		i = j;
		j = temp;
	}
}

class StringValue  // CONTAINER 
{
	String i; //container to hold float TYPE
	String j; //container to hold float TYPE
	
	StringValue(String a, String b) {
		i = a;
		j = b;
	}
	
	void printString() { //ALGORITHM TO PRINT
		System.out.println("i "+i); //algorithm to print
		System.out.println("j "+j); //algorithm to print
	}
	void swapString() { //ALGORITHM TO SWAP
		System.out.println("swapping....Strings....");
		String  temp = i; //algorithm to swap
		i = j;
		j = temp;
	}
}

class SongValue  // CONTAINER 
{
	Song i; //container to hold float TYPE
	Song j; //container to hold float TYPE
	
	SongValue(Song a, Song b) {
		i = a;
		j = b;
	}
	
	void printSong() { //ALGORITHM TO PRINT
		System.out.println("i "+i); //algorithm to print
		System.out.println("j "+j); //algorithm to print
	}
	void swapSong() { //ALGORITHM TO SWAP
		System.out.println("swapping....Songs....");
		Song  temp = i; //algorithm to swap
		i = j;
		j = temp;
	}
}*/

class Song
{
	String title;
	String album;
	String artst;
	int year;
	
	public Song(String title, String album, String artst, int year) {
		super();
		this.title = title;
		this.album = album;
		this.artst = artst;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", album=" + album + ", artst=" + artst + ", year=" + year + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtst() {
		return artst;
	}
	public void setArtst(String artst) {
		this.artst = artst;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}


