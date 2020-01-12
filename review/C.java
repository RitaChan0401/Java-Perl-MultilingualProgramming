package review;

public class C {
  private static int a;
  private int b;

  public static int getA() {
    return a;
  }
  public int getB() {
    return this.b;
  }
  public void method() {
    a++;
    this.b++;
  }
}
