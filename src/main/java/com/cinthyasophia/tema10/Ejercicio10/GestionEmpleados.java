package com.cinthyasophia.tema10.Ejercicio10;

import com.cinthyasophia.tema10.Util.Lib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class GestionEmpleados {

    public Scanner lector = new Scanner(System.in);
    private Lib lib = new Lib();

    private String[] apellidos={"PEREZ","JIMENEZ","GONZALEZ","HERNANDEZ","CASTILLO","ROMERO","ORTIZ","MEDINA","FLORES","SILVA"};
    private String[] nombres={"ERIKA","FRANCISCO","FERNANDO","JAVIER","LUCIA","MANOLO","CINTHYA","VICTORIA","MAURICIO","RICARDO"};

    private HashMap<Integer, Empleado> empleados=new HashMap<>();

    public GestionEmpleados() {
        datosAleatorios(5);
        int opcion;
        do {
            opcion=menuPrincipal();
            switch (opcion) {
                case 1:
                    nuevoEmpleado();
                    break;
                case 2:
                    nuevoHijo();
                    break;
                case 3:
                    modificarSueldo();
                    break;
                case 4:
                    borrarEmpleado();
                    break;
                case 5:
                    borrarHijo();
                    break;
                case 6:
                    consultas();
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }

        }while(opcion!=0);

    }

    public void nuevoEmpleado() {
        boolean validado;
        boolean isNumber;
        int id = 0;
        String nombre;
        String apellido;
        String fechaNac;
        GregorianCalendar fechaNacimiento = new GregorianCalendar();
        double sueldo = 0;
        String tieneHijo;
        String nombreHijo;
        int edadHijo = 0;
        Empleado empleado;

        System.out.println("\u001B[H\u001B[2J****************");
        System.out.println("*NUEVO EMPLEADO*");
        System.out.println("****************");

        System.out.println("Vamos a proceder a pedir los datos del empleado, presiona intro para continuar:");
        lector.nextLine();
        do {
            System.out.println("Introduce el documento de identidad:");
            try {
                id = lector.nextInt();
                validado = true;

            } catch (InputMismatchException ime) {
                System.out.println("Debes introducir un numero y no una letra.");
                validado = false;

            } finally {
                lector.nextLine();
            }

            if (id < 0) {
                lib.errorDatos();
                System.out.println("El documento de identidad no puede ser menor que 0.");
                validado = false;

            } else if (buscar(id)) {
                System.out.println("El empleado ya existe, introduzca otro, o seleccione otra opción.");
                return;

            }
        } while (!validado);


        do {
            System.out.println("Introduce el nombre:");
            nombre = lector.nextLine();
            validado = nombre.length() > 4 && nombre.length() < 20;

            if (!validado) {
                lib.errorDatos();
            }
        } while (!validado);

        do {
            System.out.println("Introduce el apellido:");
            apellido = lector.nextLine();
            validado = apellido.length() > 4 && apellido.length() < 20;

            if (!validado) {
                lib.errorDatos();
            }
        } while (!validado);

        do {

            System.out.println("Introduce la fecha de nacimiento (dd/mm/yyyy):");
            fechaNac = lector.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date d = format.parse(fechaNac);
                fechaNacimiento.setTime(d);
                validado = true;
            } catch (ParseException pe) {
                validado = false;
                System.out.println("Fecha incorrecta. El formato debe ser dd/mm/yyyy.");

            }
        } while (!validado);

        do {
            System.out.println("Introduce el sueldo asignado:");
            try {
                sueldo = lector.nextDouble();
                validado = true;
            } catch (InputMismatchException ime) {
                lib.errorDatos();
                validado = false;
            } finally {
                lector.nextLine();
            }

        } while (!validado);

        empleado = new Empleado(id, nombre, apellido, fechaNacimiento, sueldo);

        do {
            System.out.println("¿El empleado tiene hijos? S/N");
            tieneHijo = lector.nextLine();
            validado = tieneHijo.equalsIgnoreCase("S") || tieneHijo.equalsIgnoreCase("N");

            if (!validado) {

                System.out.println("Opcion incorrecta, debes responder S/N.");
            }

            if (tieneHijo.equalsIgnoreCase("S")) {
                System.out.println("Indica el nombre de el hijo: ");
                nombreHijo = lector.nextLine();
                do {
                    System.out.println("Indica la edad de el niño: ");
                    try {
                        edadHijo = lector.nextInt();
                        isNumber = true;
                    } catch (InputMismatchException ime) {
                        System.out.println("Debes introducir un numero, no una letra.");
                        isNumber = false;
                    } finally {

                        lector.nextLine();
                    }

                } while (!isNumber);

                empleado.setHijos(nombreHijo, edadHijo);
            }

        } while (!validado);

        if (empleados.isEmpty()||empleados.containsKey(null)|| empleados.containsValue(null)) {
            empleados.replace(id,empleado);
        }else {
            empleados.put(id,empleado);
        }
        System.out.println("¡Empleado creado con éxito!");

    }

    public void nuevoHijo() {
        boolean validado;
        boolean isNumber;
        int id = 0;
        String nombreHijo;
        int edadHijo = 0;

        System.out.println("\u001B[H\u001B[2J************");
        System.out.println("*NUEVO HIJO*");
        System.out.println("************");
        do {
            System.out.println("Introduce el documento de identidad:");
            try {
                id = lector.nextInt();
                validado = true;

            } catch (InputMismatchException ime) {
                System.out.println("Debes introducir un numero y no una letra.");
                validado = false;

            } finally {
                lector.nextLine();
            }

            if (id < 0) {
                lib.errorDatos();
                System.out.println("El documento de identidad no puede ser menor que 0.");
                validado = false;

            }
        } while (!validado);

        if (buscar(id)) {
            System.out.println("Indica el nombre de el hijo/a: ");
            nombreHijo = lector.nextLine();
            do {
                System.out.println("Indica la edad de el hijo/a: ");
                try {
                    edadHijo = lector.nextInt();
                    isNumber = true;
                } catch (InputMismatchException ime) {
                    System.out.println("Debes introducir un numero, no una letra.");
                    isNumber = false;
                } finally {

                    lector.nextLine();
                }

                if (edadHijo < 0) {
                    lib.errorDatos();
                    isNumber = false;

                }

            } while (!isNumber);

            empleados.get(id).setHijos(nombreHijo, edadHijo);

        }else{
            System.out.println("El empleado no existe, seleccione la opcion 1 en el menu para introducirlo o indique un documento de identidad existente.");
        }

    }

    public void modificarSueldo() {
        boolean validado;
        int id = 0;
        double sueldo=0;

        System.out.println("\u001B[H\u001B[2J******************");
        System.out.println("*MODIFICAR SUELDO*");
        System.out.println("******************");
        do {
            System.out.println("Introduce el documento de identidad:");
            try {
                id = lector.nextInt();
                validado = true;

            } catch (InputMismatchException ime) {
                System.out.println("Debes introducir un numero y no una letra.");
                validado = false;

            } finally {
                lector.nextLine();
            }

            if (id < 0) {
                lib.errorDatos();
                System.out.println("El documento de identidad no puede ser menor que 0.");
                validado = false;

            }
        } while (!validado);

        if (buscar(id)) {
            do {
                System.out.println("Introduce el nuevo sueldo a asignar:");
                try {
                    sueldo = lector.nextDouble();
                    validado = true;
                } catch (InputMismatchException ime) {
                    lib.errorDatos();
                    validado = false;
                } finally {
                    lector.nextLine();
                }

            } while (!validado);

            empleados.get(id).setSueldo(sueldo);

            System.out.println("Sueldo modificado con éxito.");

        }else{
            System.out.println("El empleado no existe, seleccione la opcion 1 en el menu para introducirlo o indique un documento de identidad existente.");
        }


    }
    public void borrarEmpleado(){
        int id=0;
        boolean validado;

        System.out.println("\u001B[H\u001B[2J*****************");
        System.out.println("*BORRAR EMPLEADO*");
        System.out.println("*****************");
        do {
            System.out.println("Introduce el documento de identidad:");
            try {
                id = lector.nextInt();
                validado = true;

            } catch (InputMismatchException ime) {
                System.out.println("Debes introducir un numero y no una letra.");
                validado = false;

            } finally {
                lector.nextLine();
            }

            if (id < 0) {
                lib.errorDatos();
                System.out.println("El documento de identidad no puede ser menor que 0.");
                validado = false;

            }
        } while (!validado);

        if (buscar(id)) {
            empleados.remove(id,empleados.get(id));
        }else{
            System.out.println("El empleado no existe, seleccione la opcion 1 en el menu para introducirlo o indique un documento de identidad existente.");
        }

    }
    public void borrarHijo(){
        int id=0;
        boolean validado;
        String nomHijo;
        Set<String> nombresHijosEmpleado;

        System.out.println("\u001B[H\u001B[2J*************");
        System.out.println("*BORRAR HIJO*");
        System.out.println("*************");
        do {
            System.out.println("Introduce el documento de identidad:");
            try {
                id = lector.nextInt();
                validado = true;

            } catch (InputMismatchException ime) {
                System.out.println("Debes introducir un numero y no una letra.");
                validado = false;

            } finally {
                lector.nextLine();
            }

            if (id < 0) {
                lib.errorDatos();
                System.out.println("El documento de identidad no puede ser menor que 0.");
                validado = false;

            }
        } while (!validado);

        if (buscar(id)) {
            nombresHijosEmpleado= empleados.get(id).getNombresHijos();
            System.out.println("Introduzca el nombre del hijo/a:");
            nomHijo=lector.nextLine();

            if (nombresHijosEmpleado.contains(nomHijo)){
                empleados.get(id).getHijos().remove(nomHijo);
                System.out.println("Hijo borrado con exito.");
            }

        }else{
            System.out.println("El empleado no existe, seleccione la opcion 1 en el menu para introducirlo o indique un documento de identidad existente.");
        }

    }
    public void consultas(){
        int opcion;
        do{
            opcion=menuConsultas();
            switch (opcion){
                case 1:
                    buscarPorNif();
                    break;
                case 2:
                    buscarPorNombre();
                    break;
                case 3:
                    buscarPorRangoDeEdad();
                    break;
                case 4:
                    buscarPorRangoDeSueldo();
                    break;
                case 5:
                    buscarPorHijosMenoresDeEdad();
                    break;
                case 6:
                    mostrarTodo();
                    break;
                case 0:
                    lib.volverMenu();
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }
        }while(opcion!=0);
    }
    public void mostrarTodo(){
        Collection<Empleado> empleadoValores= empleados.values();
        for (Empleado e: empleadoValores) {
            System.out.println(e.toString());

        }
    }
    public void buscarPorNif (){
        int id=0;
        boolean validado;
        do {
            System.out.println("Introduce el documento de identidad:");
            try {
                id = lector.nextInt();
                validado = true;

            } catch (InputMismatchException ime) {
                System.out.println("Debes introducir un numero y no una letra.");
                validado = false;

            } finally {
                lector.nextLine();
            }

            if (id < 0) {
                lib.errorDatos();
                System.out.println("El documento de identidad no puede ser menor que 0.");
                validado = false;

            }
        } while (!validado);

        if (buscar(id)) {
            System.out.println(empleados.get(id).toString());

        }else{
            System.out.println("El empleado no existe, vuelva al menu principal para introducirlo, o indique un documento de identidad existente.");
        }
    }
    public void buscarPorNombre(){
        String nombre;
        Collection<Empleado> valorEmpleados= empleados.values();
        System.out.println("Introduce el nombre del empleado a buscar:");
        nombre = lector.nextLine();

        for (Empleado e:valorEmpleados) {
            if (e.getNombre().contains(nombre.toUpperCase())){
                System.out.println(e.toString());
            }
        }

    }
    public void buscarPorRangoDeEdad(){
        int edadMin=0;
        int edadMax=0;
        boolean validado;
        Collection<Empleado> valorEmpleados=empleados.values();
        do {
            try {
                System.out.println("Introduce una edad mínima:");
                edadMin = lector.nextInt();
                System.out.println("Introduce una edad máxima:");
                edadMax = lector.nextInt();
                validado=true;
            }catch (InputMismatchException ime){
                System.out.println("Debes introducir numeros, no letras.");
                validado=false;
            }
        }while(!validado);

        for (Empleado e: valorEmpleados) {
            if(e.getEdad()<edadMax && e.getEdad()>edadMin){
                System.out.println(e.toString());

            }

        }

    }
    public void buscarPorRangoDeSueldo(){
        int sueldoMin=0;
        int sueldoMax=0;
        boolean validado;
        Collection<Empleado> valorEmpleados=empleados.values();
        do {
            try {
                System.out.println("Introduce un sueldo mínimo:");
                sueldoMin = lector.nextInt();
                System.out.println("Introduce un sueldo máximo:");
                sueldoMax = lector.nextInt();
                validado=true;
            }catch (InputMismatchException ime){
                System.out.println("Debes introducir numeros, no letras.");
                validado=false;
            }
        }while(!validado);

        for (Empleado e: valorEmpleados) {
            if(e.getSueldo()<sueldoMax && e.getSueldo()>sueldoMin){
                System.out.println(e.toString());

            }

        }
    }
    public void buscarPorHijosMenoresDeEdad(){
        Collection<Empleado> valorEmpleados= empleados.values();
        Collection<Integer> edadHijos;

        for (Empleado e: valorEmpleados) {
            edadHijos=e.getEdadHijos();
            for (int edad: edadHijos) {
                if(edad<18){
                    System.out.println(e.toString());
                }
            }

        }

    }

    public int menuPrincipal() {
        int opcion = 0;
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
            try {
                opcion = lector.nextInt();
                isNumber = true;
            } catch (InputMismatchException ime) {
                System.out.println("Debes introducir numeros, no letras.");
                isNumber = false;
            } finally {
                lector.nextLine();
            }
            if (opcion < 0 || opcion > 6) {
                System.out.println("Opcion incorrecta.");
            }

        } while (!isNumber || opcion < 0 || opcion > 6);

        return opcion;

    }
    public int menuConsultas() {
        int opcion = 0;
        boolean isNumber;
        System.out.println("*********************");
        System.out.println("*CONSULTAS EMPLEADOS*");
        System.out.println("*********************");
        System.out.println("1. Buscar por NIF.");
        System.out.println("2. Buscar por nombre.");
        System.out.println("3. Buscar por rango de edad.");
        System.out.println("4. Buscar por rango de sueldo.");
        System.out.println("5. Buscar por hijos menores de edad.");
        System.out.println("6. Mostrar todos los empleados.");
        System.out.println("---------------------");
        System.out.println("0. Volver al menu principal.");
        do {
            try {
                opcion = lector.nextInt();
                isNumber = true;
            } catch (InputMismatchException ime) {
                System.out.println("Debes introducir numeros, no letras.");
                isNumber = false;
            } finally {
                lector.nextLine();
            }
            if (opcion < 0 || opcion > 6) {
                System.out.println("Opcion incorrecta.");
            }

        } while (!isNumber || opcion < 0 || opcion > 6);

        return opcion;

    }
    public boolean buscar(int i){
        Set<Integer> clavesId= empleados.keySet();

       return clavesId.contains(i);
    }
    public void datosAleatorios(int n){
        int id;
        String nombre;
        String apellido;
        GregorianCalendar fechaNac;
        double sueldo;
        String nombreHijo;
        int edadHijo;

        Empleado empleado;

        for (int i = 0; i < n ; i++) {
            id=lib.aleatorio(1,10);
            nombre=nombres[lib.aleatorio(0,9)];
            apellido=apellidos[lib.aleatorio(0,9)];
            fechaNac=new GregorianCalendar(lib.aleatorio(1980,2010),lib.aleatorio(1,12),lib.aleatorio(1,28));
            sueldo=lib.aleatorio(900,2100);
            nombreHijo=nombres[lib.aleatorio(0,9)];
            edadHijo=lib.aleatorio(0,26);

            empleado= new Empleado(id,nombre,apellido,fechaNac,sueldo);
            empleado.setHijos(nombreHijo,edadHijo);

            empleados.put(id,empleado);
        }



    }
}
