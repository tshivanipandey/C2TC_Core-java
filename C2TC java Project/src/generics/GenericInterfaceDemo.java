package generics;

interface MinMax<T extends Comparable<T>> // Comparable is for
{
	T min();

	T max();
}

public class GenericInterfaceDemo<T extends Comparable<T>> // T is anytype o obj
		implements MinMax<T> { // GenericInterfaceDemo is concrete class
	T[] values;// T anytype of array

	GenericInterfaceDemo(T[] obj) {
		values = obj;
	}

	@Override
	public T min() {
		T o1 = values[0];

		for (int i = 1; i < values.length; i++)
			if (values[i].compareTo(o1) < 0)

				o1 = values[i];
		return o1;
	}

	public T max() {
		T o1 = values[0];

		for (int i = 1; i < values.length; i++)
			if (values[i].compareTo(o1) > 0)

				o1 = values[i];
		return o1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr[] = { 3, 6, 2, 8, 6 };

		GenericInterfaceDemo<Integer> obj1 = new GenericInterfaceDemo<Integer>(arr);
		System.out.println("Minimum value is :" + obj1.min());
		System.out.println("Minimum value is :" + obj1.max());
	}

}
