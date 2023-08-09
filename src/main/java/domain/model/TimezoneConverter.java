package domain.model;

import java.time.LocalTime;

/**
 * Represents a TimezoneConverter interface used to convert time between different timezones.
 */
public interface TimezoneConverter {
    /**
     * Converts the given time from the source timezone to the target timezone.
     *
     * @param sourceTimezone Source timezone ID (e.g., "America/New_York").
     * @param targetTimezone Target timezone ID (e.g., "Asia/Tokyo").
     * @param localTime      Local time to be converted.
     * @return Formatted time in the target timezone.
     */
    String convertTimezone(String sourceTimezone, String targetTimezone, LocalTime localTime);
}
