package addition_and_subtraction;

public abstract class CompoundExpression extends Expression {
    protected Expression e1, e2;
    //Constructor
    public CompoundExpression (Expression e1, Expression e2) {
        this.e1=e1; 
        this.e2=e2;
    }
    //public abstract double calculate();
}