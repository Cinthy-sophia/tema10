package com.cinthyasophia.tema10.Ejercicio04;

import java.util.Random;

public class Ejercicio4 {
    public Random rnd = new Random();

    public Ejercicio4(){
        Cola cola = new Cola(15);
        String letras = "abcdefghi";
        int aleatorio;
        for (int i = 0; i < 15; i++) {
            aleatorio=rnd.nextInt(9);
            cola.add(Character.toString(letras.charAt(aleatorio)));
        }
        System.out.println(cola.toString());
        System.out.println(cola.remove());
        System.out.println(cola.size());
        System.out.println(cola.peek());
        System.out.println(cola.isEmpty());
        System.out.println(cola.toString());



    }
}
