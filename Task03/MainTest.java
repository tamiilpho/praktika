package Task03;

public class MainTest {
    public static void main(String[] args) {
        // Створюємо фабрику для створення тіл
        BodyFactory factory = new ConBodyFact();
        
        // Параметри для створення тіла
        double current = 10.0;
        double voltage1 = 20.0;
        double voltage2 = 30.0;
        double voltage3 = 40.0;
        
        // Створюємо тіло за допомогою фабрики
        Main body = factory.createBody(current, voltage1, voltage2, voltage3);
        
        // Виводимо результати
        System.out.println("Body created:");
        System.out.println(body);
        
        // Перевіряємо, чи об'єкт реалізує інтерфейс Displayable
        if (body instanceof Displayable) {
            // Якщо так, виводимо результати викликом методу displayResults()
            System.out.println("\nDisplaying results:");
            ((Displayable) body).displayResults();
        } else {
            System.out.println("\nObject does not implement Displayable interface.");
        }
    }
}