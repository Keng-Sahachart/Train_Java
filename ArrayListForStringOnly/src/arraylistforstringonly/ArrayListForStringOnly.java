/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistforstringonly;

import java.util.ArrayList;

/**
 *
 * @author KeNG
 */
public class ArrayListForStringOnly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //  เก็บ DataType ได้ ทุกชนิด
        ArrayList Lst = new ArrayList();
        Lst.add("This is String");
        Lst.add(10); 
        Lst.add(123.321); 
        
        Lst.forEach(val -> System.out.println(val) );
        
        
        // บังคับให้ เก็บได้เฉพาะ String
        ArrayList<String> LstStr = new ArrayList<String>();
        
        LstStr.add("This is String");
        //LstStr.add(10); // แจ้ง Error ตั้งแต่ Edit
        //LstStr.add(123.321);  // แจ้ง Error ตั้งแต่ Edit
        Lst.forEach(val -> System.out.println(val) );
        
    }
    
}
