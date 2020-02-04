/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

/**
 *
 * @author KeNG
 */
public class OOP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CCalculator cal1 =new CCalculator();
        System.out.println("\n CCalculator V1");
        System.out.println(cal1.Additinal(5, 10));
        System.out.println(cal1.Subtraction(10, 5));
        
        
        CCalculatorV2 cal2 =new CCalculatorV2();
        System.out.println("\n CCalculator V2");
        System.out.println(cal2.Additinal(10, 15));
        System.out.println(cal2.Subtraction(10, 15));
        System.out.println(cal2.Multiply(10, 3));
        System.out.println(cal2.Divition(10, 20));
    }
    
}
