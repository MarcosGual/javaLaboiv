package controlador;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.*;
import java.util.ArrayList;
import modelo.Cliente;

public class ControladorClientes {

    public String[] obtenerClientes() throws SQLException {

        ArrayList<String> clientes = new ArrayList<>();
        String[] arrayClientes;

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
                clientes.add(nuevoCliente.toString());
            }

            rs.close();
            st.close();
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ControladorClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        arrayClientes = new String[clientes.size()];
        clientes.toArray(arrayClientes);

        return arrayClientes;
    }

    public boolean agregarCliente(Cliente nuevoCliente) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=LIBRERIA;TrustServerCertificate=true", "admin", "1959marcos");

            //Statement st=conn.createStatement();
            PreparedStatement st = conn.prepareStatement("insert into Clientes (nom_cliente, ape_cliente, calle, altura, cod_barrio, nro_tel, [e-mail]) values(?,?,?,?,?,?,?)");
            st.setString(1, nuevoCliente.getNombre());
            st.setString(2, nuevoCliente.getApellido());
            st.setString(3, nuevoCliente.getCalle());
            st.setInt(4, nuevoCliente.getAltura());
            st.setInt(5, nuevoCliente.getCodigoBarrio());
            st.setInt(6, nuevoCliente.getNroTel());
            st.setString(7, nuevoCliente.getEmail());

            st.executeUpdate();

            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
