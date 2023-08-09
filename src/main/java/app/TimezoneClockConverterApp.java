package app;

import factory.DefaultTimezoneConverterFactory;
import factory.TimezoneConverterFactory;
import strategy.DefaultTimezoneConversionStrategy;
import usecase.TimezoneConverter;
import usecase.TimezoneConverterImpl;

import java.time.LocalTime;
import java.util.Scanner;


/**
 * Application class for the Timezone Clock Converter program.
 */
public class TimezoneClockConverterApp {
    private final TimezoneConverter timezoneConverter;

    /**
     * Creates a TimezoneClockConverterApp instance with a specified TimezoneConverter.
     *
     * @param timezoneConverter TimezoneConverter implementation to be used.
     */
    public TimezoneClockConverterApp(TimezoneConverter timezoneConverter) {
        this.timezoneConverter = timezoneConverter;
    }

    /**
     * Runs the application, interacting with the user to perform timezone conversion.
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter source timezone (e.g., America/New_York): ");
        String sourceTimezone = scanner.nextLine();

        System.out.print("Enter target timezone (e.g., Asia/Tokyo): ");
        String targetTimezone = scanner.nextLine();

        System.out.print("Enter time in source timezone (HH:mm:ss): ");
        String inputTime = scanner.nextLine();
        LocalTime localTime = LocalTime.parse(inputTime);

        String convertedTime = timezoneConverter.convertTimezone(sourceTimezone, targetTimezone, localTime);

        System.out.println("Time in " + targetTimezone + ": " + convertedTime);
    }

    /**
     * Entry point of the application.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        TimezoneConverterFactory factory = new DefaultTimezoneConverterFactory();
        TimezoneConverter timezoneConverter = factory.createTimezoneConverter();

        TimezoneClockConverterApp app = new TimezoneClockConverterApp(timezoneConverter);
        app.run();
    }
}





