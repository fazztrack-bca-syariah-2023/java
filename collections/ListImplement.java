package collections;

import java.util.ArrayList;
import java.util.List;

public class ListImplement {
  public static void main(String[] args) {
    // Instance object
    List<String> toDo = new ArrayList<>();

    // Add data
    toDo.add("Belanja");
    toDo.add("Ngoding");
    toDo.add("Makan");
    toDo.add("Makan");
    System.out.println(toDo);

    // Get data
    System.out.println(toDo.get(2));

    // Update data
    toDo.set(3, "Minum");
    System.out.println(toDo);

    // Remove data
    toDo.remove(0);

    System.out.println(toDo);
    System.out.println(toDo.equals("Makan"));
  }
}
