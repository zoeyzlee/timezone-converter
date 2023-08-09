package usecase;

import domain.model.TimezoneConverter;
import domain.model.TimezoneConversionStrategy;
import presenter.TimezonePresenter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Implementation of the TimezoneConverter interface.
 * Responsible for converting and presenting timezones using the specified strategy.
 */
public class TimezoneConverterImpl implements TimezoneConverter {
    private final TimezoneConversionStrategy strategy;
    private final TimezoneConversionService conversionService;
    private final TimezonePresenter presenter;

    /**
     * Constructs a TimezoneConverterImpl instance.
     *
     * @param strategy          The strategy used for timezone conversion.
     * @param conversionService The service for retrieving timezone information.
     * @param presenter         The presenter for displaying converted time.
     */
    public TimezoneConverterImpl(TimezoneConversionStrategy strategy,
                                 TimezoneConversionService conversionService,
                                 TimezonePresenter presenter) {
        this.strategy = strategy;
        this.conversionService = conversionService;
        this.presenter = presenter;
    }

    /**
     * Converts the given time from the source timezone to the target timezone using the strategy,
     * and presents the converted time using the presenter.
     *
     * @param sourceTimezone The source timezone identifier.
     * @param targetTimezone The target timezone identifier.
     * @param localTime      The local time to convert.
     */
    @Override
    public void convertAndPresentTimezone(String sourceTimezone, String targetTimezone, LocalTime localTime) {
        String convertedTime = strategy.convertTimezone(sourceTimezone, targetTimezone, localTime);
        presenter.presentTime(convertedTime);
    }

    /**
     * Converts the given time from the source timezone to the target timezone using the strategy.
     *
     * @param sourceTimezone The source timezone identifier.
     * @param targetTimezone The target timezone identifier.
     * @param localTime      The local time to convert.
     * @return The converted time in the target timezone.
     */
    public String convertTimezone(String sourceTimezone, String targetTimezone, LocalTime localTime) {
        ZoneId sourceZone = ZoneId.of(sourceTimezone);
        ZoneId targetZone = ZoneId.of(targetTimezone);

        ZonedDateTime sourceDateTime = ZonedDateTime.of(LocalDate.now(), localTime, sourceZone);
        ZonedDateTime targetDateTime = sourceDateTime.withZoneSameInstant(targetZone);

        return targetDateTime.toLocalTime().toString();
    }
}
