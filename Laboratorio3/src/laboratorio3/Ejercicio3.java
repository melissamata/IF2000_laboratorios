/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

import javax.swing.JOptionPane;

/**
 *
 * @author melis
 */
public class Ejercicio3 {
    
    public void menu() {

        int opcion;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número correspondiente para cada opcion:"
                + "\n 1. Área Triángulo"
                + "\n 2. Área Círculo"
                + "\n 3. Área Cuadrado"
                + "\n 4. Área Rectángulo"
                + "\n 5. Salir"));

        switch (opcion) {

            case 1:
                areaTriangulo();
                break;

            case 2:
                areaCirculo();
                break;

            case 3:
                areaCuadrado();
                break;

            case 4:
                areaCirculo();
                break;

            default:
                System.exit(0);

        }

    }

    public int areaTriangulo() {

        int areaTriangulo;
        int baseTriangulo;
        int alturaTriangulo;

        baseTriangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triángulo"));
        alturaTriangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triángulo"));

        areaTriangulo = ((baseTriangulo * alturaTriangulo) / 2);

        System.out.println("El área del triángulo es: " + areaTriangulo);

        return areaTriangulo;
    }

    public int areaCirculo() {

        int areaCirculo;
        int radioCirculo;

        radioCirculo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del círculo"));

        areaCirculo = (int) (3.1415 * Math.pow(radioCirculo, 2));

        System.out.println("El área del círculo es: " + areaCirculo);

        return areaCirculo;
    }

    public int areaCuadrado() {

        int areaCuadrado;
        int ladoCuadrado;

        ladoCuadrado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));

        areaCuadrado = (int) Math.pow(ladoCuadrado, 2);

        System.out.println("El área del cuadrado es: " + areaCuadrado);

        return areaCuadrado;
    }

    public int areaRectangulo() {

        int areaRectangulo;
        int baseRectangulo;
        int alturaRectangulo;

        baseRectangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del rectángulo"));
        alturaRectangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del rectángulo"));

        areaRectangulo = baseRectangulo*alturaRectangulo;
        
        System.out.println("El área del rectángulo es: " + areaRectangulo);
    
        return areaRectangulo;

    }

}
