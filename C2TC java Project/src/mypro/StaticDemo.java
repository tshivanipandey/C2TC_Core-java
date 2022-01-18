package mypro;

public class StaticDemo {

	int a=10; // Non static var
	int b;
	static int c=25; 
	void fun1()
	{
		//static int f=10;//u can't declare local variable as static 
		System.out.println("The values are ");
		System.out.println("a value  is " + a);
		System.out.println("b vaues is " + b);
		System.out.println("c value is " + c);
	}
	static void fun2() //static fun
	{
		//static int f=10;//u can't declare local variable as static 
		int d=19;  // can have non static variable but can not access
		System.out.println("d vaues is " + d);
		System.out.println("c value is " + c);
	}
	static 
	{
		System.out.println("Hi i am in static block ");
		//System.exit(0); used to write when u want exit from the particular code 
	}
	static 
	{
		System.out.println("Hi i am in static block 2 ");
		//System.exit(0); used to write when u want exit from the particular code 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main would be loaded at one time 
System.out.println("c vlaue is " + StaticDemo.c);
StaticDemo obj=new StaticDemo();
obj.fun1();
StaticDemo.fun2();	}

}
