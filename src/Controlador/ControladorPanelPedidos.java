/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloPanelPedidos;
import Vistas.VistaPanelPedidos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Erick Gonzalez
 */
public class ControladorPanelPedidos {
    
    private ModeloPanelPedidos modelo;
    private VistaPanelPedidos vista;
    
    private int vendedor;
    private String puesto_vendedor;

    public ControladorPanelPedidos(VistaPanelPedidos vista, ModeloPanelPedidos modelo) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void iniciar(int vendedor,String puesto_vendedor){
        this.vendedor = vendedor;
        this.puesto_vendedor = puesto_vendedor;
        
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    
    public static void main(String[]args){
       
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}