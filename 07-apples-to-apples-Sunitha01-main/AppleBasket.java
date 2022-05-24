import java.util.Set;
import java.util.HashSet;

public class AppleBasket implements Comparable<AppleBasket> {
  Set<Apple> apples = new HashSet<>();

  public AppleBasket addApple() {
    apples.add(new Apple());
    return this;
  }

  @Override
  public int compareTo(AppleBasket o) {
    // TODO implement this method
    if (this.apples.size() > o.apples.size()){
            return 1;
    } 
    return -1;
  }

  public static class Apple {

  }
}
