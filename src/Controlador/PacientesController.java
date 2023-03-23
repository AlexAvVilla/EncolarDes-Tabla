/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelos.PacientesModel;
import Vistas.frmPrincipal;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alex Avila
 */
public class PacientesController implements ActionListener{
    frmPrincipal VistaPrincipal;
    PacientesModel ModeloPacientes;
    

    public PacientesController(frmPrincipal VistaPrincipal, PacientesModel ModeloPacientes) {
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloPacientes = ModeloPacientes;
        
        this.VistaPrincipal.setVisible(true);
        
        
        this.VistaPrincipal.btnAtender.addActionListener(this);
        this.VistaPrincipal.btnIngresar.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaPrincipal.btnIngresar){
            this.ModeloPacientes.IngresarPacientes(this.VistaPrincipal.txtApellido.getText(),
                    this.VistaPrincipal.txtNombre.getText(), this.VistaPrincipal.txtTelefono.getText(),
                    Integer.parseInt(this.VistaPrincipal.txtGravedad.getText()));
            this.VistaPrincipal.jtPacientes.setModel(this.ModeloPacientes.ListarPacientes());
        }
        
    }
    
}
