package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bd_ventas_ds501";
    private static final String USER = "root";
    private static final String PWD = "";

    static {
        try {
            Class.forName(CONTROLADOR);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador");
        }
    }

    public Connection conectar() {
        Connection cnx = null;

        try {
            cnx = DriverManager.getConnection(URL, USER, PWD);
        } catch (SQLException e) {
            System.out.println("Error en la conexión");
        }

        return cnx;
    }

    public Connection Conectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}