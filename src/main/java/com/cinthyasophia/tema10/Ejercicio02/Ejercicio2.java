package com.cinthyasophia.tema10.Ejercicio02;



public class Ejercicio2 {


    public Ejercicio2(){
        double aleatorio;
        ArrayListEstadisticas estadisticas = new ArrayListEstadisticas();

        for (int i = 0; i < estadisticas.size() ; i++) {
            aleatorio= Math.floor(1.5);
            estadisticas.add(i,aleatorio);
        }

        System.out.println(estadisticas.maximo());
        System.out.println(estadisticas.minimo());
        System.out.println(estadisticas.sumatorio());
        System.out.println(estadisticas.media());
        System.out.println(estadisticas.moda());

    }


}
