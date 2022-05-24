public class NutritionFacts {
  final String servingSize;
  final double calories;
  final double totalFat;
  final double saturatedFat;
  final double transFat;
  final double polyunsaturatedFat;
  final double monounsaturatedFat;
  final double cholesterol;
  final double sodium;
  final double totalCarbohydrates;
  final double dietaryFiber;
  final double sugars;
  final double addedSugar;
  final double sugarAlcohol;
  final double protein;
  final double calcium;
  final double iron;
  final double vitaminD;
  final double potassium;

  public NutritionFacts(String servingSize,
                        double calories,
                        double totalFat,
                        double saturatedFat,
                        double transFat,
                        double polyunsaturatedFat,
                        double monounsaturatedFat,
                        double cholesterol,
                        double sodium,
                        double totalCarbohydrates,
                        double dietaryFiber,
                        double sugars,
                        double addedSugar,
                        double sugarAlcohol,
                        double protein,
                        double calcium,
                        double iron,
                        double vitaminD,
                        double potassium) {
    this.servingSize = servingSize;
    this.calories = calories;
    this.totalFat = totalFat;
    this.saturatedFat = saturatedFat;
    this.transFat = transFat;
    this.polyunsaturatedFat = polyunsaturatedFat;
    this.monounsaturatedFat = monounsaturatedFat;
    this.cholesterol = cholesterol;
    this.sodium = sodium;
    this.totalCarbohydrates = totalCarbohydrates;
    this.dietaryFiber = dietaryFiber;
    this.sugars = sugars;
    this.addedSugar = addedSugar;
    this.sugarAlcohol = sugarAlcohol;
    this.protein = protein;
    this.calcium = calcium;
    this.iron = iron;
    this.vitaminD = vitaminD;
    this.potassium = potassium;
  }
  
  @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize='" + servingSize + '\'' +
                ", calories=" + calories +
                ", totalFat=" + totalFat +
                ", saturatedFat=" + saturatedFat +
                '}';
    }

  public static NutritionFactsBuilder builder(){
    return new NutritionFactsBuilder();
  }

  public static class NutritionFactsBuilder {

    // TODO implement this class using the fluent style presented in class.
    
    String servingSize;
        double calories;
        double totalFat;
        double saturatedFat;
        double transFat;
        double polyunsaturatedFat;
        double monounsaturatedFat;
        double cholesterol;
        double sodium;
        double totalCarbohydrates;
        double dietaryFiber;
        double sugars;
        double addedSugar;
        double sugarAlcohol;
        double protein;
        double calcium;
        double iron;
        double vitaminD;
        double potassium;

        public NutritionFactsBuilder servingSize(String servingSize){
            this.servingSize = servingSize;
            return this;
        }

        public NutritionFactsBuilder calories(double calories){
            this.calories = calories;
            return this;
        }

        public NutritionFactsBuilder saturatedFat(double saturatedFat){
            this.saturatedFat = saturatedFat;
            return this;
        }


    public NutritionFacts build(){
      return new NutritionFacts(servingSize,calories ,
             totalFat,
             saturatedFat,
             transFat,
             polyunsaturatedFat,
             monounsaturatedFat,
             cholesterol,
             sodium,
             totalCarbohydrates,
             dietaryFiber,
             sugars,
             addedSugar,
             sugarAlcohol,
             protein,
             calcium,
             iron,
             vitaminD,
             potassium); // TODO implement this method to call the NutritionFacts constructor
    }
  }
}
