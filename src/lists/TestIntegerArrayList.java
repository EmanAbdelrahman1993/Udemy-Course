package lists;

import java.util.ArrayList;

public class TestIntegerArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> listNumbers = new ArrayList<Integer>();
		listNumbers.add(10);
		listNumbers.add(20);
		listNumbers.add(30);
		listNumbers.add(40);
		listNumbers.add(50);	
		listNumbers.add(60);
		System.out.println("List Numbers after adding new Numbers are: "+ listNumbers);
		
		for(int i=0; i< listNumbers.size(); i++) 
		{
			System.out.println(listNumbers.get(i));
		}
		
		listNumbers.remove(listNumbers.size()-2);
		System.out.println("List Numbers after deleting Number are: "+ listNumbers);

	}

}
