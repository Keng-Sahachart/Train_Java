/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalec14;

import java.util.Scanner;

/**
 *
 * @author KeNG
 */
public class JavaLec14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input Dollas:");
        float Dollas = sc.nextFloat();
        
        System.out.println("Input Convert $<->THB:");
        float Convert = sc.nextFloat();
        
        float ThaiBath = Dollas * Convert;
        
        String Msg;
        Msg="Money " + Dollas + " Dollas IS " + ThaiBath + " THB";
        System.out.println(Msg);
    }
    
}
