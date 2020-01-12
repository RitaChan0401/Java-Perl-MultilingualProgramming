import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class G6_2 {
  public static void main(String[] args) {
    List<Undergraduate> list1 = Arrays.asList(GData.DATA1);
    Function<Undergraduate, String> keyExtractor = Undergraduate::getId;

    list1.forEach((undergraduate -> {
      System.out.println(keyExtractor.apply(undergraduate));
    }));
  }
}
