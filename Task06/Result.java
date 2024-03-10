package Task06;

public class Result {
    private double min;
    private double max;
    private double average;

    // Конструктор класу
    public Result(double min, double max, double average) {
        this.min = min;
        this.max = max;
        this.average = average;
    }

    // Геттер для мінімального значення
    public double getMin() {
        return min;
    }

    // Сеттер для мінімального значення
    public void setMin(double min) {
        this.min = min;
    }

    // Геттер для максимального значення
    public double getMax() {
        return max;
    }

    // Сеттер для максимального значення
    public void setMax(double max) {
        this.max = max;
    }

    // Геттер для середнього значення
    public double getAverage() {
        return average;
    }

    // Сеттер для середнього значення
    public void setAverage(double average) {
        this.average = average;
    }

    // Перевизначений метод toString() для зручного виведення об'єкту
    @Override
    public String toString() {
        return "Result{" +
                "min=" + min +
                ", max=" + max +
                ", average=" + average +
                '}';
    }
}

