
package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    java.sql.Connection con;
    
    //Este método crea la conexión a la base de Datos SQL, y lo utilizaremos para conectarnos cuando queramos realizar alguna acción en esta.
    public Connection Conecta(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Indicamos la url, el nombre del perfil, y la contraseña ( que en este caso no existe)
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebajava","root","");
            
    
         }
         catch(Exception e){
               JOptionPane.showMessageDialog(null, "Error al conectar.");
               e.printStackTrace();
        }
        return con;
    }

}
