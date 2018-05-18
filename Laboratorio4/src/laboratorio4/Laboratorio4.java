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
        /*Ejercicio1 ej1 = new Ejercicio1();
        int [] arregloNumeros = ej1.llenaArreglo();
        ej1.operaciones(arregloNumeros);*/
    
        EjerciciosLaboratorio ej = new EjerciciosLaboratorio();
        int [] segundoArregloNumeros = {1,3,4,6};
        ej.busquedaLineal(segundoArregloNumeros, 9);
        
    }
    
}
