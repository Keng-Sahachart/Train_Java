/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample2;

/**
 *
 * @author KeNG
 */
public class JavaExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=10,i2;
        float f = 10.2f;
        double db =100,db2=100.2,db3;
        i2 = i+(int)f;
        db3=db+db2;
                
        System.out.println("10+5+4");
        System.out.println(10+5+4);
        System.out.println(i);
        System.out.println(f);
        System.out.println(i+f);
        System.out.println(i2);
        System.out.println(db);
        System.out.println(db2);
        System.out.println(db3);
        System.out.println(true);
        System.out.println(false);
        System.out.println(10000000000000l); // long
        System.out.println(9999999999999999999999999999.693f); // float
        System.out.println(999999999999999999999999999999999999999999999999999999999999999999999.5); // double
        System.out.println('A');
        //System.out.println('ABCD');
        System.out.println("ABCD");
        
        System.out.println(5/10.0); // จะได้ชนิดตัวแปรที่ใหญ่ที่สุด
        System.out.println(5f/10);
        System.out.println(5/10f);
        
        System.out.println(10%3);
        
        boolean b1 = 5 > 10,B1 = 5<10; // Case Sensitive
        System.out.println(b1);
        System.out.println(B1);
        
        boolean b2 = (true && true);
        System.out.println(b2);
        
        System.out.println(true && false);
        
        System.out.println(true || false);
        
    }
    
}
