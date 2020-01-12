import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class G6_4 {
  public static void main(String[] args) {
    List<Undergraduate> list1 = Arrays.asList(GData.DATA1);

    Comparator<Undergraduate> comparator = Comparator.comparing((Undergraduate o1) -> o1.getGpa())
        .thenComparing((Undergraduate o1) -> o1.getId());

//    Comparator<Undergraduate> comparator = Comparator.comparing(Undergraduate::getGpa).thenComparing(Undergraduate::getId).

    Collections.sort(list1, comparator);
    for (Undergraduate u: list1) {
      System.out.println(u.getId() + " " + u.getGpa());
    }
  }
}
