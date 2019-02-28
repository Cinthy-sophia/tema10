package com.cinthyasophia.tema10.Ejercicio02;


import com.cinthyasophia.tema10.Util.Lib;

import java.util.Random;

public class Ejercicio2 {
    public Random rnd = new Random();
    private Lib lib= new Lib();
    public Ejercicio2(){
        double aleatorio;
        ArrayListEstadisticas estadisticas = new ArrayListEstadisticas(10);

        for (int i = 0; i < 10 ; i++) {
            aleatorio=Math.floor(lib.aleatorio(1,5)*100)/100;
            estadisticas.add(i,aleatorio);

            System.out.print(estadisticas.get(i)+" ");
        }

        System.out.println("\n"+estadisticas.maximo());
        System.out.println(estadisticas.minimo());
        System.out.println(estadisticas.sumatorio());
        System.out.println(estadisticas.media());
        System.out.println(estadisticas.moda());

    }


}
