
import Controlador.PacientesController;
import Modelos.PacientesModel;
import Vistas.frmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Avila
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        PacientesModel ModeloPacientes = new PacientesModel();
        PacientesController ControladorPacientes = new PacientesController(VistaPrincipal, ModeloPacientes);
    }
    
}
