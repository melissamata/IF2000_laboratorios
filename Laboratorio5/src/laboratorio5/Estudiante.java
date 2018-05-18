/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5;

/**
 *
 * @author Melissa
 */
public class Estudiante {
    
    String carne;
    String nombre;
    float nota;

    public Estudiante() {
    }
    

    public Estudiante(String carne, String nombre, float nota) {
        this.carne = carne;
        this.nombre = nombre;
        this.nota = nota;
    }

    
    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
       
}
