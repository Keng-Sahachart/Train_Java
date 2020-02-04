/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author KeNG
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int month; 
        String season, inputNum; 
        InputStreamReader in;   
        BufferedReader buffer; 
     
        System.out.print("Enter month (1 – 12): "); 
        in = new InputStreamReader(System.in); 
        buffer = new BufferedReader(in); 
        inputNum = buffer.readLine();

        month = Integer.parseInt(inputNum); 
        switch(month) { 
         case 3: case 4: case 5: case 6: 
          season = "Summer"; 
          break; 
         case 7: case 8: case 9: case 10: 
          season = "Rainy"; 
          break; 
         case 11: case 12: case 1: case 2: 
          season = "Winter"; 
          break; 
         default : 
          season = "Never heard of it!"; 
          break; 
        } 
        System.out.println(month + " is in " + season); 
          }
    
}
