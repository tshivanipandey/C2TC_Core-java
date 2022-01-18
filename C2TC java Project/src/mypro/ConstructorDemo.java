package mypro;

class Student
{
	int id;
	String name;
	String course;
	String email;
	
	Student()
	{	
		
	}
	public void display()
	{
		System.out.println("Student Information : ");
		System.out.println(id+ " " + name + " " +course+ " " + email);
	}
	public Student(int id, String name, String course, String email) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(1,"ana","c2c","hfdiughdrui");
//s1.id=1;
//s1.name="SV";
//s1.course="java";
//s1.email="ygy";
s1.display();
	}

}
