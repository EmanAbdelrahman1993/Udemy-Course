package lists;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Eman");
		linkedList.add("Heba");
		linkedList.add("Omar");
		linkedList.add("Ahmed");
		linkedList.add("Makkah");
	
		System.out.println("List Items are: "+ linkedList);
		linkedList.addFirst("Kamal");
		linkedList.addLast("Abdelrahman");
		System.out.println("List Items after adding new items are: "+ linkedList);
		
		Object firstItem = linkedList.getFirst();
		Object lastItem = linkedList.getLast();
		System.out.println("First Item : "+ firstItem + " and Last Item is : "+ lastItem);
		
		linkedList.set(6, "Layan");
		System.out.println("List Items after editing last item are: "+ linkedList);
		
		linkedList.removeFirst();
		System.out.println("List Items after removing first item are: "+ linkedList);
		linkedList.removeLast();
		System.out.println("List Items after removing last item are: "+ linkedList);
		
		linkedList.add(4, "Layan lolo");
		System.out.println("List Items after adding item in particular position : "+ linkedList);
		
		linkedList.add(5, "Layan lolo");
		System.out.println("List Items after adding item in particular position : "+ linkedList);
		
		linkedList.remove(4);
		System.out.println("List Items after removing item from particular position : "+ linkedList);
	}

}
