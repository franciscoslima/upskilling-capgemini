package list01.singleton.logger;

import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Logger logger = LoggerSingleton.getLogger();

        logger.info("info message");
        logger.warning("warning message");
        logger.severe("severe message");
    }
}
