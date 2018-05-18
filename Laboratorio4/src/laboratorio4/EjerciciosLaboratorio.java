/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 *
 * @author melis
 */
public class EjerciciosLaboratorio {

    public int busquedaLineal(int[] arregloNumeros, int numeroABuscar) {

        int resultado = 0;

        for (int i = 0; i < arregloNumeros.length; i++) {

            if (arregloNumeros[i] == numeroABuscar) {
                resultado = arregloNumeros[i];
            } else {
                resultado = -1;
            }
        }

        System.out.print("El número " + numeroABuscar + " se encuentra en la posición " + resultado);

        return resultado;

    }

}
