package com.cinthyasophia.tema10.Ejercicio11;

public class Profesor {
    private int dni;
    private String nombre;
    private String apellido;
    private double sueldo;

    public Profesor(int dni,String nombre,String apellido,double sueldo){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.sueldo=sueldo;
    }
    public Profesor(){
        dni=0;
        nombre= " ";
        apellido= " ";
        sueldo=0;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
