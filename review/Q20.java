package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q20 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("1");
    list.add("2");
    list.add("11");
    list.sort(Collections.reverseOrder());

    for (String s : list) {
      System.out.println(s);
    }
  }
}
