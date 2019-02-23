package com.cinthyasophia.tema10.Ejercicio02;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListEstadisticas implements IEstadisticas {
    private ArrayList<Double> lista;

    public ArrayListEstadisticas(){
        lista = new ArrayList<>();
    }

    @Override
    public double minimo() {
        double min;
        min= Double.MAX_VALUE;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)<min) {
                min=lista.get(i);
            }

        }
        return min;
    }

    @Override
    public double maximo() {
        double max;
        max=Double.MIN_VALUE;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)>max) {
                max=lista.get(i);
            }

        }
        return max;
    }

    @Override
    public double sumatorio() {
        double sumatorio=0;
        for (double n:lista) {
            sumatorio=+n;
        }
        return sumatorio;
    }

    @Override
    public double media() {
        double sumatorio=0;
        double total;
        for (double n:lista) {
            sumatorio=+n;
        }
        total = sumatorio/lista.size();
        return total;
    }

    @Override
    public double moda() {
        HashMap<Double,Integer> repetidos = new HashMap<>();

        for (int i = 0; i <lista.size() ; i++) {

        }
        return 0;
    }
}
