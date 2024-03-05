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
