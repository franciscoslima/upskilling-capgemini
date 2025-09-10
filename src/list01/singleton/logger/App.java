package list01.singleton.logger;

import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {

        CustomLogger logger = CustomLogger.getInstance();

        logger.info("Info Message");
        logger.debug("Debug Message");
        logger.error("Error Message");
        logger.warn("Warn Message");
    }
}
