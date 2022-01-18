package mypro;
interface i1
{
	void set(int x,int y);
}
interface i2
{
	void disp();
}
class Impclass implements i1,i2
{
	int p=10;
	int q=20;
	
	public void set(int x,int y)
	{
		p=x;
		q=y;
	}
	public void disp()
	{
		System.out.println(p);
		System.out.println(q);
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Impclass obj=new Impclass();
		obj.set(100, 200);
		obj.disp();
		
	}

}
	

