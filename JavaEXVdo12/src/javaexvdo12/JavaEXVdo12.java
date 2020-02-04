/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexvdo12;

import java.util.Scanner; // ใช้ Sacnner

/**
 *
 * @author KeNG
 */
public class JavaEXVdo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        
        System.out.println("Hello My Name IS : " + name);
        
        System.out.println("Hello My Name ' \" IS : " + name);
        
        System.out.println("Hello \\ \"%");
        
        System.out.println("XXXXXXXXXXXX\nYYYYYYYYYYY");
              
        
    }
    
}
