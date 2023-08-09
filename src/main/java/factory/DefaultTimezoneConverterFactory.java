package factory;

import usecase.DefaultTimezoneConversionStrategy;
import domain.model.TimezoneConversionStrategy;
import domain.model.TimezoneConverter;
import usecase.TimezoneConverterImpl;
import presenter.DefaultTimezonePresenter;
import presenter.TimezonePresenter;
import usecase.DefaultTimezoneConversionService;
import usecase.TimezoneConversionService;

/**
 * Default implementation of TimezoneConverterFactory.
 */
public class DefaultTimezoneConverterFactory implements TimezoneConverterFactory {

    @Override
    public TimezoneConverter createTimezoneConverter() {
        // Create a TimezoneConversionStrategy instance (if applicable)
        TimezoneConversionStrategy strategy = new DefaultTimezoneConversionStrategy();

        // Create a TimezoneConversionService instance
        TimezoneConversionService conversionService = createConversionService();

        // Create a TimezonePresenter instance
        TimezonePresenter presenter = createPresenter();

        // Pass the strategy, conversionService, and presenter to the TimezoneConverterImpl constructor
        return new TimezoneConverterImpl(strategy, conversionService, presenter);
    }

    // Implement createConversionService method
    private TimezoneConversionService createConversionService() {
        return new DefaultTimezoneConversionService();  // Create and return an instance of TimezoneConversionService
    }

    // Implement createPresenter method
    private TimezonePresenter createPresenter() {
        return new DefaultTimezonePresenter();  // Create and return an instance of TimezonePresenter
    }
}
