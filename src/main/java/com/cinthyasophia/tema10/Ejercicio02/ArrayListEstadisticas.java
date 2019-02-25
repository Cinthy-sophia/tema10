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
        max=Double.MIN_VALUE;
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
        HashMap<Double,Double> repetidos = new HashMap<>();
        double contadorRep;
        double max= Double.MIN_VALUE;
        ArrayList<Double> claves = new ArrayList<>();

        for (int i = 0; i <lista.size() ; i++) {
            if(!repetidos.containsKey(lista.get(i))) {

                for (Double num : lista) {
                    contadorRep = 0;
                    if (lista.get(i).equals(num)) {
                        contadorRep++;
                    }
                    repetidos.put(lista.get(i), contadorRep);
                    claves.add(lista.get(i));
                }
            }
        }

        for (double num : lista) {

            if (repetidos.get(num) > max) {
                max = repetidos.get(num);
            }

        }
        return max;
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


    public Object get(int i) {
        return lista.get(i);
    }


    public Object set(int i, double o) {
        return lista.set(i,o) ;
    }


    public Object remove(int i) {
        return lista.remove(i);
    }

    public void add(int i, double o) {
        lista.add(i,o);

    }
}
