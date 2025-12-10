import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Child> santaQueue = new LinkedList<>();
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Santa's Workshop!!");
        while (running) {
            System.out.println("Press 1 to add a child to Santa's Queue 🎅🏽. ");
            System.out.println("Press 2 to display the full list of the children waiting 🎁.");
            System.out.println("Press 3 to show the next child Santa will process 👧🏽.");
            System.out.println("Press 4 to remove a child from the queue when Santa has delivered the present 💝!!!");
            System.out.println("Press 5 to leave 🚪. ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the child's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter child's address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter child's present: ");
                    String present = scanner.nextLine();
                    System.out.print("Enter if the child is nice (true/false): ");
                    boolean isNice = scanner.nextBoolean();
                    Child child = new Child(name, address, present, isNice);
                    santaQueue.offer(child);
                    System.out.println("\n" + child.getName() + " has been added to the queue!");
                    break;
                case 2:
                    System.out.println(santaQueue);
                    break;
                case 3:
                    Child nextChild = santaQueue.peek();
                    if (nextChild != null) {
                        System.out.println("The next child on the list is: " + nextChild);
                    } else {
                        System.out.println("\nThe queue is empty!");
                    }
                    break;
                case 4:
                    Child foundChild = santaQueue.poll();
                    System.out.println("Santa has delivered " + foundChild + "present!");
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for managing Santa's Workshop. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        }
        scanner.close();
    }
}