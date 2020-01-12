public class Q5 {
  public static void main(String[] args) {
    System.out.println(method("1")); // 12
  }
  public static int method(int a) {
    return a + 1;
  }
  public static int method(String a) {
    return method(Integer.valueOf(a + "1"));
  }
}
