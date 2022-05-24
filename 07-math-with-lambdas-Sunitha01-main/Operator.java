import java.util.function.BinaryOperator;

enum Operator {

  // TODO add four enum values corresponding to the PLUS, MINUS, MULTIPLY, DIVIDE
  // TODO for each enum value, set op to the right lambda expression
  
  PLUS,
  MINUS,
  MULTIPLY,
  DIVIDE;
  
  BinaryOperator<Double> op;

  public double apply(double a, double b) {
    switch (this) {
           case PLUS:
               op = (i, j) -> a + b;
               break;
           case MINUS:
               op = (i, j) -> a - b;
               break;
           case MULTIPLY:
               op = (i, j) -> a * b;
               break;
           case DIVIDE:
               op = (i, j) -> a / b;
               break;
     }
    return op.apply(a, b);
  }
}
