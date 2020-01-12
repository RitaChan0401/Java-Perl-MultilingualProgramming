import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class G4_4 {
  public static void main(String[] args) {
    List<Integer> xs = Arrays.asList(1,2,3,4,5);

    xs.replaceAll(new UnaryOperator<Integer>() {
      @Override
      public Integer apply(Integer integer) {
        return integer * 3;
      }
    });

    xs.forEach(new Consumer<Integer>() {
      @Override
      public void accept(Integer integer) {
        System.out.println(integer + " ");
      }
    });
  }
}
