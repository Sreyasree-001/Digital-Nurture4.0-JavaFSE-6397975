public class test {
    //client
    public static void main(String[] args){

        PaymentProcessor paypalPayment = new PaypalAdapter(new PaypalGateway());
        PaymentProcessor razorpayPayment = new RazorpayAdapter(new RazorpayGateway());
        PaymentProcessor amazonpayPayment = new AmazonpayAdapter(new AmazonpayGateway());

        paypalPayment.processPayment(10000);
        razorpayPayment.processPayment(5000);
        amazonpayPayment.processPayment(8000);
    }

}
