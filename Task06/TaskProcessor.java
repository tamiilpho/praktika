package Task06;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskProcessor {
    private final ExecutorService executorService;
    private final BlockingQueue<Task> taskQueue;

    public TaskProcessor(int numWorkers) {
        executorService = Executors.newFixedThreadPool(numWorkers);
        taskQueue = new LinkedBlockingQueue<>();
        initializeWorkers(numWorkers);
    }

    private void initializeWorkers(int numWorkers) {
        for (int i = 0; i < numWorkers; i++) {
            Worker worker = new Worker(taskQueue);
            executorService.submit(worker);
        }
    }

    public void submitTask(Task task) {
        try {
            taskQueue.put(task); // Додавання завдання до черги
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void shutdown() {
        executorService.shutdown();
    }
}

