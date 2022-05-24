public class NutritionFactsMain {
  public static void main(String[] args) {
    // TODO use your NutritionFactsBuilder to build the nutrition facts for some of your favorite foods
    NutritionFacts dietFood = NutritionFacts.builder().calories(50.0).servingSize("Medium").saturatedFat(12.5).build();
    System.out.println(dietFood);
  }
}
