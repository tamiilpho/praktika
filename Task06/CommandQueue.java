package Task06;

import java.util.LinkedList;
import java.util.Queue;

public class CommandQueue {
    private final Queue<String> queue;

    public CommandQueue() {
        queue = new LinkedList<>();
    }

    public synchronized void enqueue(String command) {
        queue.add(command); // Додавання команди до черги
        notifyAll(); // Повідомлення про те, що нова команда доступна
    }

    public synchronized String dequeue() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // Очікування, якщо черга пуста
        }
        return queue.poll(); // Вилучення та повернення першої команди з черги
    }

    public synchronized boolean isEmpty() {
        return queue.isEmpty();
    }
}

