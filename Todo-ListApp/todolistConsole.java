/*Initialize  */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Started? Yessir ' github.com/Watthayanuraks/ '
 */
public class todolistConsole {
    
    //List save at command
    private static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        // 1st loop for displayed menu and get output  
        while (true) {
            showMenu();
            command = scanner.nextLine();
            handleCommand(command, scanner);
        }
    }

    /**
     * Menu
     */
    private static void showMenu() {
        System.out.println("========================================================");
        System.out.println("\nTo-Do List Application");
        System.out.println("1. View Tasks");
        System.out.println("2. Add Task");
        System.out.println("3. Edit Task");
        System.out.println("4. Remove Task");
        System.out.println("5. Exit");
        System.out.println("========================================================");
        System.out.print("Enter your choice: ");

    }

    /**
     * Keep command user
     */
    private static void handleCommand(String command, Scanner scanner) {
        switch (command) {
            case "1":
                viewTasks();
                break;
            case "2":
                addTask(scanner);
                break;
            case "3":
                editTask(scanner);
                break;
            case "4":
                removeTask(scanner);
                break;
            case "5":
                System.out.println("Exiting...");
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    /**
     * Show the list / task 
     */
    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    /**
     * Add list / task 
     */
    private static void addTask(Scanner scanner) {
        System.out.print("Enter task description: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added.");
    }

    /**
     * Edited any task or list 
     */
    private static void editTask(Scanner scanner) {
        viewTasks();
        System.out.print("Enter task number to edit: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index >= 0 && index < tasks.size()) {
            System.out.print("Enter new description: ");
            String newDescription = scanner.nextLine();
            tasks.set(index, newDescription);
            System.out.println("Task updated.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    /**
     * Delete task from list 
     */
    private static void removeTask(Scanner scanner) {
        viewTasks();
        System.out.print("Enter task number to remove: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
