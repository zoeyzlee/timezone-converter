// Test class for TimezoneConverter
package usecase;

import org.junit.jupiter.api.Test;
import strategy.DefaultTimezoneConversionStrategy;
import strategy.TimezoneConversionStrategy;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimezoneConverterTest {

    @Test
    public void testConvertTimezone() {
        TimezoneConversionStrategy strategy = new DefaultTimezoneConversionStrategy();
        TimezoneConverter converter = new TimezoneConverterImpl(strategy);

        String sourceTimezone = "America/New_York";
        String targetTimezone = "Asia/Tokyo";
        LocalTime localTime = LocalTime.of(15, 30, 0);

        String convertedTime = converter.convertTimezone(sourceTimezone, targetTimezone, localTime);
        assertEquals("04:30 AM", convertedTime);
    }
}
