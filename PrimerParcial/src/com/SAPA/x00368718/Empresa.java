package com.SAPA.x00368718;

import javax.swing.*;
import java.util.ArrayList;


public class Empresa {
    private String nombre;
    private ArrayList<Empleado> planilla;

    public Empresa(String nombre) {
        this.nombre = nombre;
        planilla = new ArrayList<>();
    }

    public void addEmpleado(Empleado empleadoOb){
        try {
            boolean existe = false;
            for (Empleado a : planilla) {
                if (a.getNombre().equals(empleadoOb.nombre))
                    existe = true;
            }
            if (existe)
                throw new AlreadyExistEmployeeException("Ya existe un empleado en la empresa con ese nombre" +
                        "de paquete");
            planilla.add(empleadoOb);
        }
        catch (AlreadyExistEmployeeException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(), "Mensaje de error", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(), "Mensaje de error", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getPlanilla() {
        return planilla;
    }

    public void quitEmpleado(String EmpleadoDespe)throws NotExistingEmployedException{
        if (!planilla.removeIf(obj->{
            return (obj.getNombre()).equalsIgnoreCase(nombre);
        })) {
            throw new NotExistingEmployedException("El empleado" + nombre + "no existe");
        }
    }
    public void consultarEmpleados(){

    }
}
