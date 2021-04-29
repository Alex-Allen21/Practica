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
public class SobrecargaConstructores {
    
    double alto;
    double ancho;
    double largo;
    
    SobrecargaConstructores (double a, double b, double c){
        alto=a;
        ancho=b;
        largo=c;
        
    }
    SobrecargaConstructores(){
        alto=-1;
        ancho=-1;
        largo=-1;
    }
    SobrecargaConstructores(double longitud){
        alto=ancho=largo=longitud;
    }
}
