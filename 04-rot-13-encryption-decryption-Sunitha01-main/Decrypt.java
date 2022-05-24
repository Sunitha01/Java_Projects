import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Decrypt {

  /**
   * Reads the contents of the file into a String
   * @param filename the name of the file to read
   * @return the contents of the file
   */
  public static String readFile(String filename){
    String line = ""; // use a BufferedReader to read this from the file
    String line1 = "";
    try {
            BufferedReader br = new BufferedReader(new FileReader(filename));         

            while ((line = br.readLine()) != null) {
                
                    line1 = line;
                    
            }
         
            br.close();

     } catch (IOException ex) {
            ex.printStackTrace();
     }
    return line1;
  }

  public static void writeToFile(String filename, String contents){
    // use a BufferedWriter to write the string contents to the file
    try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

            bw.write(contents);

            // close the reader
            bw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    
    
  }

  /**
   * Loops through each character in the string and, if the character is a letter,
   * transforms it with the ROT13 cipher.  If the character is not a letter, it should
   * just return the same character unchanged.
   *
   * @param str the input  string
   * @return the encrypted string
   */
  public static String rot13(String str){
    /*
      Hint 1: Remember each character has a numerical value, which means you can
              do math with characters.
      Hint 2: In ASCII, all of the capital letters have consecutive numerical values
              and all of the lowercase letters have consecutive values, BUT there is a gap
              between capital 'Z' and lowercase 'a'
      Hint 3: You can use concatenation here to assemble th new string, however, the better way to
              do it would be using something called a StringBuilder.  We will cover StringBuilder in
              more detail next week, but you may want to read the documentation for that class and
              experiment with using it in this assignment.
     */
    StringBuilder sb = new StringBuilder();
       
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
           
            int ascivalue = (int) a;
            if ((ascivalue>= 65 && ascivalue <= 77) | (ascivalue>= 97 && ascivalue <= 109)) {
                int newascivalue = ascivalue + 13;
                char newch = (char) newascivalue;
                a = newch;
            }
            if ((ascivalue>= 78 && ascivalue <= 90) | (ascivalue>= 110 && ascivalue <= 122)) {
                int newascivalue = ascivalue - 13;
                char newch = (char) newascivalue;
                a = newch;
            }
            sb.append(a);
        }


    String decrypted = sb.toString();    
    return decrypted;
  }

  public static void main(String[] args){
    writeToFile("decrypted.txt", rot13(readFile("encrypted.txt")));
  }
}
