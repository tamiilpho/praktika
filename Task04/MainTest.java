package Task04;

import java.util.Scanner;

public class MainTest {
    private static double totalRes;
    private static String octalRepresentation;
    private static String hexRepresentation;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char command;
        do {
            System.out.println("Enter command...");
            System.out.println("'q'uit, 'v'iew, 'g'enerate, 's'ave, 'r'estore:");
            command = scanner.next().charAt(0);

            switch (command) {
                case 'v':
                    viewCurrent();
                    break;
                case 'g':
                    generateRandom();
                    break;
                case 's':
                    saveCurrent();
                    break;
                case 'r':
                    restoreLastSaved();
                    break;
                case 'q':
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        } while (command != 'q');

        scanner.close();
    }

    public static void viewCurrent() {
        System.out.println("View current:");
        System.out.println("-------------------------------------");
        System.out.printf("| %-20s | %-15s |\n", "Total resistance:", totalRes);
        System.out.printf("| %-20s | %-15s |\n", "Octal representation:", octalRepresentation);
        System.out.printf("| %-20s | %-15s |\n", "Hexadecimal representation:", hexRepresentation);
        System.out.println("-------------------------------------");
    }

    public static void generateRandom() {
        System.out.println("Random generation:");
        // Generate random values for totalRes, octalRepresentation, and hexRepresentation
        totalRes = Math.random() * 100; // Replace this with your actual generation logic
        octalRepresentation = Integer.toOctalString((int) totalRes);
        hexRepresentation = Integer.toHexString((int) totalRes);
        System.out.println("Total resistance generated: " + totalRes);
    }

    public static void saveCurrent() {
        System.out.println("Save current:");
        // Saving the current values of totalRes, octalRepresentation, and hexRepresentation
    }

    public static void restoreLastSaved() {
        System.out.println("Restore last saved:");
        // Restore the last saved values
        // Here, you would typically retrieve the previously saved values
        // and assign them to totalRes, octalRepresentation, and hexRepresentation
        // For demonstration purposes, let's just print the previously saved values
        System.out.println("Total resistance restored: " + totalRes);
        System.out.println("Octal representation: " + octalRepresentation);
        System.out.println("Hexadecimal representation: " + hexRepresentation);
    }
}
