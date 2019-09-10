/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.model;

/**
 *
 * @author estudiantes
 */
public class Cuadrado extends Figura {

    @Override
    public Double calcularArea() {
       Double lado = calcularLado();
       return lado * lado;
    }

    @Override
    public Double calcularPerimetro() {
        Double lado = calcularLado();
        return 4 * lado;
    }
    
    /**
     * Metodo que calcula el lado a partir de dos puntos
     */
    private Double calcularLado() {
        return this.getPuntoA().calcularDistancia(this.getPuntoB());
    }
    
}
