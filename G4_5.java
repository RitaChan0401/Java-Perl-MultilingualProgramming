import java.util.Arrays;
import java.util.List;

public class G4_5 {
  public static void main(String[] args) {
    List<Integer> xs = Arrays.asList(1,2,3,4,5);
    xs.replaceAll((i) -> i * 3);
    xs.forEach((i) -> System.out.println(i + " "));
  }
}
