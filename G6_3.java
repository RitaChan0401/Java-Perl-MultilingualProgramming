import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class G6_3 {
  public static void main(String[] args) {
    List<Undergraduate> list1 = Arrays.asList(GData.DATA1);
    Function<Undergraduate,String> keyExtractor = Undergraduate::getId;

    Comparator<Undergraduate> comparator = (u1,u2) -> keyExtractor.apply(u1).compareTo(keyExtractor.apply(u2));

    //staticメソッドのComparator.comparingは仮引数としてFunctionを宣言

    Collections.sort(list1, comparator);

    list1.forEach((undergraduate -> {
      System.out.println(undergraduate.getId() + " " + undergraduate.getGpa());
    }));
  }
}
