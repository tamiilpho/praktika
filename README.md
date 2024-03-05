# Практика
____
### Завдання 1
Для першого завдання було створено папку Task01, в ній розміщено файл Main.java. В файлі створена проста консольна програма для обчислення Площі конуса.

Код програми:

![Зобр1](img/image.png)

Результат роботи програми:

![Зобр2](img/image-1.png)

____
### Завдання 2
Для другого завдання потрібно виконати три пункти.

#### 1.
Розробити клас, що серіалізується, для зберігання параметрів і результатів обчислень. Використовуючи агрегування, розробити клас для знаходження рішення задачі.

Для цього, я створила папку і файл Main. java

Код програми:
package Task02;

import java.io.Serializable;

/**
 * Клас, що представляє фізичне тіло
 */
public class Main implements Serializable{
    private double current;
    private double voltage1;
    private double voltage2;
    private double voltage3; 
    
    /**
     * Конструктор, який приймає значення струму, та напругу кожного провідника
     * @param current постійний струм
     * @param voltage1 напруга першого провідника
     * @param voltage2 напруга другого провідника
     * @param voltage3 напруга третього провідника
     */ 
    public Main(double current, double voltage1, double voltage2, double voltage3){
        this.current = current;
        this.voltage1 = voltage1;
        this.voltage2 = voltage2;
        this.voltage3 = voltage3;    
}
    /**
     * Метод для отримання значення постійного струму
     * @return постійний струм
     */
    public double getCurrent(){
        return current;
    }

    /**
     * Метод для отримання значення напруги 1-го провідника
     * @return напруга 1-го провідника
     */
    public double getVoltage1(){
        return voltage1;   
    }
    
    /**
     * Метод для отримання значення напруги 2-го провідника
     * @return напруга 2-го провідника
     */
    public double getVoltage2(){
        return voltage2;
    }

    /**
     * Метод для отримання значення напруги 2-го провідника
     * @return напруга 2-го провідника
     */
    public double getVoltage3(){
        return voltage3;
    }
}

#### 2.
Розробити клас для демонстрації в діалоговому режимі збереження та відновлення стану об'єкта, використовуючи серіалізацію. Показати особливості використання transient полів.

Для цього було створено файл Calc.java

Код програми:
package Task02;

import java.io.Serializable;

/**
 * Клас, що представляє фізичне тіло
 */
public class Calc implements Serializable {
    private double resistance1;
    private double resistance2;
    private double resistance3;

    /**
     * Конструктор класу Calc для ініціалізації опорів провідників
     * @param resistance1 Опір першого провідника
     * @param resistance2 Опір другого провідника
     * @param resistance3 Опір третього провідника
     */
    public Calc(double resistance1, double resistance2, double resistance3) {
        this.resistance1 = resistance1;
        this.resistance2 = resistance2;
        this.resistance3 = resistance3;
    }

    /**
     * Метод для обчислення загального опору трьох послідовно з'єднаних провідників
     * @return Загальний електричний опір
     */
    public double calcTotalRes() {
        return resistance1 + resistance2 + resistance3;
    }
}

#### 3.
Розробити клас для тестування коректності результатів обчислень та серіалізації/десеріалізації.

Для цього пункту створено MainTest.java

Код програми:

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

Результат роботи програми:

![Зобр4](img/4.png4.png)