package usecase;

import domain.model.TimezoneConversionStrategy;

import java.time.LocalTime;

/**
 * A default implementation of the TimezoneConversionStrategy interface.
 * This strategy converts a given local time from the source timezone to the target timezone.
 */
public class DefaultTimezoneConversionStrategy implements TimezoneConversionStrategy {

    /**
     * Converts a given local time from the source timezone to the target timezone.
     *
     * @param sourceTimezone The source timezone identifier.
     * @param targetTimezone The target timezone identifier.
     * @param localTime      The local time to be converted.
     * @return The converted local time in the target timezone.
     */
    @Override
    public String convertTimezone(String sourceTimezone, String targetTimezone, LocalTime localTime) {
        // Implement the timezone conversion logic here
        // ...

        // For demonstration purposes, let's assume a simple conversion
        String convertedTime = localTime.toString() + " " + targetTimezone;

        return convertedTime;
    }
}
