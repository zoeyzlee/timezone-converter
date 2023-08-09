// Test class for TimezoneClockConverterApp
package app;

import main.TimezoneClockConverterApp;
import factory.DefaultTimezoneConverterFactory;
import factory.TimezoneConverterFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import domain.model.TimezoneConverter;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimezoneClockConverterAppTest {

    private InputStream originalSystemIn;

    @BeforeEach
    public void setUp() {
        originalSystemIn = System.in;
    }

    @Test
    public void testRun() {
        String input = "America/New_York\nAsia/Tokyo\n15:30:00\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> {
            TimezoneConverterFactory factory = new DefaultTimezoneConverterFactory();
            TimezoneConverter converter = factory.createTimezoneConverter();

            TimezoneClockConverterApp app = new TimezoneClockConverterApp(converter);
            app.run();
        });
    }

    @Test
    public void testUniqueRun() {
        String input = "America/Los_Angeles\nEurope/London\n18:30:00\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> {
            TimezoneConverterFactory factory = new DefaultTimezoneConverterFactory();
            TimezoneConverter converter = factory.createTimezoneConverter();

            TimezoneClockConverterApp app = new TimezoneClockConverterApp(converter);
            app.run();
        });
    }
}
