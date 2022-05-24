public class Fibonacci {
  /**
   * Calculates the nth Fibonacci number recursively
   */
  public static int fibonacci(int n){
    int num0 = 0;
        int num1 = 1;
        int num2 = 0;
        if (n <= 2)
            return(num0 + num1);
        num2   = fibonacci(n-1) + fibonacci(n-2);
        return(num2);
  }

  public static void main(String[] args){
    System.out.println(fibonacci(1));
    System.out.println(fibonacci(10));
    System.out.println(fibonacci(5));
    System.out.println(fibonacci(20));
    System.out.println(fibonacci(8));
  }
}

