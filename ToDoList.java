import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();

        while (true) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View list");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String newItem = scanner.nextLine();
                    toDoList.add(newItem);
                    System.out.println("Item added to the list.");
                    break;
                case 2:
                    System.out.print("Enter the item to remove: ");
                    String itemToRemove = scanner.nextLine();
                    if (toDoList.remove(itemToRemove)) {
                        System.out.println("Item removed from the list.");
                    } else {
                        System.out.println("Item not found in the list.");
                    }
                    break;
                case 3:
                    System.out.println("\nTo-Do List:");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println((i + 1) + ". " + toDoList.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}