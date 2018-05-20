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
public class Laboratorio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Ejercicio1 ej1 = new Ejercicio1();
        
        /*int [] arregloNumeros = ej1.llenaArreglo();
        ej1.operaciones(arregloNumeros);*/

        EjerciciosLaboratorio ej = new EjerciciosLaboratorio();
        int[][] matriz = {{1,23,39,42,58,66,75},
                          {23,98,11,21,23,85,90},
                          {64,32,7,35,23,82,99,56},
                          {22,39,40,29,76,8,17,30},
                          {87,46,91,23,53,96,47,12}};
        
        int masRepetido = ej.valorRepetido(matriz);
        System.out.println("El mas repetido es "+masRepetido);
        
        

        /*int [] segundoArregloNumeros = {1,3,4,6};
        ej.busquedaLineal(segundoArregloNumeros, 9);*/
        /*int [] arregloParedes = ej.paredesAPintar();
        ej.ordenaMenorMayor(arregloParedes);*/
        
        

        //ej.calculoPromedioNumeros(matrizNumeral);
    }

    }

}
