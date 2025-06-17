public class test {
    public static void main(String[] args){
        //Logger newObj = new Logger(); // new instance can not be created
        Logger newObj = Logger.getInstance();
        Logger secObj = Logger.getInstance();
    }

}