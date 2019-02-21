package com.cinthyasophia.tema10.ejercicio01;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio1 {
    public Random rnd = new Random();

    public Ejercicio1(){
        int[] array = new int[10];
        int aleatorio;
        ArrayList<Integer> lista;
        for (int i = 0; i <array.length ; i++) {
            aleatorio=rnd.nextInt(50);
            array[i]=aleatorio;
        }
        lista=listaEnteros(array);
        System.out.println();

    }

    public ArrayList<Integer> listaEnteros(int[] array){

        ArrayList<Integer> lista=new ArrayList<>(array.length);
        int punteroPar=0;
        int punteroImpar= lista.size();

        do {
            for (int i = 0; i <array.length ; i++) {

                if (array[i]%2==0){
                    lista.add(punteroPar,array[i]);
                    punteroPar++;

                }else {
                    lista.add(punteroImpar,array[i]);
                    //punteroImpar--;
                }
                //lista.
            }

        }while(punteroPar!=punteroImpar);

        return lista;

    }
}
