import java.time.LocalTime;

public class RealTime implements Time {
  public int getHour() {
    LocalTime time = java.time.LocalTime.now();

    return time.getHour();
  }
}
