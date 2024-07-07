package errorExceptions;

public class TestException {

	public static void main(String[] args) {
		TestException test = new TestException();
		test.testArray();
	}
	
	public void testArray() 
	{
		try 
		{
			//protected code
			int numArr[]= {5,3};
			System.out.println(numArr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Exception thrown: "+ e);
		}
		System.out.println("out of the block");
	}

}
