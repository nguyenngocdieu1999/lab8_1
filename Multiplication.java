/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import com.sun.org.apache.bcel.internal.generic.BALOAD;

/**
 *
 * @author admin
 */
public class Multiplication extends BinaryExpression {
    private Expression left;
    private Expression right;

    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }
    public void Multiplication(Expression l, Expression r){
        this.left=l;
        this.right=r;
    }

    @Override
    public String toString() {
        return String.valueOf(this.evaluate());
    }

    @Override
    public int evaluate() {
       return left.evaluate()* right.evaluate();
    }
}
