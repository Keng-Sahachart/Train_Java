/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map01;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author KeNG
 */
public class Map01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map map01 = new HashMap();
        //Key  / VAlues
        map01.put("John", 18);
        map01.put("Dan",20);
        map01.put("Keng",34);
        
        System.out.println(map01.get("John"));
        System.out.println(map01.get("Dan"));
        System.out.println(map01.get("Dan3")); // ไม่มีค่า
        System.out.println(map01.get("Keng"));
       
        System.out.println("-----------------------------------");
                   
        map01.forEach( (arg0, arg1) -> {
             System.out.println(arg0 + " : " + arg1);
        });
    }
    
}
