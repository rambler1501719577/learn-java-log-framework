import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLogback {
    public final static Logger logger = LoggerFactory.getLogger(Slf4jLogback.class);

    public static void main(String[] args) {
        logger.debug("Slf4j和原生实现logback结合的例子");
    }
}
