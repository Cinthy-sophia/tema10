package com.cinthyasophia.tema10.Ejercicio05;

public class Ejercicio5 {
    public Ejercicio5(){
        InformacionPacientes informacion = new InformacionPacientes();
        informacion.llenarLista(1,"Miranda","12/02/1980",'F',1.63,57);
        informacion.llenarLista(2,"Rosinda","07/03/1990",'F',1.74,60.5);
        informacion.llenarLista(3,"Lucia","20/03/1967",'F',1.62,50.8);
        informacion.llenarLista(4,"Juan","20/04/1972",'M',1.78,72.5);
        informacion.llenarLista(5,"Carlos","29/02/1960",'M',1.8,85.2);

        System.out.println(informacion.toString());

        for (Paciente p :informacion.getPaciente()) {
            System.out.println(p.toString());
        }
    }
}
