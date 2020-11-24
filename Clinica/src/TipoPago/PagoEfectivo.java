/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoPago;

/**
 *
 * @author Tommy
 */
public class PagoEfectivo {
    protected float monto;

    public PagoEfectivo(float monto) {
        this.monto = monto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    
}
