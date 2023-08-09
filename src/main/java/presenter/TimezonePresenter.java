package presenter;

/**
 * Interface for presenting converted time to the user.
 */
public interface TimezonePresenter {

    /**
     * Presents the converted time to the user.
     *
     * @param time The converted time to be presented.
     */
    void presentTime(String time);
}
