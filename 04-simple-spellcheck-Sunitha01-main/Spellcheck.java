import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.io.BufferedReader;
import java.io.FileReader;

public class Spellcheck {

  private static final Set<String> words = new HashSet<String>();


  public static void main(String[] args) {
    /* HINT - use a BufferedReader to read the words file.  For each line in
              the file, call words.add(line) . We will be covering Sets in detail
              next week, but for now just know that if you are adding each word
              to the set of known words so that spellcheck will work
     */
    String line = " ";
    try {

      // write code to read words.txt here
      
      BufferedReader br = new BufferedReader(new FileReader("words.txt"));
      while ((line = br.readLine()) != null) {
                words.add(line);
            }

      spellCheckFile("peter-pan.txt");
      spellCheckFile("alice.txt");
      spellCheckFile("original.txt");
      
      

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Reads the contents of filename line-by-line and prints the line with
   * spellchecking markup.  Please preserve the linebreaks from the original file.
   *
   * NOTE - this method is written with "throws IOException" at the end of the declaration.
   * That means that we are passing the burden of handling the IOException to the code
   * that calls this method.  That means, in turn, that you do not need to use Try/Catch inside
   * this method.
   *
   * @param filename the name of the file to read
   * @throws IOException
   */
  static void spellCheckFile(String filename) throws IOException {
    String line = " ";    
    BufferedReader br = new BufferedReader(new FileReader(filename));
    while ((line = br.readLine()) != null) {
            String[] words1 = line.split(" ");

            for (int i = 0; i< words1.length; i++ ){
                  boolean mispelled = isSpelledCorrectly(words1[i]);
                  if (!mispelled){
                    String newWord = "[[" + words1[i] + ']'+']';
                    line = line.replace(words1[i],newWord);
                  }
           }
           System.out.println(line);
     }
 }
  
  /**
   * Returns true if the word is in the list of known words of false otherwise
   * @param word the word to check
   * @return
   */
  private static boolean isSpelledCorrectly(String word) {
    return words.contains(word) || words.contains(word.toLowerCase(Locale.ROOT));
  }
}
