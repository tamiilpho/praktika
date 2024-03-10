package Task06;

import java.util.concurrent.BlockingQueue;

public class Worker implements Runnable {
    private final BlockingQueue<Task> taskQueue;

    public Worker(BlockingQueue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Task task = taskQueue.take(); // Очікування завдання з черги
                task.execute(); // Виконання завдання
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

