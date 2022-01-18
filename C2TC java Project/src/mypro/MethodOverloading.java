package mypro;

public class MethodOverloading {
int add(int a,int b)
{
	int sum=a+b;
	return sum;
	
}
float add(float a,float b)
{
	float sum=a+b;
	return sum;
}
float add(int a,float b,int c)
{
	float sum=a+b+c;
	return sum;
}
float add(float a,int b,int c)
{
	float sum=a+b+c;
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverloading obj=new MethodOverloading();
System.out.println(obj.add(10, 20));
System.out.println(obj.add(3.4f, 9.30f));
System.out.println(obj.add(10,12.20f,20));
System.out.println(obj.add(2.5f,20,455));
	}

}
