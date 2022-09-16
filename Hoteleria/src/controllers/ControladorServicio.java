package controllers;

import dtos.ConsumoDTO;
import java.util.ArrayList;
import java.util.List;
import model.Habitacion;
import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import model.Servicio;

public class ControladorServicio {

    private String conexion;

    public ControladorServicio() {
        conexion = "jdbc:sqlserver://localhost:1433;databaseName=hotel;TrustServerCertificate=true";
    }

    public List<Habitacion> obtenerHabitaciones() {
        List<Habitacion> habitaciones = new ArrayList();

        try {
            Connection conn = DriverManager.getConnection(conexion, "admin", "1959marcos");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from habitaciones");

            while (rs.next()) {
                int id = rs.getInt("idHabitacion");
                String nombre = rs.getString("nombre");
                habitaciones.add(new Habitacion(id, nombre));
            }

            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return habitaciones;
    }

    public boolean registrarServicio(Servicio servicio) throws SQLException {
        boolean exito = true;
        try {
            Connection conn = DriverManager.getConnection(conexion, "admin", "1959marcos");
            PreparedStatement pst = conn.prepareStatement("insert into servicios(concepto, precio, idHabitacion) values (?,?,?)");

            pst.setString(1, servicio.getConcepto());
            pst.setFloat(2, servicio.getPrecio());
            pst.setInt(3, servicio.getHabitacion().getNroHabitacion());

            pst.executeUpdate();

            pst.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorServicio.class.getName()).log(Level.SEVERE, null, ex);
            exito = false;
        }
        return exito;
    }

    public String[] obtenerReporte() {
        List<String> consumos = new ArrayList<>();
        String[] arrayConsumos;

        try {
            Connection conn = DriverManager.getConnection(conexion, "admin", "1959marcos");
            String consulta = "select h.idHabitacion, h.nombre, sum(s.precio) total, count(s.idServicio) cantidad\n"
                    + "from habitaciones h join servicios s on h.idHabitacion=s.idHabitacion\n"
                    + "group by h.idHabitacion, h.nombre\n"
                    + "having count(s.idServicio)>2;";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(consulta);

            while (rs.next()) {
                int id = rs.getInt("idHabitacion");
                String nombre = rs.getString("nombre");
                float total = rs.getFloat("total");
                int cantidad = rs.getInt("cantidad");

                ConsumoDTO c = new ConsumoDTO(id, nombre, total, cantidad);
                consumos.add(c.toString());
            }

            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorServicio.class.getName()).log(Level.SEVERE, null, ex);
        }

        arrayConsumos = new String[consumos.size()];
        consumos.toArray(arrayConsumos);

        return arrayConsumos;
    }

    public List<Servicio> obtenerServicioPorHabitacion(Habitacion h) {
        List<Servicio> servicios = new ArrayList();

        try {
            Connection conn = DriverManager.getConnection(conexion, "admin", "1959marcos");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from servicios s where s.idHabitacion="+h.getNroHabitacion());

            while (rs.next()) {
                int idServicio = rs.getInt("idServicio");
                String concepto = rs.getString("concepto");
                float nombre = rs.getFloat("precio");
                int idHabitacion = rs.getInt("idHabitacion");
                servicios.add(new Servicio(idServicio, concepto, nombre, h));
            }

            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return servicios;
    }
}
