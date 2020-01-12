import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class G3_1 {
  public static void main(String[] args) {
    List<Undergraduate> list1 = Arrays.asList(GData.DATA1);
    Collections.sort(list1);
    for (Undergraduate u: list1) {
      System.out.println(u.getId() + " " + u.getGpa());
    }
  }
}
