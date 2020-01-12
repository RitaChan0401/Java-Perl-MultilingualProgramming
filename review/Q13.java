package review;

public class Q13 {
  public static void main(String[] args) {
    Tag tag = new Tag("tag");
    String message = method2(tag);
    System.out.println(message);

//    String message2 = method1("テスト");
//    System.out.println(message2);
  }
  public static String method1(String name) {
    return name + "!";
  }
  public static String method2(Tag tag) {
    return tag.getName() + "?";
  }
}
