package constructor;

public class Machine {

	private String name;
	private int code;
	
	public Machine() 
	{
		System.out.println("Constructor Running");
	}
	public Machine(String name) 
	{
		System.out.println("Machine name is : " + name);
	}
	
	public Machine(String machName , int machCode) 
	{
		this.name = machName;
		this.code = machCode;

		System.out.println("Machine name is : " + name + " and code is : " + code);
	}
	
	
}
