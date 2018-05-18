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
}
