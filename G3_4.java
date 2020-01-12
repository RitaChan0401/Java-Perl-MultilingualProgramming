import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class G3_4 {
  public static void main(String[] args) {
    List<Undergraduate> list1 = Arrays.asList(GData.DATA1);
    Comparator<Undergraduate> comparator = new Comparator<Undergraduate>() {
      @Override
      public int compare(Undergraduate o1, Undergraduate o2) {
        return o2.getGpa().compareTo(o1.getGpa());
      }
    };
    Comparator<Undergraduate> newComparator = comparator.thenComparing(Comparator.naturalOrder());
    Collections.sort(list1, newComparator);
    for (Undergraduate u: list1) {
      System.out.println(u.getId() + " " + u.getGpa());
    }
  }
}
