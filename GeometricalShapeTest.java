
public class GeometricalShapeTest {
	public static void main(String[] args) {
		// a parent handle/ref can point to its child
		// Doctor d = new Surgeon();
		
	/*	GeometricalShape gs = new Circle(12);
		gs.calcArea();
		gs.calcPeriphery();
		
		gs = new Ellipse(12,24);
		gs.calcArea();
	*/
		Geometry.process(new Circle(12));
		Geometry.process(new Ellipse(34,55));
		Geometry.process(new Triangle(50));
		
		//Triangle t = new Triangle(55);
		
	}
}

class Geometry
{
	public static void process(GeometricalShape x)
	{
		System.out.println("Procssing....");
		x.calcArea();
		x.calcPeriphery();
		System.out.println("Processed...");
	}
}

abstract class GeometricalShape //abstract means incomplete
{
	  abstract void calcArea() ;
	  
	  
	  //{  
		//  System.out.println("nothing to find...area");
	  //} //incomplete
	  
	  abstract void calcPeriphery(); 
	  //{    
		  //System.out.println("nothing to find peri");
	 // }
}
//GeometricalShape <--  artGallery <-- abstract image painted by an artist
//    | calcArea(); <-- code is undefined
//	------------------------------------------
//	|	   		|		  |				|		
// Circle 		Square 	Triangle  		Pentagon
//calcArea()  calcArea()  calcArea()    calcArea();
//  forest		cloud		God				face <--- implementations
//   |
// Ellipse

//The type Circle must implement the inherited abstract method 
//GeometricalShape.calcArea()

//The type Circle must implement the inherited abstract method 
//GeometricalShape.calcPeriphery()
class Circle extends GeometricalShape
{
	protected int radius;
	protected static final float PI = 3.14f;
	
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	void calcArea() {
		float ans = radius * radius * PI;
		System.out.println("Area of the Circle : "+ans);
	}
	
	void calcPeriphery() {
		float peri = 2 * PI * radius;
		System.out.println("Perimeter of Circle : "+peri);
	}
}

class Ellipse extends Circle
{
	int verticalRadius;

	public Ellipse(int radius, int verticalRadius) {
		super(radius);
		this.verticalRadius = verticalRadius;
	}
	void calcArea() { //overriding
		float ans = radius * verticalRadius * PI;
		System.out.println("Area of the Ellipse : "+ans);
	}
	
	void calcPeriphery() {
		float peri = 2 + PI + radius;
		System.out.println("Perimeter of Ellipse : "+peri);
	}
	
}

class Triangle extends GeometricalShape
{
	protected int side;
	
	
	public Triangle(int side) {
		super();
		this.side = side;
	}

	void calcArea() { //is it overriding | or exclusive method
		float ans = side * 0.5f;
		System.out.println("Area of the Triangle : "+ans);
	}
	
	void calcPeriphery() {
		float peri = side + side;
		System.out.println("Perimeter of Triangle : "+peri);
	}
}