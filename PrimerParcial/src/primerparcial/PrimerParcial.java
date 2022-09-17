/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerparcial;

import controllers.ControladorAlumno;
import java.sql.*;
import views.JFMenu;

public class PrimerParcial {

    public static void main(String[] args) {
        // TODO code application logic here
        ControladorAlumno controller;
        try {
            controller=new ControladorAlumno();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //System.out.println(controller.obtenerCursos());
            new JFMenu(new ControladorAlumno()).setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
