/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import figuras.model.Circulo;
import figuras.model.Cuadrado;
import figuras.model.Figura;
import figuras.model.Punto;
import figuras.model.Rectangulo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiantes
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Punto> listaPuntos = new ArrayList<Punto>();
        listaPuntos.add(new Punto(0, 5));
        listaPuntos.add(new Punto(0, 8));
        listaPuntos.add(new Punto(2, 9));
        listaPuntos.add(new Punto(2, 10));
        listaPuntos.add(new Punto(0, 12));
        listaPuntos.add(new Punto(1, 15));

        Figura figura1 = new Cuadrado();
        figura1.setPuntoA(listaPuntos.get(0));
        figura1.setPuntoB(listaPuntos.get(1));
        
        System.out.println("Area cuadrado: " + figura1.calcularArea());
        System.out.println("Perimetro cuadrado: " + figura1.calcularPerimetro());
        
        Figura figura2 = new Circulo();
        figura2.setPuntoA(listaPuntos.get(2));
        figura2.setPuntoB(listaPuntos.get(3));
        
        System.out.println("Area circulo: " + figura2.calcularArea());
        System.out.println("Perimetro circulo: " + figura2.calcularPerimetro());
        
        Figura figura3 = new Rectangulo();
        figura3.setPuntoA(listaPuntos.get(4));
        figura3.setPuntoB(listaPuntos.get(5));
        
        System.out.println("Area rectangulo: " + figura3.calcularArea());
        System.out.println("Perimetro rectangulo: " + figura3.calcularPerimetro());
        
    }
    
}
