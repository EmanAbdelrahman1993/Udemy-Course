package interfaceAndAbstraction;

public class Dog implements Animal{
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Dog can sleep for 7 hours");
		
	}

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog can eat meats");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dogObject = new Dog();
		dogObject.eat();
		dogObject.sleep();
	}

	

}
