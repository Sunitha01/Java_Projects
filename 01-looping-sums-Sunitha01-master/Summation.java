public class Summation {
  /**
   * Calculates the sum of all integers from 1 to 100
   */
  public static int sum1to100(){
    int sum = 0;
    for (int k = 1 ; k <=  100 ; k++) {
            sum = sum + k;
        }
    return sum;
  }

  /**
   * Calculates the sum of a harmonic series from n=1 to 100
   */
  public static float sumHarmonicForward(){
    float sum = 0;
    for (int k = 1 ; k <=  100 ; k++) {
            sum = sum + (float) 1 / k;
        }
    return sum;
  }

  /**
   * Calculates the sum of the harmonic series from n = 100 to 1
   */
  public static float sumHarmonicBackward(){
    float sum = 0;
    for (int k = 100 ; k >  0 ; k--) {
            sum = sum + (float) 1 / k;
        }
    return sum;
  }

  public static void main(String[] args){
    System.out.println(sum1to100());
    System.out.println(sumHarmonicForward());
    System.out.println(sumHarmonicBackward());
  }
}

