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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salir = false;
        int opcion;
        char opcion2;
        Scanner scn = new Scanner(System.in);
        Avion a = new Avion();
        Avion b = new Avion();
        Avion c = new Avion();
        do {
            System.out.println("Menu\n"
                    + "1 Reservar asiento\n"
                    + "2 Cancelar\n"
                    + "3 Ver ocupacion\n"
                    + "Otro boton para salir\n");
            opcion = scn.nextInt();
            switch (opcion) {
                case 1: {
                    do {
                        System.out.println("De que avion desea reservar asiento a, b o c?");
                        opcion2 = scn.next().charAt(0);
                        switch (opcion2) {
                            case 'a': {
                                a.reserva();
                                
                            }
                            break;
                            case 'b': {
                                b.reserva();
                            }
                            break;
                            case 'c': {
                                c.reserva();
                            }
                            break;
                        }
                    } while (opcion2 != 'a' && opcion2 != 'b' && opcion2 != 'c');
                }
                break;
                case 2: {
                    do {
                        System.out.println("De que avion desea cancelar asiento a, b o c?");
                        opcion2 = scn.next().charAt(0);
                        switch (opcion2) {
                            case 'a': {
                                a.cancelacion();
                            }
                            break;
                            case 'b': {
                                b.cancelacion();
                            }
                            break;
                            case 'c': {
                                c.cancelacion();
                            }
                            break;
                        }
                    } while (opcion2 != 'a' && opcion2 != 'b' && opcion2 != 'c');
                }
                break;

                case 3: {
                    do {
                        System.out.println("De que avion desea imprimir lista de asientos a, b o c?");
                        opcion2 = scn.next().charAt(0);
                        switch (opcion2) {
                            case 'a': {
                                a.imprimir();
                            }
                            break;
                            case 'b': {
                                b.imprimir();
                            }
                            break;
                            case 'c': {
                                c.imprimir();
                            }
                            break;
                        }
                    } while (opcion2 != 'a' && opcion2 != 'b' && opcion2 != 'c');
                }
                break;

                default:
                    salir = true;
            }

        } while (!salir);
    }

}
