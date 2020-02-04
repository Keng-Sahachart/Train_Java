/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set01;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author KeNG
 */
public class Set01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Set<Integer> Set01 = new HashSet<Integer>();
      
      Set01.add(10);
      
      Set01.add(1);
      Set01.add(3);
      Set01.add(5);
      Set01.add(4);
      Set01.add(2);
      
      Set01.add(5);
      Set01.add(4);
      Set01.add(3);
      Set01.add(2);
      Set01.add(1);
      
      Set01.add(6);
      
      Set01.forEach(val -> System.out.println(val));
    }
    
}
