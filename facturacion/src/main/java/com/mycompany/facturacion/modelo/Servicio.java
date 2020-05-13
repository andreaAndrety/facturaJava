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
public class Servicio extends Mercancia {
    private String descricionCompleta;
    private int numeroTecnicos;
    private String horarioServicio;

    public Servicio(String descricionCompleta, int numeroTecnicos, String horarioServicio, String idMercancia, String nombre, Double precio, boolean esServicio) {
        super(idMercancia, nombre, precio, esServicio);
        this.descricionCompleta = descricionCompleta;
        this.numeroTecnicos = numeroTecnicos;
        this.horarioServicio = horarioServicio;
    }

    /**
     * @return the descricionCompleta
     */
    public String getDescricionCompleta() {
        return descricionCompleta;
    }

    /**
     * @param descricionCompleta the descricionCompleta to set
     */
    public void setDescricionCompleta(String descricionCompleta) {
        this.descricionCompleta = descricionCompleta;
    }

    /**
     * @return the numeroTecnicos
     */
    public int getNumeroTecnicos() {
        return numeroTecnicos;
    }

    /**
     * @param numeroTecnicos the numeroTecnicos to set
     */
    public void setNumeroTecnicos(int numeroTecnicos) {
        this.numeroTecnicos = numeroTecnicos;
    }

    /**
     * @return the horarioServicio
     */
    public String getHorarioServicio() {
        return horarioServicio;
    }

    /**
     * @param horarioServicio the horarioServicio to set
     */
    public void setHorarioServicio(String horarioServicio) {
        this.horarioServicio = horarioServicio;
    }

    @Override
    public String toString() {
        return super.toString()+"Servicio{" + "descricionCompleta=" + descricionCompleta + ", numeroTecnicos=" + numeroTecnicos + ", horarioServicio=" + horarioServicio + '}';
    }
    
    
}
