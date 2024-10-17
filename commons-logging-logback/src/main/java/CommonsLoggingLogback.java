import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLoggingLogback {
    public static final Log logger = LogFactory.getLog(CommonsLoggingLogback.class);

    public static void main(String[] args) {
        logger.error("这是commons-logging和logback结合的例子");
    }
}
