package mypro;

public class ExcepHandlingTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
			    int data =100/0;
			  }
			  catch(ArithmeticException ae)
			  {
			    ae.printStackTrace();
			  }
			  System.out.println("Exception Handling  Demo ");
	}

}
