/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Administrador extends Persona {

    public Administrador(String usuario, String clave, String nombre, String apellido, String cedula, Date fechaNac) {
        super(usuario, clave, nombre, apellido, cedula, fechaNac);
    }
   
    public void registrarUsuario() {

    }

    public void asignarRol(Persona p) {
    }
}
