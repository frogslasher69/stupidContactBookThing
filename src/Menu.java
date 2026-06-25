import java.util.Scanner;

public class Menu {

private static boolean isRunning = true;

    public static void main(String[] args) {

        ContactBook contactBook = new ContactBook();

        while (isRunning) {
            runMainloop();
        }
    }

    public static void runMainloop() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Add Contact");
        System.out.println("2. Display Saved Contacts");
        System.out.println("3. Search Contact");
        System.out.println("4. Remove Contact");
        System.out.println("5. Exit");

        int userInput = scanner.nextInt();

        switch (userInput) {

            case 1:
                System.out.print("Contact name: ");
            case 2:
                System.out.print("Displaying saved contacts: ");
            case 3:
                System.out.print("Contact name: ");
            case 4:
                System.out.print("Contact name: ");
            case 5:
                System.out.print("Contact name: ");
        }

    }


}
