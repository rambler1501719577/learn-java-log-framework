import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonLoggingLog4j {
    public static final Log log = LogFactory.getLog(CommonLoggingLog4j.class);

    public static void main(String[] args) {
        log.debug("这个是CommonsLogging和Log4j结合的例子");
    }
}
