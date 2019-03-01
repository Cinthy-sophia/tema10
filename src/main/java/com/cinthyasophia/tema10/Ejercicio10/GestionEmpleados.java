package com.cinthyasophia.tema10.Ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionEmpleados {
    public Scanner lector = new Scanner(System.in);

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
}
