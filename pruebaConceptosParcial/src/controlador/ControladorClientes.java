package controlador;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.*;
import java.util.ArrayList;
import modelo.Cliente;

public class ControladorClientes {

    public ArrayList<Cliente> obtenerClientes() throws SQLException {

        ArrayList<Cliente> clientes = new ArrayList<>();

        try {
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ACADEMIA", "root", "1959Marcos");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=LIBRERIA;TrustServerCertificate=true", "admin", "1959marcos");

            //System.out.println(conn.isClosed());
            //System.out.println("Conexión establecida exitosamente...");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from clientes");

            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                String calle = rs.getString(4);
                int altura = rs.getInt(5);
                int codigoBarrio = rs.getInt(6);
                int nroTel = rs.getInt(7);
                String email = rs.getString(8);

                Cliente nuevoCliente = new Cliente(id, nombre, apellido, calle, altura, codigoBarrio, nroTel, email);
                clientes.add(nuevoCliente);
            }

            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return clientes;
    }

    public boolean agregarCliente(Cliente nuevoCliente){
        return false;
    }
}
