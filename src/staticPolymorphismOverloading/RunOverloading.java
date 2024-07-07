package staticPolymorphismOverloading;

public class RunOverloading {

	public static void main(String[] args) {

		double result;
		Overload obj = new Overload();
		obj.print(10);
		obj.print(3, 5);
		result = obj.print(10.4);
		System.out.println(result);
	}

}
