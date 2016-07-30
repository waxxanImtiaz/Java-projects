/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;


public class A {
    static int x = 12;
    public static void parse(String str){
        try
        {
            Object obj = new Object();
            
            float f= Float.parseFloat(str);
            System.out.println(f);
        }
        catch(NumberFormatException nfe)
        {
         //   f=0;
        }
        finally{
           
           //     System.out.println(f);
                }
    }
    public void printx()
    {
        System.out.println(" x = "+x);
    }
    public void main()
    {
        printx();
    }
    public static void main(String[] args) {
    A obj = new A();
       // parse("1111.2");
        obj.main();
    }
    
}
