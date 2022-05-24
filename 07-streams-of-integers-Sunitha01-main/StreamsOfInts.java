import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamsOfInts {
  public static List<Integer> getOdds(){
    // Write code here - use the **filter** method and produce a List<Integer>
    List<Integer> numbers = new ArrayList<>(100);
    for (int i=0 ; i < 100; i++){
                numbers.add(i);
    }
    return (List) numbers.stream().filter(i -> i%2 !=0 ).collect(Collectors.toList());

  }

  public static List<Integer> getEvens(){
    // Write code here - use the **filter** method and produce a List<Integer>
    List<Integer> numbers = new ArrayList<>(100);
    for (int i=0 ; i < 100; i++){
                numbers.add(i);
     }
     return  numbers.stream().filter(i -> i%2 ==0 ).collect(Collectors.toList()) ;
    
  }
  public static List<Integer> getPowersOfTwo(){
    // Write code here - use the **map** method and produce a List<Integer>
    
    List<Integer> numbers = new ArrayList<>(100);
    for (int i=0 ; i < 13; i++){
           numbers.add(i);
     }

    return numbers.stream().map(i -> { double j = 2;
                                     double k = i;
                                     return (int) Math.pow(j,k); })
                                   .collect(Collectors.toList());
     
  }

  public static void main(String[] args){
    System.out.println(getOdds());
    System.out.println(getEvens());
    System.out.println(getPowersOfTwo());
  }
}
