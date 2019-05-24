/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_franciscopagoaga;

/**
 *
 * @author Francisco Pagoaga
 */
public class Carrera {
    private String nombre;
    private String Facultad;
    private double mensualidad;
    private String jefedecarrera;

    public Carrera() {
    }

    public Carrera(String nombre, String Facultad, double mensualidad, String jefedecarrera) {
        this.nombre = nombre;
        this.Facultad = Facultad;
        this.mensualidad = mensualidad;
        this.jefedecarrera = jefedecarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    public double getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(double mensualidad) {
        this.mensualidad = mensualidad;
    }

    public String getJefedecarrera() {
        return jefedecarrera;
    }

    public void setJefedecarrera(String jefedecarrera) {
        this.jefedecarrera = jefedecarrera;
    }
    
}
