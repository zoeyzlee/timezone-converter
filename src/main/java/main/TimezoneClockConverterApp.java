package main;

import domain.model.TimezoneConverter;
import factory.TimezoneConversionServiceFactory;
import presenter.TimezonePresenter;
import usecase.TimezoneConversionService;
import factory.TimezoneConverterFactory;
import factory.DefaultTimezoneConverterFactory;

import java.time.LocalTime;
import java.util.Scanner;

/**
 * Application class for converting and presenting timezones to the user.
 */
public class TimezoneClockConverterApp {
    private final TimezoneConverter converter;
    private final TimezonePresenter presenter;
    private final TimezoneConversionService conversionService;

    /**
     * Constructs a TimezoneClockConverterApp instance.
     *
     * @param converter        The timezone converter used for conversion and presentation.
     * @param presenter        The presenter for displaying converted time to the user.
     * @param conversionService The service for retrieving timezone information.
     */
    public TimezoneClockConverterApp(TimezoneConverter converter,
                                     TimezonePresenter presenter,
                                     TimezoneConversionService conversionService) {
        this.converter = converter;
        this.presenter = presenter;
        this.conversionService = conversionService;
    }

    /**
     * Runs the timezone conversion and presentation application.
     *
     * @param scanner The scanner used for user input.
     */
    public void run(Scanner scanner) {
        // Get user inputs and local time...

        // Create instances using Factory Method pattern
        TimezoneConverterFactory factory = new DefaultTimezoneConverterFactory();
        TimezoneConverter converter = factory.createTimezoneConverter();
        TimezoneConversionService conversionService = TimezoneConversionServiceFactory.createRemoteTimezoneConversionService();

        // Convert and present timezone
        converter.convertAndPresentTimezone(sourceTimezone, targetTimezone, localTime);
    }
}
