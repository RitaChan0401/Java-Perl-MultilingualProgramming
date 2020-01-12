public class Q4 {
  public static void main(String[] args) {
    int a = 4;
    int b = method1(a);
    System.out.println(String.valueOf(a) + String.valueOf(b)); // 48
  }
  public static int method1(int a) {
    if(method2(a)) {
    a = a + a;
  }
  else {
    a = a * a;
  }
    return a;
  }
  public static boolean method2(int a) {
    return a % 2 == 0;
  }
}
