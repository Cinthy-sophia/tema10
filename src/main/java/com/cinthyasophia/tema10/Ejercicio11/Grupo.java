package com.cinthyasophia.tema10.Ejercicio11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Grupo {
    private int id;
    private String nombre;
    private HashMap<Integer,Double> aula;

    public Grupo(int id,String nombre, int numeroAula, double metrosCuadrados){
        this.id=id;
        this.nombre=nombre;
        aula=new HashMap<>();
        aula.put(numeroAula,metrosCuadrados);
    }
    public Grupo(){
        id=0;
        nombre=" ";
        aula= new HashMap<>();
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

    public HashMap<Integer, Double> getAula() {
        return aula;
    }
    public Set<Integer> getNumeroAula(){
        return aula.keySet();
    }
    public Collection<Double> getMetrosAula(){
        return aula.values();
    }

    public void setAula(int numeroAula, double metrosCuadrados) {

        aula.put(numeroAula,metrosCuadrados);
    }
}
