import java.util.Scanner;

public class test {
    //client
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        PaymentProcessor paypalPayment = new PaypalAdapter(new PaypalGateway());
        PaymentProcessor razorpayPayment = new RazorpayAdapter(new RazorpayGateway());
        PaymentProcessor amazonpayPayment = new AmazonpayAdapter(new AmazonpayGateway());

        System.out.print("Enter amount for Paypal payment: ");
        double amt1 = sc.nextDouble();
        System.out.print("Enter amount for Paypal payment: ");
        double amt2 = sc.nextDouble();
        System.out.print("Enter amount for Paypal payment: ");
        double amt3 = sc.nextDouble();

        paypalPayment.processPayment(amt1);
        razorpayPayment.processPayment(amt2);
        amazonpayPayment.processPayment(amt3);

        sc.close();
    }

}
