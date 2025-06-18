public class FinancialPredictor {
    // Recursive method
    public static double forecast(double initialValue, double growthRate, int years) {

        if (years == 0) {
            return initialValue;
        }

        return forecast(initialValue, growthRate, years - 1) * (1 + growthRate);
    }
}
