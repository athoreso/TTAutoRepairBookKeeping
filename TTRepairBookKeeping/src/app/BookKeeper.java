package app;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import misc.Address;
import people.Customer;

public class BookKeeper {

	public static void main(String[] args) throws IOException {

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner stdin = new Scanner(System.in);
		File file = new File("customers.txt");
		
		Scanner fileIn = new Scanner(file);
		
		
		StringBuilder sb = new StringBuilder();

		while(fileIn.hasNext()) {
			sb.append(fileIn.nextLine() + "\n");
		}
		
		
		
		FileWriter fw = new FileWriter(file);
		
			
		System.out.println("Saved Customers: \n" + sb.toString());
		
		
		System.out.println("Create a customer ");
		
		Customer testCustomer = new Customer();
		Address testAddress = new Address();
		
		System.out.println("Enter customer name:");
		
		testCustomer.setName(stdin.nextLine());
		
		System.out.println("Enter cell number:");

		testCustomer.setCellNumber(stdin.nextLine());

		System.out.println("Now entering address:");
		
		System.out.println("Please enter street and number:");
		
		testAddress.setStreet(stdin.nextLine());

		System.out.println("Please enter city:");
		
		testAddress.setCity(stdin.nextLine());
		
		System.out.println("Please enter state:");
		
		testAddress.setState(stdin.nextLine());
		
		System.out.println("Please enter 5 digit zipcode:");
		
		testAddress.setZipcode(stdin.nextLine());
		
		testCustomer.setAddress(testAddress);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Formatted Information: \n");
		System.out.println(testCustomer.toString());
		
		if (file.createNewFile()) {
			System.out.println("File created: " + file.getName());
	    }else {
	        System.out.println("File already exists. \n");
	    }
		
		fw.write(sb.toString() + testCustomer.toString());
		
			
		
		fileIn.close();
		fw.close();
		stdin.close();

		System.out.println("Ending Program");
		
	}
}
