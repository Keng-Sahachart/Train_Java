/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec17_if;

import java.util.Scanner;

/**
 *
 * @author KeNG
 */
public class Lec17_If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n1 :");
        int n1 = sc.nextInt();
        System.out.println("Enter n2 :");
        int n2 = sc.nextInt();
        
        if (n1>n2)
            System.out.println("n1 More");
            //System.out.println("n1 More");
        else{
            System.out.println("n2 More");
            System.out.println("n2 More 2");
        }
        
        switch(n1){
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            default:
                System.out.println("Case Default");
                
        }
        
    }
    
}
