package oop;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateImplement {
  private static String contoh;

  public static String getContoh() {
    return contoh;
  }

  public static void setContoh(String contoh) {
    DateImplement.contoh = contoh;
  }

  public static void main(String[] args) {
    // instance local date
    LocalDate localDate = LocalDate.now();
    System.out.println("date: " + localDate);
    System.out.println("date 2 days after: " + localDate.plusDays(2));
    System.out.println(localDate.atStartOfDay());

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);
  }
}
