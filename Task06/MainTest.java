package Task06;

import java.util.Scanner;

public class MainTest {
    private static double totalRes;
    private static double previousTotalRes;
    private static String octalRepresentation;
    private static String previousOctalRepresentation;
    private static String hexRepresentation;
    private static String previousHexRepresentation;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char command;
        do {
            System.out.println("Enter command...");
            System.out.println("'q'uit, 'v'iew, 'g'enerate, 's'ave, 'r'estore, 'u'ndo:");
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
                case 'u':
                    undo();
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
        // Спершу збережемо попередні значення
        previousTotalRes = totalRes;
        previousOctalRepresentation = octalRepresentation;
        previousHexRepresentation = hexRepresentation;

        // Генерація нових випадкових значень
        totalRes = Math.random() * 100;
        octalRepresentation = Integer.toOctalString((int) totalRes);
        hexRepresentation = Integer.toHexString((int) totalRes);

        System.out.println("Total resistance generated: " + totalRes);
    }

    public static void saveCurrent() {
        System.out.println("Save current:");
        // Збереження поточних значень
    }

    public static void restoreLastSaved() {
        System.out.println("Restore last saved:");
        // Відновлення попередніх значень
        totalRes = previousTotalRes;
        octalRepresentation = previousOctalRepresentation;
        hexRepresentation = previousHexRepresentation;

        System.out.println("Total resistance restored: " + totalRes);
        System.out.println("Octal representation: " + octalRepresentation);
        System.out.println("Hexadecimal representation: " + hexRepresentation);
    }

    public static void undo() {
        System.out.println("Undo operation:");
        // Відміна останньої операції, відновлення попередніх значень
        totalRes = previousTotalRes;
        octalRepresentation = previousOctalRepresentation;
        hexRepresentation = previousHexRepresentation;

        System.out.println("Undo successful!");
    }
}
