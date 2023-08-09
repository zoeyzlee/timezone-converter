package factory;

import strategy.DefaultTimezoneConversionStrategy;
import strategy.TimezoneConversionStrategy;
import usecase.TimezoneConverter;
import usecase.TimezoneConverterImpl;

/**
 * Default implementation of TimezoneConverterFactory.
 */
public class DefaultTimezoneConverterFactory implements TimezoneConverterFactory {

    @Override
    public TimezoneConverter createTimezoneConverter() {
        // Create a TimezoneConversionStrategy instance (if applicable)
        TimezoneConversionStrategy strategy = new DefaultTimezoneConversionStrategy();

        // Pass the strategy to the TimezoneConverterImpl constructor
        return new TimezoneConverterImpl(strategy);
    }
}
