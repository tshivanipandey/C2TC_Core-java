package mypro;
class Base
{
	static int i;
	static void m1()
	{
		i=10;
		System.out.println("hi in a base class");
	}
}
class Derived1 extends Base
{
	int i;
	void m2()
	{
		System.out.println("hi in a derived1 class ");
	}
}

class Derived2 extends Base
{
	int j;
	void m3()
	{
		System.out.println("hi in a derived1 class ");
	}
}


class Derived3 extends Base
{
	int k;
	void m4()
	{
		System.out.println("hi in a derived1 class ");
	}
}

class Derived4 extends Derived1
{
	int m;
	void m5()
	{
		System.out.println("hi in a derived4 class ");
	}
}

public class HirarcInheritDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Derived1 obj=new Derived1();
		Base.m1();
		obj.m2();
		Derived2 obj1 = new Derived2();
		obj1.m1();// exact way to call is Base.m1(); thats why is is giving u a warnning 
		obj1.m3();
		Derived4 obj2=new Derived4();
		obj2.m1();
		obj2.m2();
		obj2.m5();
	}

}
