/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list01;
/**
 *
 * @author KeNG
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("****************************************");
         System.out.println("List 1\n****************************************t");
        
        List Lst =  new ArrayList();//  ต้อง new ก่อน จะ Add Item ได้
        Lst.add("What?");
        Lst.add("The");
        
        Lst.forEach(value -> System.out.println(value)); // For Each
        
        //**************************************************************************
        
        System.out.println("****************************************");
        System.out.println("List 2\n****************************************t");
        /*  ถ้าไม่ New ArrayList จะ Add New Item ไม่ได้ จะ Error*/
        try {
            List Lst2 = Arrays.asList(new String[]{"Hello","Fucking","World"});
            Lst2.add("The");

            Lst2.forEach(value -> System.out.println(value));
        }catch(Exception e){
            System.out.println("Error (List 2) IS :" + e);
        }
        
        //**************************************************************************
        
        System.out.println("****************************************");
        System.out.println("List 3\n****************************************t");
         
        List Lst3 =new ArrayList();   // ต้อง New Item ก่อน
        Lst3.addAll( Arrays.asList(new String[]{"Hello","Fucking","World"}));
        Lst3.add("What?");
        Lst3.add("The");
        
        System.out.println("---> .forEach()");
        Lst3.forEach(value -> System.out.println(value));
        
        System.out.println("---> For Loop");
        for(Object  Val : Lst3) {
            System.out.println((String)Val);
        }
        
      
    }
    
}
