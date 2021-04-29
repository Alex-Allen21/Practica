
package pruebasgit;

/**
 *
 * @author linom
 */
public class Constructores {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        SobrecargaConstructores c1= new SobrecargaConstructores(10, 20, 15);
        SobrecargaConstructores c2 = new SobrecargaConstructores();
        SobrecargaConstructores c3= new SobrecargaConstructores(5);
        
        System.out.println("Caja 1: "+c1);
         System.out.println("Caja 2: "+c2);
        System.out.println("Caja 3: "+c3);
    }
    
    
}
