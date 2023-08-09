// Test class for TimezoneConverter
package usecase;

import domain.model.TimezoneConverter;
import org.junit.jupiter.api.Test;
import domain.model.TimezoneConversionStrategy;

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

    @Test
    public void testUniqueTimezone() {
        TimezoneConversionStrategy strategy = new DefaultTimezoneConversionStrategy();
        TimezoneConverter converter = new TimezoneConverterImpl(strategy);

        // Convert from "America/New_York" to "Europe/London"
        assertEquals("08:30 PM", converter.convertTimezone("America/New_York", "Europe/London", LocalTime.of(15, 30, 0)));

        // Convert from "Asia/Tokyo" to "Australia/Sydney"
        assertEquals("07:30 AM", converter.convertTimezone("Asia/Tokyo", "Australia/Sydney", LocalTime.of(10, 30, 0)));

        // Convert from "Europe/Paris" to "America/Los_Angeles"
        assertEquals("06:30 AM", converter.convertTimezone("Europe/Paris", "America/Los_Angeles", LocalTime.of(12, 30, 0)));
    }
}
