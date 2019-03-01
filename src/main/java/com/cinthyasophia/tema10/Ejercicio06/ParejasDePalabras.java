package com.cinthyasophia.tema10.Ejercicio06;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ParejasDePalabras {
    public Scanner lector = new Scanner(System.in);
    private HashMap<String,String> parejas;

    public ParejasDePalabras(){
        parejas= new HashMap<>();
        int opcion;
        do {
            opcion= menuPrincipal();
            switch (opcion){
                case 1:
                    insertarPalabras();
                    break;
                case 2:
                    traducirPalabras();
                    break;
                case 0:
                    System.out.println("Adios! :)");
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }

        }while(opcion!=0);
    }
    public void insertarPalabras(){
        int cantidadParejas=0;
        boolean isNumber;
        String palabraIngles;
        String palabraValenciano;
        do {
            try {
                System.out.println("¿Cuantas parejas deseas introducir?");
                cantidadParejas= lector.nextInt();
                isNumber=true;
            }catch (InputMismatchException ime){
                System.out.println("Debes introducir un numero.");
                isNumber=false;
            }finally {
                lector.nextLine();
            }

            if (cantidadParejas<0){
                System.out.println("Introduce un numero positivo.");
            }

        }while (!isNumber|| cantidadParejas<0);

        for (int i = 0; i < cantidadParejas; i++) {
            System.out.print("Palabra en ingles:");
            palabraIngles= lector.nextLine();

            System.out.print("Traduccion al valenciano:");
            palabraValenciano= lector.nextLine();

            parejas.put(palabraIngles,palabraValenciano);
        }


    }
    public void traducirPalabras(){
        String palabraATraducir;
        System.out.print("Inserta la palabra a buscar: ");
        palabraATraducir= lector.nextLine();

        System.out.println(parejas.getOrDefault(palabraATraducir, "La palabra no existe. Selecciona 1 en el menu principal para introducirla junto con su traduccion."));
    }


    public int menuPrincipal(){
        int opcion=0;
        boolean isNumber;
        System.out.println("MENU PRINCIPAL");
        System.out.println("===============");
        System.out.println("1. Insertar parejas de palabras.");
        System.out.println("2. Traducir palabras.");
        System.out.println("0. Salir de la aplicación.");
        do {
            try{
                System.out.print("\nIndica una opcion valida: ");
                opcion= lector.nextInt();
                isNumber= true;
            }catch(InputMismatchException ime){
                System.out.println("Debes introducir un numero no letras.");
                isNumber=false;
            }finally {
                lector.nextLine();
            }
            if (opcion>2||opcion<0){
                System.out.println("Opcion incorrecta.");

            }
        }while(!isNumber||opcion>2||opcion<0);

        return opcion;
    }

}
