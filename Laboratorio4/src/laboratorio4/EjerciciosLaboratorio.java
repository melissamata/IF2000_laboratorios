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

    //public int[][] matrizNumero(int matrizNumerosPositivos) {

    }//

    public void valorRepetido() {

        /*int[][] matrizNumerica = {{23, 8, 59, 73, 23, 45, 76},
        {11, 6, 7, 82, 56, 34, 57},
        {93, 34, 48, 1, 98, 26, 35},
        {2, 92, 53, 26, 34, 82, 60},
        {34, 17, 88, 6, 99, 53, 21}};

        int variableAuxiliar = 1;
        int cuentaRepetido = 0;

        for (int f = 0; f < matrizNumerica.length; f++) {
            for (int c = 0; c < matrizNumerica[0].length; c++) {
                

                if (variableAuxiliar != matrizNumerica[f][c]) {
                    variableAuxiliar =  matrizNumerica[f][c];
                }

            }

        }
        System.out.print(variableAuxiliar);*/
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
