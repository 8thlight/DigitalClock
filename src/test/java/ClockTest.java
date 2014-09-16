import org.junit.Test;
import static org.junit.Assert.*;

public class ClockTest {

  @Test
  public void ItGetsHoursFromItsTime() {
    int hours = 1;
    int minutes = 2;
    int seconds = 3;

    Time time = new TestTime(hours, minutes, seconds);

    Clock clock = new Clock(time);

    assertEquals(hours, clock.getHours());
  }
}
