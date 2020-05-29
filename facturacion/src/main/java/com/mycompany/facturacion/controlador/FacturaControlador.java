/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facturacion.controlador;

import com.mycompany.facturacion.db.Conexion;
import com.mycompany.facturacion.modelo.Cliente;
import com.mycompany.facturacion.modelo.Mercancia;
import com.mycompany.facturacion.modelo.Factura;
import com.mycompany.facturacion.modelo.FacturaDetalle;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class FacturaControlador {
    //conexion a la db
    Cliente cliente=new Cliente();
    Conexion cc = new Conexion();
    Connection cn =cc.getConnection();
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;
    
    //intaciamos la clase factura
    Factura fac = new Factura();
    
    ArrayList<Mercancia> ListaMercancia=new ArrayList<>();
    
    
    public void consultarMercancia(JComboBox cbxMercancia){
        String sql="select idMercancia,nombre,precio from mercancia";
        
        try {
            PreparedStatement st=cn.prepareStatement(sql);
            rs=st.executeQuery();
            cbxMercancia.addItem("Seleccione...");
            while (rs.next()) {
               ListaMercancia.add(new Mercancia(rs.getString("idMercancia"), rs.getString("nombre"), Double.parseDouble(rs.getString("precio")), true));
               cbxMercancia.addItem(rs.getString("nombre"));
               //  rs.getString("nombre"));
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public Cliente buscarTerceroDesdeTxt(String numeroIdentificacion){
        String sql="select * from cliente where identificacion= ?";
        Cliente encontrado=new Cliente();
            try {
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, numeroIdentificacion);
            rs=st.executeQuery();
            if(rs.next()){
            
            encontrado.setIdentificacion(rs.getString("identificacion"));
            encontrado.setNombreCompleto(rs.getString("nombreCompleto"));
            encontrado.setTipoDocumento(rs.getString("tipoDocumento"));
            }else{
            //System.out.println(rs);
            JOptionPane.showMessageDialog(null,"no se encontro Cliente con el numero de indentificacion debe crearlo.");
            }
        
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
            return encontrado;
    }
    
    
    public Mercancia buscarIndexArrayMercancia(int posicion){
    
        return ListaMercancia.get(posicion-1);
    }
    
    
    public void GuardarFactura(Factura factura){
        int idFactura=-1;
        ArrayList<FacturaDetalle> detalle=factura.getFacturaDetalle();
        String sql="insert into factura (idCliente,fecha,valorTotal,idFactura) values(?,?,?,null)";
        String fechaInsert=factura.getFecha().getYear()+"/"+factura.getFecha().getMonth()+"/"+factura.getFecha().getDay();
        try {
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, factura.getIdcliente());
            st.setString(2, fechaInsert);
            st.setDouble(3, factura.getValorTotal());
            st.execute();
            st=cn.prepareStatement("select max(idFactura)as idFactura from factura ");
            rs=st.executeQuery();
                if(rs.next()){
                    idFactura=Integer.parseInt(rs.getString(1));
                }else{
                    //System.out.println(rs);
                    JOptionPane.showMessageDialog(null,"no se encontro pudo crear la factura en el primer paso .");
                }
            String sql2="insert into facturadetalle (idFacturaDetalle,idDocumento,idMercancia,cantidad,valorTotal) values(null,?,?,?,?)";
            //insertar detalles
            for (int i = 0;i< detalle.size(); i++) {
                
                st=cn.prepareStatement(sql2);
                st.setInt(1,idFactura);
                st.setString(2, detalle.get(i).getIdMercancia());
                st.setInt(3, detalle.get(i).getCantidad());
                st.setDouble(4, detalle.get(i).getValorTotal());
                st.execute();
            }
            JOptionPane.showMessageDialog(null, "Se guardo la factura N :"+idFactura);
            
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Ocurrio un error :"+e);
        }
{}
    
    }
    
}
