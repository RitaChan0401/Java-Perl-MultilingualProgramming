package review;

import java.util.ArrayList;
import java.util.List;

public class Q18 {
  public static void main(String[] args) {
    List<User> users = new ArrayList<>();
    users.add(new User("s001", 20));
    users.add(new User("s002", 21));
    users.add(0, new User("s003", 20));
    users.remove(1);

    for (User user: users) {
      System.out.println(user.getName() + "," + user.getAge());
    }
  }
}
