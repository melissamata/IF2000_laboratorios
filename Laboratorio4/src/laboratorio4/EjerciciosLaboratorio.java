/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Melissa
 */
public class EjerciciosLaboratorio {

    public int busquedaLineal(int[] arregloNumeral, int numeroABuscar) {

        int resultado = -1;

        for (int i = 0; i < arregloNumeral.length; i++) {

            if (arregloNumeral[i] == numeroABuscar) {
                resultado = arregloNumeral[i];
            }

        }

        System.out.println("El número " + numeroABuscar + " se encuentra en la posición " + resultado);

        return resultado;
    }

    public int[] paredesAPintar() {

        int[] arregloParedes = new int[4];
        int largoPared;
        int anchoPared;

        for (int i = 0; i < arregloParedes.length; i++) {

            largoPared = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo de la pared"));
            anchoPared = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho de la pared"));
            arregloParedes[i] = largoPared * anchoPared;
            //System.out.println(arregloAreaParedes[f]);
        }
        return arregloParedes;
    }

    public int[] ordenaMenorMayor(int[] arreglo) {

        int[] arregloOrdenado = new int[arreglo.length];

        for (int i = 0; i < (arreglo.length); i++) {

            for (int j = i + 1; j < arreglo.length; j++) {

                if (arreglo[i] > arreglo[j]) {
                    int variableAuxiliar = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = variableAuxiliar;
                }
            }
            System.out.println(arreglo[i]);
        }

        return arregloOrdenado;
    }

    public int valorRepetido(int[][] matrizNumerica) {

        int repeticionMaxima = 0;
        int numeroMaximaRepeticion = 0;

        for (int f = 0; f < matrizNumerica.length; f++) {
            for (int c = 0; c < matrizNumerica[0].length; c++) {
                int numActual = matrizNumerica[f][c];
                int repeticionActual = contarApariciones(matrizNumerica, numActual);
                if (repeticionActual > repeticionMaxima) {
                    repeticionMaxima = repeticionActual;
                    numeroMaximaRepeticion = numActual;
                }

            }

        }

        return numeroMaximaRepeticion;

    }

    public int contarApariciones(int[][] matriz, int numeroBuscado) {
        int apariciones = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (numeroBuscado == matriz[i][j]) {
                    apariciones++;
                }
            }

        }
        return apariciones;
    }

    public int calculoPromedioNumeros(int[][] matrizNumeral) {

        int sumaMatriz = 0;
        int promedioMatriz = 0;
        for (int f = 0; f < matrizNumeral.length; f++) {

            for (int c = 0; c < matrizNumeral[0].length; c++) {
                sumaMatriz += matrizNumeral[f][c];
            }
        }
        return promedioMatriz = sumaMatriz / ((matrizNumeral.length) * (matrizNumeral[0].length));
    }
}
