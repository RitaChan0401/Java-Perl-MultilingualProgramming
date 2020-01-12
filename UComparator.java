import java.util.Comparator;

public class UComparator implements Comparator<Undergraduate> {
  @Override
  public int compare(Undergraduate o1, Undergraduate o2) {
    return o2.getGpa().compareTo(o1.getGpa());
  }
}
