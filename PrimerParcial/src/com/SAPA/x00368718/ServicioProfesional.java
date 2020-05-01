package com.SAPA.x00368718;

public class ServicioProfesional extends  Empleado {
    private int mesesContrato;

    public ServicioProfesional(String nombreP, String puestoP, double salarioP, int mesesContratoP) {
        super(nombreP, puestoP, salarioP);
        this.mesesContrato = mesesContratoP;
    }

    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

}
