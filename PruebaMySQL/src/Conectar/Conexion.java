
package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    java.sql.Connection con;
    
    public Connection Conecta(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebajava","root","");
            
    
         }
         catch(Exception e){
               JOptionPane.showMessageDialog(null, "Error al conectar.");
               e.printStackTrace();
        }
        return con;
    }

}
