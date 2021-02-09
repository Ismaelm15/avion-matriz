/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author ismael
 */
public class Asiento {
    boolean disponible;

    public Asiento(boolean disponible) {
        this.disponible = disponible;
    }

    public Asiento() {
        this.disponible = true;
    }
    

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
