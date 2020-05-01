package com.SAPA.x00368718;

import javax.swing.*;

public class Main {
    static int Opci = 0, Opci2 = 0;
    static String[] opciones = {
            "1 - Agregar Empleado",
            "2 - Despedir empleado",
            "3 - Ver lista de empleadps",
            "4 - Calcular sueldo",
            "5 - Mostrar totales",
            "0 - Salir"
    };
    static String[] opcionesTipo = {
            "1 - Servicio profesional",
            "2 - Plaza fija"
    };

    public static void main(String[] args) throws NotExistingEmployedException {
        try {
            Empresa miEmpresa = new Empresa("La Constancia");

            do {
                Opci = Integer.parseInt(JOptionPane.showInputDialog(null, opciones, "Opciones de Menu: " + miEmpresa.getNombre(), JOptionPane.DEFAULT_OPTION));
                //elegirOpcion(Opci);
                switch (Opci) {
                    case 1:
                        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado : ");
                        String puesto = JOptionPane.showInputDialog(null, "Ingrese el puesto del empleado : ");
                        Double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado : "));
                        String nombreDocu = JOptionPane.showInputDialog(null, "Ingrese el nombre del documento  : ");
                        Opci2 = Integer.parseInt(JOptionPane.showInputDialog(null, opcionesTipo, "Opciones de Menu", JOptionPane.DEFAULT_OPTION));
                        //elegirOpcionTwo(Opci2);
                        switch (Opci2) {
                            case 1:
                                int mesesContrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cant. de meses de contrato : "));
                                miEmpresa.addEmpleado(new ServicioProfesional(nombre, puesto, salario, mesesContrato));
                                break;
                            case 2:
                                int extensión = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese extensión : "));
                                miEmpresa.addEmpleado(new PlazaFija(nombre, puesto, salario, extensión));
                                break;
                        }
                        break;
                    case 2:
                        String nombreDespedir = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado : ");
                        miEmpresa.quitEmpleado(nombreDespedir);
                        break;
                    case 3:
                        miEmpresa.getPlanilla().forEach(s -> {
                            JOptionPane.showMessageDialog(null, "Nombre: " + s.getNombre() + ", Puesto: " + s.getPuesto() + ", Salario: " + s.getSalario() + ",  Tipo de contrato: " + s.getClass().getSimpleName());
                        });
                        break;
                    case 4:
                        miEmpresa.getPlanilla().forEach(s -> {
                            JOptionPane.showMessageDialog(null, "Sueldo despues de renta de " + s.getNombre() + " : " + CalculadoraImpuestos.calcularPago(s));
                        });
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, CalculadoraImpuestos.mostrarTotales());
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion ingresada NO valida, ingrese nuevamente");
                        break;
                }
            } while (Opci != 0);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(), "Mensaje de error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
    /*public static void elegirOpcion(String optiStr){
        if(optiStr.equals("Salir")){
            option =  0;
        }else{
            for(int i = 0; i < opciones.length; i++){
                if(optiStr.equals(opciones[i])){
                    option = i + 1;
                }
            }
        }
    }
    public static void elegirOpcionTwo(String optiStr){
        if(optiStr.equals("Salir")){
            option2 =  0;
        }else{
            for(int i = 0; i < opciones.length; i++){
                if(optiStr.equals(opciones[i])){
                    option2 = i + 1;
                }
            }
        }
    }
}*/
