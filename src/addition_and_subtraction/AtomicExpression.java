package addition_and_subtraction;

public class AtomicExpression extends Expression{
    private double num;
    //Constructor
    public AtomicExpression (double num) {
        this.num=num;
    }
    //Overriding toString() method of String class
    @Override
    public String toString() {
        return String.format("%.2f", this.num);
    }
    //Implement the calculate method
    public double calculate() {
        return this.num;
    }
}
