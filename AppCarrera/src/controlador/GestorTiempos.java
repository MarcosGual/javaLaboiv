package controlador;

import java.sql.*;
import modelo.Corredor;
import modelo.Tiempo;
import modelo.DtoCarrera.Carrera;
import modelo.DtoCarrera.Promedio;

import java.util.ArrayList;
import java.util.List;

public class GestorTiempos {

	private String conexion;

	public GestorTiempos() {
		conexion = "jdbc:mysql://localhost:3306/carrera?user=root&password=mysql";
		// TODO: cambiar credenciales de la conexión según sus propias bases.
	}

	public boolean agregarTiempo(Tiempo tiempo) {
		boolean ok = true;
		String query = "INSERT INTO tiempos (idCorredor,tiempos,club,clima) VALUES( ?, ?, ?, ?)";

		try (Connection cnn = DriverManager.getConnection(conexion);
				PreparedStatement ps = cnn.prepareStatement(query);) {
			ps.setInt(1, tiempo.getCorredor().getId());
			ps.setFloat(2, tiempo.getTiempo());
			ps.setString(3, tiempo.getClub());
			ps.setString(4, tiempo.getClima());

			ok = ps.execute();
			System.out.println("valor ps.execute: "+ok);
		} catch (Exception e) {
			System.out.println("error insert: "+e);
			ok = false;
		}
		System.out.println("valor return: "+ok);
		return ok;
	}

	public List<Corredor> obtenerCorredores() {
		List<Corredor> lst = new ArrayList<>();
		try (Connection cnn = DriverManager.getConnection(conexion);
				Statement stmt = cnn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM corredores")) {

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				lst.add(new Corredor(id, nombre));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return lst;
	}

	public int contarTiemposMenores(float maximo) {
		String query = "select count(*) as total from tiempos where tiempos < " + maximo;
        int total = 0;
         try ( Connection cnn = DriverManager.getConnection(conexion);  
        		 Statement stmt = cnn.createStatement();  ResultSet rs = stmt.executeQuery(query)) {
            if(rs.next()) {
                total = rs.getInt("total");
            }
        } catch (Exception e) {
        }
        return total;
	}

	public List<Promedio> promedioPorCorredor() {
		List<Promedio> lst = new ArrayList<>();
		String query = "SELECT c.nombre, avg(t.tiempos) as promedio from corredores c join tiempos t on t.idCorredor = c.id group by c.nombre ";

		try (Connection cnn = DriverManager.getConnection(conexion);
				Statement stmt = cnn.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {

			while (rs.next()) {
				String nombre = rs.getString("nombre");
				float promedio = rs.getFloat("promedio");
				lst.add(new Promedio(nombre,promedio));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return lst;
	}

	public List<Carrera> tiemposPorClima(float maximo) {
		List<Carrera> lst = new ArrayList<>();
		String query = "SELECT c.nombre, t.tiempos, t.club from corredores c join tiempos t on t.idCorredor = c.id and upper(t.clima) in ('FRIO','VIENTO') and t.tiempos < " + maximo;
		try (Connection cnn = DriverManager.getConnection(conexion);
				Statement stmt = cnn.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {

			while (rs.next()) {
				String nombre = rs.getString("nombre");
				float tiempos = rs.getFloat("tiempos");
				String club = rs.getString("club");
				lst.add(new Carrera(nombre,tiempos,club));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return lst;
	}

}
