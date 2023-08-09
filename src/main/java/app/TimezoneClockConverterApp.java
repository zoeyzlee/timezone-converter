package app;

import factory.DefaultTimezoneConverterFactory;
import factory.TimezoneConverterFactory;
import strategy.DefaultTimezoneConversionStrategy;
import usecase.TimezoneConverter;
import usecase.TimezoneConverterImpl;

import java.time.LocalTime;
import java.util.Scanner;

public class TimezoneClockConverterApp {
    private final TimezoneConverter timezoneConverter;

    public TimezoneClockConverterApp(TimezoneConverter timezoneConverter) {
        this.timezoneConverter = timezoneConverter;
    }

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

    public static void main(String[] args) {
        TimezoneConverterFactory factory = new DefaultTimezoneConverterFactory();
        TimezoneConverter timezoneConverter = new TimezoneConverterImpl(new DefaultTimezoneConversionStrategy());

        TimezoneClockConverterApp app = new TimezoneClockConverterApp(timezoneConverter);
        app.run();
    }
}
