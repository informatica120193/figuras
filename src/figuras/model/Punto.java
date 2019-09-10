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
public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    
    /**
     * Calcula la distancia entre el punto de la instanci y un punto dado
     * @param punto
     * @return distancia
     */
    public Double calcularDistancia(Punto punto){
       return Math.sqrt(Math.pow(punto.getX() - this.getX(), 2) + Math.pow(punto.getY() - this.getY(), 2));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
