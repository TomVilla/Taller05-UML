/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author micar
 */
public class Secretaria extends Persona{
    
    public Secretaria(String usuario, String clave, String nombre, String apellido, String cedula, Date fechaNac){
        super(usuario, clave, nombre, apellido, cedula, fechaNac);
    }
    
    public void verificarCita(){
        
    }
    
    public void agendarCita(){
        
    }
}
