public class Logger {
    private static final Logger obj = new Logger();
    private static int count = 0;
    private Logger(){
        count++;
        System.out.println("Logger class created ");
        System.out.println("Count = "+count);
    }
    public static Logger getInstance(){
        return obj;
    }
}
//Eager initialization