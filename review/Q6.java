package review;

public class Q6 {
  public static void main(String[] args) {
    int[] box = {0,1,2,3,4,5};
    int sum = 0;

    for (int i = 0; i < box.length -1; i++) {
      sum = sum + add(box[i], box[i + 1]);
    }
    System.out.println(sum); // 25
  }

  public static int add(int a, int b) {
    return a + b;
  }
}
