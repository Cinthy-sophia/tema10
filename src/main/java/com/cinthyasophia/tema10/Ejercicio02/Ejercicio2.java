package com.cinthyasophia.tema10.Ejercicio02;


import java.util.Random;

public class Ejercicio2 {
    public Random rnd = new Random();

    public Ejercicio2(){
        double aleatorio;
        ArrayListEstadisticas estadisticas = new ArrayListEstadisticas(10);

        for (int i = 0; i < 10 ; i++) {
            aleatorio=Math.floor(rnd.nextDouble()*100)/100;
            estadisticas.add(i,aleatorio);

            //System.out.println(estadisticas.get(i));
        }

        System.out.println(estadisticas.maximo());
        System.out.println(estadisticas.minimo());
        System.out.println(estadisticas.sumatorio());
        System.out.println(estadisticas.media());
        System.out.println(estadisticas.moda());

    }


}
