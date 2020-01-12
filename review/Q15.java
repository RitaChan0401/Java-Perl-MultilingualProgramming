package review;

public class Q15 {
  public static void main(String[] args) {
    A ab =  new B();
    method(ab); // A
    System.out.println(ab.getName()); // B
  }
  public static void method(A a) {
    System.out.println("A");
  }
  public static void method(B b){
    System.out.println("B");
  }
}
