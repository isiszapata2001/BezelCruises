
package Clases;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionBasedeDatos {
    
    static Connection conn = null;
    
    //Metodo
    
    public static Connection obtenerConexion()
    {
        String url = "jdbc:sqlserver://JEFFERSON-PC:1433;databaseName=Cruceros";
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error de Conexion");
        }
        
        try
        {
            conn = DriverManager.getConnection(url, "sa", "jete");
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error de Conexion" + ex);
        }
        
        return conn;
    }
    
}
