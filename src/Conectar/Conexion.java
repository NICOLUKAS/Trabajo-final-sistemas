/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nikol
 */
public class Conexion {
    Connection conn = null;
    public Connection conexion (){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:1818/BaseParqueadero","root","12345");
        }
        catch(Exception e){
             System.out.print(e.getMessage());
        }
        return conn;
    }
}
