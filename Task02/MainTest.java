package Task02;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введіть силу струму (A): ");
            double current = scanner.nextDouble();

            System.out.println("Введіть значення напруги першого провіднику  (V): ");
            double voltage1 = scanner.nextDouble();

            System.out.println("Введіть значення напруги другого провіднику (V): ");
            double voltage2 = scanner.nextDouble();

            System.out.println("Enter voltage on the третього conductor (V): ");
            double voltage3 = scanner.nextDouble();

            double totalRes = calculateTotalRes(current, voltage1, voltage2, voltage3);

            System.out.println("Загальний опір: " + totalRes);

            String octalRepresentation = Integer.toOctalString((int) totalRes);
            System.out.println("8-річне уявлення загального опору: " + octalRepresentation);

            String hexRepresentation = Integer.toHexString((int) totalRes);
            System.out.println("16-річне уявлення загального опору: " + hexRepresentation);
        }
    }

    public static double calculateTotalRes(double current, double voltage1, double voltage2, double voltage3) {
        double resistance1 = voltage1 / current;
        double resistance2 = voltage2 / current;
        double resistance3 = voltage3 / current;

        return resistance1 + resistance2 + resistance3;
    }
}

