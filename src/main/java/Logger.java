import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    public static Logger logger;
    protected int num = 1;

    private Logger(){}

    public static Logger getLogger(){
        if (logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println("["+ formater.format(date) + " " + num++ + "] " + msg);
    }

}
