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
public class Circulo extends Figura {
    @Override
    public Double calcularArea() {
       return Math.PI * (Math.pow(calcularRadio(), 2));
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * Math.PI * calcularRadio();
    }
    
    private Double calcularRadio() {
        return this.getPuntoA().calcularDistancia(this.getPuntoB());
    }
}
