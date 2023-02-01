package collections;

import java.util.HashMap;
import java.util.Map;

public class MapImpl {
  public static void main(String[] args) {
    // instance object
    Map<String, Integer> stocks = new HashMap<>();

    // add data
    stocks.put("Pulpen", 100);
    stocks.put("penggaris", 10);
    System.out.println(stocks);

    // get value
    System.out.println(stocks.get("Pulpen"));

    // update data
    stocks.replace("penggaris", 20);

    System.out.println(stocks);
  }
}
