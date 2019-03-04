package com.cinthyasophia.tema10.Ejercicio11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CentroAlumnos {
    public Scanner lector = new Scanner(System.in);
    private ArrayList<Alumno> alumnos;
    private ArrayList<Profesor> profesores;
    private ArrayList<Grupo> grupos;
    private ArrayList<Asignatura> asignaturas;

    public CentroAlumnos(){

    }
    public int menuPrincipal(){
        int opcion=0;
        boolean validado;
        System.out.println("****************");
        System.out.println("*GESTION CENTRO*");
        System.out.println("****************");
        System.out.println("1. Dar de alta.");
        System.out.println("2. Modificar datos.");
        System.out.println("3. Borrar datos.");
        System.out.println("4. Consultas.");
        System.out.println("****************");
        System.out.println("0. Salir");
        System.out.println("\nSelecciona una opcion del menu:");
        do {
            try{
                opcion=lector.nextInt();
                validado=opcion>0&&opcion<4;
            }catch (InputMismatchException ime){
                System.out.println("Debes introducir un numero no una letra.");
                validado=false;
            }finally {
                lector.nextLine();
            }
            if (!validado){
                System.out.println("El numero debe estar en el rango indicado.");
            }
        }while(!validado);
        return opcion;
    }

    public int menuAlta(){
        int opcion=0;
        boolean validado;
        System.out.println("*************");
        System.out.println("*DAR DE ALTA*");
        System.out.println("*************");
        System.out.println("1. Nuevo alumno.");
        System.out.println("2. Nueva asignatura.");
        System.out.println("3. Nuevo grupo.");
        System.out.println("4. Nueva aula.");
        System.out.println("5. Nuevo profesor/a.");
        System.out.println("****************");
        System.out.println("0. Volver al menu principal");
        System.out.println("\nSelecciona una opcion del menu:");
        do {
            try{
                opcion=lector.nextInt();
                validado=opcion>0&&opcion<5;
            }catch (InputMismatchException ime){
                System.out.println("Debes introducir un numero no una letra.");
                validado=false;
            }finally {
                lector.nextLine();
            }
            if (!validado){
                System.out.println("El numero debe estar en el rango indicado.");
            }
        }while(!validado);
        return opcion;

    }
    public int menuModificarDatos(){
        int opcion=0;
        boolean validado;
        System.out.println("*****************");
        System.out.println("*MODIFICAR DATOS*");
        System.out.println("*****************");
        System.out.println("1. Modificar alumno.");
        System.out.println("2. Modificar asignatura.");
        System.out.println("3. Modificar grupo.");
        System.out.println("4. Modificar aula.");
        System.out.println("5. Modificar profesor/a.");
        System.out.println("****************");
        System.out.println("0. Volver al menu principal");
        System.out.println("\nSelecciona una opcion del menu:");
        do {
            try{
                opcion=lector.nextInt();
                validado=opcion>0&&opcion<5;
            }catch (InputMismatchException ime){
                System.out.println("Debes introducir un numero no una letra.");
                validado=false;
            }finally {
                lector.nextLine();
            }
            if (!validado){
                System.out.println("El numero debe estar en el rango indicado.");
            }
        }while(!validado);
        return opcion;

    }
    public int menuBorrarDatos(){
        int opcion=0;
        boolean validado;
        System.out.println("**************");
        System.out.println("*BORRAR DATOS*");
        System.out.println("**************");
        System.out.println("1. Borrar alumno.");
        System.out.println("2. Borrar asignatura.");
        System.out.println("3. Borrar grupo.");
        System.out.println("4. Borrar aula.");
        System.out.println("5. Borrar profesor/a.");
        System.out.println("****************");
        System.out.println("0. Volver al menu principal");
        System.out.println("\nSelecciona una opcion del menu:");
        do {
            try{
                opcion=lector.nextInt();
                validado=opcion>0&&opcion<5;
            }catch (InputMismatchException ime){
                System.out.println("Debes introducir un numero no una letra.");
                validado=false;
            }finally {
                lector.nextLine();
            }
            if (!validado){
                System.out.println("El numero debe estar en el rango indicado.");
            }
        }while(!validado);
        return opcion;
    }
    public int  menuconsultas(){
        int opcion=0;
        boolean validado;
        System.out.println("***********");
        System.out.println("*CONSULTAS*");
        System.out.println("***********");
        System.out.println("1. Mostrar alumnos por grupo.");
        System.out.println("2. Mostrar alumnos por profesor.");
        System.out.println("5. Mostrar aulas por grupo.");
        System.out.println("3. Lista de alumnos.");
        System.out.println("3. Lista de profesores.");
        System.out.println("4. Lista de asignaturas.");
        System.out.println("****************");
        System.out.println("0. Volver al menu principal");
        System.out.println("\nSelecciona una opcion del menu:");
        do {
            try{
                opcion=lector.nextInt();
                validado=opcion>0&&opcion<5;
            }catch (InputMismatchException ime){
                System.out.println("Debes introducir un numero no una letra.");
                validado=false;
            }finally {
                lector.nextLine();
            }
            if (!validado){
                System.out.println("El numero debe estar en el rango indicado.");
            }
        }while(!validado);
        return opcion;

    }
}
