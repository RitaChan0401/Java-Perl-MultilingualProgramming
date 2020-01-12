import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class G3_6 {
  public static void main(String[] args) {
    List<Undergraduate> list1 = Arrays.asList(GData2.DATA1);
    Comparator<Undergraduate> comparator = new Comparator<Undergraduate>() {
      @Override
      public int compare(Undergraduate o1, Undergraduate o2) {
        return o2.getGpa().compareTo(o1.getGpa());
      }
    };

    Comparator<Undergraduate> comparator1 = new Comparator<Undergraduate>() {
      @Override
      public int compare(Undergraduate o1, Undergraduate o2) {
        return o2.getId().substring(2,4).compareTo(o1.getId().substring(2,4));
      }
    };

    Collections.sort(list1, comparator1.thenComparing(comparator).thenComparing(Comparator.naturalOrder()));
    for (Undergraduate u: list1) {
      System.out.println(u.getId() + " " + u.getGpa());
    }
  }
}
