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

        int sumaArreglo = 0;
        int numeroMayor;
        int numeroMenor;
        float promedioArreglo = 0;

        numeroMayor = arregloNumeros[0];
        numeroMenor = arregloNumeros[0];

        for (int i = 0; i < arregloNumeros.length; i++) {
            sumaArreglo += arregloNumeros[i];
        }
        promedioArreglo = sumaArreglo / arregloNumeros.length;

        for (int i = 0; i < arregloNumeros.length; i++) {
            if (arregloNumeros[i] > numeroMayor) {
                numeroMayor = arregloNumeros[i];
            }
        }

        for (int i = 0; i < arregloNumeros.length; i++) {
            if (arregloNumeros[i] < numeroMenor) {
                numeroMenor = arregloNumeros[i];
            }
        }

        System.out.println("La suma es: " + sumaArreglo);
        System.out.println("El promedio es: " + promedioArreglo);
        System.out.println("El mayor es: " + numeroMayor);
        System.out.println("El menor es: " + numeroMenor);
    }
}
