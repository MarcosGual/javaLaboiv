/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hoteleria;

import controllers.ControladorServicio;
import views.JFPrincipal;

/**
 *
 * @author marco
 */
public class Hoteleria {

    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            new JFPrincipal(new ControladorServicio()).setVisible(true);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
