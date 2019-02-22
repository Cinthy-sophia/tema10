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
        System.out.println(lista);

    }

    public ArrayList<Integer> listaEnteros(int[] array){

        ArrayList<Integer> lista=new ArrayList<>(array.length);

        for (int i = 0; i <array.length ; i++) {
            lista.add(i,0);
        }
        int punteroPar=0;
        int punteroImpar= lista.size()-1;


            for (int i = 0; i <array.length ; i++) {

                if (array[i]%2==0){
                    lista.set(punteroPar,array[i]);
                    punteroPar++;

                }else {
                    lista.set(punteroImpar,array[i]);
                    punteroImpar--;
                }

            }



        return lista;

    }
}
