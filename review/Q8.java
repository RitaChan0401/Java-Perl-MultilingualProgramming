package review;

public class Q8 {
  public static void main(String[] args) {
    System.out.println(method("1"));
  }
  public static int method(char a) {
    return a + 1;
  }
  public static int method(String a) {
    // 文字列から数値へ変換
    return Integer.valueOf(a + "1");
  }
}
