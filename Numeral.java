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
public class Numeral extends Expression {
    private int value;
    
    public Numeral(){
        
    }
    public Numeral(int value){
        this.value=value;
    }
    
    public String toString(){
        return String.valueOf (value);
    }
    
    public int evaluate() {
        return value;
    }
}
