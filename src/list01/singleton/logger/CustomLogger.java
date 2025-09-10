package list01.singleton.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomLogger {

    private static final String LOG_FILE = "application.log";
    private final PrintWriter writer;

    private CustomLogger() {
        try {
            FileWriter fw = new FileWriter(LOG_FILE, true);
            this.writer = new PrintWriter(fw, true);
        } catch (IOException e) {
            throw new RuntimeException("Failed to open log file", e);
        }
    }

    private static class Holder {
        private static final CustomLogger INSTANCE = new CustomLogger();
    }

    public static CustomLogger getInstance() {
        return Holder.INSTANCE;
    }

    public enum LogLevel {
        INFO, WARN, DEBUG, ERROR
    }

    private void log(LogLevel level, String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        String logMessage = String.format("[%s] [%s] %s", timestamp, level, message);

        writer.println(logMessage);
        System.out.println(logMessage);
    }

    public void info(String message) {
        log(LogLevel.INFO, message);
    }

    public void warn(String message) {
        log(LogLevel.WARN, message);
    }

    public void error(String message) {
        log(LogLevel.ERROR, message);
    }

    public void debug(String message) {
        log(LogLevel.DEBUG, message);
    }
}
