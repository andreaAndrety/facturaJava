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
    private ArrayList<FacturaDetalle>  detalleFactura;
    private Date fecha;
    private Double valorTotal;
    
    public Factura(){};
    public Factura(String idcliente, ArrayList<FacturaDetalle> detalleFactura, Date fecha, Double valorTotal) {
        this.idcliente = idcliente;
        this.detalleFactura = detalleFactura;
        this.fecha = fecha;
        this.valorTotal = valorTotal;
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
     * @return the detalleFactura
     */
    public ArrayList<FacturaDetalle> getFacturaDetalle() {
        return detalleFactura;
    }

    /**
     * @param detalleFactura the detalleFactura to set
     */
    public void setFacturaDetalle(ArrayList<FacturaDetalle> detalleFactura) {
        this.detalleFactura = detalleFactura;
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
     * @return the valorTotal
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Factura{" + "idcliente=" + idcliente + ", detalleFactura=" + detalleFactura.toString() + ", fecha=" + fecha + ", valorTotal=" + valorTotal + '}';
    }
    
    
    
    
}
