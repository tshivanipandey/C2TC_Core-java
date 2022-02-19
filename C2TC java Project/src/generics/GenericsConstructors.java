package generics;

public class GenericsConstructors {

	private double v;

	public <T extends Number> GenericsConstructors(T t)// this T can hold anything but it should be subclass of number
	{
		v = t.doubleValue();
	}

	void show() {
		System.out.println("value of v is :" + v);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Number to double conversion:");
		GenericsConstructors obj = new GenericsConstructors(10);
		obj.show();

		GenericsConstructors obj1 = new GenericsConstructors(136.8F);
		obj1.show();

	}

}
