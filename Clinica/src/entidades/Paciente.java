/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import ProcessClinica.Cita;
import java.util.Date;

import ProcessClinica.HistorialClinica;
import java.util.ArrayList;
import medicina.Receta;

/**
 *
 * @author HP
 */
public class Paciente extends Persona{
    protected String email;
    public HistorialClinica htClinica;
    ArrayList<Receta> listReceta;
    private Cita cita;
    
    public Paciente(String email, String usuario, String clave, String nombre, String apellido, String cedula, Date fechaNac) {
        super(usuario, clave, nombre, apellido, cedula, fechaNac);
        this.email = email;
        htClinica= new HistorialClinica();
        listReceta=new ArrayList<Receta>(); 
    }

    public boolean solicitarCita() {
        if(this.cita ==  null){
            return false;
        } else {
            this.cita.getRegistradoPor().agendarCita(cita);
            return true;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    public void setCita(Cita cita){
        this.cita = cita;
    }
}
