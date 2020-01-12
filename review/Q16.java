package review;

public class Q16 {
  public static void main(String[] args) {
    String s = method(3, "a");
    System.out.println(s); // aaa
  }

  public static String method(int a, String... elements) {
    return String.join(String.valueOf(a), elements);
  }

  public static String method(int a, String element){
    String tmp = "";
    for (int i  = 0; i < a; i++) {
      tmp = tmp + element;
    }
    return tmp;
  }
}
