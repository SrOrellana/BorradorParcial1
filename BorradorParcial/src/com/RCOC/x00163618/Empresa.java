package com.RCOC.x00163618;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> planilla;

    public Empresa(String nombre) {
        this.nombre = nombre;
        planilla = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getPlanilla() {
        return planilla;
    }
    public void addEmpleado(Empleado emp1){
        planilla.add(emp1);
    }
    public void quitEmpleado(String EmpleadoDespe)throws NotExistingEmployedException{
     if (!planilla.removeIf(obj->{
         return (obj.getNombre()).equalsIgnoreCase(nombre);
     })) {
         throw new NotExistingEmployedException("El empleado" + nombre"no existe");
     }
    }
    public void consultarEmpleados(){
        
    }

}

