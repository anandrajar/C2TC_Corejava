package excemptions;

public class ThrowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
	     ArithmeticException a = new ArithmeticException("hello from throw");
	     
	     throw a;
		}
		catch(ArithmeticException a)
		{
			System.out.println("ArithmeticException Caught:\n" +a);
			System.out.println(a.getMessage());
			
		}


	}

}
