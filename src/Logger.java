import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private final SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    protected static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        Date date = new Date(System.currentTimeMillis());
        System.out.println("[" + formatter.format(date) + " " + num++ + "] " + msg);
    }
}
