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
public abstract class Figura {
    private Punto puntoA;
    private Punto puntoB;
    public abstract Double calcularArea();
    public abstract Double calcularPerimetro();

    public Punto getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }

    public Punto getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }
    
    
}
