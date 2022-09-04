package testconexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TestConexion {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ACADEMIA", "root", "1959Marcos");
            System.out.println("Conexión exitosa...");

            ArrayList lista = new ArrayList();
            String nombre, apellido;
            int id;

            Statement comando = conn.createStatement();
            ResultSet rs = comando.executeQuery("select * from alumnos");
            
            while(rs.next()){
                /*nombre=rs.getString("nombre");
                apellido=rs.getString("apellido");
                id=rs.getInt("AlumnoID");*/
                
                System.out.println("ID: "+rs.getString("AlumnoID"));
                System.out.println("Nombre: "+rs.getString("Nombre"));
                System.out.println("Apellido: "+rs.getString("Apellido"));
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TestConexion.class.getName()).log(Level.SEVERE, null, ex);
            //ex.printStackTrace();
        }
    }
}
