import java.time.LocalTime;

public class Clock {
  private Time time;

  public static void main(String[] args) {
    Clock clock = new Clock(new RealTime());
    DigitalClock digitalClock = new DigitalClock();

    while (true) {
      digitalClock.Display(clock.getHours(), clock.getMinutes(), clock.getSeconds());
    }
  }

  public Clock(Time t) {
    time = t;
  }

  public int getHours() {
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
