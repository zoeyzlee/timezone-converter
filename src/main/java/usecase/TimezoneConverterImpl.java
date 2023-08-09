package usecase;

import strategy.TimezoneConversionStrategy;

import java.time.LocalTime;

public class TimezoneConverterImpl implements TimezoneConverter {
    private final TimezoneConversionStrategy strategy;

    public TimezoneConverterImpl(TimezoneConversionStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String convertTimezone(String sourceTimezone, String targetTimezone, LocalTime localTime) {
        return strategy.convertTimezone(sourceTimezone, targetTimezone, localTime);
    }
}
