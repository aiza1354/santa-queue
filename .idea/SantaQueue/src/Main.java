import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Main() {
    public static void main(String[] args) {
        Queue<Child> santaQueue = new LinkedList<Child>();
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        Child child1 = new Child("Aiza", "Reading", "iPhone 25", true);
        Child child2 = new Child("Rukhsar", "Reading", "iPhone 25", true);
        Child child3 = new Child("Shahzad", "Reading", "iPhone 25", true);
        Child child4 = new Child("Imaan", "Reading", "iPhone 25", true);
        Child child5 = new Child("Aamna", "Reading", "iPhone 25", true);
        System.out.println("Santa's Workshop!!");
        while (running) {
            System.out.println("Press 1 to add a child to Santa's Queue 🎅🏽. ");
            System.out.println("Press 2 to display the full list of the children waiting 🎁.");
            System.out.println("Press 3 to show the next child Santa will process 👧🏽.");
            System.out.println("Pres 4 to remove a child from the queue when Santa has delivered the present 💝!!!");
            System.out.println("Press 5 to leave 🚪. ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    santaQueue.add(child1);
                    System.out.println(child1.getName() + " has been added to the queue!");
                    break;
            }
        }
    }
}