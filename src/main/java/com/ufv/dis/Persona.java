package com.ufv.dis;

import java.util.ArrayList;

public class Persona {
    private String Nombre;
    private String apellido;
    private boolean casado;
    private int edad;

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", casado=" + casado +
                ", edad=" + edad +
                ", hijas=" + hijas +
                '}';
    }

    private ArrayList<Hija> hijas;

    public Persona(String Nombre, String apellido, boolean casado, int edad, ArrayList<Hija> hijas) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.casado = casado;
        this.edad = edad;
        this.hijas = hijas;
    }

    public Persona() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Hija> getHijas() {
        return hijas;
    }

    public void setHijas(ArrayList<Hija> hijas) {
        this.hijas = hijas;
    }
}
