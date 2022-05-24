public class Looper {
  public static void printOdds(){
    for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                i++;
            }
        }
  }

  public static void printEvens(){
    for (int i = 0 ; i <= 99; i++) {
                if (i%2 == 0 ) {
                    System.out.println(i);
                    i++;
                }
            }
  }

  public static void printPowersOfTwo(){
    int power;
            power = 1;
            while (power <= 4096) {
                System.out.println(power);
                power = power * 2;

            }
  }
  
  public static void main(String[] args){
    printOdds();
    printEvens();
    printPowersOfTwo();
  }
}

