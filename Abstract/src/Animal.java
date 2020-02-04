/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KeNG
 */
public abstract class Animal {
    
    public String Name;
    public String Dna;
    
    //public Animal(){};
    
    public Animal(String NameInput){
        Name = NameInput;
    }
    
    public void Eat(){
        System.err.println("Eat : Food");
    }
    
    public abstract void walk();  // บังคับให้ class ลูก ประกาศ เพื่อใส่การทำงาน
    
}



