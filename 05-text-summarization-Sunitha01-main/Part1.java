import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.lang.Math;

public class Part1 {
  public static void main(String[] args) {

    System.out.println(cosineTheta(
        List.of(3.0, 4.0),
        List.of(4.0, 3.0)
    ));
    System.out.println(cosineTheta(
        List.of(7.0, 1.0),
        List.of(5.0, 5.0)
    ));

    System.out.println(cosineTheta(
        List.of(3.0, 4.0, 0.0),
        List.of(4.0, 4.0, 2.0)
    ));

    System.out.println(cosineTheta(
        List.of(1.0, 0.0, 3.0),
        List.of(5.0, 5.0, 0.0)
    ));
  }

  static double cosineTheta(List<Double> a, List<Double> b){
    // HINT this is the formula for cosine theta - implement the methods for dotProduct and
    //      magnitude below
    return dotProduct(a,b) / (magnitude(a) * magnitude(b));
  }

  /**
   * Calculates dot product of a vector represented as a list
   * @param v the vector
   * @return a scalar representing the magnitude of the vector
   */
  static double dotProduct(List<Double> a, List<Double> b){
    // We haven't seen assert yet, but this will ensure the two vectors are the same size
    assert a.size() == b.size();

    // TODO implement this method by iterating through the two lists
    Iterator<Double> iterator1 = a.iterator();
    Iterator<Double> iterator2 = b.iterator();
    double sum = 0;
    while (iterator1.hasNext()) {
           sum = sum + (iterator1.next() * iterator2.next());
    }  
    return sum;
  }

  /**
   * Calculates magnitude of a vector  represented as a list
   * @param v the vector
   * @return a scalar representing the magnitude of the vector
   */
  static double magnitude(List<Double> v){
    // TODO implement this method by iterating through the list
    // HINT Math.sqrt is the Java square root function
    Iterator<Double> iterator = v.iterator();
    double magnitude = 0;
    double square = 0;
    while (iterator.hasNext()) {
         square = Math.pow(iterator.next(),2);
         magnitude = magnitude + (square);           
     }
     magnitude = Math.sqrt(magnitude);     
    return magnitude;
  }

}
