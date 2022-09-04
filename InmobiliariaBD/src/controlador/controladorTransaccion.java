package controlador;

import modelo.Transaccion;
import modelo.Vendedor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class controladorTransaccion {

    private String conexion;

    public controladorTransaccion() {
        conexion = "";
    }

    public boolean registrarTransaccion(Transaccion trx) {
        boolean status = true;

        try {
            Connection conn = DriverManager.getConnection(conexion);

            PreparedStatement ps = conn.prepareStatement("insert into transacciones (fecha, idVendedor, tipoOperacion, tipoInmueble, monto) "
                    + "values()");

            ps.setString(1, trx.getFecha());
            ps.setInt(2, trx.getVendedor().getIdVendedor());
            ps.setInt(1, trx.getTipoOperacion());
            ps.setInt(1, trx.getTipoInmueble());
            ps.setFloat(1, trx.getMonto());

            return ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
            status = false;
        }
        
        return status;
    }

    public List<Transaccion> obtenerTodas() {
        List<Transaccion> listaTrx = new ArrayList();

        try {
            Connection conn = DriverManager.getConnection(conexion);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from transacciones");

            while (rs.next()) {
                int id = rs.getInt("id");
                String fecha = rs.getString("fecha");
                int tipoOperacion = rs.getInt("tipoOperacion");
                int tipoInmueble = rs.getInt("tipoInmueble");
                float monto = rs.getFloat("monto");
                int idVendedor = rs.getInt("idVendedor");
                Vendedor vendedor=new Vendedor(idVendedor, "");

                listaTrx.add(new Transaccion(id, fecha, monto, tipoOperacion, tipoInmueble, vendedor));
            }
            
            rs.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return listaTrx;
    }
}
