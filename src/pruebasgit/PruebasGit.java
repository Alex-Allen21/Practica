
/*invocar a java class Sobrecarga*/
package pruebasgit;


public class PruebasGit {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        SobrecargaMetodos datos= new SobrecargaMetodos();
        double res;
        datos.test();
        datos.test(123.2);
        datos.test(10);
        datos.test(10, 20);
        
        //comentar
        res = datos.test(123.2);
        
        System.out.println(res);
        
        
    }
    
}
