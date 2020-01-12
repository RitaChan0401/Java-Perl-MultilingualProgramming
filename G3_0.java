import java.util.Comparator;

public class G3_0 {

  public static <T extends Comparable<T>> T[] sort (T[] list) {
    for(int i = 0; i < list.length - 1; i++)  {
      for(int j = 0; j < list.length - 1 - i; j++) {
        T v1 = list[j];
        T v2 = list[j + 1];
        if(v1.compareTo(v2) > 0) {
          T temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
        }
      }
    }
    return list;
  }

  public static <T extends Comparable<T>> T[] sort (T[] list, Comparator<T> c) {
    for(int i = 0; i < list.length - 1; i++)  {
      for(int j = 0; j < list.length - 1 - i; j++) {
        T v1 = list[j];
        T v2 = list[j + 1];
        if(/*v1.compareTo(v2) */c.compare(v1, v2) > 0) {
          T temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
        }
      }
    }
    return list;
  }
}
