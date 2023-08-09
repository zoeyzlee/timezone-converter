package strategy;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DefaultTimezoneConversionStrategy implements TimezoneConversionStrategy {

    @Override
    public String convertTimezone(String sourceTimezone, String targetTimezone, LocalTime localTime) {
        ZoneId sourceZone = ZoneId.of(sourceTimezone);
        ZoneId targetZone = ZoneId.of(targetTimezone);

        ZonedDateTime sourceZonedDateTime = ZonedDateTime.of(LocalDate.now(), localTime, sourceZone);
        ZonedDateTime targetZonedDateTime = sourceZonedDateTime.withZoneSameInstant(targetZone);

        LocalTime targetLocalTime = targetZonedDateTime.toLocalTime();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return targetLocalTime.format(formatter);
    }
}
