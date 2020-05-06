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
public class Cliente {
    
    private String identificacion;
    private String nombreCompleto;
    private String tipoDocumento;

    public Cliente(String identificacion, String nombreCompleto, String tipoDocumento) {
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * @return the identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the tipoDocumento
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * @param tipoDocumento the tipoDocumento to set
     */
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "identificacion=" + identificacion + ", nombreCompleto=" + nombreCompleto + ", tipoDocumento=" + tipoDocumento + '}';
    }
    
    
}
