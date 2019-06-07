package com.cinthyasophia.tema10.Ejercicio11;

import com.cinthyasophia.tema10.Util.Lib;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CentroAlumnos {
    public Scanner lector = new Scanner(System.in);
    private ArrayList<Alumno> alumnos;
    private ArrayList<Profesor> profesores;
    private ArrayList<Grupo> grupos;
    private ArrayList<Asignatura> asignaturas;
    private Lib lib = new Lib();

    public CentroAlumnos(){
        int opcion;
        do {
            opcion=menuPrincipal();
            switch (opcion){
                case 1:
                    //darDeAlta();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Hasta luego :)");
                    break;
                default:
                    System.out.println("Error.");
            }

        }while(opcion!=0);

    }
    public void darDeAlta(){
        int opcion;
        do {
            opcion=menuAlta();
            switch (opcion){
                case 1:
                    //nuevoAlumno();
                    break;
                case 2:
                    //nuevaAsignatura();
                    break;
                case 3:
                    //nuevoGrupo();
                    break;
                case 4:
                    //nuevaAula();
                    break;
                case 5:
                    //nuevoProfesor();
                    break;
                case 0:
                    System.out.println(lib.volverMenu());
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }
        }while(opcion!=0);
    }
    public void nuevoAlumno(){
        String nombre;
        String apellido;
        Grupo grupo;
        boolean validado;
        ArrayList<Asignatura> asignaturas;

        System.out.println("*NUEVO ALUMNO*");
        System.out.println("Identificador añadido.");
        do {
            System.out.println("Indique el nombre: ");
            nombre=lector.nextLine();
            validado=nombre.length()>4&& nombre.length()<20;
            if (!validado) {
                System.out.println("El tamaño no es el indicado.");
            }
        }while(!validado);
        do {
            System.out.println("Indique el apellido: ");
            apellido=lector.nextLine();
            validado=apellido.length()>5&& apellido.length()<20;
            if (!validado) {
                System.out.println("El tamaño no es el indicado.");
            }
        }while(!validado);
        do {
            System.out.println("Indique el grupo en el que se desea inscribir: ");
            apellido=lector.nextLine();
            validado=apellido.length()>5&& apellido.length()<20;
            if (!validado) {
                System.out.println("El tamaño no es el indicado.");
            }
        }while(!validado);




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
                validado=true;
            }catch (InputMismatchException ime){
                System.out.println("Debes introducir un numero no una letra.");
                validado=false;
            }finally {
                lector.nextLine();
            }
            if (opcion>0&&opcion<4){
                System.out.println("El numero debe estar en el rango indicado.");
            }
        }while(!validado||opcion>0&&opcion<4);
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
                validado=true;
            }catch (InputMismatchException ime){
                System.out.println("Debes introducir un numero no una letra.");
                validado=false;
            }finally {
                lector.nextLine();
            }
            if (opcion>0&&opcion<5){
                System.out.println("El numero debe estar en el rango indicado.");
            }
        }while(!validado||opcion>0&&opcion<5);
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
                validado=true;
            }catch (InputMismatchException ime){
                System.out.println("Debes introducir un numero no una letra.");
                validado=false;
            }finally {
                lector.nextLine();
            }
            if (opcion>0&&opcion<5){
                System.out.println("El numero debe estar en el rango indicado.");
            }
        }while(!validado|| opcion>0&&opcion<5);
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
                validado=true;
            }catch (InputMismatchException ime){
                System.out.println("Debes introducir un numero no una letra.");
                validado=false;
            }finally {
                lector.nextLine();
            }
            if (opcion>0&&opcion<5){
                System.out.println("El numero debe estar en el rango indicado.");
            }
        }while(!validado|| opcion>0&&opcion<5);
        return opcion;
    }
    public int  menuconsultas(){
        int opcion=0;
        boolean validado;
        System.out.println("***********");
        System.out.println("*CONSULTAS*");
        System.out.println("***********");
        System.out.println("1. Mostrar alumnos por grupo.");
        System.out.println("2. Mostrar alumnos por id.");
        System.out.println("3. Buscar profesor por rango de sueldo.");
        System.out.println("4. Mostrar alumnos por profesor.");
        System.out.println("5. Buscar grupo por aulas.");
        System.out.println("6. Mostrar todos los grupos.");
        System.out.println("7. Mostrar todos los alumnos.");
        System.out.println("8. Mostrar todos los profesores.");
        System.out.println("9. Mostrar todas las asignaturas.");
        System.out.println("****************************************");
        System.out.println("0. Volver al menu principal");
        System.out.println("\nSelecciona una opcion del menu:");
        do {
            try{
                opcion=lector.nextInt();
                validado=true;
            }catch (InputMismatchException ime){
                System.out.println("Debes introducir un numero no una letra.");
                validado=false;
            }finally {
                lector.nextLine();
            }
            if (opcion>0&&opcion<9){
                System.out.println("El numero debe estar en el rango indicado.");
            }
        }while(!validado||opcion>0&&opcion<9);
        return opcion;

    }
}
