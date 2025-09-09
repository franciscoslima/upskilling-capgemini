package list01.singleton.logger;

import java.util.logging.Logger;

public class LoggerSingleton {

    private static final Logger logger = Logger.getLogger("LoggerSingleton");

    private LoggerSingleton() {}

    public static Logger getLogger() {
        return logger;
    }
}
