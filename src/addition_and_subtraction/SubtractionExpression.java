package addition_and_subtraction;

public class SubtractionExpression extends CompoundExpression {
    //Constructor
    public SubtractionExpression (Expression input_e1, Expression input_e2) {
        super(input_e1, input_e2);
    }
    //Implement the calculate method
    public double calculate() {
        return super.e1.calculate()-super.e2.calculate();
    }
    //Overriding toString() method of String class
    @Override
    public String toString() {
        return String.format("%.2f",super.e1.calculate())+" - "+String.format("%.2f",super.e2.calculate());
    }
}
