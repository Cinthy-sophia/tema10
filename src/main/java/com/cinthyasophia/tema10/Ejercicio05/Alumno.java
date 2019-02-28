package com.cinthyasophia.tema10.Ejercicio05;

public class Alumno {
    private int id;
    private String nom;
    private String fechaNac;
    private char sexo;
    private double altura;
    private double peso;

    public Alumno(int id, String nom, String fechaNac, double altura, double peso){
        this.id=id;
        this.nom= nom;
        this.sexo='M';
        this.fechaNac=fechaNac;
        this.altura=altura;
        this.peso= peso;
    }

    public Alumno(){
        id= 0;
        nom= "";
        sexo= 'M';
        fechaNac= "";
        altura= 0;
        peso=0;
    }

}
