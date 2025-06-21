public class test {
    public static void main(String[] args){
        //Logger newObj = new Logger(); // new instance can not be created
        Logger obj1 = Logger.getInstance();
        System.out.println("Object1 hashcode: "+obj1.hashCode());

        Logger obj2 = Logger.getInstance();
        System.out.println("Object2 hashcode: "+obj2.hashCode());

        if (obj1.equals(obj2)) {
            System.out.println("Both logger instances are the same (singleton confirmed).");
        } else {
            System.out.println("Logger instances are different (singleton failed).");
        }
    }

}