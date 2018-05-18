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

        int[] arregloAreaParedes = new int[4];
        int largoPared;
        int anchoPared;

        for (int i = 0; i < arregloAreaParedes.length; i++) {

            largoPared = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo de la pared"));
            anchoPared = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho de la pared"));
            arregloAreaParedes[i] = largoPared * anchoPared;
            //System.out.println(arregloAreaParedes[j]);
        }
        return arregloAreaParedes;
    }

    
}
