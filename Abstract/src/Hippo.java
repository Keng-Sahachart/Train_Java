/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KeNG
 */
public class Hippo extends Animal {

    public Hippo(String NewName){
        super(NewName);
    }
    
    
    @Override
   public void walk() {
       System.out.println("Walk And Swim");
    }

         
}
