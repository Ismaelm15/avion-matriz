/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio26;

import java.util.ArrayList;

/**
 * char[] sacarElementos(), saca los elementos de la pila y los devuelva en un
 * array de char. La pila queda vacía.
 *
 * @author ismael
 */
public class LiFO {

    private final ArrayList<String> procesos;

    public LiFO(int numero) {
        this.procesos = new ArrayList<>(numero);
    }

    public String push(char letra) {

        String proceso = String.valueOf(letra);
        try {
            procesos.add(proceso);
        } catch (NullPointerException e) {
            return "Se ha sobrepasado el tamaño, antes de meter un nuevo proceso deberá sacar uno antes";
        }
        return "El proceso ha sido implementado correctamente";
    }

    public String pop() {
        return procesos.remove(procesos.size() - 1);
    }

    public boolean estaVacia() {
        return procesos.isEmpty();

    }

    public int actuales() {
        return procesos.size();
    }

    public String mostrarElementos() {
        String devolver = "";
        if (!procesos.isEmpty()) {
            for (String g : procesos) {
                devolver += g;  //devolver = procesos.stream().map(g -> g).reduce(devolver, String::concat);
            }
        } else {
            return "No hay elementos que mostrar";
        }
        return devolver;
    }

    public void rellenar(char[] letras) {

        for (int i = 0; i < letras.length; i++) {
            procesos.add(String.valueOf(letras[i]));

        }

    }

    public char[] sacarElementos() {
        char[] devolver = new char[procesos.size()];

        for (int j = 0; j < devolver.length; j++) {
            devolver[j] = pop().charAt(0);
        }

        return devolver;
    }
}
