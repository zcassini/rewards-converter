
public class RewardValue {
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    public static final double CASH_TO_MILES_CONVERSION_RATE = 0.0035;

    private final double cashValue;
    
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        cashValue = convertMilesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertCashToMiles(cashValue);
    }

    private static int convertCashToMiles(double cashValue) {
        return (int) (cashValue / CASH_TO_MILES_CONVERSION_RATE);
    }

    private static double convertMilesToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }
}
