/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import ProcessClinica.Cita;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author micar
 */
public class Secretaria extends Persona {

    ArrayList<Cita> listCita = new ArrayList<>();

    public Secretaria(String usuario, String clave, String nombre, String apellido, String cedula, Date fechaNac) {
        super(usuario, clave, nombre, apellido, cedula, fechaNac);
    }

    boolean verificarFechas(Date date) {
        Date d = new Date();
        int dia, mes, ano;
        dia = d.getDay();
        mes = d.getMonth();
        ano = d.getYear();
        if (date.getDay() == dia) {
            if (date.getMonth() == mes) {
                if (date.getYear() == ano) {
                    return true;
                }
            }
        }
        return false;
    }

    public void verificarCita(Cita cita) {
        if (this.listCita.contains(cita)) {
            Date d = cita.getFecha();            
            if (verificarFechas(d)) {
                Date date = new Date();
                long horaActual = date.getTime();
                long horaCita = d.getTime();
                long res = horaCita - horaActual;
                if(res <= 10){
                    System.out.println("verificada");
                    cita.setPagada(true);
                } else {
                    System.out.println("no verificada");
                    cita.setPagada(false);
                }
                
            }
        }
    }

    public void agendarCita(Cita cita) {
        this.listCita.add(cita);
    }
}
