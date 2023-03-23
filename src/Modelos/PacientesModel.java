/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.PriorityQueue;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex Avila
 */
public class PacientesModel {
    
    PriorityQueue<Paciente> ListaPacientes = new PriorityQueue<Paciente>();
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    
    
    public void IngresarPacientes(String ape, String nom, String tel, int gra){
        Paciente nuevoPaciente = new Paciente(ape, nom, tel, gra);
        ListaPacientes.add(nuevoPaciente);
    }
    
    public DefaultTableModel ListarPacientes(){
        this.ModeloTabla.addColumn("APELLIDOS");
        this.ModeloTabla.addColumn("NOMBRE");
        this.ModeloTabla.addColumn("TELEFONO");
        this.ModeloTabla.addColumn("GRAVEDAD");
        for(Paciente MiListaPacientes: ListaPacientes){
            this.ModeloTabla.addRow(new Object[]{MiListaPacientes.getApellido(),MiListaPacientes.getNombre(),MiListaPacientes.getNumero(),MiListaPacientes.getGravedad()});
        }
        return ModeloTabla;
    }
}
