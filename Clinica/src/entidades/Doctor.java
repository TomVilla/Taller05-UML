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
public class Doctor extends Persona {

    protected int regDoctor;
    protected String especialidad;
    protected Secretaria secretaria; 
    private ArrayList<Cita> citas = new ArrayList<>();
    
    public Doctor(String usuario, String clave, String nombre, String apellido, String cedula, Date fechaNac, int regDoctor, String especialidad) {
        super(usuario, clave, nombre, apellido, cedula, fechaNac);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
    }
    
    public Doctor(String usuario, String clave, String nombre, String apellido, String cedula, Date fechaNac){
         super(usuario, clave, nombre, apellido, cedula, fechaNac);
    }

    public int getRegDoctor() {
        return regDoctor;
    }

    public void setRegDoctor(int regDoctor) {
        this.regDoctor = regDoctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void recetar() {

    }

    public void agregarPlanNut() {

    }

    public void imprimirRecta() {

    }

    public void registrarSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }
}
