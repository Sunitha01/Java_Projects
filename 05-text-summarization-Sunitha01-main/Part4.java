import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Part4 {
  public static void main(String[] args) {
    List<BagOfWords> documents = new ArrayList<>();

    try {
      // The below line is an alternate way of reading from files compared to what we looked
      // at in class.  This is part of the java.nio.  We will look at it more detail in
      // the second half of the semester
      final List<String> lines = Files.readAllLines(Paths.get("article.txt"));

      for (String line : lines) {
        documents.add(new BagOfWords(line));
      }

      final List<String> vocab = BagOfWords.getVocabulary(documents);
      final TfIdf tfIdf = new TfIdf(vocab, documents);

      List<List<Double>> vectors = new ArrayList<>();
      for (BagOfWords document : documents) {
        vectors.add(tfIdf.tfIdf(document));
      }

      List<List<Double>> matrix = new ArrayList<>();
      // TODO populate this matrix so that matrix[i][k]=cosine(sentence_i, sentence_j)
      // HINT - to populate this matrix, you need to compute the cosine of each pair of sentences
      //        by iteration. How many loops will you need?
      
      for (int i = 0 ; i < vectors.size()  ; i++) {
                List<Double> k = new ArrayList<>();
                for (int j = 0; j < vectors.size() ; j++) {
                    k.add(Part1.cosineTheta(vectors.get(i), vectors.get(j)));
                    
                }
                matrix.add(k);
                
      }

      Map<Double, Integer> indexes = new HashMap<>();
      // TODO implement calculateAverage below and populate this Map based on the matrix

      // HINT - to populate this map, we need to be able to get the average of each row in the matrix and
      //        be able to map the highest average similarity (Double) measures back to the
      //        position of the sentence (Integer)
      
      for (int i = 0 ; i < matrix.size(); i++) {
               indexes.put(calculateAverage(matrix.get(i)),i);
               
       }
       TreeMap<Double, Integer> sorted = new TreeMap<>();
       sorted.putAll(indexes);

      printTopN(lines, indexes, 5);
    } catch (IOException e) {
      e.printStackTrace();

    }
  }

  private static double calculateAverage(List<Double> doubles) {
    // TODO implement this method
    Iterator<Double> iterator = doubles.iterator();
    double sum = 0;
    while(iterator.hasNext()){
        sum = sum + iterator.next();

    }
    return sum/doubles.size();
  }



  public static class TfIdf {

    private final List<Double> idfVector;
    private final List<String> vocab;

    public TfIdf(List<String> vocab, List<BagOfWords> documents) {
      this.vocab = vocab;
      this.idfVector = Part3.inverseDocumentFrequency(vocab, documents);
    }

    public List<Double> tfIdf(BagOfWords document) {
      final List<Double> termFreq = Part2.termFrequency(this.vocab, document);
      return hadamardProduct(termFreq, idfVector);
    }

    /**
     * Returns the element-wise product of two equal sized vectors as a new vector
     *
     * @param a a vector
     * @param b another vector of the same size
     * @return the product
     */
    public static List<Double> hadamardProduct(List<Double> a, List<Double> b) {
      // TODO implement this method
     
      List<Double> product = new ArrayList<>();
      Iterator<Double> iterator = a.iterator();
      Iterator<Double> iterator1 = b.iterator();
      while(iterator.hasNext()) {
           product.add(iterator.next() * iterator1.next());
      }
      return product;
    }
  }

  /**
   * Will print N sentences as a summary of the article
   *
   * @param lines   the lines of the file
   * @param indexes a mapping from the similarity score to the position of the sentence with that score
   * @param n       the number of sentences to extract
   */
  private static void printTopN(List<String> lines, Map<Double, Integer> indexes, int n) {
    // NOTE - this uses some advanced Java 8 features we haven't discussed yet.  It will be the
    //        topic of week 12 of the course.  For now, just trust me that it works.
    indexes
        .keySet()
        .stream()
        .sorted(Comparator.reverseOrder())
        .limit(n)
        .map(indexes::get)
        .sorted()
        .map(lines::get)
        .forEach(System.out::println);

  }

}
