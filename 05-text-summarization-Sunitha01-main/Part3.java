import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Part3 {
  public static void main(String[] args) {

    final BagOfWords bagOfWords1 = new BagOfWords("This is Spot. See Spot run. Run, Spot, Run.");
    final BagOfWords bagOfWords2 = new BagOfWords("This is Jane. See Spot run to Jane.");

    final List<BagOfWords> documents = Arrays.asList(
        bagOfWords1, bagOfWords2
    );
    final List<String> vocab = BagOfWords.getVocabulary(documents);
    System.out.println(inverseDocumentFrequency(vocab, documents));
  }

  static List<Double> inverseDocumentFrequency(List<String> vocabulary, List<BagOfWords> documents){
    // TODO implement this method using the formula in the assignment description

    // HINT this requires iteration through both the vocabulary and the documents lists
    int N = documents.size();
    List<Double> IDF = new ArrayList<>();
    for (String i : vocabulary){
            Iterator<BagOfWords> iterator = documents.iterator();
            int dtf = 0;
            boolean wordFound = false;
            while(iterator.hasNext()){
              wordFound = iterator.next().getWords().contains(i);
               if (wordFound){
                   dtf++;

               }
              wordFound = false;
            }
      double p = (double) N / (double) dtf;
      double q = Math.log(p);
      IDF.add(q);
    }  
    return IDF;
  }
}
