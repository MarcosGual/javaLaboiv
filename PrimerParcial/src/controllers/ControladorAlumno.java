/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dtos.AdeudadoDTO;
import java.util.List;
import models.Curso;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;
import models.Alumno;

public class ControladorAlumno {

    String conexion;

    public ControladorAlumno() {
        conexion = "jdbc:sqlserver://sqlgabineteinformatico.frc.utn.edu.ar;DatabaseName=Lab4P1N;TrustServerCertificate=true";
    }

    public List<Curso> obtenerCursos() {

        List<Curso> cursos = new ArrayList();

        try {
            Connection conn = DriverManager.getConnection(conexion, "alumnolab22", "SQL-Alu22");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from cursos");

            while (rs.next()) {
                int id = rs.getInt("IdCurso");
                String nombre = rs.getString("Nombre");
                float precioCuota = rs.getFloat("PrecioCuota");
                int cantidadCuotas = rs.getInt("CantidadCuotas");
                int activo = rs.getInt("Activo");
                cursos.add(new Curso(id, nombre, precioCuota, cantidadCuotas, activo));
            }

            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cursos;
    }

    public boolean registrarAlumno(Alumno a) {

        boolean exito = true;

        try {
            Connection conn = DriverManager.getConnection(conexion, "alumnolab22", "SQL-Alu22");
            String query = "insert into alumnos(IdCurso, Nombre, CuotasPagas, Nota) values (?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(query);

            pst.setInt(1, a.getCurso().getIdCurso());
            pst.setString(2, a.getNombre());
            pst.setInt(3, a.getCuotasPagas());
            pst.setInt(4, a.getNota());

            pst.executeUpdate();

            pst.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
            exito = false;
        }

        return exito;
    }

    public List<Alumno> obtenerAlumnos(Curso curso) {

        List<Alumno> alumnos = new ArrayList();

        try {
            Connection conn = DriverManager.getConnection(conexion, "alumnolab22", "SQL-Alu22");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from alumnos where IdCurso=" + curso.getIdCurso());

            while (rs.next()) {
                int idAlumno = rs.getInt("IdAlumno");
                String nombre = rs.getString("Nombre");
                int cuotasPagas = rs.getInt("CuotasPagas");
                int nota = rs.getInt("Nota");
                alumnos.add(new Alumno(idAlumno, nombre, cuotasPagas, nota, curso));
            }

            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alumnos;
    }

    public AdeudadoDTO obtenerAdeudado(Curso curso) {
        List<AdeudadoDTO> adeudado = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(conexion, "alumnolab22", "SQL-Alu22");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select IdCurso, SUM(c.precio*(c.CantidadCuotas-a.CuotasPagas)"
                    + " adeudado from alumnos a join cursos c on a.IdCurso=c.IdCurso where a.IdCurso=" + curso.getIdCurso() + " group by IdCurso");

            while (rs.next()) {
                int id = rs.getInt("IdCurso");
                float total = rs.getFloat("adeudado");
                adeudado.add(new AdeudadoDTO(id, total));
            }

            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (AdeudadoDTO) adeudado;
    }
}
