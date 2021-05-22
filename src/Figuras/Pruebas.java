
package Figuras;

/**
 *
 * @author linom
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Rectangulo r1= new Rectangulo(4.0, 2.0);
        
        System.out.println("RECTANGULOS");
        System.out.println("PERIMETROS");
        //pErimetro y area primer objeto
        System.out.println("Rectangulo base: " +r1.getBase()+" altura "+r1.getAltura());
        System.out.println("es " +r1.calcularPerimetro());
        //area
        System.out.println("Rectangulo base: "+r1.getBase()+ " de altura: "+r1.getAltura()+" Es: "+r1.calcularArea());
       
        //cIRCULOS primer objeto
        Circulo c1= new Circulo(2);
        System.out.println("CIRCULOS");
        System.out.println("PERIMETRO");
        System.out.println("El radio es: "+c1.getRadio()+ "el perimetro es: " +c1.calcularPerimetro());
        //areea
        System.out.println("AREAS");
        System.out.println("El radio es: "+c1.getRadio()+" El area es: "+c1.calcularArea());
    }
    
}
