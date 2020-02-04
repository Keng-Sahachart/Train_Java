/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloop;

/**
 *
 * @author KeNG
 */
public class WhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 0;
        while(x<20){
            System.out.println("Hello By While is " +x);
            x++;
        }
        
        x=0;
        do{
            System.out.println("Hello By Do While is " +x);
            x++;
        }
        while(x<30);
                
    }
    
}
