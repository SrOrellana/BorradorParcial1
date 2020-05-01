package com.SAPA.x00368718;

public class PlazaFija extends Empleado {
    private int extensión;

    public PlazaFija(String nombreP, String puestoP, double salarioP, int extensiónP) {
        super(nombreP, puestoP, salarioP);
    }

    public int getExtensión() {
        return extensión;
    }

    public void setExtensión(int extensión) {
        this.extensión = extensión;
    }
}
