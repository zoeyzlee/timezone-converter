package usecase;

import java.time.LocalTime;

public interface TimezoneConverter {
    String convertTimezone(String sourceTimezone, String targetTimezone, LocalTime localTime);
}
