// ConsoleUI.java
package app.console;

import main.TimezoneClockConverterApp;
import presenter.ConsoleTimezonePresenter;
import presenter.TimezonePresenter;
import usecase.TimezoneConversionService;
import domain.model.TimezoneConverter;
import factory.DefaultTimezoneConverterFactory;
import factory.TimezoneConverterFactory;

import java.util.Scanner;

public class ConsoleUI {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            TimezoneConverterFactory factory = new DefaultTimezoneConverterFactory();
            TimezoneConverter converter = factory.createTimezoneConverter();

            TimezonePresenter presenter = new ConsoleTimezonePresenter();
            TimezoneConversionService conversionService = (TimezoneConversionService) new usecase.RemoteTimezoneConversionService();

            TimezoneClockConverterApp app = new TimezoneClockConverterApp(converter, presenter, conversionService);

            app.run(scanner);
        }
    }
}