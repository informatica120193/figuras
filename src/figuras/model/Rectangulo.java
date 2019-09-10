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
public class Rectangulo extends Figura {
    @Override
    public Double calcularArea() {
       return calcularAltura() * calcularBase();
    }

    @Override
    public Double calcularPerimetro() {
        return (2 * calcularAltura()) + (2 * calcularBase());
    }
    
    /**
     * Metodo que calcula la altura de un rectangulo a partir de dos puntos
     */
    private Double calcularAltura() {
        Punto puntoTemporal = new Punto(this.getPuntoA().getX(), this.getPuntoB().getY());
        return puntoTemporal.calcularDistancia(this.getPuntoA());
    }
    
    /**
     * Metodo que calcula la base de un rectangulo a partir de dos puntos
     */
    private Double calcularBase() {
        Punto puntoTemporal = new Punto(this.getPuntoA().getX(), this.getPuntoB().getY() );
        return puntoTemporal.calcularDistancia(this.getPuntoB());
    }
}
