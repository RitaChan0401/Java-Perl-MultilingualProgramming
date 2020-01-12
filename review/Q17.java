package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q17 {
  public static void main(String[] args) {
    String s = "1,2,3";
    List<String> strs = getSplitList(s);
    System.out.println(getLine(strs)); // 122333
  }

  public static List<String> getSplitList(String str) {
    return Arrays.asList(str.split(","));
  }

  public static String getLine(List<String> strs) {
    List<String> results = new ArrayList<>();
    for (String str: strs) {
      results.add(getMessage(str));
    }
    return String.join("", results);
  }

  public static String getMessage(String number) {
    String tmp = "";
    for (int i = 0; i < Integer.parseInt(number); i++) {
      tmp = tmp + number;
    }
    return tmp;
  }
}
