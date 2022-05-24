import java.util.List;
import java.util.ArrayList;

public class ListsOfInts {
  public static List<Integer> getOdds(){
    // Write code here
    ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0 ; i <= 99; i++) {
            if (i%2 != 0 ) {
                odd.add(i);
            }
        }
        return odd;
  }

  public static List<Integer> getEvens(){
    // Write code here
    ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0 ; i <= 99; i++) {
            if (i%2 == 0 ) {
                even.add(i);
            }
        }
        return even;
  }

  public static List<Integer> getPowersOfTwo(){
    // Write code here
    ArrayList<Integer> power = new ArrayList<>();
        int pow;
        pow = 1;
        while (pow <= 4096) {
            power.add(pow);
            pow = pow * 2;
            
        }
        return power;
  }

  public static void main(String[] args){
    System.out.println(getOdds());
    System.out.println(getEvens());
    System.out.println(getPowersOfTwo());
  }
}
