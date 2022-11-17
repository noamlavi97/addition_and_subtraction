package addition_and_subtraction;

public abstract class Expression {
    //Abstract method that calculates the result of the expression
    public abstract double calculate();
    //Overriding equals()
    @Override
    public boolean equals(Object o) {
        //If this is the very same object
        if (o == this) {
            return true;
        }
        // Check if o is an instance of Expression or not
        if (!(o instanceof Expression)) {
            return false;
        }
        //Typecast o to Expression in order to compare the values inside
        Expression c = (Expression) o;
        //Compare the data members and return accordingly
        return c.calculate()==this.calculate();
    }
}