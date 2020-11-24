/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicina;

import java.util.ArrayList;

/**
 *
 * @author Julian
 */
public class Receta {
     protected Datetime fecha;
     protected PlanNutricional planNut;
     protected ArrayList<Medicamento> medicamentos;

    public Receta(PlanNutricional planNut, ArrayList<Medicamento> medicamentos) {
        this.planNut = planNut;
        this.medicamentos = medicamentos;
    }

    public PlanNutricional getPlanNut() {
        return planNut;
    }

    public void setPlanNut(PlanNutricional planNut) {
        this.planNut = planNut;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Datetime getFecha() {
        return fecha;
    }

    public void setFecha(Datetime fecha) {
        this.fecha = fecha;
    }
    
}
