package ProcessClinica;

import java.util.Date;

import TipoPago.Pago;
import entidades.Paciente;

public class Cita {
	protected Date fecha;
	protected boolean pagada;
	protected String registradoPor;
	public Paciente paciente;

	public boolean realizarPago(Pago pg){
		return pagada;

	}	
}
