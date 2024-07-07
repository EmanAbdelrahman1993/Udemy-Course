package abstraction;

public class Dog extends Animals{

	public void sound() 
	{
		System.out.println("Dog sound is : Woof");
	}
	public void move() 
	{
		System.out.println("Dog can move fast and run");
	}
	public static void main(String[] args) {

		Animals dog = new Dog();
		dog.sound();
		dog.move();
	}

}
