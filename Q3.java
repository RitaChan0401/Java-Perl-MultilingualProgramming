public class Q3 {
  public static void main(String[] args) {
    int[] box = {0, 1, 2, 3, 4, 5}; int sum = 0;
    for(int i = 0; i < box.length - 1; i++) {
      sum = sum + calc(box[i], box[i + 1]);
    }
    System.out.println(sum);
  }
  public static int calc(int a, int b) {
    if(add(a, b) % 3 == 0) {
    return add(a, a);
  }
    return add(b, b);
  }
  public static int add(int a, int b) {
    return a + b;
  }
}

// 26
