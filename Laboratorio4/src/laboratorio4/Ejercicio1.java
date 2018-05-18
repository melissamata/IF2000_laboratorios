/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

import javax.swing.JOptionPane;

/**
 *
 * @author melis
 */
public class Ejercicio1 {

    public int[] llenaArreglo() {

        int[] arregloNumeros = new int[10];

        for (int i = 0; i < arregloNumeros.length; i++) {
            arregloNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            System.out.println(arregloNumeros[i]);
        }

        return arregloNumeros;

    }

}
