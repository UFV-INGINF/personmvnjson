package com.ufv.dis;

public class Hija {
    private String nombre;
    private int edad;

    public Hija(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Hija() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
