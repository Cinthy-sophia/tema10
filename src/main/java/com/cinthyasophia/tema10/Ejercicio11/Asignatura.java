package com.cinthyasophia.tema10.Ejercicio11;

public class Asignatura {
    private int id;
    private String nombre;
    private Profesor profesor;

    public Asignatura(int id, String nombre,int dni, String nombreP, String apellidoP, double sueldo){
        this.id=id;
        this.nombre=nombre;
        this.profesor= new Profesor(dni,nombreP,apellidoP,sueldo);
    }

    public Asignatura(){
        id=0;
        nombre=" ";
        profesor=new Profesor();
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

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(int dni, String nombre, String apellido, double sueldo) {
        this.profesor = new Profesor(dni,nombre, apellido,sueldo);
    }
}
