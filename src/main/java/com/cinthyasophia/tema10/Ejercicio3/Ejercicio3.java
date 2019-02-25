package com.cinthyasophia.tema10.Ejercicio3;

import java.util.Random;

public class Ejercicio3 {
    public Random rnd = new Random();

    public Ejercicio3(){
        Pila pila = new Pila();
        String letras = "abcdefghi";
        int aleatorio;
        for (int i = 0; i < 15; i++) {
            aleatorio=rnd.nextInt(9);
            System.out.print(pila.push(Character.toString(letras.charAt(aleatorio)))+"");
        }
        System.out.println("\n"+pila.pop());
        System.out.println(pila.size());
        System.out.println(pila.top());
        System.out.println(pila.isEmpty());


    }
}
