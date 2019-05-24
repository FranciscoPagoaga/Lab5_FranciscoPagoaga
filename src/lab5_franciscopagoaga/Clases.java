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
public class Clases {
    private String nombre, aire;
    private int  seccion, edificio, salon;

    public Clases() {
    }

    public Clases(String nombre, String aire, int seccion, int edificio, int salon) {
        this.nombre = nombre;
        this.aire = aire;
        this.seccion = seccion;
        this.edificio = edificio;
        this.salon = salon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAire() {
        return aire;
    }

    public void setAire(String aire) {
        this.aire = aire;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }
    
}