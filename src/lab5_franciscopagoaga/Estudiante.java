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
public class Estudiante {
    private String nombre, apellido,genero;
    private int numcuenta,edad;
    private Carrera carrera;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String genero, int numcuenta, int edad, Carrera carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.numcuenta = numcuenta;
        this.edad = edad;
        this.carrera=carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return nombre+" " + apellido;
    }
    
}
