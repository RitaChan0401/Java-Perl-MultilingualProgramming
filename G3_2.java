import java.util.*;

public class G3_2 {
  public static void main(String[] args) {
    List<Undergraduate> list1 = Arrays.asList(GData.DATA1);
    // <>の中は要素型
    Comparator<Undergraduate> comparator = new UComparator();
    Collections.sort(list1, comparator);
    for (Undergraduate u: list1) {
      System.out.println("ID:" + u.getId() + " " + "GPA:"+u.getGpa());
    }
  }
}
