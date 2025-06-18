public class Main {
    public static void main(String[] args){
        double initial = 10000;
        double rate = 0.05;
        int futureYears = 5;

        double result = FinancialPredictor.forecast(initial, rate, futureYears);
        System.out.printf("Forecasted value after %d years: %.2f\n", futureYears, result);

    }
}