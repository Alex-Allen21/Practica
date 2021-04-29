/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasgit;

/**
 *
 * @author linom
 */
public class SobrecargaMetodos {
    
   public void test(){
        System.out.println("Vacio");
    }
   public void test(int a){
        System.out.println("a=  "+a);
    }
   public void test(int a, int b){
        System.out.println("a=  "+a+""+b);
     }    
   public double test(double a){
        System.out.println("double de a: "+a);
        return a;
      }    
}
