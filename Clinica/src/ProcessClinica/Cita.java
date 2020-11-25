package ProcessClinica;

import java.util.Date;

import TipoPago.Pago;
import entidades.Paciente;
import entidades.Secretaria;

public class Cita {

    protected Date fecha;
    protected boolean pagada;
    protected Secretaria registradoPor;
    public Paciente paciente;

    public Cita(Date fecha, Secretaria registradoPor, Paciente paciente) {
        this.fecha = fecha;
        this.pagada = false;
        this.registradoPor = registradoPor;
        this.paciente = paciente;
    }

    public boolean realizarPago(Pago pg) {
        return pagada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Secretaria getRegistradoPor() {
        return registradoPor;
    }

    public void setRegistradoPor(Secretaria registradoPor) {
        this.registradoPor = registradoPor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
