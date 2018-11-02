/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.lang.ArithmeticException;
/**
 *
 * @author admin
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kq;
        Numeral n1 = new Numeral(10);
        Numeral n2 = new Numeral(-1);
        Numeral n3 = new Numeral(2);
        Numeral n4 = new Numeral(3);
        Numeral n5 = new Numeral(0);
        Square sq1 = new Square (n1);
        kq = sq1.evaluate() + n2.evaluate() + n3.evaluate()*n4.evaluate ();
        System.out.println(kq);
        
        try {
            Division di = new Division(n1,n5);
            di.evaluate();
        } catch (ArithmeticException e) {
            System.out.println("Loi chia 0");
        }
    }
}
    

