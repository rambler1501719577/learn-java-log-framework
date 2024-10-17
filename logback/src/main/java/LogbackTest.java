import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {

    public static void main(String[] args) {
        // logback是slf4j的默认实现， 在logback-classic依赖中导入了slf4j，默认门户就是slf4j
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);
        logger.info("这是logback原生实现，默认使用slf4j作为门户");
    }
}
