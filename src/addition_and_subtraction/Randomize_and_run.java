package addition_and_subtraction;

import java.util.ArrayList;
import java.util.Random;

public class Randomize_and_run {
    public static void main (String args[] ) {
        final double min_num=-10.0, max_num=10.0;
        final int num_of_expressions=50;
        ArrayList<Expression> expressions_array=new ArrayList<Expression>();
        Random r = new Random();
        
        //Let's create the array - we will add 2 atomic expressions, 2 addition expressions and 2 subtraction expressions
        AtomicExpression atomic_num_1, atomic_num_2;
        AdditionExpression addition_expression_variable;
        SubtractionExpression subtraction_expression_variable;

        //Let's add 2 atomic numbers to the array
        for (int i=0; i<num_of_expressions; i++) {
            atomic_num_1= new AtomicExpression(((r.nextInt(1000) / 1000.0)*(max_num-min_num))+min_num);
            expressions_array.add(atomic_num_1);
        }

        //Let's add 2 addition expressions to the array
        for (int i=0; i<num_of_expressions; i++) {
            //In order to add complex expressions, we have to create some atomic expressions first
            atomic_num_1= new AtomicExpression(((r.nextInt(1000) / 1000.0)*(max_num-min_num))+min_num);
            atomic_num_2= new AtomicExpression(((r.nextInt(1000) / 1000.0)*(max_num-min_num))+min_num);
            addition_expression_variable= new AdditionExpression(atomic_num_1, atomic_num_2);
            expressions_array.add(addition_expression_variable);
        }
        
        //Let's add 2 subtraction expressions to the array
        for (int i=0; i<num_of_expressions; i++) {
            //In order to add complex expressions, we have to create some atomic expressions first
            atomic_num_1= new AtomicExpression(((r.nextInt(1000) / 1000.0)*(max_num-min_num))+min_num);
            atomic_num_2= new AtomicExpression(((r.nextInt(1000) / 1000.0)*(max_num-min_num))+min_num);
            subtraction_expression_variable= new SubtractionExpression(atomic_num_1, atomic_num_2);
            expressions_array.add(subtraction_expression_variable);
        }

        //Now we will print everything
        System.out.println("Atomic expressions and their respective value:");
        for (int i=0; i<num_of_expressions; i++) {
            System.out.println(expressions_array.get(i)+" = "+String.format("%.2f",expressions_array.get(i).calculate()));
        }
        System.out.println("Addition expressions and their respective value:");
        for (int i=num_of_expressions; i<2*num_of_expressions; i++) {
            System.out.println(expressions_array.get(i)+" = "+String.format("%.2f",expressions_array.get(i).calculate()));
        }
        System.out.println("Subtraction expressions and their respective value:");
        for (int i=2*num_of_expressions; i<3*num_of_expressions; i++) {
            System.out.println(expressions_array.get(i)+" = "+String.format("%.2f",expressions_array.get(i).calculate()));
        }
        //Check if the any of the expressions are equal
        for (int i=0; i<3*num_of_expressions; i++) {
            for (int j=0; j<3*num_of_expressions; j++) {
                if ((expressions_array.get(i).equals(expressions_array.get(j))&&(i!=j)&&(i<j))) {
                    System.out.println("Found equal expressions!");
                    System.out.println(expressions_array.get(i)+" = "+expressions_array.get(j));
                }
            }
        }
    }
    
}
