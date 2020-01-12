package review;

public class Q3 {
  public static void main(String[] args) {
    int x = 13;
    int y = 5;
    int z = x;

    x = x + 2; // x=15
    z = x; // z=15
    x = 5;

    // 5+5*15
    System.out.println(x + y * z);
  }
}
