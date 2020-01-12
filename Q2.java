public class Q2 {
  public static void main(String[] args) {
    NumString a = new NumString(1);
    NumString b = new NumString(2);
    NumString c = new NumString(3);
    System.out.println(a.asString() + b.asNumber() + c.asNumber());
    System.out.println(b.asNumber() + c.asNumber() + a.asString());
  }
}
