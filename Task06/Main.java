package Task06;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Double> data = generateData(); // Генерація випадкових даних

        // Паралельне обчислення мінімуму, максимуму та середнього значення
        double min = data.parallelStream().min(Double::compare).orElse(0.0);
        double max = data.parallelStream().max(Double::compare).orElse(0.0);
        double average = data.parallelStream().mapToDouble(Double::doubleValue).average().orElse(0.0);

        // Паралельний відбір за критерієм (наприклад, значення більше 50)
        List<Double> filteredData = data.parallelStream().filter(d -> d > 50).collect(Collectors.toList());

        // Виведення результатів
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + average);
        System.out.println("Filtered Data: " + filteredData);
    }

    // Метод для генерації випадкових даних
    private static List<Double> generateData() {
        return Stream.generate(Math::random)
                .limit(100)
                .map(d -> d * 100) // Обмеження значень від 0 до 100
                .collect(Collectors.toList());
    }
}

