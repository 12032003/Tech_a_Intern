/*import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber + ", Email: " + email;
    }
}

public class L1_task2 {
    private ArrayList<Contact> contacts;

    public L1_task2() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found!");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void searchContacts(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println(contact);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Contact not found!");
        }
    }

    public void deleteContact(String name) {
        boolean removed = false;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                contacts.remove(i);
                System.out.println("Contact deleted successfully!");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Contact not found!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        L1_task2 addressBook = new L1_task2();

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add new contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Search for a contact");
            System.out.println("4. Delete a contact");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = input.nextLine();
                    System.out.print("Enter email address: ");
                    String email = input.nextLine();
                    Contact contact = new Contact(name, phoneNumber, email);
                    addressBook.addContact(contact);
                    break;
                case 2:
                    addressBook.displayContacts();
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = input.nextLine();
                    addressBook.searchContacts(searchName);
                    break;
                case 4:
                    System.out.print("Enter name to delete: ");
                    String deleteName = input.nextLine();
                    addressBook.deleteContact(deleteName);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
*/