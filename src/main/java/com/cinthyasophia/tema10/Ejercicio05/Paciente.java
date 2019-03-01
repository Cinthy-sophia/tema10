package com.cinthyasophia.tema10.Ejercicio05;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Paciente {
    private int id;
    private String nom;
    private GregorianCalendar fechaNac;
    private char sexo;
    private double altura;
    private double peso;

    public Paciente(int id, String nom, GregorianCalendar fechaNac, double altura, double peso){
        this.id=id;
        this.nom= nom;
        this.sexo='M';
        this.fechaNac=fechaNac;
        this.altura=altura;
        this.peso= peso;
    }
    public Paciente(){
        id=0;
        nom="";
        sexo='M';
        fechaNac= new GregorianCalendar();
        altura= 0;
        peso=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public GregorianCalendar getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(GregorianCalendar fechaNac) {
        this.fechaNac = fechaNac;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {

        if(sexo=='M'|| sexo=='F')
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getEdad(){
        int year= fechaNac.get(Calendar.YEAR);
        int month= fechaNac.get(Calendar.MONTH);
        int day= fechaNac.get(Calendar.DAY_OF_MONTH);

        LocalDate birth= LocalDate.of(year,month,day);
        LocalDate now= LocalDate.now();
        Period p;
        p= Period.between(birth, now);

        if (birth.isBefore(now)){
            return p.getYears()-1;
        }else{
            return p.getYears();
        }
    }
    public double calcularIMC(){
        return peso/(altura*altura);
    }
    public String mensajeIMC(){
        double indicePaciente=calcularIMC();

        if (indicePaciente<18.5){
            return "Peso insuficiente.";
        }else if (indicePaciente>=18.5 && indicePaciente<=24.9){
            return "Peso normal.";
        } else if(indicePaciente>=25 && indicePaciente <= 26.9){
            return "Sobrepeso grave I.";
        }else if (indicePaciente>=27 && indicePaciente <= 29.9){
            return "Sobrepeso grave II.";
        }else {
            return "Sobrepeso grave III.";
        }

    }


   @Override
    public String toString() {

        return String.format("Paciente numero %2d:\t %10s ",getId(),mensajeIMC());
    }
}
