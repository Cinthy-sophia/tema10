package com.cinthyasophia.tema10.Ejercicio10;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionEmpleados {
    public Scanner lector = new Scanner(System.in);

    private ArrayList<String> Empleados;


    public int menuPrincipal(){
        int opcion=0;
        boolean isNumber;
        System.out.println("*******************");
        System.out.println("*GESTION EMPLEADOS*");
        System.out.println("*******************");
        System.out.println("1. Nuevo empleado.");
        System.out.println("2. Nuevo hijo.");
        System.out.println("3. Modificar sueldo.");
        System.out.println("4. Borrar empleado.");
        System.out.println("5. Borrar hijo.");
        System.out.println("6. Consultas.");
        System.out.println("---------------------");
        System.out.println("0. Salir.");
        do {
            try{
                opcion=lector.nextInt();
                isNumber=true;
            }catch (InputMismatchException ime){
                System.out.println("Debes introducir numeros, no letras.");
                isNumber=false;
            }finally {
                lector.nextLine();
            }
            if (opcion<0||opcion>6){
                System.out.println("Opcion incorrecta.");
            }

        }while(!isNumber||opcion<0||opcion>6);

        return opcion;

    }
    public int menuConsultas(){
        int opcion=0;
        boolean isNumber;
        System.out.println("*******************");
        System.out.println("*CONSULTAS EMPLEADOS*");
        System.out.println("*******************");
        System.out.println("1. Buscar por NIF.");
        System.out.println("2. Buscar por nombre.");
        System.out.println("3. Buscar por rango de edad.");
        System.out.println("4. Buscar por rango de sueldo.");
        System.out.println("5. Buscar por hijos menores de edad.");
        System.out.println("---------------------");
        System.out.println("0. Volver al menu principal.");
        do {
            try{
                opcion=lector.nextInt();
                isNumber=true;
            }catch (InputMismatchException ime){
                System.out.println("Debes introducir numeros, no letras.");
                isNumber=false;
            }finally {
                lector.nextLine();
            }
            if (opcion<0||opcion>5){
                System.out.println("Opcion incorrecta.");
            }

        }while(!isNumber||opcion<0||opcion>5);

        return opcion;

    }

}
