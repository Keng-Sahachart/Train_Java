/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author KeNG
 */
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hippo a1 = new Hippo("Mali");
        //Hippo a2 = new Hippo("123" );
        
        
        System.out.println(a1.Name);
        
        a1.Eat();
        
        a1.walk();
        
        TimesTwo t2 = new  TimesTwo();
        TimesWhat tw = new TimesWhat(5);
    }
    
}


abstract class Product { 
    int multiplyBy;
    public Product( int multiplyBy ) {
        this.multiplyBy = multiplyBy;
    }

    public int mutiply(int val) {
       return multiplyBy * val;
    }
}

class TimesTwo extends Product {
    private String Name;
    
    public TimesTwo() {
        super(2);
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }
}

class TimesWhat extends Product {
    public TimesWhat(int what) {
        super(what);
    }
}

