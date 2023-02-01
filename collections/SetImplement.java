package collections;

import java.util.HashSet;
import java.util.Set;

public class SetImplement {
  public static void main(String[] args) {
    // Instance object
    Set<String> months = new HashSet<>();
    Set<Integer> numbers = new HashSet<>();

    // Add data
    months.add("Januari");
    months.add("Februari");
    months.add("Januari");
    months.add("Maret");
    months.add("April");
    months.add("Mei");
    months.add("Juni");

    System.out.println(months);

    // Update data
    months.remove("Januari");
    months.add("Juli");
    System.out.println(months);

    // Hapus data
    months.remove("Maret");

    System.out.println(months);
    System.out.println(numbers);
  }
}
