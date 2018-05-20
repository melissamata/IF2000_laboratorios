/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

/**
 *
 * @author melis
 */
public class Ejercicio4 {

    int minimo = 1;
    int maximo = 7;

    public void imprimir() {
        System.out.println();
        imprimirAscendente();
        imprimirDivision();
        System.out.println();
        imprimirDescendente();
        imprimirDivision();
        System.out.println();
        imprimirAscendente();
        imprimirDivision();
    }

    private void imprimirAscendente() {
        String patron = "";
        for (int i = minimo; i <= maximo; i++) {
            patron += "0";
            System.out.println(patron);
        }
    }

    private void imprimirDescendente() {
        String patron = "0000000";
        for (int i = maximo; i >= minimo; i--) {
            System.out.println(patron);
            patron = patron.substring(0, i - 1);
        }
    }

    private void imprimirDivision() {
        for (int i = 0; i < 75; i++) {
            System.out.print("-");
        }
    }

}
