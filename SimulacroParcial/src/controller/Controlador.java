package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Corredor;
import dto.DtoTiempos;
import model.Tiempo;
import dto.DtoSegundoReporte;
import dto.DtoTercerReporte;

//Clase para comunicarse con la base de datos mediante JAVA. Para poder hacerlo se requiere un driver.
public class Controlador {

    private String CONN = "jdbc:sqlserver://DESKTOP-D9LPN9U\\SQLEXPRESS:1433;databaseName=Entrenamiento;TrustServerCertificate=True";//String conexion
    private String USER = "sa"; // Nombre de usuario de SQL Server
    private String PASS = "Admin123"; // Contraseña de usuario de SQL Server

    public Controlador() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver no encontrado!");
            return;
        }
    }

    public void agregarTiempo(Tiempo tiempo) {
        try {
            Connection conn = DriverManager.getConnection(CONN, USER, PASS);

            PreparedStatement st = conn.prepareStatement("INSERT INTO TIEMPOS (IdCorredor,Tiempo,Club,Clima) VALUES (?,?,?,?)");

            st.setInt(1, tiempo.getCorredor().getId());
            st.setFloat(2, tiempo.getTiempo());
            st.setString(3, tiempo.getClub());
            st.setString(4, tiempo.getClima());

            st.executeUpdate();

            st.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Corredor obtenerCorredor(int idCorredor) {
        Corredor c = null;
        try {
            Connection conn = DriverManager.getConnection(CONN, USER, PASS);
            PreparedStatement st = conn.prepareStatement("SELECT id, nombre FROM corredores WHERE id = ?");
            st.setInt(1, idCorredor);
            ResultSet rs = st.executeQuery();
            // Si el select devuelve una única fila, en lugar de while, se usa un if
            if (rs.next()) {
                int id = rs.getInt("ID");
                String nombre = rs.getString("NOMBRE");
                c = new Corredor(id, nombre);

            }

            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

        return c;
    }

    public ArrayList<Corredor> obtenerCorredores() {
        ArrayList<Corredor> lista = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(CONN, USER, PASS);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from corredores");
            // Si el select devuelve una única fila, en lugar de while, se usa un if
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                Corredor c = new Corredor(id, nombre);
                lista.add(c);
            }

            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public ArrayList<DtoTiempos> obtenerTiempos() {

        ArrayList<DtoTiempos> lista = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(CONN, USER, PASS);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT c.nombre as Nombre, t.Tiempo as Tiempo, t.Clima as Club\n"
                    + "FROM Corredores c Join Tiempos t ON c.Id = t.IdCorredor");
            // Si el select devuelve una única fila, en lugar de while, se usa un if
            while (rs.next()) {
                String nombre = rs.getString("Nombre");
                String tiempo = rs.getString("Tiempo");
                String club = rs.getString("Club");
                DtoTiempos dto = new DtoTiempos(nombre, tiempo, club);
                lista.add(dto);
            }

            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public int cantidadJugadoresTiempoMenor(double tiempo) {
        int cantidad = 0;

        try {
            Connection conn = DriverManager.getConnection(CONN, USER, PASS);

            PreparedStatement st = conn.prepareStatement("SELECT COUNT(*) AS CANTIDAD FROM TIEMPOS WHERE TIEMPO < ?");
            st.setDouble(1, tiempo);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                cantidad = rs.getInt("CANTIDAD");
                System.out.println(cantidad);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return cantidad;

    }

    public ArrayList<DtoSegundoReporte> segundoReporte() {
        ArrayList<DtoSegundoReporte> lista = new ArrayList();

        try {
            Connection conn = DriverManager.getConnection(CONN, USER, PASS);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT c.nombre as Nombre, AVG(t.Tiempo)"
                    + " as Promedio FROM Corredores c Join Tiempos t ON c.Id = t.IdCorredor GROUP BY c.Nombre");

            while (rs.next()) {
                String nombre = rs.getString("Nombre");
                Double promedio = rs.getDouble("Promedio");
                DtoSegundoReporte dto = new DtoSegundoReporte(nombre, promedio);
                lista.add(dto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    public ArrayList<DtoTercerReporte> tercerReporte(Double tiempo) {
        ArrayList<DtoTercerReporte> lista = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(CONN, USER, PASS);
            PreparedStatement st = conn.prepareStatement("SELECT c.Nombre as Nombre, t.Tiempo as tiempo, t.Club as Club\n"
                    + "FROM Corredores c JOIN Tiempos t ON t.IdCorredor = c.Id\n"
                    + "WHERE (t.Clima = 'Frio') OR (t.Clima = 'Viento') AND t.Tiempo < ?");
            st.setDouble(1, tiempo);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("Nombre");
                Double tiempoInsumido = rs.getDouble("Tiempo");
                String club = rs.getString("Club");
                DtoTercerReporte dto = new DtoTercerReporte(nombre, tiempoInsumido, club);
                lista.add(dto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;

    }

}
