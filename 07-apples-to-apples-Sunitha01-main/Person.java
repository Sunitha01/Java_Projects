public class Person implements Comparable<Person> {

  final String firstName;
  final String lastName;

  public Person(String firstName, String lastName) {
    // Note - this is not particularly relevant to this assignment, but this is not the best way to store
    // peoples' names.  Every programmer should read this: https://www.kalzumeus.com/2010/06/17/falsehoods-programmers-believe-about-names/
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public int compareTo(Person o) {
    // TODO implement this method
    int l1 = this.lastName.length();
    int l2 = this.lastName.length();
    int f1 = this.firstName.length();
    int f2 = this.firstName.length();
    int lmin = Math.min(l1, l2);
    int fmin = Math.min(f1, f2);
    boolean sameLastname = true;
    for (int i = 0; i < lmin; i++) {
      if ((int) this.lastName.charAt(i) > (int) o.lastName.charAt(i)) {
         return 1;
      }
      if ((int) this.lastName.charAt(i) < (int) o.lastName.charAt(i)) {
                return -1;
      }
    }
    for (int j = 0; j < fmin; j++) {
      if ((int) this.firstName.charAt(j) > (int) o.firstName.charAt(j)) {
          return 1;
       }
      if ((int) this.firstName.charAt(j) < (int) o.firstName.charAt(j)) {
           return -1;
        }
    }

    return -1;
  }
}

