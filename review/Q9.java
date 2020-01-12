package review;

public class Q9 {
  public static void main(String[] args) {
    C c1 = new C();
    C c2 = new C();

    c1.method();
    c2.method();

    System.out.println(c1.getA()); // 2
    System.out.println(c1.getB()); // 1
  }
}
