// Test class for DefaultTimezoneConverterFactory
package factory;

import org.junit.jupiter.api.Test;
import domain.model.TimezoneConverter;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DefaultTimezoneConverterFactoryTest {

    @Test
    public void testCreateTimezoneConverter() {
        DefaultTimezoneConverterFactory factory = new DefaultTimezoneConverterFactory();
        TimezoneConverter converter = factory.createTimezoneConverter();

        assertNotNull(converter);
    }
}
