package com.cinthyasophia.tema10.Ejercicio03;

import java.util.ArrayList;

public class Pila implements IPila<String> {
    private ArrayList<String> pila;

    public Pila(int size){
        pila= new ArrayList<>(size);
    }
    @Override
    public String push(String e) {
        if(pila.add(e)){
            return e;
        } else {
            return "No se ha podido añadir." ;

        }
    }

    @Override
    public String pop() {
        return pila.remove(size()-1);
    }

    @Override
    public int size() {
        return pila.size();
    }

    @Override
    public String top() {
        return pila.get(size()-1);
    }

    @Override
    public boolean isEmpty() {
        return pila.isEmpty();
    }

    public String toString(){
        return pila.toString();
    }
}

