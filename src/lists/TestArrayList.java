package lists;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> listItems = new ArrayList<String>();
		listItems.add("Ahmed");
		listItems.add("Omar");
		listItems.add("Heba");
		listItems.add("Eman");
		listItems.add("Abdelrahman");	
		listItems.add("Mona");
		System.out.println("List Items after adding new items are: "+ listItems);
		
		listItems.add(0, "Makkah");
		listItems.add(3, "Layan");
		System.out.println("List Items after adding new items are: "+ listItems);
		
		listItems.remove(5);
		listItems.remove("Abdelrahman");
		System.out.println("List Items after deleting items are: "+ listItems);


		

	}

}
