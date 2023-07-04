import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);

        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);

        assertEquals(milesValue, rewardValue.getMilesValue());
     }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        int expectedMilesValue = (int) (cashValue / RewardValue.CASH_TO_MILES_CONVERSION_RATE);

        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 10000;
        var rewardValue = new RewardValue(miles);
        double expectedCashValue = miles * RewardValue.MILES_TO_CASH_CONVERSION_RATE;

        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}
