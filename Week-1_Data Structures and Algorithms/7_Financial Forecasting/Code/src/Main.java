import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial amount: ");
        double initial = sc.nextDouble();
        System.out.print("Enter growth rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter years: ");
        int futureYears = sc.nextInt();

        double result = FinancialPredictor.forecast(initial, rate, futureYears);
        System.out.printf("Forecasted value after %d years: %.2f\n", futureYears, result);

        sc.close();
    }
}