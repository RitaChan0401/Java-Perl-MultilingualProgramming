public class Q1 {
  public static void main(String[] args) {
    int x = 13;
    int y = 5;
    int z = x;
    IntCalculator ic = new IntCalculator();
    x = x + 2; z = x;
    x = 5;
    System.out.println(
        ic.add(ic.sub(x, ic.add(y, z)), ic.mul(ic.mul(x, y), ic.sub(z, y)))
    );
  }
}
