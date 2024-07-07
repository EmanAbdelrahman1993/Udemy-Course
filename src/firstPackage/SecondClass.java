package firstPackage;

public class SecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstClass.main(args); //static method doesn't need to create an object from class to access it,just mention class.
		FirstClass fclass = new FirstClass();
		fclass.printStatment("Hello World!!");
		//fclass.main(args);
		
	}

}
