package mypro;

import java.io.IOException;

public class ExcephandlingThrows {
	void m()throws IOException
	{
	throw new IOException("device error");//checked exception
	}
	void n()throws IOException
	{
	m();
	}
	void p()
	{
	try
	{
	n();
	}
	catch(Exception e){System.out.println("exception handled");}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ExcephandlingThrows obj=new ExcephandlingThrows();
			obj.p();
			System.out.println("normal flow...");
	}

}
