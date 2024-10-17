import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLog4j {
    static Logger logger = LoggerFactory.getLogger(Slf4jLog4j.class);

    public static void main(String[] args) {
        logger.info("Slf4j作为门户， Log4j2作为实现");
    }
}
