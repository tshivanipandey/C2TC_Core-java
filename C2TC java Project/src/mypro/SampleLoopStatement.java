package mypro;

public class SampleLoopStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Example 1
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			break;
		}
		
		//Example 2
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			i++;
		}
		
		
		//Example 3
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			i++;
			i--;
		}
		

		//Example 4
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			i+=2;
		}
	
		
String s="friends";
int x=0;
do
{
	System.out.println(s.charAt(x));
	x++;
}
while(x<2);

//Will give u error
//while(true);{
//	System.out.println("i m error");
//}


//Ternary Operator 

int y=10;
y=(10==y)?1:0;
System.out.println(y);

	}
}
