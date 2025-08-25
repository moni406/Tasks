package javafilehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Task8 {
    private static final String FILE_NAME = "contacts.txt";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contact> contacts = loadContacts();
        while (true) {
            System.out.println("Contact Manager");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
            case 1:
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter phone number: ");
                String phoneNumber = scanner.nextLine();
                contacts.add(new Contact(name, phoneNumber));
                saveContacts(contacts);
                break;
            case 2:
                displayContacts(contacts);
                break;
            case 3:
                System.out.print("Enter name to search: ");
                String searchName = scanner.nextLine();
                searchContact(contacts, searchName);
                break;
            case 4:
                System.out.println("Exiting...");
                scanner.close();
                return;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
}
    private static List<Contact> loadContacts() {
        List<Contact> contacts = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    contacts.add(new Contact(parts[0], parts[1]));
                }
            }
        } catch (IOException e) {
            System.out.println("No existing contacts found. Starting fresh.");
        }
        return contacts;
    }
    private static void saveContacts(List<Contact> contacts) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Contact contact : contacts) {
                bw.write(contact.getName() + "," + contact.getPhoneNumber());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }
    private static void displayContacts(List<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        System.out.println("Contacts:");
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName() + ", Phone: " + contact.getPhoneNumber());
        }
    }
    private static void searchContact(List<Contact> contacts, String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Found: Name: " + contact.getName() + ", Phone: " + contact.getPhoneNumber());
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}
class Contact {
    private String name;
    private String phoneNumber;
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}