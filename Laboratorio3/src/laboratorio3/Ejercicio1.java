/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

/**
 *
 * @author melis
 */
public class Ejercicio1 {

    String listadoNumeros = "";

    public int determinaAleatorio() {

        int numeroAleatorio;

        numeroAleatorio = (int) (Math.random() * 20);

        return numeroAleatorio;
    }

    public boolean esPar(int numero) {

        boolean resultado = false;
        listadoNumeros += numero;

        if (numero % 2 == 0) {
            resultado = true;

        }

        System.out.print("El numero: " + numero + " es par: " + resultado);
        return resultado;
    }

    public boolean esImpar(int numero) {

        boolean resultado = false;
        listadoNumeros += numero;

        if (numero % 2 != 0) {
            resultado = true;

        }

        System.out.print("El numero: " + numero + " es impar: " + resultado);
        return resultado;
    }

    public void listaParesImpares() {

        System.out.println(listadoNumeros);

    }

}
