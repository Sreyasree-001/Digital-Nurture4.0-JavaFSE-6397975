public class test {
    public static void main(String[] args){
        //Logger newObj = new Logger(); // new instance can not be created
        Logger Obj1 = Logger.getInstance();
        Logger Obj2 = Logger.getInstance();

        if (Obj1 == Obj2) {
            System.out.println("Both logger instances are the same (singleton confirmed).");
        } else {
            System.out.println("Logger instances are different (singleton failed).");
        }
    }

}