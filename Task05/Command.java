package Task05;

// Абстрактний клас команди
public abstract class Command {
    // Виконання команди
    public abstract void execute();

    // Скасування команди
    public abstract void undo();
}
