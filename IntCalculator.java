public class IntCalculator { private static int cntr = 0;
  public int add(int op1, int op2) {
    cntr++;
    return op1 + op2;
  }
  public int sub(int op1, int op2) {
    cntr++;
    return op1 - op2; }
  public int mul(int op1, int op2) {
    cntr++;
    return op1 * op2;
  }
  public int getCount() {
    return cntr;
  }
}
