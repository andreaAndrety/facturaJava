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
public class Mercancia {
    
    private String codigo;
    private String nombre;
    private Double precio;
    private boolean esServicio;

    public Mercancia(String codigo, String nombre, Double precio, boolean esServicio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.esServicio = esServicio;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * @return the esServicio
     */
    public boolean isEsServicio() {
        return esServicio;
    }

    /**
     * @param esServicio the esServicio to set
     */
    public void setEsServicio(boolean esServicio) {
        this.esServicio = esServicio;
    }

    @Override
    public String toString() {
        return "Mercancia{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", esServicio=" + esServicio + '}';
    }
    
    
}
