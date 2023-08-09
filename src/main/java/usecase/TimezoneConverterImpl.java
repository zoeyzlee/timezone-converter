package usecase;

import strategy.TimezoneConversionStrategy;

import java.time.LocalTime;

/**
 * Implementation of TimezoneConverter interface using a specified strategy.
 */
public class TimezoneConverterImpl implements TimezoneConverter {
    private final TimezoneConversionStrategy strategy;

    /**
     * Creates a TimezoneConverterImpl instance with a specified strategy.
     *
     * @param strategy Timezone conversion strategy to be used.
     */
    public TimezoneConverterImpl(TimezoneConversionStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String convertTimezone(String sourceTimezone, String targetTimezone, LocalTime localTime) {
        return strategy.convertTimezone(sourceTimezone, targetTimezone, localTime);
    }
}
