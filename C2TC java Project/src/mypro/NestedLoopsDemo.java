package mypro;

public class NestedLoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i=1;i<=10;i++)
//		{
//			for(int j=1;j<=10;j++)
//			{
//				System.out.println("value of i : " +i+"and value of j: " +j);
//			}
//			System.out.println("****************************");
//		}
//		
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
		
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("@");
			}
			
			System.out.println();
		}
		
		for(int i=0;i<=5;i++)
		{
			for(int j=(5-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("@");
			}
			
			System.out.println();
		}
	}

}
