/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dto.DtoLista;
import dto.DtoSegundoReporte;
import dto.DtoTercerReporte;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Habitacion;
import model.Servicio;

/**
 *
 * @author Samuel Risso
 */
public class Controlador {

    String CONN = "jdbc:sqlserver://DESKTOP-D9LPN9U\\SQLEXPRESS:1433;databaseName=Hotel;TrustServerCertificate=True";
    String USER = "sa";
    String PASS = "Admin123";

    public Controlador() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver no encontrado");
            return;
        }
    }

    public ArrayList<Habitacion> obtenerHabitaciones() {
        ArrayList<Habitacion> lista = new ArrayList();

        try {

            Connection conn = DriverManager.getConnection(CONN, USER, PASS);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM HABITACIONES");

            while (rs.next()) {
                Integer id = rs.getInt("idHabitacion");
                String denominacion = rs.getString("denominacion");
                Habitacion h = new Habitacion(id, denominacion);
                lista.add(h);
            }
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    public Habitacion obtenerHabitacion(int idHabitacion) {
        Habitacion h = null;
        try {
            Connection conn = DriverManager.getConnection(CONN, USER, PASS);
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM HABITACIONES WHERE IDHABITACION = ?");
            ps.setInt(1, idHabitacion);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Integer id = rs.getInt("idHabitacion");
                String denominacion = rs.getString("denominacion");
                h = new Habitacion(id, denominacion);
            }
            conn.close();
        } catch (Exception e) {
        }
        return h;
    }

    public ArrayList<DtoLista> obtenerServicios() {
        ArrayList<DtoLista> lista = new ArrayList();

        try {
            Connection conn = DriverManager.getConnection(CONN, USER, PASS);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT s.Concepto as Concepto, s.importe as Importe, h.Denominacion\n"
                    + "FROM HABITACIONES h JOIN SERVICIOS s ON h.idHabitacion = s.idHabitacion");
            while (rs.next()) {
                String concepto = rs.getString("concepto");
                String importe = rs.getString("importe");
                String denominacion = rs.getString("denominacion");
                DtoLista dto = new DtoLista(concepto, importe, denominacion);
                lista.add(dto);
            }
            conn.close();
        } catch (Exception e) {
        }

        return lista;

    }

    public void agregarServicio(Servicio s) {

        try {
            Connection conn = DriverManager.getConnection(CONN, USER, PASS);
            PreparedStatement st = conn.prepareStatement("INSERT INTO SERVICIOS (CONCEPTO,IDHABITACION,IMPORTE) VALUES (?,?,?)");
            st.setString(1, s.getConcepto());
            st.setInt(2, s.getHabitacion().getId());
            st.setDouble(3, s.getImporte());
            st.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Double primerReporte() {
        Double suma = 0D;
        try {
            Connection conn = DriverManager.getConnection(CONN, USER, PASS);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT SUM(importe) AS Suma FROM Servicios");
            if (rs.next()) {
                suma = rs.getDouble("Suma");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return suma;

    }

    public ArrayList<DtoSegundoReporte> segundoReporte() {
        ArrayList<DtoSegundoReporte> lista = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(CONN, USER, PASS);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT h.idHabitacion as ID, h.Denominacion as Denominacion, sum(s.importe) \n"
                    + "as SumaDeServicios\n"
                    + "FROM Habitaciones h JOIN Servicios s ON h.idHabitacion = s.idHabitacion\n"
                    + "GROUP BY h.idHabitacion, h.Denominacion\n"
                    + "HAVING count(s.idHabitacion) > 3");
            while (rs.next()) {
                String id = rs.getString("ID");
                String denominacion = rs.getString("Denominacion");
                String sumaDeServicios = rs.getString("SumaDeServicios");

                DtoSegundoReporte dto = new DtoSegundoReporte(id, denominacion, sumaDeServicios);
                lista.add(dto);
            }
            conn.close();
        } catch (Exception e) {
        }

        return lista;
    }

    public ArrayList<DtoTercerReporte> tercerReporte(Habitacion h) {
        ArrayList<DtoTercerReporte> lista = new ArrayList();
        try {
            Connection conn = DriverManager.getConnection(CONN, USER, PASS);
            PreparedStatement ps = conn.prepareStatement("SELECT s.Concepto as Concepto, s.Importe as Importe\n"
                    + "FROM Servicios s JOIN Habitaciones h ON s.idHabitacion = h.idHabitacion\n"
                    + "WHERE h.idHabitacion = ?");
            ps.setInt(1, h.getId());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String concepto = rs.getString("Concepto");
                String importe = rs.getString("Importe");
                DtoTercerReporte dto = new DtoTercerReporte(concepto, importe);
                lista.add(dto);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

}
