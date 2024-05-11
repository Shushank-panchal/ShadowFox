package com.contactmanagement.contactmanagementsystem;

import java.util.Scanner;

//Main class
public class Main {
 public static void main(String[] args) {
     // Initialize ContactManager object
     ContactManager contactManager = new ContactManager();
     Scanner scanner = new Scanner(System.in);

     // Main application loop
     while (true) {
         // Display menu options
         System.out.println("1. Add contact");
         System.out.println("2. List contacts");
         System.out.println("3. Search contact");
         System.out.println("4. Update contact");
         System.out.println("5. Delete contact");
         System.out.println("6. Exit");
         System.out.print("Enter your choice: ");

         int choice = scanner.nextInt();
         scanner.nextLine(); // Consume newline character

         switch (choice) {
             case 1:
                 System.out.print("Enter name: ");
                 String name = scanner.nextLine();
                 System.out.print("Enter phone number: ");
                 String phoneNumber = scanner.nextLine();
                 System.out.print("Enter email address: ");
                 String emailAddress = scanner.nextLine();
                 contactManager.addContact(new Contact(name, phoneNumber, emailAddress));
                 System.out.println("Contact added successfully.");
                 break;
             case 2:
                 System.out.println("Contacts:");
                 contactManager.listContacts();
                 break;
             case 3:
                 System.out.print("Enter name to search: ");
                 String searchName = scanner.nextLine();
                 contactManager.searchContact(searchName);
                 break;
             case 4:
                 System.out.print("Enter name to update: ");
                 String oldName = scanner.nextLine();
                 System.out.print("Enter new name: ");
                 String newName = scanner.nextLine();
                 System.out.print("Enter new phone number: ");
                 String newPhoneNumber = scanner.nextLine();
                 System.out.print("Enter new email address: ");
                 String newEmailAddress = scanner.nextLine();
                 contactManager.updateContact(oldName, new Contact(newName, newPhoneNumber, newEmailAddress));
                 break;
             case 5:
                 System.out.print("Enter name to delete: ");
                 String deleteName = scanner.nextLine();
                 contactManager.deleteContact(deleteName);
                 break;
             case 6:
                 System.out.println("Exiting...");
                 System.exit(0);
             default:
                 System.out.println("Invalid choice.");
         }
        
     }
 }
}
