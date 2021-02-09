/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author ismael
 */
public class Avion {

    Asiento[][] listaAsientos = new Asiento[25][4];
    Scanner scn = new Scanner(System.in);

    public Avion() {
        for (int i = 0; i < listaAsientos.length; i++) {
            for (int j = 0; j < listaAsientos[i].length; j++) {
                listaAsientos[i][j] = new Asiento();

            }
        }
    }

    public void reserva() {
        int fila, columna;
        do {
            System.out.println("Indique la fila que desea reservar");
            fila = scn.nextInt() - 1;
        } while (fila > 24 || fila < 0);
        do {
            System.out.println("Indique la columna que desea reservar");
            columna = scn.nextInt() - 1;
        } while (columna > 3 || columna < 0);

        listaAsientos[fila][columna].setDisponible(false);
    }

    public void cancelacion() {
        int fila, columna;
        do {
            System.out.println("Indique la fila que desea cancelar");
            fila = scn.nextInt() - 1;
        } while (fila > 24 || fila < 0);
        do {
            System.out.println("Indique la columna que desea cancelar");
            columna = scn.nextInt() - 1;
        } while (columna > 3 || columna < 0);

        listaAsientos[fila][columna].setDisponible(true);
    }

    public void imprimir() {
        for (Asiento[] listaAsiento : listaAsientos) {
            System.out.println("");
            for (Asiento listaAsiento1 : listaAsiento) {
                if (listaAsiento1.isDisponible()) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[X]");
                }
            }
        }
        System.out.println("");
    }
}
