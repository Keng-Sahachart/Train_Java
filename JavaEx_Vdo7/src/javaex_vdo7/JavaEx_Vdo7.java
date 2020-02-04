/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaex_vdo7;

/**
 *
 * @author KeNG
 */
public class JavaEx_Vdo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // การแปลง ข้อมูล
        int x = (int)3.14f;
        System.out.println(x);
        
        System.out.println("Hello" + " " + "World");
        
        System.out.println("Hello" + " " + "World");
        
        System.out.println((int)'A'); // ascii
        
        System.out.println(Integer.parseInt("10")); 
        System.out.println(Integer.parseInt("123")+7);
        
        
        float Prc =200f;
        float vat = 7f;
        float PrcV =Prc+(Prc*vat/100);
        System.out.println(PrcV);
        
                
 
    }
    
}
