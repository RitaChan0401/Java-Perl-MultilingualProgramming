package review;

public class Q7 {
  public static void main(String[] args) {
    int a = 0;
    int b = method(a);

    // String型に変換
    System.out.println(String.valueOf(a) + String.valueOf(b));
  }

  public static int method(int a) {
    a = 1;
    return a;
  }
}
