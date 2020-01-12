package review;

public class Q4 {
  public static void main(String[] args) {
    String a = "1";
    int b = 2;
    int c = 3;

    // 「文字列 + 数値」の時は、「+」演算子の左辺が文字列なので右辺の数値は文字列に変換
    System.out.println(a + b + c);
    // 「数値 + 文字列」の時は、数値どうしは通常に計算され、最終的に文字列が結合する
    System.out.println(b + c + a);
  }
}
