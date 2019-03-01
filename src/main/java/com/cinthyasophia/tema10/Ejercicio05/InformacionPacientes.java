package com.cinthyasophia.tema10.Ejercicio05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;


public class InformacionPacientes {
    private ArrayList<Paciente> pacientes = new ArrayList<>();

    public void llenarLista(int id,String nom, String fechaNac, char sexo, double altura, double peso){
        Paciente paciente;
        SimpleDateFormat formt= new SimpleDateFormat("dd/MM/yyyy");
        GregorianCalendar fecha=new GregorianCalendar();
        try {
            Date date = formt.parse(fechaNac);
            fecha.setTime(date);

        }catch (ParseException pe){

        }
        paciente= new Paciente(id,nom,fecha,altura,peso);
        paciente.setSexo(sexo);

        pacientes.add(paciente);

    }

    public int[] mayorMenor(ArrayList<Paciente> pacientes) {
        int[] mayorMenor= new int[2];
        int min= 1;
        int max= 0;

        for (Paciente p : pacientes) {
            if (p.getEdad() > max) {
                max = pacientes.indexOf(p);
            } else if (p.getEdad() < min) {
                min = pacientes.indexOf(p);
            }
        }
        mayorMenor[0]=min;
        mayorMenor[1]=max;

        return mayorMenor;

    }

    public int[] pacientesPorSexo(ArrayList<Paciente> pacientes){
        int mujeres=0;
        int hombres=0;
        int[] sexoPacientes= new int[2];
        for (Paciente p: pacientes) {
            if (p.getSexo()=='F'){
                mujeres++;
            }else{
                hombres++;
            }
        }
        sexoPacientes[0]=hombres;
        sexoPacientes[1]=mujeres;

        return sexoPacientes;
    }
    public ArrayList<Paciente> getPaciente(){
        return pacientes;
    }

    @Override
    public String toString() {
        int[] mayMen;
        mayMen= mayorMenor(pacientes);
        int menor= pacientes.get(mayMen[0]).getEdad();
        int mayor=pacientes.get(mayMen[1]).getEdad();
        char sexoMay= pacientes.get(mayMen[1]).getSexo();
        char sexoMen= pacientes.get(mayMen[0]).getSexo();

        int[] homMuj= pacientesPorSexo(pacientes);
        int hombres= homMuj[0];
        int mujeres= homMuj[1];


        return String.format("PACIENTE MAYOR\t Edad: %4d\t Sexo: %4s \n",mayor,
                sexoMay)+ String.format("PACIENTE MENOR\t Edad: %4d\t Sexo: %4s \n\n",menor,
                sexoMen)+ "Cantidad de pacientes por sexo:\n"+ String.format("%8s %4d","Hombres:",hombres)+
                String.format("%12s %4d \n","Mujeres:",mujeres);
    }
}
