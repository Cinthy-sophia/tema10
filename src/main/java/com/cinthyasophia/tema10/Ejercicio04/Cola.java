package com.cinthyasophia.tema10.Ejercicio04;

import java.util.ArrayList;

public class Cola implements ICola<String> {
    private ArrayList<String> cola;

    public Cola(int size) {
        cola= new ArrayList<>(size);
    }

    @Override
    public boolean add(String e) {
        if (cola.add(e)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String remove() {
        return cola.remove(0);
    }

    @Override
    public int size() {
        return cola.size();
    }

    @Override
    public String peek() {
        return cola.get(0);
    }

    @Override
    public boolean isEmpty() {
        return cola.isEmpty();
    }

    public String toString(){
        return cola.toString();
    }

}

