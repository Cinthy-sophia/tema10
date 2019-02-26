package com.cinthyasophia.tema10.Ejercicio02;


import java.util.ArrayList;
import java.util.HashMap;



public class ArrayListEstadisticas implements IEstadisticas {
    private ArrayList<Double> lista;

    public ArrayListEstadisticas(int i){
        lista = new ArrayList<>(i);

    }

    @Override
    public double minimo() {
        double min;
        min= Double.MAX_VALUE;

        for (Double num : lista) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public double maximo() {
        double max;
        max=0;
        for (Double num : lista) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @Override
    public double sumatorio() {
        double sumatorio=0;
        for (double n: lista) {
            sumatorio+=n;
        }
        return sumatorio;
    }

    @Override
    public double media() {
        return sumatorio()/lista.size();
    }

    @Override
    public double moda() {
        HashMap<Double,Double> repetidos = new HashMap<>();
        double contadorRep;
        double max= Double.MIN_VALUE;
        ArrayList<Double> claves = new ArrayList<>();

        for (int i = 0; i <lista.size() ; i++) {
            if(!repetidos.containsKey(lista.get(i))) {

                contadorRep = 0;
                for (double num : lista) {
                    if (lista.get(i).equals(num)) {
                        contadorRep++;
                    }
                    repetidos.put(lista.get(i), contadorRep);
                    claves.add(lista.get(i));
                }
            }
        }
        double numRep=0;
        for (double num : claves) {

            if (repetidos.get(num) > max) {
                max = repetidos.get(num);
                numRep= num;
            }

        }
        return numRep;
    }



    public int size() {
        return lista.size();
    }


    public boolean isEmpty() {
        return lista.isEmpty();
    }


    public boolean contains(double o) {
        return lista.contains(o);
    }


    public double get(int i) {
        return lista.get(i);
    }


    public double set(int i, double o) {
        return lista.set(i,o) ;
    }


    public double remove(int i) {
        return lista.remove(i);
    }

    public void add(int i, double o) {
        lista.add(i,o);

    }
}
