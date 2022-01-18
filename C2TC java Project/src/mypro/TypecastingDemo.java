package mypro;

public class TypecastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//widening / implicit type casting 
byte b=10;
int i=b;
System.out.println(i);

float f=22.14f;
double d=f;
System.out.println(d);

char ch='A';
int i3=ch;
System.out.println("char to int " + i3);

char var1='\u00A7';
int i4=var1;
System.out.println("char to int " + i4);

//narrowing /explicit type casting 

double f1=10.532f;
long l=(long)f1;
System.out.println("double to long " + l);

float f2=34.56f;
int i1=(int) f2;
System.out.println("float to int " + i1);

long l1=876478353406L;
int i2=(int)l1;
System.out.println("long to int " + i2);

byte b1=90;
char ch1=(char)b1;
System.out.println("byte to char " + ch1);


	}

}
