package homework32;

/**
 * Java Professional Homework #32
 *
 * @author Artysh
 * @version 06.03 - 09.03
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Homework32 {
    private static final Logger LOGGER = LogManager.getLogger(Homework32.class);

    public static void main(String[] args) {
        LOGGER.fatal("This is a log fatal");
        LOGGER.error("This is a log error");
        LOGGER.warn("This is a log warn");
        LOGGER.info("log info: {}", "Hello, world");
        LOGGER.debug("This is a log debug");
    }
}
