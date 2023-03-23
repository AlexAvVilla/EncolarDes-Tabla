/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Alex Avila
 */
public class Paciente implements Comparable<Paciente>{
    String apellido;
    String nombre;
    String numero;
    int gravedad;

    public Paciente(String apellido, String nombre, String numero, int gravedad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.numero = numero;
        this.gravedad = gravedad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public int compareTo(Paciente o) {       
        return o.gravedad < this.gravedad ? 1: -1;
    }

    
    
    
}
