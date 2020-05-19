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
public class FacturaDetalle {
    private Integer idFacturaDetalle;
    private String idMercancia;
    private Integer cantidad;
    private Double valorTotal;
    
    public FacturaDetalle(){}

    /**
     * @return the idFacturaDetalle
     */
    public Integer getIdFacturaDetalle() {
        return idFacturaDetalle;
    }

    /**
     * @param idFacturaDetalle the idFacturaDetalle to set
     */
    public void setIdFacturaDetalle(Integer idFacturaDetalle) {
        this.idFacturaDetalle = idFacturaDetalle;
    }

    /**
     * @return the idMercancia
     */
    public String getIdMercancia() {
        return idMercancia;
    }

    /**
     * @param idMercancia the idMercancia to set
     */
    public void setIdMercancia(String idMercancia) {
        this.idMercancia = idMercancia;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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
    
    
    
}
