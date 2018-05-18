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
        }

        return arregloNumeros;

    }

    public void operaciones(int[] arregloNumeros) {

        int suma = 0;
        float promedio = 0;
        for (int i = 0; i < arregloNumeros.length; i++) {
            suma += arregloNumeros[i];
        }
        promedio = suma/arregloNumeros.length;
        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+promedio);

    }

}
