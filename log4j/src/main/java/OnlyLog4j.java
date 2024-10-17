import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OnlyLog4j {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(OnlyLog4j.class);
        logger.info("Hello World");
    }
}
