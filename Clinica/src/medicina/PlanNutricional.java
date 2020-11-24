/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicina;

/**
 *
 * @author Julian
 */
public class PlanNutricional {
    protected String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public PlanNutricional(String descripcion) {
        this.descripcion = descripcion;
    }
}
