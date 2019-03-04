package com.cinthyasophia.tema10.Ejercicio11;

import java.util.ArrayList;

public class Alumno {
    private static int id;
    private String nombre;
    private String apellido;
    private Grupo grupo;
    private ArrayList<Asignatura> listaAsig;

    public Alumno(String nombre,String apellido, Grupo grupo){
        id++;
        this.nombre=nombre;
        this.apellido=apellido;
        this.grupo=grupo;
        listaAsig= new ArrayList<>();

    }

    public static int getId() {
        return id;
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

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public ArrayList<Asignatura> getListaAsig() {
        return listaAsig;
    }

    public void setListaAsig(Asignatura asig) {
        listaAsig.add(asig);
    }
}
