public class Fraction {
  private final int numerator;
  private final int denominator;

  public Fraction(int numerator, int denominator){
    this.numerator = numerator;
    this.denominator = denominator;
  }

  /**
   * Calculates the sum of two fractions
   * @param other the other fraction
   * @return the sum of this fraction and the other in lowest terms
   */
  public Fraction plus(Fraction other){
    int otherNumerator = other.numerator;
    int otherDenominator = other.denominator;
    int factor = gcd(denominator,otherDenominator);
    int lcm = (denominator * otherDenominator)/factor;
    int newNumerator = (numerator * lcm) / denominator + (otherNumerator * lcm) / otherDenominator; // Replace 0 with the correct calculation
    int newDenominator = lcm; // Replace 0 with the correct calculation
    return new Fraction(newNumerator, newDenominator).reduce();
  }

  /**
   * Calculates the difference of two fractions
   * @param other the other fraction
   * @return the difference between this fraction and the other in lowest terms
   */
  public Fraction minus(Fraction other){
    int otherNumerator = other.numerator;
    int otherDenominator = other.denominator;
    int factor = gcd(denominator,otherDenominator);
    int lcm = (denominator * otherDenominator)/factor;
    int newNumerator = (numerator * lcm) / denominator - (otherNumerator * lcm) / otherDenominator; // Replace 0 with the correct calculation
    int newDenominator = lcm; // Replace 0 with the correct calculation
    return new Fraction(newNumerator, newDenominator).reduce();
  }

  /**
   * Calculates the product of two fractions
   * @param other the other fraction
   * @return the product of this fraction and the other fraction in lowest terms
   */
  public Fraction times(Fraction other){
    int otherNumerator = other.numerator;
    int otherDenominator = other.denominator;
    int newNumerator = numerator * otherNumerator;  // Replace 0 with the correct calculation
    int newDenominator = denominator * otherDenominator; // Replace 0 with the correct calculation
    return new Fraction(newNumerator, newDenominator).reduce();
  }

  /**
   * Reduces a fraction by dividing the numerator and denominator by the greatest
   * common factor.
   * @return a reduced fraction
   */
  public Fraction reduce(){
    int factor = gcd(numerator,denominator);
    int newNumerator = numerator/factor; // Replace 0 with the correct calculation
    int newDenominator = denominator/factor; // Replace 0 with the correct calculation
    return new Fraction(newNumerator, newDenominator);
  }

  private int gcd(int a, int b){
    // implement Euclid's algorithm
    while (b != 0) {
            int t =b;
            b = a % b;
            a=t;
    }
    return a;
  }

  // DO NOT EDIT THIS FUNCTION
  @Override
  public String toString() {
    return "(" +
        numerator +
        " / " + denominator +
        ')';
  }
}
