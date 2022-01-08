import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//jdbc 
//person student employee    pancard
//pid								pid(fk)

class MyFrame extends JFrame //isA
{
	JMenuBar jmb = new JMenuBar(); //hasA
	JMenu fileMenu = new JMenu("File"); //hasA
	JMenu editMenu = new JMenu("Edit"); //hasA
	JMenu helpMenu = new JMenu("Help"); //hasA
	
	JMenuItem item1 = new JMenuItem("New");
	JMenuItem item2 = new JMenuItem("Open");
	JMenuItem item3 = new JMenuItem("Close");
	
	
	MyFrame() {
		
		fileMenu.add(item1);
		fileMenu.add(item2);
		fileMenu.add(item3);
		
		jmb.add(fileMenu);
		jmb.add(editMenu);
		jmb.add(helpMenu);
		
		super.setJMenuBar(jmb); //built in function
		super.setSize(450,450);
		super.setLocation(350,350);
		super.setTitle("MyOwn Frame");
	}
}
public class PersonTest {
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
		mf.setVisible(true);
		
	/*	JFrame f = new JFrame();
		f.setSize(400,300);
		f.setLocation(300, 400);
		f.setTitle("MyFrame");
		f.setVisible(true);//show the frame
		
		JFrame f1 = new JFrame();
		f1.setSize(300,500); //actual size on screen
		f1.setLocation(200, 200); //screen location
		f1.setTitle("Your Frame");
		f1.setVisible(true); //show the frame
		
		
		JFrame f2 = new JFrame();
		f2.setSize(100,300);
		f2.setLocation(100, 100);
		f2.setTitle("Their Frame");
		f2.setVisible(true);
		
	*/	
		Person person = new Person('F',22,"Minal");
		person.panCard.setPanCard("ABCK4545R", "Pqr", "12-Oct-1990", "India");
		person.adhaar.setAdhaarCard("1234 1234 1234", "West Avenue, Bandra, Mumbai");
		person.voterCard.setVotingCard("T-12321", "G-Ward");
		
		person.showPerson();
		//System.out.println("person : "+person);
		
		System.out.println("-------------");
		
		Student student = new Student('M',23,"Bhushan",123,"A",90.56f);
		student.panCard.setPanCard("PQRTF4567P", "Xyz","10-Jan-1991", "Nepal");
		student.adhaar.setAdhaarCard("9934 8834 7734", "East Avenue, Boriwali, Mumbai");
		student.voterCard.setVotingCard("T-125125", "S-Ward");
		student.report.setReportCard(90, 95, 88, 92, 83, 93);
		
		student.showStudent();

		//System.out.println("Student : "+student);
		
		System.out.println("-------------");
		
		Employee emp = new Employee('F',24,"Ruhi",445,"A",97.5f,333,"Analyst");
		
		emp.panCard.setPanCard("RTUFE4576A", "Lml", "20-Aug-1990", "Srilanka");
		emp.adhaar.setAdhaarCard("6565 7878 6767", "Laxmi Road, Kothrud, Pune");
		emp.voterCard.setVotingCard("T-676767", "N-Ward");
		emp.report.setReportCard(98, 99, 95, 88, 93, 99);
		emp.salaryJan.setSalarySlip(4500, 500, 300, 200);
		emp.showEmployee();
		//System.out.println("emp : "+emp);
		
		
	}
}

//isA		hasA		usesA		producesA

class AdhaarCard
{
	private String adhaarNumber;
	private String address;
	
	public void setAdhaarCard(String adhaarNumber, String address) {
		
		this.adhaarNumber = adhaarNumber;
		this.address = address;
	}
	void showAdhaarCard() {
		System.out.println("------ADHAAR CARD DETAILS -----");

		System.out.println("Adhaar :"+adhaarNumber);
		System.out.println("Address:"+address);
	}
	
}
class VotingCard
{
	private String voterId;
	private String ward;
	
	public void setVotingCard(String voterId, String ward) {
		
		this.voterId = voterId;
		this.ward = ward;
	}
	void showVotingCard() {
		System.out.println("------VOTING CARD DETAILS -----");
		System.out.println("VoterId:"+voterId);
		System.out.println("Ward   :"+ward);
	}
}

class ReportCard
{
	private float phy,chem,maths,eng,history, geo;
	private float total, average;
	private char grade;
	
	public void setReportCard(float phy, float chem, float maths, float eng, float history, float geo) {
		
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
		this.eng = eng;
		this.history = history;
		this.geo = geo;
		this.total = this.phy + this.chem + this.maths + this.eng + this.history + this.geo;
		
		this.average = this.total / 6;
		
		if(this.average >= 90) { this.grade = 'A'; }
		else 	if(this.average >= 75 && this.average <90) { this.grade = 'B'; }
		else 	if(this.average >= 60 && this.average <75) { this.grade = 'C'; }
		else    if(this.average >= 45 && this.average <60) { this.grade = 'D'; }
	  	else    if(this.average >= 35 && this.average <45) { this.grade = 'E'; }
	  	else this.average = 'F';
	}
	
	void showReportCard() {
		System.out.println("------REPORT CARD DETAILS -----");

		System.out.println("PHY   : "+phy);
		System.out.println("CHEM  : "+chem);
		System.out.println("MATH  : "+maths);
		System.out.println("ENG   : "+eng);
		System.out.println("HIST  : "+history);
		System.out.println("GEO   : "+geo);
		System.out.println("TOT   : "+total);
		System.out.println("AVG   : "+average);
		System.out.println("GRADE : "+grade);

	}
	
}

class SalarySlip
{
	private float basic,hra,da,ta,gross,pf;
	private float net;
	private char grade;
	
	public void setSalarySlip(float basic, float hra, float da, float ta) {
		
		this.basic = basic;
		this.hra= hra;
		this.da = da;
		this.ta = ta;
		this.gross = this.basic + this.hra + this.da + this.ta;
		
		this.pf = this.gross * 0.10f;
		this.net = this.gross - this.pf;
		if(this.basic > 5000 ) this.grade ='A';
		else if(this.basic >= 4000 && this.basic<5000 ) this.grade ='B';
		else if(this.basic < 4000 ) this.grade ='C';
		
	}
	
	void showSalarySlip() {
		System.out.println("------SALARY SLIP DETAILS -----");

		System.out.println("BASIC   : "+basic);
		System.out.println("HRA     : "+hra);
		System.out.println("DA      : "+da);
		System.out.println("TA      : "+ta);
		System.out.println("GROSS   : "+gross);
		System.out.println("PF      : "+pf);
		System.out.println("NET     : "+net);
		System.out.println("GRADE   : "+grade);

	}
	
}

class SalarySlip
{
	
}
class PanCard
{
	String panNumber;
	String fatherName;
	String birthDate;
	String issuingAuthority="Govt Of India";
	
	public void setPanCard(String panNumber, String fatherName, String birthDate, String issuedBy) {
		
		this.panNumber = panNumber;
		this.fatherName = fatherName;
		this.birthDate = birthDate;
		this.issuingAuthority = issuedBy;
	}
	
	void showPanCard() {
		System.out.println("------PAN DETAILS -----");
		System.out.println("Pan   : "+panNumber);
		System.out.println("Father: "+fatherName);
		System.out.println("DOB   : "+birthDate);
		System.out.println("Issued: "+issuingAuthority);
	}
}
/*
 * 			
 * 						 gender	 age	name	panCard   adhaar  voterCard
 * 						+-----------------------------------------------+
 * 						|	F	|22	 | Minal  |	   350 	|450	|		|		
 * 						+----------------------------|----|-------------+
 * 		+--------------->100						 |	  |
 		|         									 |    |
 * * 	|											 |	  |	adhaarNumber	address
 * 		|											 |	  |	---------------------
 * 		|											 |	  |	|....	|....		|  show / setter
 * 		|											 |	  |	---------------------
 * 		|											 +    +---->450
 		|											 |		panNumber	fatherName	DOB  issuedBy
 * 		|											 |		-------------------------------------
 * 		|											 |		|....	|....		|...	|...	|  show/ setter
 * 		|											 |		-------------------------------------
 * 		|											 +----->350
 * 		|
 * 		100
 * 		person
 * 
 * Bulb has a Filament
 * WahingMachine hasA WashingTub
 */
class Person
{
	private char gender;
	private int age;
	private String name;
	//private String panCard="SOME PAN VALUE";
	
	public PanCard panCard = new PanCard(); //hasA
	AdhaarCard adhaar = new AdhaarCard(); //hasA
	VotingCard voterCard = new VotingCard(); //hasA
	
	public Person(char gender, int age, String name) {
		super();
		System.out.println("Person(char,int,String)...ctor...");
		this.gender = gender;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
	
	void showPerson() {
		System.out.println("Gender : "+gender);
		System.out.println("Age    : "+age);
		System.out.println("Name   : "+name);
	//	System.out.println("Pan    : "+panCard);
		panCard.showPanCard();
		adhaar.showAdhaarCard();
		voterCard.showVotingCard();
	//	System.out.println("-----------------------");
	}

}


class Student extends Person //isA
{

	private int roll;
//	private String grade;
//	private float totalScore; // total 6 variables here
	ReportCard report = new ReportCard();
	
	public Student(char gender, int age, String name, int roll, String grade, float totalScore) {
		super(gender,age,name);//Constructor call must be the first statement in a constructor
		System.out.println("Student(char,int,String,int,String,float)...ctor...");
		this.roll = roll;
//		this.grade = grade;
//		this.totalScore = totalScore;
	}
	
	void showStudent() {
		super.showPerson();
		System.out.println("Roll   : "+roll);
//		System.out.println("Grade  : "+grade);
//		System.out.println("Total  : "+totalScore);
		report.showReportCard();
	}


	

	

	
}


class Employee extends Student //isA
{

	private int empno;
	private String job;
	//private float salary; // total 9 variables here
	
	SalarySlip salaryJan = new SalarySlip(); 
	//Collection framework
	//ArrayList<SalarySlip> salaries = new ArrayList<SalarySlip>(); 
	
	public Employee(char gender, int age, String name, int roll, String grade, float totalScore, int empno, String job) {
		super(gender,age,name,roll,grade,totalScore);//Constructor call must be the first statement in a constructor
		System.out.println("Employee(char,int,String,int,String,float,int,String,float)...ctor...");

		this.empno = empno;
		this.job = job;
	//	this.salary = salary;
		
	}

	void showEmployee() {
		super.showStudent();
		System.out.println("Empno  : "+empno);
		System.out.println("Job    : "+job);
		//System.out.println("Salary : "+salary);
		salaryJan.showSalarySlip();
	}

	

	
}



/*
class Student
{
	private char gender;
	private int age;
	private String name;
	
	private int roll;
	private String grade;
	private float totalScore;
	
	
	public Student(char gender, int age, String name, int roll, String grade, float totalScore) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
		
		this.roll = roll;
		this.grade = grade;
		this.totalScore = totalScore;
		
	}


	@Override
	public String toString() {
		return "Student [gender=" + gender + ", age=" + age + ", name=" + name + ", roll=" + roll + ", grade=" + grade
				+ ", totalScore=" + totalScore + "]";
	}

	
}*/

