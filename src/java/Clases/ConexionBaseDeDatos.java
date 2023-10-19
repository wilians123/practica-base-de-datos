/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBaseDeDatos {
   private String url="jdbc:mysql://localhost:3306/universidad";//url de MySQL
    private String usuario="root";// usuario de mysql local
    private String clave="admin"; 
    private Connection conexion=null;  
    
    public Connection conectar(){   
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection( url, usuario,clave);
        }  catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {   
           ex.printStackTrace();
        }         
        return conexion;        
    }
}


/*

    public Connection conectar(){   
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection( "jdbc:mysql://localhost:3306/universidad", root, admin);

        }  catch (SQLException ex) {
            ex.printStackTrace();

        } catch (ClassNotFoundException ex) {   
           ex.printStackTrace();
        }         
        return conexion;        
    }
}
*/