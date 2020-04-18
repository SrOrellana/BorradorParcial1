package com.RCOC.x00163618;

public class HerramientasMinecraft {
    private String tipo;
    private String material;
    private String objetivo;
    private int duracion;
    private int daño;


    public void imprimirLista(){
        System.out.println("Tipo: " + tipo.toUpperCase());
        System.out.println("Material: " +material.toUpperCase());
        System.out.println("Funcionabilidad: " + objetivo.toUpperCase());
        System.out.println("Duración: " + duracion);
        System.out.println("Daño: " + daño);
        System.out.println();
    }
    public String getTipo(){
        return tipo;
    }
    public String getObjetivo(){
        return objetivo;
    }
    public int getDuracion(){
        return duracion;
    }
    public HerramientasMinecraft(String tipo, String material, String objetivo, int duracion, int daño) {
        this.tipo = tipo;
        this.material = material;
        this.objetivo = objetivo;
        this.duracion = duracion;
        this.daño = daño;
    }
}