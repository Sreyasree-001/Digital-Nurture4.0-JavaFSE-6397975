public class Logger {
    private static Logger obj = null;

    private Logger(){
        System.out.println("Logger instance created ");
    }


    public static Logger getInstance(){
        if(obj==null){
            obj = new Logger();
        }
        return obj;
    }

    public void logDetails(String str){
        System.out.println(str);
    }
}
