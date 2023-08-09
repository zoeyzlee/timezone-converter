// Test class for DefaultTimezoneConverterFactory
package factory;

import factory.DefaultTimezoneConverterFactory;
import org.junit.jupiter.api.Test;
import usecase.TimezoneConverter;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DefaultTimezoneConverterFactoryTest {

    @Test
    public void testCreateTimezoneConverter() {
        DefaultTimezoneConverterFactory factory = new DefaultTimezoneConverterFactory();
        TimezoneConverter converter = factory.createTimezoneConverter();

        assertNotNull(converter);
    }
}
