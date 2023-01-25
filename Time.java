/*
Name: Wesley Squire
Date: Sept 27, 2022
QAP1 Problem 3
*/

public class Time {
  // Init
  private int hour, min, sec;

  public Time(int hour, int min, int sec) {
    this.hour = hour;
    this.min = min;
    this.sec = sec;
  }

  public int getHour() {
    return hour;
  }

  public int getMin() {
    return min;
  }

  public int getSec() {
    return sec;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public void setMin(int min) {
    this.min = min;
  }

  public void setSec(int sec) {
    this.sec = sec;
  }

  public void setTime(int hour, int min, int sec) {
    this.hour = hour;
    this.min = min;
    this.sec = sec;
  }

  // Puts time to required format
  public String toString() {
    String h = String.valueOf(this.hour);
    String m = String.valueOf(this.min);
    String s = String.valueOf(this.sec);
    if (this.hour < 10)
      h = ("0" + this.hour);
    if (this.min < 10)
      m = ("0" + this.min);
    if (this.sec < 10)
      s = ("0" + this.sec);
    return (h + ":" + m + ":" + s);
  }

  public Time nextSecond() {

    sec++;
    if (this.sec >= 60) {
      this.min++;
      this.sec = 0;
    }
    if (this.min >= 60) {
      this.hour++;
      this.min = 0;
    }
    if (this.hour >= 24) {
      // next day
      this.hour = 0;
    }
    return (this);

  }

  public Time prevSecond() {
    sec--;
    if (this.sec <= 0) {
      this.min--;
      this.sec = 0;
    }
    if (this.min <= 0) {
      this.hour--;
      this.min = 0;
    }
    if (this.hour <= 0) {
      // next day
      this.hour = 23;
      this.min = 59;
      this.sec = 59;
    }
    return (this);
  }
}
