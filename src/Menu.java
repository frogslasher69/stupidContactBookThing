import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;

public class Menu {


    public static void main(String[] args) throws InterruptedException {

        Menu menu = new Menu();
        ContactBook contactBook = new ContactBook();

        menu.runMainloop(contactBook);
    }

    public void runMainloop(ContactBook contactBook) throws InterruptedException {

        boolean loadingScreen = false;

        boolean isRunning = true;

        while (isRunning) {
            Scanner scanner = new Scanner(System.in);



            if (!loadingScreen)

            {

                System.out.print("Loading...");


                Thread.sleep(500);



                for (int i = 0 ; i <= 100 ; i++) {
                    System.out.print("\r" + "=".repeat(i) + ">" + i + "%");
                    Thread.sleep(25);
                }


                System.out.println();
                loadingScreen = true;
            }



            System.out.println("1. Add Contact");
            System.out.println("2. Display Saved Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Remove Contact");
            System.out.println("5. Exit");

            int userInput = scanner.nextInt();

            scanner.nextLine();

            switch (userInput) {

                // Add Contact
                case 1:

                    ArrayList<String> contactDetails = new ArrayList<>();

                    System.out.print("Contact name: ");
                    String name = scanner.nextLine();

                    if (!contactDetails.add(name)) {
                        System.out.println("Contact already exists");
                        break;
                    }

                    System.out.print("Contact Address: ");
                    String address = scanner.nextLine();

                    contactDetails.add(address);


                    System.out.print("Favourite food: ");
                    String food = scanner.nextLine();

                    contactDetails.add(food);




                    contactBook.addContact(name, contactDetails);
                    System.out.println("Contact (" + name + ") succesfully added.");
                    break; // exit loop to allow for another option


                // Display all contacts
                case 2:
                    System.out.println("Displaying saved contacts: ");
                    System.out.println(contactBook.getAllContacts());

                    break;


                // Search contact
                case 3:
                    System.out.println("Contact name: ");
                    name = scanner.nextLine();

                    if (contactBook.getContact(name) == null) {
                        System.out.println("Contact not found");
                        break;
                    }

                    System.out.println(name + "'s details: ");


                    for (String i : contactBook.getContact(name)) {
                        System.out.println(i);
                    }

                    break;

                // Remove Contact
                case 4:
                    System.out.print("Contact name: ");
                    name = scanner.nextLine();
                    contactBook.removeContact(name);

                // Exit out of interface
                case 5:
                    System.out.print("Exiting interface...");

                    Random random = new Random();


                    Thread.sleep(300);
                    for (int i = 0 ; i <= 100 ; i++) {
                        System.out.print("\r" + "=".repeat(i) + ">" + i + "%");
                        Thread.sleep(100);
                    }


                    isRunning = false;
                    break;


                default:
                    System.out.println("Invalid number bro");
            }

        }

    }


}
