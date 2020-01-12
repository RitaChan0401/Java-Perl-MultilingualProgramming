public class NumString {
  private int num;
  private String str;
  public NumString(int num) {
    this.num = num; this.str = "" + num;
  }
  public int asNumber() {
    return this.num;
  }
  public String asString() {
    return this.str;
  }
}
