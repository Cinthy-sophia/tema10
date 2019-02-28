package com.cinthyasophia.tema10.Ejercicio03;

import java.util.Random;

public class Ejercicio3 {
    public Random rnd = new Random();

    public Ejercicio3(){
        Pila pila = new Pila(15);
        String letras = "abcdefghi";
        int aleatorio;
        for (int i = 0; i < 15; i++) {
            aleatorio=rnd.nextInt(9);
            pila.push(Character.toString(letras.charAt(aleatorio)));
        }
        System.out.println(pila.toString());
        System.out.println(pila.pop());
        System.out.println(pila.size());
        System.out.println(pila.top());
        System.out.println(pila.isEmpty());
        System.out.println(pila.toString());



    }
}
