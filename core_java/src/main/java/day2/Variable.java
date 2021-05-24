package day2;

public class Variable {
	int a;
	float b;
	short c;
	long d;
	double e;
	char f;
	boolean g;
	byte h;
	//instance variable
	static byte i;
	static int j;
	static float k;
	static short l;
	static long m;
	static double n;
	static char o;
	static boolean p;//class variable
//notes : by default system will give default value to global variable not to local variable
		public static void main(String[] args) { 
		//variable inside a method/function is known as local variable
			int k=8; 
			System.out.println(k);
		//since i want to access global variable i which is non static inside static void main 
			//so i have to create object of Variable class 
			Variable v=new Variable(); 
			
		//create object of class Variable
			
			System.out.println(v.a);
			System.out.println(v.b);
			System.out.println(v.c);
			System.out.println(v.d);
			System.out.println(v.e);
			System.out.println(v.f);
			System.out.println(v.g);
			System.out.println(v.h);
		
			//for static variables
			System.out.println(v.i);
			System.out.println(v.j);
			System.out.println(v.k);
			System.out.println(v.l);
			System.out.println(v.m);
			System.out.println(v.n);
			System.out.println(v.o);			
			System.out.println(p); 
			}
		}
		// TODO Auto-generated method stub

	


