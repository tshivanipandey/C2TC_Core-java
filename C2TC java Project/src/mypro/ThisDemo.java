package mypro;
class Animal
{
int legs;
String name;
String color;

public Animal()
{
System.out.println("this is default constructor");
}

public Animal(int legs) {
	
	this.legs = legs;
}

public Animal(int legs, String name, String color) {
	
	this.legs = legs;
	this.name = name;
	this.color = color;
}


public Animal(String name, String color) {
	
	
	this.color = color;
}

void display()
{
	System.out.println("Animal description : ");
	System.out.println(color+ " " + name+" " + "with" + " " +legs +" "+ " legs");
}
}
public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal obj=new Animal();
		obj.display();
		Animal obj1=new Animal(4,"cat","white");
obj1.display();

Animal obj2=new Animal("cat","white");
obj2.display();

Animal obj3=new Animal(9,"	cat","white");
obj3.display();

	}

}
