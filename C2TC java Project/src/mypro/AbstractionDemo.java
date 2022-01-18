package mypro;
abstract class Banks
{
	abstract float getrateOfInterest();
	
	void display()
	{
		System.out.println("Abstract class ");
	}
}
class SBI_B extends Bank
{

	@Override
	float getrateOfInterest() {
		
		return 4.6f;
	}
	
}
class HDFC_B extends Bank
{

	@Override
	float getrateOfInterest() {
		
		return 4.5f;
	}
class ICIC extends Bank
{

	
	float getrateOfInterest() {
		
		return 45.2f;
	}
	
}
	
}

public class AbstractionDemo {

	public static void main(String[] args) {
		
		SBI obj =new SBI();
		System.out.println(obj.getrateOfInterest());

		Bank obj1=new SBI();
		System.out.println(obj1.getrateOfInterest());
	}

}
