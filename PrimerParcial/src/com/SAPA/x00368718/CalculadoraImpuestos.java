package com.SAPA.x00368718;

public final class CalculadoraImpuestos {
    private static double totalRenta=0, totalISSS=0, totalAFP=0;

    private CalculadoraImpuestos(){
        this.totalRenta=0;
        this.totalISSS=0;
        this.totalAFP=0;
    }

    public static double calcularPago(Empleado emp){
        double salario=0, renta=0, afp=0, isss=0, restante=0;
        new CalculadoraImpuestos();
        if(emp instanceof ServicioProfesional){
            salario = emp.getSalario();
            renta = salario*0.10;
            totalRenta = totalRenta + renta;
            return salario - renta;
        }else{
            salario = emp.getSalario();
            afp = salario*0.0625;
            totalAFP = totalAFP + afp;

            isss = salario*0.03;
            totalISSS = totalISSS + isss;

            restante = salario - afp - isss;
            renta = 0;
            if(restante >= 0.01 && restante <= 472){
                renta = 0;
            }else if(restante >= 472.01 && restante <= 895.24 ){
                renta = (0.1*(restante-472))+17.67;
            }else if(restante >= 895.25 && restante <= 2038.10){
                renta = (0.2*(restante-895.24))+60;
            }else if(restante >= 2038.11){
                renta = (0.3*(restante-2038.10))+288.57;
            }
            return restante-renta;
        }
    }

    public static String mostrarTotales(){
        return "Total Renta: " + totalRenta + ", Total ISSS: " + totalISSS + ", Total AFP: " + totalAFP;
    }
}
