package pruebaconceptosparcial;

import controlador.ControladorClientes;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Cliente;
import vistas.VentanaMenu;

public class PruebaConceptosParcial {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*ControladorClientes controlador = new ControladorClientes();

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        Cliente c = new Cliente(0, "Benito", "Juárez", "Guillermo Marconi", 2553, 2, 11500233, "benito_1998@hotmail.com");
        controlador.agregarCliente(c);
        
        ArrayList<Cliente> clientes=controlador.obtenerClientes();
        
        for(Cliente cl: clientes){
                System.out.println("CLIENTE N°: " + cl.getId() + "; nombre: " + cl.getNombre() + "; apellido: " + cl.getApellido() 
                        + "; calle: " + cl.getCalle() + "; altura: " + cl.getAltura());
        }*/
        
        new VentanaMenu().setVisible(true);
    }
}
