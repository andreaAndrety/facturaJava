/*
 * To change this license header, choose License Headers in Project PropcionSeleccionadaerties.
 * To change this template file, choose Tools | Templates
 * and opcionSeleccionadaen the template in the editor.
 */
package com.mycompany.facturacion.controlador;
import com.mycompany.facturacion.modelo.Factura;
import com.mycompany.facturacion.modelo.Mercancia;
import com.mycompany.facturacion.modelo.Producto;
import com.mycompany.facturacion.modelo.Servicio;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Facturacion {
    public static void main(String[] args){
        
        
        Scanner teclado=new Scanner(System.in);
        
        Servicio listaServicios []=new Servicio[100];
        Producto listaProductos []=new Producto[100];
        
        int opcionSeleccionada;
        boolean seguir=true;
        boolean exis1=true,exis2=true,exis3=true;
        int acumuladoServicios=-1,acumuladoProductos=-1;
        
    do{
        JOptionPane.showMessageDialog(null, "Ingrese la Opcion que desea realisar"+
                                            "\n1.-Agregar"+
                                            "\n2.-Vender"+
                                            "\n5.-Salir");
        opcionSeleccionada=Integer.parseInt(JOptionPane.showInputDialog(""));
        
        switch(opcionSeleccionada){
            
            //Agregar Mercancia
            case 1:
         
                int opcionSeleccionada1;
                JOptionPane.showMessageDialog(null, "Seleccione el tipo de procuto"+
                                            "\n1.-Servicio"+
                                            "\n2.-Producto ");
                opcionSeleccionada1=Integer.parseInt(JOptionPane.showInputDialog(""));

                switch(opcionSeleccionada1){
                    //cuando es Servicio
                    case 1:       
                            String codigo; 
                            String nombre;
                            Double precio;
                            boolean esServicio;
                            String descricionCompleta;
                            int numeroTecnicos;
                            String horarioServicios;

                            acumuladoServicios+=1;

                            codigo="codigo"+Math.random()*9999;
                            System.out.println("codigo: "+codigo);
                            System.out.print("Ingrese el nombre: ");
                            nombre=teclado.nextLine();
                            System.out.print("Ingrese el numero de tecnicos: ");
                            numeroTecnicos=teclado.nextInt();
                            System.out.print("Ingrese el precio: ");
                            precio=teclado.nextDouble();
                            System.out.print("Ingrese la descripcion completa del servicio: ");
                            descricionCompleta=teclado.next();                             
                            System.out.print("Ingrese la los horarios de este servicio: ");
                            horarioServicios=teclado.next();                             
                            esServicio=true;
                            
                            listaServicios[acumuladoServicios]=new Servicio(descricionCompleta, numeroTecnicos, horarioServicios, codigo, nombre, precio, esServicio);
                            System.out.println("Servicio agregado exitosamente");
                            System.out.println("\n");
                            break;
                    //cuando es producto
                    case 2:
                            String unidadMedida;
                            double peso;

                            acumuladoProductos+=1;

                            codigo="codigo"+Math.random()*9999;
                            System.out.println("id: "+codigo);
                            System.out.print("Ingrese el nombre: ");
                            nombre=teclado.nextLine();
                            System.out.print("Ingrese el precio: ");
                            precio=teclado.nextDouble();
                            esServicio=false;
                            System.out.print("Unidad de medida el producto: ");
                            unidadMedida=teclado.next();
                            System.out.print("Peso del producto: ");
                            peso=teclado.nextDouble();


                            listaProductos[acumuladoProductos]=new Producto(peso,unidadMedida,codigo,nombre,precio,esServicio);
                            System.out.println("Producto agregado exitosamente");
                            System.out.println("\n");

                            break;
                            
                            default:
                                System.out.println("Opcion no valida");
                                break;
                            }

                            break;
            //realizar venta
            case 2:     
                        ArrayList<Mercancia> listaMercancia=new ArrayList<Mercancia>();
                        int opcionSeleccionada2;
                        String codigoServicio,codigoProducto;
                        String codigoServicioComparar,codigoProductoComparar;
                        String identificacionTercero;
                        Double total;
                        Date fecha;
                        int p1=-1,p2=-1;
                        
                        
                        
                         JOptionPane.showMessageDialog(null, "Seleccione el tipo de procuto"+
                                                            "\n1.-Servicio"+
                                                            "\n2.-Producto ");
                        opcionSeleccionada2=Integer.parseInt(JOptionPane.showInputDialog(""));

                     switch(opcionSeleccionada2){
                         case 1:
                                if(acumuladoServicios==-1){
                                    System.out.println("No existe ningun producto");
                                }else{
                                    System.out.println("Ingrese el codigo del producto");
                                    codigoServicio=teclado.next();

                                    for(int i=0;i<=acumuladoServicios;i++){
                                        
                                    codigoServicioComparar = listaServicios[i].getCodigo();
                                    
                                        if(codigoServicio==codigoServicioComparar){
                                            listaMercancia.add(listaServicios[i]);
                                            p1=i;
                                            exis1=false;
                                        }
                                    }
                                    if(p1==-1){
                                        System.out.println("Elcodigo no existe");
                                    }else{
                                        System.out.println("Producto agregado exitosamente");
                                    }
                             }
                             break;
                        case 2:
                            if(acumuladoProductos==-1){
                               System.out.println("No existe ningun producto");
                             }
                            else{
                                System.out.println("Ingrese el codigo del producto");
                                codigoProducto=teclado.next();

                                for(int i=0;i<=acumuladoProductos;i++){
                                    codigoProductoComparar = listaProductos[i].getCodigo();
                                    if(codigoProducto==codigoProductoComparar){
                                      listaMercancia.add(listaProductos[i]);
                                      p2=i;
                                      exis2=false;
                                    }
                                }
                                if(p2==-1){
                                    System.out.println("Elcodigo no existe");
                                }else{
                                    System.out.println("Producto agregado exitosamente");
                                }
                            }
                            
                            //indentificacion tercero
                            System.out.println("Ingrese el numero de cedula del cliente");
                            identificacionTercero=teclado.next();
                            total=(double) 50000;
                            fecha=new Date();
                            
                            
                            //Factura factura = new Factura(identificacionTercero, listaMercancia, fecha, total);
                            //factura.toString();
                            break;
                           
                        default:
                                 System.out.println("Opcion de salida");
                                 break;
                     }
                     break;


       
        case 5:
            seguir=false;
            break;
            
        default:
            System.out.println("Opcion no valida");
            break;
              
        }
    }while(seguir==true);
        
    }
    
   
}
