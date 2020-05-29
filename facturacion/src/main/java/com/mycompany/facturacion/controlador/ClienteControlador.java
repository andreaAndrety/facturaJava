/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facturacion.controlador;

import com.mycompany.facturacion.db.Conexion;
import com.mycompany.facturacion.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ClienteControlador {
    
    Conexion cc = new Conexion();
    Connection cn=cc.getConnection();
    Cliente cliente = new Cliente();
    Statement st;
    ResultSet rs;
    
    
    
    public void guardar(Cliente cliente){
    
        String sql="insert into cliente (identificacion,nombreCompleto,tipoDocumento)";
        
        try {
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, cliente.getIdentificacion());
            st.setString(2, cliente.getNombreCompleto());
            st.setString(3, cliente.getTipoDocumento());
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Se guardo el cliente");
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "No fue posible hacer el guardado:"+e);
        }
        
        
    
    }
    
}
