package Controlador;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alexis
 */
public class cls_conexionbd {
    public Connection conectarBB(){
        Connection conexion = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("DRIVER Java a la Bd cargado!!");

        } catch (ClassNotFoundException ex) {
            System.out.println("Error: no se encuentra el Driver" + ex);
        }
        
        try {
            String urlbd = "jdbc:derby://localhost:1527/Cuentas_Bancarias";//url para conectarnos a la base de datos utilizando la sintaxis de JDBC
            conexion = DriverManager.getConnection(urlbd, "administrador", "admin");// se establece la coneccion a la bace de datos
            System.out.println("Conexion establecida  a la BD");
        } catch (SQLException ex) {
            System.out.println("ERROR: No se puede establecer conexion a la BD !!" + ex);
        }
        return conexion;
    }
}
