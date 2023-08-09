// ConsoleTimezonePresenter.java
package presenter;

public class ConsoleTimezonePresenter implements TimezonePresenter {
    @Override
    public void presentTime(String time) {
        System.out.println("Converted time: " + time);
    }
}
