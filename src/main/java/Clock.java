import java.time.LocalTime;

public class Clock {

    public static void main(String[] args) {
        Clock clock = new Clock();
        DigitalClock digitalClock = new DigitalClock();

        while (true) {
            digitalClock.Display(clock.getHours(), clock.getMinutes(), clock.getSeconds());
        }
    }

    public int getHours() {
        LocalTime time = java.time.LocalTime.now();
        return time.getHour();
    }

    public int getMinutes() {
        LocalTime time = java.time.LocalTime.now();
        return time.getMinute();
    }

    public int getSeconds() {
        LocalTime time = java.time.LocalTime.now();
        return time.getSecond();
    }
}
