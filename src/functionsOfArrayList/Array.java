package functionsOfArrayList;

/**
*Create an object of ArrayList class and perform the following functions:
   Find the number of elements present in the array list. 
     Check whether an element is present in ArrayList or not.
       Convert ArrayList into Array
         Replace the third element of ArrayList with a given value.
 */
import java.util.ArrayList;

public class Array {
	public static void main(String[] args) {

		// Creating an ArrayList object
		ArrayList<String> fooditems = new ArrayList<String>();
		// Adding elements in the array list .
		fooditems.add("Burger");
		fooditems.add("Fried rice");
		fooditems.add("Hakka noddles");
		fooditems.add("Manchurian");
		fooditems.add("Chicken sandwich");
		fooditems.add("Spring roll");
		System.out.println("Today's Menu");

		// Using for loop to print all the items in the array list
		for (String items : fooditems) { 
											
			System.out.println(items);
		}

		// Checks the size of the array list
		int totalItems = fooditems.size();

		// Prints the number of elements in the array list
		System.out.println("\nTotal number of items in the menu: " + totalItems);

		/*
		 * Using if else statements and contains method ().
		 * Contains method searches the sequence of characters in this string. 
		 * It returns true if sequence of char values are found in this string 
		   otherwise returns false.
		 */
		if (fooditems.contains("Spring roll")) { // Element to be searched in the list
			System.out.println("\nItem is present in the menu.");
		} else {
			System.err.println("\nItem is not present in the menu.");
		}

		// Creating a string array object 
		// Using toArray method () to convert Array list into array 
		String[] arrayListToArray = new String[totalItems];
		arrayListToArray = fooditems.toArray(arrayListToArray); // Converting Array list into array
		System.out.println("\nArray list is converted into array");

		for (String s : arrayListToArray) { // Prints the converted array 
			System.out.println(s);
		}
	
        System.out.println("\nReplaced the 3rd item from the menu");
		
        //set method() in array list will remove and replace an element from a particular position.
		fooditems.set(2, "Paneer tikka");
		for (String items : fooditems) { // Prints the list with replaced element 
			System.out.println(items);
		}

	}

}
