public class TestTime implements Time {
  private int hours;
  private int minutes;
  private int seconds;

  public TestTime(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  public int getHour() {
    return hours;
  }
}
