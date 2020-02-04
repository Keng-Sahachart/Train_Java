/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KeNG
 */
public class NewClass {
    public static void main(String[] args){
        System.out.println("****************************************************");
        System.out.println("Hello Array 1 D");
        
        int ar1d[] = new int[10];
        
        for(int r=0 ; r<10 ; r++){
            ar1d[r]=r*10;
        }
        for(int r=0 ; r<10 ; r++){
             System.out.println("ar1d["+r+"] is :" + ar1d[r]);
        }
        
        System.out.println("****************************************************");
           System.out.println("Hello Array 2 D");
        
        int ar2d[][] = new int[5][10];
        
        for(int d1=0 ; d1<5 ; d1++){
            for(int d2=0 ; d2 < 10 ; d2++)
                ar2d[d1][d2] = d1*d2;
        }
        for(int d1=0 ; d1<5 ; d1++){
            for(int d2=0 ; d2 < 10 ; d2++)
                System.out.println("ar2d["+d1+"]["+d2+"] is :" + ar2d[d1][d2]);
        }
          
    }
    
}
