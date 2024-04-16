
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GIGABYTE
 */
public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/Dump20240415 (1)";
    private static final String USUARIO = "Gilson";
    private static final String CONTRASENA = "12345";
    private static Connection conexion;

    public static Connection obtenerConexion() {
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            return conexion;
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            return null;
        }
    }

    public static void cerrarConexion() {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

}
