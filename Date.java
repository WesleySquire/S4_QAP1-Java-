/*
Name: Wesley Squire
Date: Sept 21, 2022
QAP1 Problem 2
*/

public class Date {
  private int day;
  private int month;
  private int year;

  // Sets the default for a blank date object
  public Date() {
    day = 1;
    month = 1;
    year = 1900;
  }

  // Lets you create it
  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  // returns day
  public int getDay() {
    return day;
  }

  // returns month
  public int getMonth() {
    return month;
  }

  // returns year
  public int getYear() {
    return year;
  }

  // sets given date's day to input day
  public void setDay(int day) {
    this.day = day;
  }

  // sets given date's month to input month
  public void setMonth(int month) {
    this.month = month;
  }

  // sets given date's year to input year
  public void setYear(int year) {
    this.year = year;
  }

  // sets given date to input
  public void setDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  // returns date to required format
  public String toString() {

    String d = String.valueOf(this.day);
    String m = String.valueOf(this.month);
    if (this.day < 10)
      d = ("0" + this.day);
    if (this.month < 10)
      m = ("0" + this.month);
    return (d + "/" + m + "/" + this.year);
  }

}
