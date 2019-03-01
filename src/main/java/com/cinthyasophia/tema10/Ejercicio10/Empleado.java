package com.cinthyasophia.tema10.Ejercicio10;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private GregorianCalendar fechaNac;
    private double sueldo;
    private ArrayList<Hijo> hijos;

    public Empleado(int id, String nombre, String apellido, GregorianCalendar fechaNac,double sueldo){
        this.id= id;
        this.nombre= nombre;
        this.apellido= apellido;
        this.fechaNac= fechaNac;
        this.sueldo= sueldo;
        hijos= new ArrayList<>();

    }

    public boolean setHijos(String nombre, String apellido, int edad) {
        Hijo hijo= new Hijo(nombre,apellido,edad);
        return hijos.add(hijo);
    }

    public ArrayList<Hijo> getHijos() {
        return hijos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public GregorianCalendar getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(GregorianCalendar fechaNac) {
        this.fechaNac = fechaNac;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
