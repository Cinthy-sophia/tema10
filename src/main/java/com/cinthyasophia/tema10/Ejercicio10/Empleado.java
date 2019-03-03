package com.cinthyasophia.tema10.Ejercicio10;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private GregorianCalendar fechaNac;
    private double sueldo;
    private HashMap<String,Integer> hijos;

    public Empleado(int id, String nombre, String apellido, GregorianCalendar fechaNac,double sueldo){
        this.id= id;
        this.nombre= nombre;
        this.apellido= apellido;
        this.fechaNac= fechaNac;
        this.sueldo= sueldo;
        hijos= new HashMap<>();

    }

    public void setHijos(String nombre, int edad) {
        hijos.put(nombre,edad);
    }

    public HashMap<String, Integer> getHijos() {
        return hijos;
    }

    public Set<String> getNombresHijos() {
        return hijos.keySet();
    }
    public Collection<Integer> getEdadHijos(){
        return hijos.values();
    }

    public int getId() {
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

    @Override
    public String toString() {
        SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%9d\t",id)+String.format("%-9s\t",nombre)+
        String.format("%-9s\t",apellido)+
        format.format(fechaNac.getTime())+String.format("%5d",getEdad())+
        String.format("%9.2f\t",sueldo)+String.format("%-9s",hijos.keySet());
    }
}
