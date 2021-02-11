/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio26;

/**
 *
 * @author ismael
 */
public class mainLifo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LiFO a = new LiFO(10);
        char[] b=new char[10];
        char[] c=new char[10];
        for (int i=0;i<b.length;i++){
        b[i]='a';
        }
        
        a.push('a');
        a.push('c');
        System.out.println(a.mostrarElementos());
        a.pop();
        a.pop();
        System.out.println(a.estaVacia());
        System.out.println("El numero de procesos actuales es de " +a.actuales());
        a.rellenar(b);
        System.out.println(a.mostrarElementos());
        c=a.sacarElementos();
        System.out.println(a.mostrarElementos());
    }
    
}
