public class G1_6 {

  public static void main(String[] args) {
    Object[] list1 = {
        new Undergraduate("00AJ02", 3.5),
        new Undergraduate("00AJ01", 3.3),
        new Undergraduate("00AJ04", 2.5),
        new Undergraduate("00AJ00", 1.8),
        new Undergraduate("00AJ05", 2.3)
    };

    Object[] list2 = {5, 2, 3, 9, 1};

    for (Object o: sort(list1)) {
//      System.out.println(v);
    }

    for (Object o: sort(list2)) {
//      System.out.println(v);
    }
  }

  public static Object[] sort (Object[] list) {
    for (Object o:list) {
      System.out.println((o instanceof Comparable) + ":" + o);
    }
    return list;
  }
}
