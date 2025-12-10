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
            System.out.println("Press 5 to search for a child by name 👧🏽 . ");
            System.out.println("Press 6 to leave 🚪. ");
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
                    if (santaQueue.isEmpty()) {
                        System.out.println("The queue is empty!");
                    } else {
                        for (Child c : santaQueue) {
                            System.out.println(c);
                            System.out.println("\n");
                        }
                    }
                    break;
                case 3:
                    Child nextChild = santaQueue.peek();
                    if (nextChild != null) {
                        System.out.println("The next child in Santa's Queue is: " + nextChild);
                    } else {
                        System.out.println("\nThe queue is empty!");
                    }
                    break;
                case 4:
                    Child deliveredChild = santaQueue.poll();
                    if (deliveredChild != null) {
                        System.out.println("Santa has already given the present to: " + deliveredChild.getName());
                        System.out.println("They have been removed from the queue.");
                    } else {
                        System.out.println("The queue is empty! No child to remove.");
                    }
                    break;
                case 5:
                    System.out.println("What is the name of the child that you are looking for?");
                    String findChild = scanner.nextLine();
                    for (Child c : santaQueue) {
                        if (c.getName().equals(findChild)) {
                            System.out.println(findChild + " has been found! ");
                        } else {
                            System.out.println(findChild + " has not been found.");
                        }
                    }
                    break;
                case 7:
                    running = false;
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 6.");
                    break;
            }
        }
        scanner.close();
    }
}