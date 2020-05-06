/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facturacion.modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Factura {
    
    private String idcliente;
    private ArrayList<Mercancia>  mercanciaLista;
    private Date fecha;
    private Double valorToral;

    public Factura(String idcliente, ArrayList<Mercancia> mercanciaLista, Date fecha, Double valorToral) {
        this.idcliente = idcliente;
        this.mercanciaLista = mercanciaLista;
        this.fecha = fecha;
        this.valorToral = valorToral;
    }

    /**
     * @return the idcliente
     */
    public String getIdcliente() {
        return idcliente;
    }

    /**
     * @param idcliente the idcliente to set
     */
    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    /**
     * @return the mercanciaLista
     */
    public ArrayList<Mercancia> getMarcanciaLista() {
        return mercanciaLista;
    }

    /**
     * @param mercanciaLista the mercanciaLista to set
     */
    public void setMarcanciaLista(ArrayList<Mercancia> mercanciaLista) {
        this.mercanciaLista = mercanciaLista;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the valorToral
     */
    public Double getValorToral() {
        return valorToral;
    }

    /**
     * @param valorToral the valorToral to set
     */
    public void setValorToral(Double valorToral) {
        this.valorToral = valorToral;
    }

    @Override
    public String toString() {
        return "Factura{" + "idcliente=" + idcliente + ", mercanciaLista=" + mercanciaLista + ", fecha=" + fecha + ", valorToral=" + valorToral + '}';
    }
    
    
    
    
}
