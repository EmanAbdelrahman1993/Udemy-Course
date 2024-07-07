package encapsulation;

public class RunEncap {

	public static void main(String[] args) {
		TestEncap encap = new TestEncap();
		encap.setName("OOP Course");
		encap.setAge(2024);
		System.out.println("Course Name: "+ encap.getName()+ " At Year: "+encap.getAge());
	}

}
