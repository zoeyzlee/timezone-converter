// Test class for DefaultTimezoneConversionStrategy
package strategy;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultTimezoneConversionStrategyTest {

    @Test
    public void testConvertTimezone() {
        DefaultTimezoneConversionStrategy strategy = new DefaultTimezoneConversionStrategy();

        String sourceTimezone = "America/New_York";
        String targetTimezone = "Asia/Tokyo";
        LocalTime localTime = LocalTime.of(15, 30, 0);

        String convertedTime = strategy.convertTimezone(sourceTimezone, targetTimezone, localTime);
        assertEquals("04:30 AM", convertedTime);
    }
}
