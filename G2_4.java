public class G2_4 {
  public static void main(String[] args) {
    Undergraduate[] list1 = {
        new Undergraduate("00AJ02", 3.5),
        new Undergraduate("00Aj01", 3.3),
        new Undergraduate("00AJ04", 2.5),
        new Undergraduate("00AJ00", 1.8),
        new Undergraduate("00Aj05", 2.3)
    };

    for (Undergraduate v: sort(list1)) {
      System.out.println(v.getId());
    }
  }

  public static <T extends Comparable<T>> T[] sort (T[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      for (int j = 0; j < list.length - 1 - i; j++) {
        T v1 = list[j];
        T v2 = list[j + 1];
        if (v1.compareTo(v2) > 0) {
          T temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
        }
      }
    }
    return list;
  }
}
