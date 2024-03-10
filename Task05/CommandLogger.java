package Task05;

import java.util.ArrayList;
import java.util.List;

// Клас для ведення журналу команд
public class CommandLogger {
    private static CommandLogger instance;
    private List<Command> commandHistory;

    private CommandLogger() {
        commandHistory = new ArrayList<>();
    }

    // Реалізація Singleton
    public static synchronized CommandLogger getInstance() {
        if (instance == null) {
            instance = new CommandLogger();
        }
        return instance;
    }

    // Додавання команди до журналу
    public void logCommand(Command command) {
        commandHistory.add(command);
    }

    // Скасування останньої команди
    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }

    // Виконання макрокоманди
    public void executeMacroCommand(List<Command> macroCommands) {
        for (Command command : macroCommands) {
            command.execute();
        }
    }

    // Очищення журналу команд
    public void clearCommandHistory() {
        commandHistory.clear();
    }
}
