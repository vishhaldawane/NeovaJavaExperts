
public class PersonTest {
	public static void main(String[] args) {
		
		Person person = new Person('F',22,"Minal");
		person.showPerson();
		//System.out.println("person : "+person);
		
		System.out.println("-------------");
		
		Student student = new Student('M',23,"Bhushan",123,"A",90.56f);
		student.showStudent();
		//System.out.println("Student : "+student);
		
		System.out.println("-------------");
		
		Employee emp = new Employee('F',24,"Ruhi",445,"A",97.5f,333,"Analyst",9999);
		emp.showEmployee();
		//System.out.println("emp : "+emp);
		
		
	}
}

//isA		hasA		usesA		producesA

class Person
{
	private char gender;
	private int age;
	private String name;
	
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
		
	}

}


class Student extends Person //isA
{

	private int roll;
	private String grade;
	private float totalScore; // total 6 variables here
	
	
	public Student(char gender, int age, String name, int roll, String grade, float totalScore) {
		super(gender,age,name);//Constructor call must be the first statement in a constructor
		System.out.println("Student(char,int,String,int,String,float)...ctor...");
		this.roll = roll;
		this.grade = grade;
		this.totalScore = totalScore;
	}
	
	void showStudent() {
		super.showPerson();
		System.out.println("Roll   : "+roll);
		System.out.println("Grade  : "+grade);
		System.out.println("Total  : "+totalScore);
	}


	@Override
	public String toString() {
		return "Student [toString()=" + super.toString() + ", roll=" + roll + ", grade=" + grade + ", totalScore="
				+ totalScore + "]";
	}

	

	
}


class Employee extends Student //isA
{

	private int empno;
	private String job;
	private float salary; // total 9 variables here
	
	
	public Employee(char gender, int age, String name, int roll, String grade, float totalScore, int empno, String job, float salary) {
		super(gender,age,name,roll,grade,totalScore);//Constructor call must be the first statement in a constructor
		System.out.println("Employee(char,int,String,int,String,float,int,String,float)...ctor...");

		this.empno = empno;
		this.job = job;
		this.salary = salary;
		
	}

	void showEmployee() {
		super.showStudent();
		System.out.println("Empno  : "+empno);
		System.out.println("Job    : "+job);
		System.out.println("Salary : "+salary);
	}

	@Override
	public String toString() {
		return "Employee [toString()=" + super.toString() + ", empno=" + empno + ", job=" + job + ", salary=" + salary
				+ "]";
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

