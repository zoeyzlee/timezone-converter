// TimezoneConversionService.java
package usecase;

import java.time.ZoneId;

public interface TimezoneConversionService {
    ZoneId getTimezone(String timezoneId);
}
