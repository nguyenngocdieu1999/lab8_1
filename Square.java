/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author admin
 */

public class Square extends Expression{

    private Expression expression;
     
    public Square(Expression ex){
        this.expression = ex;
    }
    
    @Override
    public String toString() {
        return  String.valueOf (this.evaluate());
    }

    @Override
    public int evaluate() {
        return expression.evaluate()* expression.evaluate();
    }

}
