/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Melissa
 */
public class MantieneEstudiante {

    String nombreDeArchivo;
    
    public int getTotalRegistros() {

        int cuentaRegistros = 0;

        BufferedReader br = getBufferedReader("Estudiantes.txt");

        try {
            String registroActual = br.readLine();
            while (registroActual != null) {
                cuentaRegistros++;
                registroActual = br.readLine();
            }

            br.close();

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Problemas de lectura en el archivo");
        }

        return cuentaRegistros;
    }

    public boolean buscarEstudiante(String nombreABuscar) {

        boolean encontrado = false;
        Estudiante[] estudiantes = getTodosLosEstudiantes();
        nombreABuscar = nombreABuscar.trim();

        for (Estudiante estudiante : estudiantes) {
            String nombreActual = estudiante.getTodosLosEstudiantes().trim();
            if (nombreABuscar == (nom)) {
                encontrado = true;
                break;
            }
        }
        System.out.println(nombreABuscar + " = " + encontrado);

        return encontrado;
    }

    public void insertarEstudiante(Estudiante estudiante) {

        File archivo = new File("Estudiantes.txt");

        try {

            FileOutputStream fos = new FileOutputStream(archivo, true);
            PrintStream ps = new PrintStream(fos);
            
            for(Estudiante estudiantes : listaDeEstudiantes)

            ps.println( + ";" + nombre + ";" + telefono + ";" + direccion + ";" + correo + ";" + pais);

            ps.close();

        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "Error con el archivo");
        }

    }
    
    
    public Estudiante[] getTodosLosEstudiantes() {

        Estudiante[] estudiante = new Estudiante[getTotalRegistros()];
        int indice = 0;
        

        try {

            BufferedReader br = getBufferedReader("Estudiante.txt");
            String registroActual = br.readLine();

            while (registroActual != null) {
                Estudiante estudianteActual = convertirAEstudiante(registroActual);
                estudiante[indice] = estudianteActual;
                registroActual = br.readLine();
                indice++;
            }

            br.close();

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Problemas");
        }
        return estudiante;
    }

    public BufferedReader getBufferedReader(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        BufferedReader br = null;

        try {
            FileInputStream fis = new FileInputStream(archivo);
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No existe el archivo " + nombreArchivo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hay problemas con el archivo  " + nombreArchivo);
        }
        return br;

    }
    
    public PrintStream getPrintStream(String nombreArchivo) {

        File archivo = new File(nombreArchivo);
        PrintStream ps = null;

        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            ps = new PrintStream(fos);

        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "Problemas");
        }

        return ps;
    }

}
