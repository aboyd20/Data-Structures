import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class TestSortOptions {

	public static void main(String[] args) {
		ArrayList<Contact> contacts = initializeContactsArray();
		promptForOption(contacts);
		
	}

	/*
	 * Data Initialization
	 */

	private static ArrayList<Contact> initializeContactsArray() {
		// TODO: Initialize an array of Student objects  
		// create an arrayList
		ArrayList<Contact> Contacts = new ArrayList<Contact>();  
		// add contents to the contact array list
		Contacts.add(new Contact("Joe", "Jones", "IL", 35));
		Contacts.add(new Contact("Jane", "Doe", "CA", 41));
		Contacts.add(new Contact("Bill", "Barnes", "OH", 62));
		Contacts.add(new Contact("Ida", "Know", "FL", 23));
		Contacts.add(new Contact("Adam", "Ant", "MI", 14));

		return Contacts;
	}

	/*
	 * Prompt for the user to enter their option from the keyboard
	 *
	 * 1 = Sort by last name
	 * 2 = Sort by Home State
	 * 3 = Sort by Age
	 * 0 = End input and exit/terminate the application
	 *
	 */

	private static void promptForOption(ArrayList<Contact> contacts) {
		// TODO: Prompt and accept option input
		// prompting options below
		System.out.println("Sort by Last Name   : [1]");
		System.out.println("Sort by Home State  : [2]");
		System.out.println("Sort by Age         : [3]");

		// scanner input code
		Scanner input = new Scanner(System.in);  
		System.out.print("Enter option or 0 to end input: ");


		int promptForOption = input.nextInt();

		if (promptForOption == 1){
			Collections.sort(contacts, new ContactLastnameComparator());
			displayContacts(contacts);
		}
		else if (promptForOption == 2){
			Collections.sort(contacts, new ContactHomeStateComparator());
			displayContacts(contacts);
		}
		else if (promptForOption == 3){
			Collections.sort(contacts, new ContactAgeComparator());
			displayContacts(contacts);
		}
		else if(promptForOption == 0){
			System.out.println("Exiting....");
		}
		else {
			System.out.println("Invalid Entry.");
		}
	}

	/*
	 * Display the Contact information sorted by using the selected option from 
	 * the above "promptForOption" method result
	 */

	private static void displayContacts(ArrayList<Contact> contacts) {
		// TODO: Display the contents of the Contacts Array
		for (int i = 0; i < contacts.size(); i++){
			System.out.println("Contacts " + contacts.get(i));
		}

	}

}





