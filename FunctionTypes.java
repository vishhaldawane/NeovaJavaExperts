package com.neova;

public class FunctionTypes {
	public static void main(String[] args) {
		function1();
		int a=10,b=20,c=30; function2(a,b,c); //actual values of a,b,c and not the address [ called by value ]
		int ans = function3(a,b,c); System.out.println("ans  : "+ans);
		int randomValue = function4(); System.out.println("random value : "+randomValue);
	}
	
	public static void function1() {
		System.out.println("1.  type one ");
	}

	public static void function2(int x, int y, int z) {
		System.out.println("2.  type two "+x+" "+y+" "+z);	
	}
	

	public static int function3(int x, int y, int z) {
		System.out.println("3.  type three "+x+" "+y+" "+z);
		return x+y+z;
	}
	
	public static int function4() {
		System.out.println("4.  type four ");
		return 100;
	}

}
/*


	1. function without argument(s) and without return value
	
			void functionName() {
				
			}
			
	2. function with argument(s) BUT no return value
	
			void functionName(int a, int b) {
				
			}
	
	3. function with argument(s) AND with return value
	
			float functionName(int a, int b) {
				return floatValue;
			}
	
	4. 	function without argument(s) BUT with return value	
			float functionName() {
				return floatValue;
			}

*/