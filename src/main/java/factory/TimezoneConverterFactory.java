package factory;

import usecase.TimezoneConverter;

/**
 * Represents a factory interface for creating TimezoneConverter instances.
 */
public interface TimezoneConverterFactory {
    /**
     * Creates a new instance of TimezoneConverter.
     *
     * @return A new TimezoneConverter instance.
     */
    TimezoneConverter createTimezoneConverter();
}