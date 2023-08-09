package factory;

import usecase.TimezoneConverter;
import usecase.TimezoneConverterImpl;

public class DefaultTimezoneConverterFactory implements TimezoneConverterFactory {

    @Override
    public TimezoneConverter createTimezoneConverter() {
        return new TimezoneConverterImpl();
    }
}
