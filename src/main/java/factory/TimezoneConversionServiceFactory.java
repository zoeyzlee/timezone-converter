package factory;

import usecase.RemoteTimezoneConversionService;
import usecase.TimezoneConversionService;

/**
 * Factory class responsible for creating instances of TimezoneConversionService.
 */
public class TimezoneConversionServiceFactory {

    /**
     * Creates an instance of RemoteTimezoneConversionService.
     *
     * @return An instance of RemoteTimezoneConversionService.
     */
    public static TimezoneConversionService createRemoteTimezoneConversionService() {
        return new RemoteTimezoneConversionService();
    }
}
