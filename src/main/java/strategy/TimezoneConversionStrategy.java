package strategy;

import java.time.LocalTime;

public interface TimezoneConversionStrategy {
    String convertTimezone(String sourceTimezone, String targetTimezone, LocalTime localTime);
}

