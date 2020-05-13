/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facturacion.modelo;

/**
 *
 * @author ASUS
 */
public class Producto extends Mercancia{
    
    private Double peso;
    private String unidadMedida;

    public Producto(Double peso, String unidadMedida, String idMercancia, String nombre, Double precio, boolean esServicio) {
        super(idMercancia, nombre, precio, esServicio);
        this.peso = peso;
        this.unidadMedida = unidadMedida;
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * @return the unidadMedida
     */
    public String getUnidadMedida() {
        return unidadMedida;
    }

    /**
     * @param unidadMedida the unidadMedida to set
     */
    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    @Override
    public String toString() {
        return super.toString()+ "Producto{" + "peso=" + peso + ", unidadMedida=" + unidadMedida + '}';
    }
    
    
}
