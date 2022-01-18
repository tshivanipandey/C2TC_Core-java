package mypro;
class Bank
{
	float getrateOfInterest()
	{
		return 6.7f;
	}
}
class SBI extends Bank
{

	@Override
	float getrateOfInterest() {
		// TODO Auto-generated method stub
		return 4.6f;
	}
	
}
class HDFC extends Bank
{

	@Override
	float getrateOfInterest() {
		// TODO Auto-generated method stub
		return 4.5f;
	}
class ICIC extends Bank
{

	
	float getrateOfInterest() {
		// TODO Auto-generated method stub
		return 45.2f;
	}
	
}
	
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI obj =new SBI();
System.out.println(obj.getrateOfInterest());

Bank obj1=new SBI();
System.out.println(obj1.getrateOfInterest());

//Bank obj2=new ICIC();
//System.out.println(obj2.getrateOfInterest());
	}

}
