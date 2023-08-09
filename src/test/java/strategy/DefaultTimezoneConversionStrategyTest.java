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

    @Test
    public void testUniqueTimezone() {
        DefaultTimezoneConversionStrategy strategy = new DefaultTimezoneConversionStrategy();

        // Normal conversion
        assertEquals("10:30 PM", strategy.convertTimezone("America/Los_Angeles", "Europe/London", LocalTime.of(18, 30, 0)));

        // Edge case: Midnight conversion
        assertEquals("05:00 AM", strategy.convertTimezone("Asia/Kolkata", "Pacific/Auckland", LocalTime.of(0, 30, 0)));

        // Edge case: Noon conversion
        assertEquals("06:00 AM", strategy.convertTimezone("Australia/Sydney", "Asia/Tokyo", LocalTime.of(12, 0, 0)));
    }
}
