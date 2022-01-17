
public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerValue iv = new IntegerValue(10, 20);
		iv.printInteger();
		iv.swapInteger();
		iv.printInteger();
	//what should we do if we want the same to be done on float
		System.out.println("----");
		FloatValue fv = new FloatValue(45.5f, 89.6f);
		fv.printFloat();
		fv.swapFloat();
		fv.printFloat();
		System.out.println("----");
		StringValue sv = new StringValue("Jack", "Julie");
		sv.printString();
		sv.swapString();
		sv.printString();
		System.out.println("----");
		
		Song s1 = new Song("My Heart Will Go On","Titanic","Celine D",1994);
		Song s2 = new Song("I want it that way","Millenium","Backstreet Boys",1996);
		
		SongValue songVal = new SongValue(s1, s2);
		songVal.printSong();
		songVal.swapSong();
		songVal.printSong();
		
		
		
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
}

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


