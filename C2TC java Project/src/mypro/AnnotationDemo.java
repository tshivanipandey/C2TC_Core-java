package mypro;

import java.lang.annotation.Annotation;
@SmartPhone(os="Android",version=6)
@SmartTV(os1="unix",version1=10)
//@SmartPhone() or @SmartPhone() try thus for default values
class Nokia_Series
{
String model;
int ScareenSize;

public Nokia_Series(String model, int scareenSize) {
	//super();
	this.model = model;
	this.ScareenSize = scareenSize;
}
}

class Samsung_Series
{
String Name;
int Size;

public Samsung_Series(String name) {
	super();
	Name = name;
	
}

public Samsung_Series(int size) {
	super();
	Size = size;
}

}

public class AnnotationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nokia_Series obj=new Nokia_Series("Fire", 4);
		System.out.println(obj.model);
		System.out.println(obj.ScareenSize);
		Class c=obj.getClass();
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone)an;
		System.out.println(s.os());
		System.out.println(s.version());
		
		Samsung_Series obj1=new Samsung_Series("Windows");
		System.out.println(obj1.Name);
		System.out.println(obj1.Size);
		Class c1=obj1.getClass();
		Annotation an1=c1.getAnnotation(SmartTV.class);
		SmartTV st=(SmartTV)an1;
		System.out.println(st.os1());
		System.out.println(st.version1());
	}

}
